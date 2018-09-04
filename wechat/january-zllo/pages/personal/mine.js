// pages/personal/mine.js
//获取应用实例
const app = getApp()

Page({

    /**
     * 页面的初始数据
     */
    data: {
        imageUrl: '/images/login_logo.png',
        personal_center_url: 'bindMobile/bindMobile',
        hasAuthorize: false,  // 是否已授权
        hasMobile: false, // 是否已绑定手机
        wxNickName: "",
        mobile: "",
        toBindMobile: "bindMobile/bindMobile"
    },

    /**
     * 生命周期函数--监听页面加载
     */
    onLoad: function (options) {
        // 会员信息（判断是否已绑定手机）
        var memberInfo = app.globalData.memberInfo;
        wx.showModal({
            title: "memberInfo",
            content: memberInfo
        });
        debugger;
        // 微信用户数据（判断是否已授权）
        var userInfo = app.globalData.userInfo;

        if (userInfo != null) {
            this.setData({
                hasAuthorize: true,
                imageUrl: userInfo.avatarUrl,
                wxNickName: userInfo.nickName
            });
        }

        if (memberInfo != null) {
            this.setData({
                hasMobile: true,
                mobile: memberInfo.mobile
            });
        }

    },

    getUserInfo: function (e) {
        console.log(e)
        // var userInfo = wx.getStorageSync('userInfo');
        app.globalData.userInfo = e.detail.userInfo;

        var userInfo = e.detail.userInfo;
        this.setData({
            login_logo: userInfo.avatarUrl,
            hasAuthorize: true
        });
    },

    /**
     * 生命周期函数--监听页面初次渲染完成
     */
    onReady: function () {

    },

    /**
     * 生命周期函数--监听页面显示
     */
    onShow: function () {

    },

    /**
     * 生命周期函数--监听页面隐藏
     */
    onHide: function () {

    },

    /**
     * 生命周期函数--监听页面卸载
     */
    onUnload: function () {

    },

    /**
     * 页面相关事件处理函数--监听用户下拉动作
     */
    onPullDownRefresh: function () {

    },

    /**
     * 页面上拉触底事件的处理函数
     */
    onReachBottom: function () {

    },

    /**
     * 用户点击右上角分享
     */
    onShareAppMessage: function () {

    }
})