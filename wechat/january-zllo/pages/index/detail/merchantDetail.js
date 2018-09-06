// pages/index/detail/merchantDetail.js
Page({

    /**
     * 页面的初始数据
     */
    data: {
		imageUrl: '/images/logo0.jpg',
		currentTab: "0"
    },

    /**
     * 生命周期函数--监听页面加载
     */
    onLoad: function (options) {
        console.log(options);
        console.log("merchantId"+options.merchantId);

        wx.setNavigationBarTitle({
            title: options.merchantName,
            success: function () {
                console.log("当前微信小程序的页面标题为\"" + options.merchantName + "\"");
            },
            complete: function () {
                console.log("动态修改微信小程序的页面标题-complete");
            }
        });
    },
	onChange: function(event) {
		console.log(event);
		if(event.detail===0) {
			wx.switchTab({
				url: '../../menu/menu'
			})
		} 
		else if(event.detail===1) {
			wx.switchTab({
				url: '../../evaluation/evaluation'
			})
		}
		else if(event.detail===2) {
			wx.switchTab({
				url: '../../merchant/merchant'
			})
		}
	},
	//滑动切换
	swiperTab: function (e) {
		var that = this;
		that.setData({
			currentTab: e.detail.current
		});
	},
	//点击切换
	clickTab: function (e) {
		var that = this;
		if (this.data.currentTab === e.target.dataset.current) {
			return false;
		} else {
			that.setData({
				currentTab: e.target.dataset.current
			})
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