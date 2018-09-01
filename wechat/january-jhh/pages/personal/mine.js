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
		 * wx.setStorageSync('memberInfo', data.data.data[0])
		 */
		var memberInfo = wx.getStorageSync('memberInfo');
		var userInfo = wx.getStorageSync('userInfo');

		/**
		 * 没有微信用户信息，需要微信登录
		 */
		if(userInfo === null || userInfo === "") {
			this.setData({
				login_logo: "../../images/login_logo.png",
				wx_user_name: "点击登录",
				wx_user_desc: "独乐乐不如众乐乐！",
				personal_center_url: ""
			});
		}
		/**
		 * 没有用户信息，需要绑定手机
		 */
		else if (memberInfo === null || memberInfo === "") {
			// 显示登录按钮
			this.setData({
				login_logo: userInfo.avatarUrl,
				wx_user_name: userInfo.nickName,
				wx_user_desc: "点击绑定手机",
				personal_center_url: "bindMobile/bindMobile"
			});
		} 
		else {
			// 显示会员信息
			this.setData({
				login_logo: userInfo.avatarUrl,
				wx_user_name: userInfo.nickName,
				wx_user_desc: "独乐乐不如众乐乐！",
				personal_center_url: ""
			});
		}
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