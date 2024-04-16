/*
SQLyog Ultimate v8.82 
MySQL - 5.1.45-community : Database - office_manager
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`office_manager` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `office_manager`;

/*Table structure for table `emp_attendance` */

DROP TABLE IF EXISTS `emp_attendance`;

CREATE TABLE `emp_attendance` (
  `ecode` varchar(30) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `time_in` varchar(30) DEFAULT NULL,
  `time_out` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `emp_mstr` */

DROP TABLE IF EXISTS `emp_mstr`;

CREATE TABLE `emp_mstr` (
  `ecode` int(20) NOT NULL,
  `ename` varchar(30) DEFAULT NULL,
  `edob` date DEFAULT NULL,
  `egender` varchar(20) DEFAULT NULL,
  `epost` varchar(30) DEFAULT NULL,
  `eaddr` varchar(30) DEFAULT NULL,
  `ecity` varchar(30) DEFAULT NULL,
  `econt` varchar(15) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `idname` varchar(30) DEFAULT NULL,
  `idno` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ecode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `emp_status` */

DROP TABLE IF EXISTS `emp_status`;

CREATE TABLE `emp_status` (
  `ecode` varchar(30) NOT NULL,
  `join_date` date DEFAULT NULL,
  `last_work_date` date DEFAULT NULL,
  `emp_status` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ecode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `user` varchar(30) NOT NULL,
  `pswd` varchar(30) DEFAULT NULL,
  `utype` varchar(30) DEFAULT NULL,
  `ac_status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
