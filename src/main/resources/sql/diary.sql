/*
Navicat MySQL Data Transfer

Source Server         : hl
Source Server Version : 80019
Source Host           : localhost:3306
Source Database       : diary

Target Server Type    : MYSQL
Target Server Version : 80019
File Encoding         : 65001

Date: 2020-03-27 15:04:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for common
-- ----------------------------
DROP TABLE IF EXISTS `common`;
CREATE TABLE `common` (
  `from` varchar(255) NOT NULL,
  `systemVersion` varchar(255) NOT NULL,
  `deviceModel` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of common
-- ----------------------------

-- ----------------------------
-- Table structure for release
-- ----------------------------
DROP TABLE IF EXISTS `release`;
CREATE TABLE `release` (
  `id` int(255) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `uid` int(255) unsigned zerofill DEFAULT NULL,
  `openid` varchar(255) NOT NULL,
  `createtime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0',
  `weather` int(5) unsigned zerofill NOT NULL,
  `mood` int(5) unsigned zerofill NOT NULL,
  `location` varchar(255) DEFAULT NULL,
  `music` int(5) unsigned zerofill DEFAULT NULL,
  `musicurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `theme` int(5) unsigned zerofill DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of release
-- ----------------------------
