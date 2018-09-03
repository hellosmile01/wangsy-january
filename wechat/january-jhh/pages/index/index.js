//index.js
//获取应用实例
const app = getApp()

Page({
	data: {
		motto: 'Hello World',
		userInfo: {},
		hasUserInfo: false,
		merchantList: [],
	},
	//事件处理函数
	bindViewTap: function() {
		wx.navigateTo({
			url: '../logs/logs'
		})
	},
	onLoad: function () {
		var that = this;

		if (app.globalData.userInfo) {
			this.setData({
				userInfo: app.globalData.userInfo,
				hasUserInfo: true
			})
		} else if (this.data.canIUse){
		// 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
		// 所以此处加入 callback 以防止这种情况
		app.userInfoReadyCallback = res => {
			this.setData({
				userInfo: res.userInfo,
					hasUserInfo: true
				});
				that.getMerchantList();
			}
		} else {
			// 在没有 open-type=getUserInfo 版本的兼容处理
			wx.getUserInfo({
				success: res => {
					app.globalData.userInfo = res.userInfo;
					that.getMerchantList();
					this.setData({
						userInfo: res.userInfo,
						hasUserInfo: true
					})
				}
			})
		}
	},
  	getUserInfo: function(e) {
		console.log(e)
		app.globalData.userInfo = e.detail.userInfo
		this.setData({
			userInfo: e.detail.userInfo,
			hasUserInfo: true
		})
  	},
  	getMerchantList: function() {
	  	var that = this;
	   /**
	 	* 加载商户列表
		*/
	  	wx.request({
			url: 'http://likeyou.nat300.top/v1/merchant',
			method: 'GET',
			header: {
				//设置参数内容类型为x-www-form-urlencoded
				'content-type': 'application/x-www-form-urlencoded',
				'Accept': 'application/json'
			},
			success: function (data) {
				if (data.statusCode === 200) {
					that.setData({
						merchantList: data.data.data
					});
				}
			}
	  	})
  	}
})
