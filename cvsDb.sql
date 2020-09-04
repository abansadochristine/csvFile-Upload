/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.6.21-log : Database - csv
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `csvinfo` */

CREATE TABLE `csvinfo` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `a` varchar(250) DEFAULT NULL,
  `b` varchar(250) DEFAULT NULL,
  `c` varchar(250) DEFAULT NULL,
  `d` varchar(50) DEFAULT NULL,
  `e` varchar(250) DEFAULT NULL,
  `f` varchar(250) DEFAULT NULL,
  `g` varchar(250) DEFAULT NULL,
  `h` varchar(50) DEFAULT NULL,
  `i` varchar(50) DEFAULT NULL,
  `j` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `csvinfo` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
