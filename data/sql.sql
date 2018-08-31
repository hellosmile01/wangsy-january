/**
  商户信息表
 */
CREATE TABLE `merchant` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(30) DEFAULT NULL COMMENT '商户名称',
  `mobile` varchar(16) DEFAULT NULL COMMENT '联系电话',
  `principal_name` varchar(50) DEFAULT NULL COMMENT '负责人',
  `principal_mobile` varchar(16) DEFAULT NULL COMMENT '负责人电话',
  `start_hours` varchar(30) DEFAULT NULL COMMENT '营业时间(开始时间）',
  `end_hours` varchar(30) DEFAULT NULL COMMENT '营业时间(结束时间)',
  `province` varchar(30) DEFAULT NULL COMMENT '所属省份（000001）',
  `city` varchar(30) DEFAULT NULL COMMENT '所属市（000001001）',
  `area` varchar(30) DEFAULT NULL COMMENT '所属区（000001001001）',
  `address` varchar(30) DEFAULT NULL COMMENT '详细地址',
  `logo` text COMMENT '门店Logo（图片url，单张）',
  `out_image` text COMMENT '门店外景照片（图片url,url,url）',
  `inner_image` text COMMENT '门店内景照片（url,url,url,url）',
  `id_card_front_image` text COMMENT '身份证正面照',
  `id_card_back_image` text COMMENT '身份证反面照',
  `business_license` text COMMENT '营业执照（图片上传）',
  `industry_license` text COMMENT '行业许可证',
  `state` int(1) DEFAULT '0' COMMENT '审核状态（0：未审核，1：通过；2：不通过）',
  `is_valid` tinyint(1) DEFAULT NULL COMMENT '是否有效',
  `longitude` double DEFAULT '0' COMMENT '经度',
  `latitude` double DEFAULT '0' COMMENT '纬度',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  `login_account` varchar(20) DEFAULT NULL COMMENT '登陆账号',
  `password` varchar(35) DEFAULT NULL COMMENT '密码',
  `insert_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '数据入库时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '数据最后一次更新时间',
  `delete_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '删除时间',
  `been_deleted` tinyint(1) DEFAULT NULL COMMENT '是否已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='商户信息表';

/**
  会员信息表
 */
CREATE TABLE `member` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `member_name` varchar(30) DEFAULT NULL COMMENT '会员名称(登陆名称)',
  `mobile` varchar(16) DEFAULT NULL COMMENT '联系电话',
  `name` varchar(50) DEFAULT NULL COMMENT '真实名称(预留)',
  `avatar` varchar(30) DEFAULT NULL COMMENT '头像（图片url，单张）',
  `id_card_front_image` varchar(30) DEFAULT NULL COMMENT '身份证正面照',
  `id_card_back_image` varchar(30) DEFAULT NULL COMMENT '身份证反面照',
  `is_valid` tinyint(1) DEFAULT NULL COMMENT '是否有效',
  `password` varchar(35) DEFAULT NULL COMMENT '密码',
  `insert_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '数据入库时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '数据最后一次更新时间',
  `delete_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '删除时间',
  `been_deleted` tinyint(1) DEFAULT NULL COMMENT '是否已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='会员信息表';

/*
  商品信息表
*/
CREATE TABLE `products` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(30) DEFAULT NULL COMMENT '商品名称',
  `price` decimal(10,2) DEFAULT NULL COMMENT '商品价格',
  `images` text COMMENT '商品图片',
  `in_stocks` int(255) DEFAULT NULL COMMENT '商品库存',
  `sales_volume` int(255) DEFAULT NULL COMMENT '销量',
  `sales_month_volume` int(255) DEFAULT NULL COMMENT '月销量',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  `state` int(1) DEFAULT NULL COMMENT '审核状态（0：未审核，1：通过；2：不通过）',
  `merchant_name` varchar(30) DEFAULT NULL COMMENT '商户名称',
  `merchant_id` bigint(20) DEFAULT NULL COMMENT '商户id',
  `insert_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '数据入库时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '数据最后一次更新时间',
  `delete_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '删除时间',
  `been_deleted` tinyint(1) DEFAULT NULL COMMENT '是否已删除',
  `category_id` bigint(20) DEFAULT NULL COMMENT '分类id',
  `category_name` varchar(30) DEFAULT NULL COMMENT '分类名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品信息表';


CREATE TABLE `product_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(30) DEFAULT NULL COMMENT '类别名称',
  `images` text COMMENT '分类图片',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  `state` int(1) DEFAULT NULL COMMENT '审核状态（0：未审核，1：通过；2：不通过）',
  `merchant_name` varchar(30) DEFAULT NULL COMMENT '商户名称',
  `merchant_id` bigint(20) DEFAULT NULL COMMENT '商户id',
  `insert_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '数据入库时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '数据最后一次更新时间',
  `delete_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '删除时间',
  `been_deleted` tinyint(1) DEFAULT NULL COMMENT '是否已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品分类表';


CREATE TABLE `order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `order_number` varchar(30) DEFAULT NULL COMMENT '订单号',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  `order_state` int(1) DEFAULT NULL COMMENT '订单状态（-1：已取消, 0：未支付，1：已支付；2：已接单，3: 配送中，4: 已完成）',
  `distribute_address` varchar(500) DEFAULT NULL COMMENT '配送地址',
  `merchant_name` varchar(30) DEFAULT NULL COMMENT '商户名称',
  `merchant_id` bigint(20) DEFAULT NULL COMMENT '商户id',
  `member_name` varchar(30) DEFAULT NULL COMMENT '会员名称',
  `member_id` bigint(20) DEFAULT NULL COMMENT '会员id',
  `member_mobile` varchar(16) DEFAULT NULL COMMENT '联系电话',
  `distribute_price` decimal(10,2) DEFAULT NULL COMMENT '配送费',
  `discount` decimal(10,2) DEFAULT NULL COMMENT '优惠金额',
  `pack_price` decimal(10,2) DEFAULT NULL COMMENT '打包费',
  `total_amount` decimal(10,2) DEFAULT NULL COMMENT '合计金额',
  `distributer_name` varchar(30) DEFAULT NULL COMMENT '配送员名称',
  `distributer_id` bigint(20) DEFAULT NULL COMMENT '配送员id',
  `distributer_mobile` varchar(16) DEFAULT NULL COMMENT '配送员联系电话',
  `distribution_name` varchar(30) DEFAULT NULL COMMENT '配送单位名称',
  `distribution_id` bigint(20) DEFAULT NULL COMMENT '配送单位id',
  `insert_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '数据入库时间(订单时间)',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '数据最后一次更新时间',
  `delete_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '删除时间',
  `been_deleted` tinyint(1) DEFAULT NULL COMMENT '是否已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单信息表';


CREATE TABLE `order_items` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `order_number` varchar(30) DEFAULT NULL COMMENT '订单号',
  `order_id` bigint(20) DEFAULT NULL COMMENT '订单id',
  `product_name` varchar(30) DEFAULT NULL COMMENT '商品名称',
  `product_id` bigint(20) DEFAULT NULL COMMENT '商品id',
  `product_price` decimal(10,2) DEFAULT NULL COMMENT '商品价格(原价)',
  `product_discount` decimal(10,2) DEFAULT NULL COMMENT '商品优惠金额',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  `insert_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '数据入库时间(订单时间)',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '数据最后一次更新时间',
  `delete_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '删除时间',
  `been_deleted` tinyint(1) DEFAULT NULL COMMENT '是否已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单信息表';