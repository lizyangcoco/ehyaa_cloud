
-- 创建项目配置sql
/*
 Navicat Premium Data Transfer

 Source Server         : Licocom.com
 Source Server Type    : MySQL
 Source Server Version : 50558
 Source Host           : 134.175.167.28:3306
 Source Schema         : ehyaa_cloud

 Target Server Type    : MySQL
 Target Server Version : 50558
 File Encoding         : 65001

 Date: 22/12/2019 19:09:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for a
-- ----------------------------
DROP TABLE IF EXISTS `a`;
CREATE TABLE `a`  (
  `a` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
