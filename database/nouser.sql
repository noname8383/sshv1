/*
Navicat MySQL Data Transfer

Source Server         : local mysql
Source Server Version : 50729
Source Host           : localhost:3306
Source Database       : sshv1

Target Server Type    : MYSQL
Target Server Version : 50729
File Encoding         : 65001

Date: 2020-02-04 13:52:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for nouser
-- ----------------------------
DROP TABLE IF EXISTS `nouser`;
CREATE TABLE `nouser` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
