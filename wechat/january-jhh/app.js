//app.js
App({
	onLaunch: function () {
		// 展示本地存储能力
		var logs = wx.getStorageSync('logs') || []
		logs.unshift(Date.now())
		wx.setStorageSync('logs', logs)

		var hasOauth = false;
		debugger;
		/**
		 * 获取用户权限
		 */
		var that = this;

		that.wxLogin();
		
		this.getWxSetting(that);
	},
	getWxSetting: function (that) {
		wx.getSetting({
			success(res) {
				/**
				 * 未授权
				 */
				if (!res.authSetting['scope.record']) {
					wx.authorize({
						scope: 'scope.record',
						success() {
							// 用户已经同意小程序使用录音功能，后续调用 wx.startRecord 接口不会弹窗询问
							that.wxLogin();
						},
						fail(msg) {
							that.wxLogin();
							debugger;
						}
					})
				}
				/**
				 * 已授权
				 */
				else {
					that.wxLogin();
				}
			}
		});
		//this.wxLogin();
	},
	/**
	 * 微信登录
	 */
	wxLogin: function() {
		var that = this;
		var openid = '';
		var session_key = '';
		// 如果total大于0表示后台数据以保存，则不需要再次请求保存数据
		var total = 0;

		// 登录
		wx.login({
			success: res => {
				// 发送 res.code 到后台换取 openId, sessionKey, unionId
				wx.request({
					url: 'http://likeyou.nat300.top/v1/wechat/api/getOpenId',
					data: {
						code: res.code
					},
					success: function (data) {
						debugger;
						if (data.statusCode === 200) {
							openid = data.data.rows.openid;
							session_key = data.data.rows.session_key;
							total = data.data.total;
							wx.setStorageSync('openid', openid);

							that.getWxUserInfo(openid, session_key, total);
							that.getMemberInfo(openid);
						}
					},
					fail: function (error) {
						wx.showModal({
							title: "error",
							content: error
						});
					}
				})
			}
		});
	},
	getWxUserInfo: function (openid, session_key, total) {
		// 获取用户信息
		wx.getSetting({
			success: res => {
				if (res.authSetting['scope.userInfo']) {
					// 已经授权，可以直接调用 getUserInfo 获取头像昵称，不会弹框
					wx.getUserInfo({
						success: res => {
							// 可以将 res 发送给后台解码出 unionId
							this.globalData.userInfo = res.userInfo
							
							// 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
							// 所以此处加入 callback 以防止这种情况
							if (this.userInfoReadyCallback) {
								this.userInfoReadyCallback(res);
								// 需要保存到后台的数据
								var userInfo = this.globalData.userInfo;
								userInfo.openid = openid;
								userInfo.sessionKey = session_key;

								// 如果后台不存在该用户，将用户信息保存到后台
								if (total != 1) {
									wx.request({
										url: 'http://likeyou.nat300.top/v1/wechat/user/info',
										method: 'POST',
										data: userInfo,
										header: {
											//设置参数内容类型为x-www-form-urlencoded
											'content-type': 'application/x-www-form-urlencoded',
											'Accept': 'application/json'
										},
										success: function (data) {
											if (data.statusCode === 200) {

											}
										}
									})
								}
								// 后台已存在该用户(wechatUserInfo表)，查询会员表中是否有该用户
								else if (total == 1) {

								}
							}
						}
					})
				}
			}
		})
	},
	/**
	 * 根据openid获取用户是否存在member表中
	 */
	getMemberInfo: function (openid) {
		var that = this;
		/**
		 * 根据openid请求后台查询，是否已绑定手机号码，即是否已注册系统账号
		 */
		wx.request({
			url: 'http://likeyou.nat300.top/v1/member',
			method: 'GET',
			data: {
				openid: openid
			},
			header: {
				'content-type': 'application/x-www-form-urlencoded',
				'Accept': 'application/json'
			},
			success: function (data) {
				/**
				 * member表中存在该用户
				 */
				if (data.statusCode === 200 && data.data.code==200 && data.data.data.length===1) {
					that.globalData.memberInfo = data.data.data[0];
				} else {
					// 不存在该用户
				}
			}
		})
	},
	globalData: {
		userInfo: null,
		memberInfo: null
	}
})