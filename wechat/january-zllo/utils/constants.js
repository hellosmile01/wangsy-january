const constants = [
	{
		"id": "id1",
		"name": "热销",
		"category": [
			{
				"category_id": 1,
				"category_name": "绿茶烤鸡",
			},
			{
				"category_id": 2,
				"category_name": "香菜土豆丝",
			},
			// {
			// 	"category_id": 3,
			// 	"category_name": "糖醋里脊",
			// },
			// {
			// 	"category_id": 4,
			// 	"category_name": "干锅花菜",
			// }
		],
	},
	{
		"id": "id2",
		"name": "折扣",
		"category": [
			{
				"category_id": 4,
				"category_name": "石锅豆腐鸡汤",
			},
			{
				"category_id": 5,
				"category_name": "古法腊烧鸡",
			},
			// {
			// 	"category_id": 6,
			// 	"category_name": "绿茶炒饭",
			// },
			// {
			// 	"category_id": 7,
			// 	"category_name": "面包诱惑",
			// },
			// {
			// 	"category_id": 8,
			// 	"category_name": "特惠A套餐",
			// }, {
			// 	"category_id": 9,
			// 	"category_name": "特惠B套餐",
			// },
			// {
			// 	"category_id": 10,
			// 	"category_name": "特惠C套餐",
			// }
		]
	},
	{
		"id": "id3",
		"name": "招牌菜",
		"category": [
			{
				"category_id": 17,
				"category_name": "鱼头豆腐汤",
			},
			{
				"category_id": 18,
				"category_name": "鱼头诱惑",
			},
			// {
			// 	"category_id": 19,
			// 	"category_name": "绿茶烤鸡",
			// },
			// {
			// 	"category_id": 19,
			// 	"category_name": "绿茶烤鱼",
			// },
			// {
			// 	"category_id": 19,
			// 	"category_name": "绿茶大虾",
			// }
		],
	},
	// {
	// 	"id": "id4",
	// 	"name": "家常菜",
	// 	"category": [
	// 		{
	// 			"category_id": 20,
	// 			"category_name": "粉丝娃娃菜",
	// 		},
	// 		{
	// 			"category_id": 21,
	// 			"category_name": "香菜土豆丝",
	// 		},
	// 		{
	// 			"category_id": 22,
	// 			"category_name": "干锅花菜",
	// 		},
	// 		{
	// 			"category_id": 23,
	// 			"category_name": "水煮肉片",
	// 		},
	// 		{
	// 			"category_id": 24,
	// 			"category_name": "小锅土豆",
	// 		},
	// 		{
	// 			"category_id": 25,
	// 			"category_name": "麻婆豆腐",
	// 		}
	// 	],
	// },
	// {
	// 	"id": "id5",
	// 	"name": "无肉不欢",
	// 	"category": [
	// 		{
	// 			"category_id": 33,
	// 			"category_name": "烤鸡翅",
	// 		},
	// 		{
	// 			"category_id": 34,
	// 			"category_name": "锅包肉",
	// 		},
	// 		{
	// 			"category_id": 35,
	// 			"category_name": "东坡肉",
	// 		},
	// 		{
	// 			"category_id": 35,
	// 			"category_name": "烤鸭",
	// 		},
	// 		{
	// 			"category_id": 35,
	// 			"category_name": "糖醋排骨",
	// 		}
	// 	],
	// },
	// {
	// 	"id": "id6",
	// 	"name": "健康时蔬",
	// 	"category": [
	// 		{
	// 			"category_id": 36,
	// 			"category_name": "空心菜",
	// 		},
	// 		{
	// 			"category_id": 37,
	// 			"category_name": "菜心煮豆腐",
	// 		},
	// 		{
	// 			"category_id": 38,
	// 			"category_name": "上汤西兰花",
	// 		}
	// 	],
	// },
	// {
	// 	"id": "id7",
	// 	"name": "开胃凉菜",
	// 	"category": [
	// 		{
	// 			"category_id": 39,
	// 			"category_name": "卤鸡爪",
	// 		},
	// 		{
	// 			"category_id": 40,
	// 			"category_name": "爽口木耳",
	// 		}
	// 	],
	// },
	// {
	// 	"id": "id8",
	// 	"name": "主食",
	// 	"category": [
	// 		{
	// 			"category_id": 42,
	// 			"category_name": "米饭",
	// 		},
	// 		{
	// 			"category_id": 43,
	// 			"category_name": "馒头",
	// 		},
	// 		{
	// 			"category_id": 44,
	// 			"category_name": "面包",
	// 		}
	// 	],
	// },
	// {
	// 	"id": "id9",
	// 	"name": "饮品",
	// 	"category": [
	// 		{
	// 			"category_id": 45,
	// 			"category_name": "芬达",
	// 		},
	// 		{
	// 			"category_id": 46,
	// 			"category_name": "可乐",
	// 		},
	// 		{
	// 			"category_id": 47,
	// 			"category_name": "雪碧",
	// 		}
	// 	],
	// },
	// {
	// 	"id": "id10",
	// 	"name": "汤羹",
	// 	"category": [
	// 		{
	// 			"category_id": 48,
	// 			"category_name": "冬瓜排骨汤",
	// 		},
	// 		{
	// 			"category_id": 49,
	// 			"category_name": "萝卜骨头汤",
	// 		},
	// 		{
	// 			"category_id": 50,
	// 			"category_name": "香菇老鸭汤",
	// 		}
	// 	],
	// },
]

module.exports = constants