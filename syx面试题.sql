/*
 Navicat Premium Data Transfer

 Source Server         : 本地mysql
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : syx面试题

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 16/09/2022 17:17:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for syx_city
-- ----------------------------
DROP TABLE IF EXISTS `syx_city`;
CREATE TABLE `syx_city`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '城市id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '城市名称',
  `parent_id` int(0) DEFAULT NULL COMMENT '城市父类id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of syx_city
-- ----------------------------
INSERT INTO `syx_city` VALUES (1, '湖北', 0);
INSERT INTO `syx_city` VALUES (2, '武汉', 1);
INSERT INTO `syx_city` VALUES (3, '江夏', 2);
INSERT INTO `syx_city` VALUES (4, '光谷东', 2);
INSERT INTO `syx_city` VALUES (5, '汉口', 2);
INSERT INTO `syx_city` VALUES (6, '荆门', 1);
INSERT INTO `syx_city` VALUES (7, '荆州', 1);
INSERT INTO `syx_city` VALUES (8, '宜昌', 1);
INSERT INTO `syx_city` VALUES (9, '天门', 1);
INSERT INTO `syx_city` VALUES (10, '仙桃', 1);

-- ----------------------------
-- Table structure for syx_city_game_quarter
-- ----------------------------
DROP TABLE IF EXISTS `syx_city_game_quarter`;
CREATE TABLE `syx_city_game_quarter`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '事件id',
  `city_id` int(0) DEFAULT NULL COMMENT '城市id',
  `game_id` int(0) DEFAULT NULL COMMENT '比赛id',
  `quarter_id` int(0) DEFAULT NULL COMMENT '季度id',
  `date` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '日期',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of syx_city_game_quarter
-- ----------------------------
INSERT INTO `syx_city_game_quarter` VALUES (1, 8, 1, 1, '2021-12-01');
INSERT INTO `syx_city_game_quarter` VALUES (2, 2, 1, 1, '2021-12-01');
INSERT INTO `syx_city_game_quarter` VALUES (3, 9, 2, 2, '2021.11.10');
INSERT INTO `syx_city_game_quarter` VALUES (4, 6, 2, 2, '2021.11.10');
INSERT INTO `syx_city_game_quarter` VALUES (5, 10, 3, 3, '2021.11.10');
INSERT INTO `syx_city_game_quarter` VALUES (6, 8, 3, 3, '2021.11.10');

-- ----------------------------
-- Table structure for syx_game
-- ----------------------------
DROP TABLE IF EXISTS `syx_game`;
CREATE TABLE `syx_game`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '比赛id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '比赛名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of syx_game
-- ----------------------------
INSERT INTO `syx_game` VALUES (1, '乒乓球');
INSERT INTO `syx_game` VALUES (2, '篮球');
INSERT INTO `syx_game` VALUES (3, '排球');

-- ----------------------------
-- Table structure for syx_quarter
-- ----------------------------
DROP TABLE IF EXISTS `syx_quarter`;
CREATE TABLE `syx_quarter`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '季度id',
  `quarter` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '季度名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of syx_quarter
-- ----------------------------
INSERT INTO `syx_quarter` VALUES (1, '月度');
INSERT INTO `syx_quarter` VALUES (2, '季度');
INSERT INTO `syx_quarter` VALUES (3, '年度');

SET FOREIGN_KEY_CHECKS = 1;
