/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : shop_center

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 18/03/2022 14:34:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dishes
-- ----------------------------
DROP TABLE IF EXISTS `dishes`;
CREATE TABLE `dishes`  (
  `dishID` int(0) NOT NULL,
  `dishName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `dishIMG` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `dishDis` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `dishNum` int(0) NOT NULL,
  `dishMon` float(255, 0) NOT NULL,
  PRIMARY KEY (`dishID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dishes
-- ----------------------------
INSERT INTO `dishes` VALUES (1, '酸菜鱼套餐', '酸菜鱼的网址', '这是好吃的酸菜鱼', 99999, 20);
INSERT INTO `dishes` VALUES (2, '红烧肉套餐', '红烧肉的网址', '这是好吃都红烧肉', 99999, 10);

-- ----------------------------
-- Table structure for locations
-- ----------------------------
DROP TABLE IF EXISTS `locations`;
CREATE TABLE `locations`  (
  `userID` int(0) NOT NULL,
  `loca` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of locations
-- ----------------------------
INSERT INTO `locations` VALUES (1, '柜101');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `orderNumber` int(0) NOT NULL,
  `account` int(0) NOT NULL,
  `orderTime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `money` float(255, 0) NOT NULL,
  `isFinished` bit(1) NOT NULL COMMENT '0未完成，1完成',
  PRIMARY KEY (`orderNumber`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (1, 1, '2022.3.16', 50, b'0');
INSERT INTO `orders` VALUES (2, 2, '2022.3.16', 20, b'0');

-- ----------------------------
-- Table structure for speficorders
-- ----------------------------
DROP TABLE IF EXISTS `speficorders`;
CREATE TABLE `speficorders`  (
  `orderNumber` int(0) NOT NULL,
  `dishID` int(0) NOT NULL,
  `disNum` int(0) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of speficorders
-- ----------------------------
INSERT INTO `speficorders` VALUES (1, 1, 2);
INSERT INTO `speficorders` VALUES (1, 2, 1);
INSERT INTO `speficorders` VALUES (2, 1, 1);

-- ----------------------------
-- Table structure for todolist
-- ----------------------------
DROP TABLE IF EXISTS `todolist`;
CREATE TABLE `todolist`  (
  `userID` int(0) NOT NULL,
  `date` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of todolist
-- ----------------------------
INSERT INTO `todolist` VALUES (2, '2022-03-18 13:38:30');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `account` int(0) NOT NULL COMMENT '账号',
  `userName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `sex` bit(1) NULL DEFAULT NULL COMMENT '性别',
  `grade` int(0) NULL DEFAULT NULL COMMENT '年级',
  `major` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '专业',
  `birthday` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '生日',
  `age` int(0) NULL DEFAULT NULL COMMENT '年龄',
  `tel` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '电话',
  PRIMARY KEY (`account`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'wyl', '123', b'1', 2021, 'js', '2022-03-22', 19, '111');
INSERT INTO `users` VALUES (2, 'JZH', '123', b'0', 2020, 'CS', '2022-03-16', 19, '123');

-- ----------------------------
-- Table structure for waiters
-- ----------------------------
DROP TABLE IF EXISTS `waiters`;
CREATE TABLE `waiters`  (
  `account` int(0) NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of waiters
-- ----------------------------
INSERT INTO `waiters` VALUES (1, '123456');
INSERT INTO `waiters` VALUES (2, '111111');
INSERT INTO `waiters` VALUES (3, '123456');

SET FOREIGN_KEY_CHECKS = 1;
