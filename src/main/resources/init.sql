-- 主从MySQL实例分别建立ds0,ds1两个数据库，在ds0,ds1分别执行下面SQL进行分表
CREATE TABLE `user_0` (
`id` INT ( 11 ) NOT NULL,
`name` VARCHAR ( 255 ) DEFAULT NULL,
`age` INT ( 11 ) DEFAULT NULL,
PRIMARY KEY ( `id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;
CREATE TABLE `user_1` (
`id` INT ( 11 ) NOT NULL,
`name` VARCHAR ( 255 ) DEFAULT NULL,
`age` INT ( 11 ) DEFAULT NULL,
PRIMARY KEY ( `id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;