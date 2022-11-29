-- MySQL dump 10.13  Distrib 5.5.28, for Win64 (x86)
--
-- Host: localhost    Database: web1.0
-- ------------------------------------------------------
-- Server version	5.5.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `web1.0`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `web1.0` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `web1.0`;

--
-- Table structure for table `manager`
--

DROP TABLE IF EXISTS `manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `manager` (
  `mana_id` varchar(10) NOT NULL,
  `mana_username` varchar(45) DEFAULT NULL,
  `mana_password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`mana_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manager`
--

LOCK TABLES `manager` WRITE;
/*!40000 ALTER TABLE `manager` DISABLE KEYS */;
INSERT INTO `manager` VALUES ('m20040103','zzy','123');
/*!40000 ALTER TABLE `manager` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `order_id` varchar(6) NOT NULL,
  `order_time` date DEFAULT NULL,
  `order_state` varchar(45) DEFAULT NULL,
  `order_total` varchar(45) DEFAULT NULL,
  `sale_id` varchar(10) DEFAULT NULL,
  `user_id` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `orders_salesman_sale_id_fk` (`sale_id`),
  KEY `orders_user_user_id_fk` (`user_id`),
  CONSTRAINT `orders_salesman_sale_id_fk` FOREIGN KEY (`sale_id`) REFERENCES `salesman` (`sale_id`),
  CONSTRAINT `orders_user_user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
INSERT INTO `order` VALUES ('o00001','2022-10-01','已完成','267.91','s00001','u00001'),('o00002','2022-10-02','已完成','1071.15','s00003','u00002'),('o00003','2022-10-03','未完成','667.91','s00004','u00003'),('o00004','2022-10-04','已完成','1590.10','s00002','u00004'),('o00005','2022-10-05','已完成','136.60','s00005','u00005');
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders_pro`
--

DROP TABLE IF EXISTS `orders_pro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders_pro` (
  `order_id` varchar(6) DEFAULT NULL,
  `pro_id` varchar(6) DEFAULT NULL,
  `pro_num` int(11) DEFAULT NULL,
  `pro_total` decimal(8,2) DEFAULT NULL,
  KEY `order_id_idx` (`order_id`),
  KEY `pro_id_idx` (`pro_id`),
  CONSTRAINT `order_id` FOREIGN KEY (`order_id`) REFERENCES `order` (`order_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `pro_id_fk` FOREIGN KEY (`pro_id`) REFERENCES `product` (`pro_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders_pro`
--

LOCK TABLES `orders_pro` WRITE;
/*!40000 ALTER TABLE `orders_pro` DISABLE KEYS */;
INSERT INTO `orders_pro` VALUES ('o00001','p00003',1,67.91),('o00001','p00005',2,200.00),('o00002','p00004',3,1035.15),('o00002','p00001',2,36.60),('o00003','p00002',3,600.00),('o00003','p00003',1,67.91),('o00004','p00005',3,300.00),('o00004','p00004',2,690.10),('o00004','p00002',3,600.00),('o00005','p00001',2,36.60),('o00005','p00005',1,100.00);
/*!40000 ALTER TABLE `orders_pro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `pro_id` varchar(6) NOT NULL,
  `pro_price` decimal(8,2) DEFAULT NULL,
  `pro_detail` varchar(100) DEFAULT NULL,
  `pro_url` varchar(45) DEFAULT NULL,
  `pro_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`pro_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES ('p00001',18.30,'水杯运动大水壶超大容量户外便携吨吨桶耐高温水瓶健身男夏季杯子','img/cup.jpg','水杯'),('p00002',200.00,'新款书包女生小学生一二三到六年级女孩减负护脊超轻便儿童双肩包','img/bag.jpg','书包'),('p00003',67.91,'恒博乒乓球拍三星五星初学者兵乓球直拍横拍儿童小学生专业级双拍','img/ppqp.jpg','乒乓球拍'),('p00004',345.05,'WITESS正品室外耐磨牛皮真皮手感中小学生7号成人比赛篮球5号儿童','img/basketball.jpg','篮球'),('p00005',100.00,'Java核心技术卷1基础知识+Java核心技术卷2高级特性(原书第11版)套装共2本 计算机程序开发 程序设计基础入门教程自学书籍机械工业','img/java.jpg','Java教程');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salesman`
--

DROP TABLE IF EXISTS `salesman`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salesman` (
  `sale_id` varchar(10) NOT NULL,
  `sale_name` varchar(45) DEFAULT NULL,
  `sale_username` varchar(45) DEFAULT NULL,
  `sale_password` varchar(45) DEFAULT NULL,
  `sale_phone` int(11) DEFAULT NULL,
  `sale_sex` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`sale_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salesman`
--

LOCK TABLES `salesman` WRITE;
/*!40000 ALTER TABLE `salesman` DISABLE KEYS */;
INSERT INTO `salesman` VALUES ('s00001','周卓颖','周卓颖','zzy',123456,'男'),('s00002','cjx_sale','sale_cjx','cjx',987654,'男'),('s00003','yws_sale','sale_yws','yws',654322,'女'),('s00004','lmk_sale','sale_lmk','lmk',123456,'男'),('s00005','zzy_sale','sale_zzy','zzy',147000,'女'),('s00006','rava','dym','smy',135642,'男'),('s00007','fvbebf','tdm','jmum',634547,'男'),('s00008','rvaer','nfg','zn',758322,'女'),('s00009','aerba','y,','mjyu',765465,'男'),('s00010','vrba','dmyd','sy',877777,'女'),('s00011','rrtsnyt','yfmd','szx',124155,'男'),('s00012','rrtsnyt','stsn','tnb',242343,'男'),('s00013','ndn','ymss','nrtbn',564563,'女'),('s00014','ddddddddytn','dytmy','erhyj',900000,'男'),('s00015','dnnytd','dmnh','uk',576444,'女'),('s00016','ymd','nsymn','oitm',648322,'男'),('s00017','tynydm','xdy','tmr',464844,'男'),('s00018','yd','nmtnm','nmynts',256424,'女'),('s00019','ymdd','symny','uuhmu',790009,'男'),('s00020','mydm','syt','ujhmh',843704,'女');
/*!40000 ALTER TABLE `salesman` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` varchar(6) NOT NULL,
  `user_phone` int(11) DEFAULT NULL,
  `user_name` varchar(45) NOT NULL,
  `user_password` varchar(45) NOT NULL,
  `user_address` varchar(100) DEFAULT NULL,
  `sale_id` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `user_salesman_sale_id_fk` (`sale_id`),
  CONSTRAINT `user_salesman_sale_id_fk` FOREIGN KEY (`sale_id`) REFERENCES `salesman` (`sale_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('u00001',1234567,'luomaike','luomaike','中央民族大学','s00001'),('u00002',7654321,'yuwanshu','yuwanshu','中央民族大学','s00001'),('u00003',2345678,'geyutong','geyutong','中央民族大学','s00003'),('u00004',8765432,'shijie','shijie','中央民族大学','s00004'),('u00005',3456789,'lizhuobing','lizhuobing','中央民族大学','s00002');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-20  0:08:39
