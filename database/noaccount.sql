/*
Navicat MySQL Data Transfer

Source Server         : local mysql
Source Server Version : 50729
Source Host           : localhost:3306
Source Database       : sshv1

Target Server Type    : MYSQL
Target Server Version : 50729
File Encoding         : 65001

Date: 2020-02-04 13:52:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for noaccount
-- ----------------------------
DROP TABLE IF EXISTS `noaccount`;
CREATE TABLE `noaccount` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `comment` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
