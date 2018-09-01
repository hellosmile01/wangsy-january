/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50638
 Source Host           : 127.0.0.1:3306
 Source Schema         : january

 Target Server Type    : MySQL
 Target Server Version : 50638
 File Encoding         : 65001

 Date: 01/09/2018 16:46:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `member_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '会员名称(登陆名称)',
  `mobile` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '真实名称(预留)',
  `avatar` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像（图片url，单张）',
  `id_card_front_image` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证正面照',
  `id_card_back_image` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证反面照',
  `is_valid` tinyint(1) NULL DEFAULT NULL COMMENT '是否有效',
  `password` varchar(35) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `insert_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '数据入库时间',
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '数据最后一次更新时间',
  `delete_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '删除时间',
  `been_deleted` tinyint(1) NULL DEFAULT NULL COMMENT '是否已删除',
  `openid` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户的微笑openid',
  `wx_info_id` bigint(20) NULL DEFAULT NULL COMMENT 'wxUserInfo表中的id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '会员信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for merchant
-- ----------------------------
DROP TABLE IF EXISTS `merchant`;
CREATE TABLE `merchant`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商户名称',
  `mobile` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `principal_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负责人',
  `principal_mobile` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负责人电话',
  `start_hours` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '营业时间(开始时间）',
  `end_hours` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '营业时间(结束时间)',
  `province` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属省份（000001）',
  `city` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属市（000001001）',
  `area` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属区（000001001001）',
  `address` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '详细地址',
  `logo` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '门店Logo（图片url，单张）',
  `out_image` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '门店外景照片（图片url,url,url）',
  `inner_image` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '门店内景照片（url,url,url,url）',
  `id_card_front_image` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '身份证正面照',
  `id_card_back_image` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '身份证反面照',
  `business_license` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '营业执照（图片上传）',
  `industry_license` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '行业许可证',
  `state` int(1) NULL DEFAULT 0 COMMENT '审核状态（0：未审核，1：通过；2：不通过）',
  `is_valid` tinyint(1) NULL DEFAULT NULL COMMENT '是否有效',
  `longitude` double NULL DEFAULT 0 COMMENT '经度',
  `latitude` double NULL DEFAULT 0 COMMENT '纬度',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `login_account` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '登陆账号',
  `password` varchar(35) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `insert_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '数据入库时间',
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '数据最后一次更新时间',
  `delete_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '删除时间',
  `been_deleted` tinyint(1) NULL DEFAULT NULL COMMENT '是否已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商户信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of merchant
-- ----------------------------
INSERT INTO `merchant` VALUES (4, '京猫旗舰店', '18233333333', 'fuzeren', '18233333333', '08:00', '22:00', '000001', '000001001', '000001001001', '莫干山路9999号', 'logo', 'outimages', 'innerImage', 'idCardFrontImage', 'idCardBackImage', 'businessLicense', 'industryLicense', NULL, NULL, 123, 33, 'miaoshuyixia', '18233333333', '123456', '2018-08-31 15:27:49', '2018-08-31 15:27:49', '2018-08-31 15:27:49', 0);

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `order_number` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单号',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `order_state` int(1) NULL DEFAULT NULL COMMENT '订单状态（-1：已取消, 0：未支付，1：已支付；2：已接单，3: 配送中，4: 已完成）',
  `distribute_address` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送地址',
  `merchant_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商户名称',
  `merchant_id` bigint(20) NULL DEFAULT NULL COMMENT '商户id',
  `member_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '会员名称',
  `member_id` bigint(20) NULL DEFAULT NULL COMMENT '会员id',
  `member_mobile` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `distribute_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '配送费',
  `discount` decimal(10, 2) NULL DEFAULT NULL COMMENT '优惠金额',
  `pack_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '打包费',
  `total_amount` decimal(10, 2) NULL DEFAULT NULL COMMENT '合计金额',
  `distributer_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送员名称',
  `distributer_id` bigint(20) NULL DEFAULT NULL COMMENT '配送员id',
  `distributer_mobile` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送员联系电话',
  `distribution_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送单位名称',
  `distribution_id` bigint(20) NULL DEFAULT NULL COMMENT '配送单位id',
  `insert_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '数据入库时间(订单时间)',
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '数据最后一次更新时间',
  `delete_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '删除时间',
  `been_deleted` tinyint(1) NULL DEFAULT NULL COMMENT '是否已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for order_items
-- ----------------------------
DROP TABLE IF EXISTS `order_items`;
CREATE TABLE `order_items`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `order_number` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单号',
  `order_id` bigint(20) NULL DEFAULT NULL COMMENT '订单id',
  `product_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `product_id` bigint(20) NULL DEFAULT NULL COMMENT '商品id',
  `product_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '商品价格(原价)',
  `product_discount` decimal(10, 2) NULL DEFAULT NULL COMMENT '商品优惠金额',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `image` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `insert_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '数据入库时间(订单时间)',
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '数据最后一次更新时间',
  `delete_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '删除时间',
  `been_deleted` tinyint(1) NULL DEFAULT NULL COMMENT '是否已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单详细信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for product_category
-- ----------------------------
DROP TABLE IF EXISTS `product_category`;
CREATE TABLE `product_category`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类别名称',
  `images` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '分类图片',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `state` int(1) NULL DEFAULT NULL COMMENT '审核状态（0：未审核，1：通过；2：不通过）',
  `merchant_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商户名称',
  `merchant_id` bigint(20) NULL DEFAULT NULL COMMENT '商户id',
  `insert_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '数据入库时间',
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '数据最后一次更新时间',
  `delete_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '删除时间',
  `been_deleted` tinyint(1) NULL DEFAULT NULL COMMENT '是否已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品分类表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of product_category
-- ----------------------------
INSERT INTO `product_category` VALUES (7, '饮品类', NULL, '都是喝的', NULL, '京猫旗舰店', 4, '2018-08-31 15:28:55', NULL, NULL, 0);
INSERT INTO `product_category` VALUES (8, '无肉不欢', NULL, '都是肉', NULL, '京猫旗舰店', 4, '2018-08-31 15:29:06', NULL, NULL, 0);
INSERT INTO `product_category` VALUES (9, '特色推荐', NULL, '本店特色', NULL, '京猫旗舰店', 4, '2018-08-31 15:40:26', '2018-08-31 15:40:26', '2018-08-31 15:40:26', 0);

-- ----------------------------
-- Table structure for products
-- ----------------------------
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '商品价格',
  `images` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '商品图片',
  `in_stocks` int(255) NULL DEFAULT NULL COMMENT '商品库存',
  `sales_volume` int(255) NULL DEFAULT NULL COMMENT '销量',
  `sales_month_volume` int(255) NULL DEFAULT NULL COMMENT '月销量',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `state` int(1) NULL DEFAULT NULL COMMENT '审核状态（0：未审核，1：通过；2：不通过）',
  `merchant_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商户名称',
  `merchant_id` bigint(20) NULL DEFAULT NULL COMMENT '商户id',
  `insert_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '数据入库时间',
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '数据最后一次更新时间',
  `delete_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '删除时间',
  `been_deleted` tinyint(1) NULL DEFAULT NULL COMMENT '是否已删除',
  `category_id` bigint(20) NULL DEFAULT NULL COMMENT '分类id',
  `category_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of products
-- ----------------------------
INSERT INTO `products` VALUES (12, '可乐(大杯)', 8.00, NULL, 1000, NULL, NULL, '可乐(大杯)', NULL, '京猫旗舰店', 4, '2018-08-31 15:39:16', NULL, NULL, 0, 7, '饮品类');

-- ----------------------------
-- Table structure for wechat_user_info
-- ----------------------------
DROP TABLE IF EXISTS `wechat_user_info`;
CREATE TABLE `wechat_user_info`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `openid` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'openid',
  `session_key` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'session_key',
  `nick_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'nickName',
  `avatar_url` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `country` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'country',
  `city` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'city',
  `province` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'province',
  `gender` int(1) NULL DEFAULT NULL COMMENT 'gender',
  `language` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'language',
  `insert_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '数据入库时间',
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '数据最后一次更新时间',
  `delete_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '删除时间',
  `been_deleted` tinyint(1) NULL DEFAULT NULL COMMENT '是否已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 34 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '微信用户信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of wechat_user_info
-- ----------------------------
INSERT INTO `wechat_user_info` VALUES (32, 'oLzso47yztiO-0eWdw3ByTzZrjUA', 'dxGWBLLMD/I+CTtBdG6w6w==', 'ㄝ界D盡頭', 'https://wx.qlogo.cn/mmopen/vi_32/ubZvc67Z8xmPZV4LPe0xAw9mhM5cqKB3MdyAtstsvYWa3nwQujY61c2CfbibLgEB3icaKicBhQeAHabrpSKic55w8w/132', 'China', 'Lianyungang', 'Jiangsu', 1, 'zh_CN', '2018-09-01 15:20:06', NULL, NULL, 0);

SET FOREIGN_KEY_CHECKS = 1;
