
-- 创建数据库
DROP DATABASE IF EXISTS user_test;
CREATE DATABASE user_test;

-- 使用数据库
USE  user_test;

-- 创建用户信息表
CREATE TABLE user(
  `user_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_name` VARCHAR(120) NOT NULL COMMENT '用户名称',
  `age` INT NOT NULL COMMENT '用户年龄',
  `address` VARCHAR (1024) NOT null COMMENT '地址',
  `user_phone` VARCHAR(64) NOT NULL COMMENT '用户电话',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP() COMMENT '创建的时间',
  PRIMARY KEY (user_id)
)ENGINE =INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='用户信息';

-- 插入初始化数据
insert into
  user_info(user_name,age,address,user_phone)
values
  ('小明',21,'北京','13712345678'),
  ('小张',22,'上海','13212345678');
