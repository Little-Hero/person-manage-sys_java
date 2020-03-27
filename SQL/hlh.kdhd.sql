/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.25-log : Database - manger
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`manger` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `manger`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `admin` */

insert  into `admin`(`id`,`username`,`password`) values (1,'admin','123'),(2,'root','123'),(3,'wc','wc');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(20) NOT NULL COMMENT '姓名',
  `sex` varchar(10) DEFAULT NULL COMMENT '性别',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `phone` int(13) DEFAULT NULL COMMENT '电话',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `woking` varchar(20) DEFAULT NULL COMMENT '职位',
  `department` varchar(20) DEFAULT NULL COMMENT '部门',
  `adress` varchar(100) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

/*Data for the table `users` */

insert  into `users`(`id`,`name`,`sex`,`age`,`phone`,`email`,`woking`,`department`,`adress`) values (1,'东方','女',21,14,'2332@qq.com','241','人事行政部','235'),(2,'东方月初','男',11,1251515,'dfyc@qq.com','刺客','人事行政部','XXXXXXXXXXX'),(10,'东方月初','男',20,666666666,'dfyc@qq.com','法师','高手部','XXX市XXX县'),(11,'涂山雅雅','男',12,6987969,'tsyy@qq.com','法师','运营部','XXX市XXX县'),(12,'涂山红红','女',15,2121212121,'tshh@qq.com','法师','运营部','gdfgdfgdf'),(23,'阿伟','女',234,877878787,'3634@qq.com','刺客','财务部','436'),(24,'东方','女',52,252,'3363@qq.com','法师','产品开发部','ytrytry');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
