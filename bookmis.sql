/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : bookmis

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2019-01-23 21:46:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `book_info`
-- ----------------------------
DROP TABLE IF EXISTS `book_info`;
CREATE TABLE `book_info` (
  `book_id` varchar(64) NOT NULL COMMENT 'ID，主键',
  `book_name` varchar(512) NOT NULL COMMENT '书名',
  `book_author` varchar(256) NOT NULL COMMENT '作者',
  `book_pubdate` datetime NOT NULL COMMENT '发行时间',
  `book_price` decimal(16,2) NOT NULL COMMENT '单价',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book_info
-- ----------------------------
INSERT INTO `book_info` VALUES ('b0001', '活着', 'AAAAA', '2010-02-10 09:37:29', '35.50');
INSERT INTO `book_info` VALUES ('b0002', '坚持', 'BBBB', '2000-06-22 09:38:12', '22.00');
