// pages/index/detail/merchantDetail.js

const constants = require('../../../utils/constants.js');

const RIGHT_BAR_HEIGHT = 20;      // 右侧每一类的 bar 的高度（固定）
const RIGHT_ITEM_HEIGHT = 60;     // 右侧每个子类的高度（固定）
const LEFT_ITEM_HEIGHT = 50       // 左侧每个类的高度（固定）

let windowHeight;

Page({

    /**
     * 页面的初始数据
     */
    data: {
		imageUrl: '/images/logo0.jpg',
		tab_active: 0,
		badge_active:0,
		menu_active: 0,
		menus: [
			{
				'name': '热销',
				'details': [
					{
						'name': 'd',
						'price': 19
					}
				]
			},
			{
				'name': '折扣',
				'details': [
					{
						'name': 'd',
						'price': 19
					}
				]
			},
			{
				'name': '招牌菜',
				'details': [
					{
						'name': 'd',
						'price': 19
					}
				]
			},
			{
				'name': '江浙菜',
				'details': [
					{
						'name': 'd',
						'price': 19
					}
				]
			},
			{
				'name': '川菜',
				'details': [
					{
						'name': 'd',
						'price': 19
					}
				]
			},
			{
				'name': '湘菜',
				'details': [
					{
						'name': 'd',
						'price': 19
					}
				]
			},
			{
				'name': '甜品',
				'details': [
					{
						'name': 'd',
						'price': 19
					}
				]
			},
			{
				'name': '饮品',
				'details': [
					{
						'name': 'd',
						'price': 19
					}
				]
			},
			{
				'name': '狗粮',
				'details': [
					{
						'name': 'd',
						'price': 19
					}
				]
			},
			{
				'name': '赠送',
				'details': [
					{
						'name': 'd',
						'price': 19
					}
				]
			},
		],
		constants: [],                // 数据
		toView: null,                 // 左 => 右联动 右scroll-into-view 所需的id
		currentLeftSelect: null,      // 当前左侧选择的
		eachRightItemToTop: [],       // 右侧每类数据到顶部的距离（用来与 右 => 左 联动时监听右侧滚动到顶部的距离比较）
		leftToTop: 0,
		leftHeight:0,
    },

    /**
     * 生命周期函数--监听页面加载
     */
    onLoad: function (options) {
        
		this.getSystemInfo();

		let lh = windowHeight;

		debugger;

		if (((constants.length - 1) * LEFT_ITEM_HEIGHT) > lh) {
			lh = (constants.length - 1) * LEFT_ITEM_HEIGHT;
		}

		this.setData({
			constants: constants,
			currentLeftSelect: constants[0].id,
			eachRightItemToTop: this.getEachRightItemToTop(),
			leftHeight: lh+90
		})

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
		this.setData({
			tab_active: event.detail.index
		});
		wx.showToast({
			icon: 'none',
			title: `Tab切换至第${event.detail.index}项`
		});
	},
	onChangeFoodNum: function(e) {
		console.log(e);
	},
	onBadgeChange: function (event) {
		console.log(event);
		wx.showToast({
			icon: 'none',
			title: `切换至第${event.detail}项`
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

    },
	 // 获取每个右侧的 bar 到顶部的距离，用来做后面的计算。
	getEachRightItemToTop: function () { 
		var obj = {};
		var totop = 0;
		// 右侧第一类肯定是到顶部的距离为 0
		obj[constants[0].id] = totop
		// 循环来计算每个子类到顶部的高度
		for (let i = 1; i < (constants.length + 1); i++) {  
			totop += (RIGHT_BAR_HEIGHT + constants[i - 1].category.length * RIGHT_ITEM_HEIGHT)
			// 这个的目的是 例如有两类，最后需要 0-1 1-2 2-3 的数据，所以需要一个不存在的 'last' 项，此项即为第一类加上第二类的高度。
			obj[constants[i] ? constants[i].id : 'last'] = totop    
		}
		return obj
	},
	rightScroll: function (e) {   // 监听右侧的滚动事件与 eachRightItemToTop 的循环作对比 从而判断当前可视区域为第几类，从而渲染左侧的对应类。
		for (let i = 0; i < this.data.constants.length; i++) {
			let left = this.data.eachRightItemToTop[this.data.constants[i].id]
			let right = this.data.eachRightItemToTop[this.data.constants[i + 1] ? this.data.constants[i + 1].id : 'last']
			if (e.detail.scrollTop < right && e.detail.scrollTop >= left) {
				this.setData({
					currentLeftSelect: this.data.constants[i].id,
					leftToTop: LEFT_ITEM_HEIGHT * i
				})
			}
		}
	},
	jumpTo: function (e) {    // 左侧类的点击事件，点击时，右侧会滚动到对应分类
		this.setData({
			toView: e.target.id || e.target.dataset.id,
			currentLeftSelect: e.target.id || e.target.dataset.id
		})
	},
	getSystemInfo() {
		let self = this
		wx.getSystemInfo({
			success: function (res) {
				windowHeight = res.windowHeight;
			}
		})
	}
})