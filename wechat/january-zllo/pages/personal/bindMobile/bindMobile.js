// pages/personal/bindMobile/bindMobile.js
const app = getApp();

Page({

	/**
	 * 页面的初始数据
	 */
	data: {

	},

	formSubmit: function(e) {
		console.log(e);
		
		e.detail.value.openid = app.globalData.openId;
		console.log('form发生了submit事件，携带数据为：', e.detail.value)

		wx.request({
			url: app.globalData.baseUrl + '/v1/member',
			data: e.detail.value,
			method: "POST",
			header: { 'content-type': 'application/x-www-form-urlencoded' },
			success: function (data) {
				if (data.statusCode === 200) {
					wx.showToast({
						title: '绑定成功',
						icon: 'success',
						duration: 2000
					});
					app.globalData.memberInfo = data.data;
					// 返回上一页
					wx.navigateBack({
						delta: 1
					})
				}
			},
			fail: function (error) {
				wx.showModal({
					title: "error",
					content: error
				});
			}
		})
	},

	/**
	 * 生命周期函数--监听页面加载
	 */
	onLoad: function (options) {

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