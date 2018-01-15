-- ----------------------------
-- Create database boot and set charset
-- ----------------------------
CREATE DATABASE boot CHARACTER SET utf8 COLLATE utf8_general_ci;;

-- ----------------------------
-- Table structure for user
-- ----------------------------
USE boot;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `NAME` varchar(128) DEFAULT NULL COMMENT '用户名',
  `AGE` tinyint(4) DEFAULT NULL COMMENT '年龄',
  `PHONE_NO` varchar(11) DEFAULT NULL COMMENT '手机号',
  `ADDRESS` varchar(255) DEFAULT NULL COMMENT '地址',
  `IDENTITY_NO` varchar(18) DEFAULT NULL COMMENT '身份证号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '啦啦啦', '18', '18937128888', '上海市黄浦区西藏南路', '411388199909299999');