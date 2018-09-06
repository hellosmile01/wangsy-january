//app.js   https://zhuanlan.zhihu.com/p/24776703
App({
    onLaunch: function () {
        // 展示本地存储能力
        var logs = wx.getStorageSync('logs') || []
        logs.unshift(Date.now())
        wx.setStorageSync('logs', logs)

        var that = this;

        wx.getLocation({
            type: 'wgs84',
            success: function (res) {
                var latitude = res.latitude
                var longitude = res.longitude
                var speed = res.speed
                var accuracy = res.accuracy
				
            },
            fail: function(error) {
                console.log("location_error : "+error);
            }
        })
        
        this.getWxSetting();
    },
    /**
     * 获取微信用户信息
     */
    getWxSetting: function() {
        var that = this;
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
                                this.userInfoReadyCallback(res)
                            }
                        }
                    });
                    that.wxLogin();
                } 
                // 如果为授权，每次进入小程序都要询问是否授权
                else {
                    wx.authorize({
                        scope: 'scope.record',
                        success() {
                            // 用户已经同意小程序使用录音功能，后续调用 wx.startRecord 接口不会弹窗询问
                            that.getWxSetting();
                        },
                        fail(error) {
                            console.log(error);
                        }
                    })
                }
            }
        })
    },

    /**
     * 微信登录，在用户授权成功后登录，否则不登录
     */
    wxLogin: function() {
        var that = this;
        // 登录
        wx.login({
            success: res => {
                // 发送 res.code 到后台换取 openId, sessionKey, unionId
                console.log(res);
                wx.request({
                    url: that.globalData.baseUrl + '/v1/wechat/api/getOpenId',
                    data: {
                        code: res.code
                    }, 
                    header: {
                        //设置参数内容类型为x-www-form-urlencoded
                        'content-type': 'application/x-www-form-urlencoded',
                        'Accept': 'application/json'
                    },
                    success: function (data) {
                        if (data.statusCode === 200) {
                            // 换取的openid和session_key
                            var openid = data.data.rows.openid;
                            var session_key = data.data.rows.session_key;
                            // 用户在member表中是否有数据
                            var total = data.data.total;
                            // 将openid和session_key保存在globalData中
                            that.globalData.openId = openid;
                            that.globalData.sessionKey = session_key;

                            // that.getWxUserInfo(openid, session_key, total);
                            that.getWxUserInfo(openid);

                        }
                    },
                    fail: function (error) {
                        console.log("location_error : " + error);
                    }
                })
            }
        })
    },
    getWxUserInfo: function(openid) {
        var that = this;
		/**
		 * 根据openid请求后台查询，是否已绑定手机号码，即是否已注册系统账号
		 */
        wx.request({
            url: that.globalData.baseUrl + '/v1/member',
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
                if (data.statusCode === 200 && data.data.code == 200 && data.data.data.length === 1) {
                    that.globalData.memberInfo = data.data.data[0];
                } else {
                    // 不存在该用户
                }
            }
        })
    },
    globalData: {
        userInfo: null,
        memberInfo: null,
        baseUrl: "http://likeyou.nat300.top"
    }
})