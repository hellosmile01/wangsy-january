//app.js
App({
  onLaunch: function () {
    // 展示本地存储能力
    var logs = wx.getStorageSync('logs') || []
    logs.unshift(Date.now())
    wx.setStorageSync('logs', logs)

    var openid = '';
    var session_key = '';

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
            if (data.statusCode===200) {
              openid = data.data.data.openid;
              session_key = data.data.data.session_key;
            }
          }
        })
      }
    })
    // 获取用户信息
    wx.getSetting({
      success: res => {
        if (res.authSetting['scope.userInfo']) {
          // 已经授权，可以直接调用 getUserInfo 获取头像昵称，不会弹框
          wx.getUserInfo({
            success: res => {
              // 可以将 res 发送给后台解码出 unionId
              this.globalData.userInfo = res.userInfo
              console.log(this.globalData);
              console.log(openid);
              console.log(session_key);
              

              // 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
              // 所以此处加入 callback 以防止这种情况
              if (this.userInfoReadyCallback) {
                this.userInfoReadyCallback(res);
                // 需要保存到后台的数据
                var userInfo = this.globalData.userInfo;
                userInfo.openid = openid;
                userInfo.sessionKey = session_key;
                // 将用户信息保存到后台
                wx.request({
                  url: 'http://likeyou.nat300.top//v1/wechat/user/info',
                  method: 'POST',
                  data: userInfo,
                  header: {
                    //设置参数内容类型为x-www-form-urlencoded
                    'content-type': 'application/x-www-form-urlencoded',
                    'Accept': 'application/json'
                  },
                  success: function (data) {
                    if (data.statusCode === 200) {
                      debugger
                    }
                  }
                })
              }
            }
          })
        }
      }
    })
  },
  globalData: {
    userInfo: null
  }
})