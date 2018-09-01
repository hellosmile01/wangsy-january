// pages/personal/mine.js
Page({
	/**
	 * 页面的初始数据
	 */
	data: {
	
	},

	/**
	 * 生命周期函数--监听页面加载
	 */
	onLoad: function (options) {
		/**
		 * 根据openid请求后台查询，是否已绑定手机号码，即是否已注册系统账号
		 */
		console.log('openid==============================' + wx.getStorageSync('openid'));
		wx.request({
			url: 'http://likeyou.nat300.top/v1/wechat/user/info',
			method: 'POST',
			// data: userInfo,
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