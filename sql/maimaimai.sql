-- MySQL dump 10.13  Distrib 5.1.33, for Win32 (ia32)
--
-- Host: localhost    Database: maimaimai
-- ------------------------------------------------------
-- Server version	5.5.20

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
-- Table structure for table `favorites`
--

DROP TABLE IF EXISTS `favorites`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `favorites` (
  `id` int(10) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `itemid` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `favorites`
--

LOCK TABLES `favorites` WRITE;
/*!40000 ALTER TABLE `favorites` DISABLE KEYS */;
/*!40000 ALTER TABLE `favorites` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `iorder`
--

DROP TABLE IF EXISTS `iorder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `iorder` (
  `id` int(10) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `shopname` varchar(20) DEFAULT NULL,
  `itemid` int(10) DEFAULT NULL,
  `buytime` datetime DEFAULT NULL,
  `num` int(10) DEFAULT NULL,
  `grade` int(10) DEFAULT NULL,
  `orderdesc` varchar(40) DEFAULT NULL,
  `status` varchar(5) DEFAULT NULL,
  `useridea` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `iorder`
--

LOCK TABLES `iorder` WRITE;
/*!40000 ALTER TABLE `iorder` DISABLE KEYS */;
/*!40000 ALTER TABLE `iorder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `id` int(10) NOT NULL,
  `itemname` varchar(20) DEFAULT NULL,
  `price` float(10,2) DEFAULT NULL,
  `num` int(10) DEFAULT NULL,
  `shopname` varchar(20) DEFAULT NULL,
  `itemdesc` varchar(40) DEFAULT NULL,
  `grade` int(10) DEFAULT NULL,
  `itemcat` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rootcat`
--

DROP TABLE IF EXISTS `rootcat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rootcat` (
  `id` int(10) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `count` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rootcat`
--

LOCK TABLES `rootcat` WRITE;
/*!40000 ALTER TABLE `rootcat` DISABLE KEYS */;
INSERT INTO `rootcat` VALUES (5,'上衣',NULL),(6,'裤子',NULL),(7,'帽子',NULL);
/*!40000 ALTER TABLE `rootcat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shop`
--

DROP TABLE IF EXISTS `shop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shop` (
  `shopname` varchar(20) NOT NULL,
  `shopdesc` varchar(40) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `grade` int(10) DEFAULT NULL,
  PRIMARY KEY (`shopname`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shop`
--

LOCK TABLES `shop` WRITE;
/*!40000 ALTER TABLE `shop` DISABLE KEYS */;
INSERT INTO `shop` VALUES ('adminshop','这是admin的shop','admin',5),('myshop','this is my shop','ymc',5),('usershop','this is user shop','user',5),('ymc2shop','hahaha','ymc2',5);
/*!40000 ALTER TABLE `shop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shopcar`
--

DROP TABLE IF EXISTS `shopcar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shopcar` (
  `id` int(10) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `itemid` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shopcar`
--

LOCK TABLES `shopcar` WRITE;
/*!40000 ALTER TABLE `shopcar` DISABLE KEYS */;
/*!40000 ALTER TABLE `shopcar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `soncat`
--

DROP TABLE IF EXISTS `soncat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `soncat` (
  `id` int(10) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `fa` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `soncat`
--

LOCK TABLES `soncat` WRITE;
/*!40000 ALTER TABLE `soncat` DISABLE KEYS */;
INSERT INTO `soncat` VALUES (14,'夹克',5),(15,'背心',5),(16,'牛仔裤',6),(17,'运动裤',6),(18,'滑雪帽',7),(19,'棒球帽',7);
/*!40000 ALTER TABLE `soncat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `sex` varchar(2) NOT NULL,
  `email` varchar(50) NOT NULL,
  `grade` varchar(20) NOT NULL,
  `userdesc` varchar(20) DEFAULT NULL,
  `shopname` varchar(20) DEFAULT NULL,
  `haveimg` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('123','123','M','123','1','haha','123','0'),('admin','admin','M','admin','2','duang duang !!!','adminshop','0'),('user','user','M','user','2','haha','usershop','0'),('ymc','ymc','M','ymc@ymc.com','3','今天天气不错~','myshop','0'),('ymc2','ymc','M','ymc2@ymc.com','2','haha','ymc2shop','0');
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

-- Dump completed on 2015-03-02 13:44:00
