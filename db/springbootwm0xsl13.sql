-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springbootwm0xsl13
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `springbootwm0xsl13`
--

/*!40000 DROP DATABASE IF EXISTS `springbootwm0xsl13`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `springbootwm0xsl13` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `springbootwm0xsl13`;

--
-- Table structure for table `cangkuxinxi`
--

DROP TABLE IF EXISTS `cangkuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cangkuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `cangkuhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '仓库号',
  `leixing` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '类型',
  `weizhi` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '位置',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=90 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='仓库信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cangkuxinxi`
--

LOCK TABLES `cangkuxinxi` WRITE;
/*!40000 ALTER TABLE `cangkuxinxi` DISABLE KEYS */;
INSERT INTO `cangkuxinxi` VALUES (81,'2024-12-11 08:06:48','仓库号1','常温库','位置1'),(82,'2024-12-11 08:06:48','仓库号2','常温库','位置2'),(83,'2024-12-11 08:06:48','仓库号3','常温库','位置3'),(84,'2024-12-11 08:06:48','仓库号4','常温库','位置4'),(85,'2024-12-11 08:06:48','仓库号5','常温库','位置5'),(86,'2024-12-11 08:06:48','仓库号6','常温库','位置6'),(87,'2024-12-11 08:06:48','仓库号7','常温库','位置7'),(88,'2024-12-11 08:06:48','仓库号8','常温库','位置8'),(89,'2024-12-11 08:13:19','001','常温库','XX位置');
/*!40000 ALTER TABLE `cangkuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chukuguanli`
--

DROP TABLE IF EXISTS `chukuguanli`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chukuguanli` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chukudanhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '出库单号',
  `huowumingcheng` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '货物名称',
  `huowuleixing` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '货物类型',
  `guige` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '规格',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `shoujia` int(11) DEFAULT NULL COMMENT '售价',
  `zongjia` int(11) DEFAULT NULL COMMENT '总价',
  `chukushijian` date DEFAULT NULL COMMENT '出库时间',
  `chukubeizhu` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '出库备注',
  `huowutupian` longtext COLLATE utf8mb4_unicode_ci COMMENT '货物图片',
  `yuangonggonghao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '员工姓名',
  PRIMARY KEY (`id`),
  UNIQUE KEY `chukudanhao` (`chukudanhao`),
  KEY `yuangonggonghao` (`yuangonggonghao`,`yuangongxingming`),
  CONSTRAINT `chukuguanli_ibfk_1` FOREIGN KEY (`yuangonggonghao`, `yuangongxingming`) REFERENCES `yuangong` (`yuangonggonghao`, `yuangongxingming`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='出库管理';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chukuguanli`
--

LOCK TABLES `chukuguanli` WRITE;
/*!40000 ALTER TABLE `chukuguanli` DISABLE KEYS */;
INSERT INTO `chukuguanli` VALUES (51,'2024-12-11 08:06:48','1111111111','货物名称1','货物类型1','规格1',1,1,1,'2024-12-11','出库备注1','upload/chukuguanli_huowutupian1.jpg,upload/chukuguanli_huowutupian2.jpg,upload/chukuguanli_huowutupian3.jpg','员工工号1','员工姓名1'),(52,'2024-12-11 08:06:48','2222222222','货物名称2','货物类型2','规格2',2,2,2,'2024-12-11','出库备注2','upload/chukuguanli_huowutupian2.jpg,upload/chukuguanli_huowutupian3.jpg,upload/chukuguanli_huowutupian4.jpg','员工工号2','员工姓名2'),(53,'2024-12-11 08:06:48','3333333333','货物名称3','货物类型3','规格3',3,3,3,'2024-12-11','出库备注3','upload/chukuguanli_huowutupian3.jpg,upload/chukuguanli_huowutupian4.jpg,upload/chukuguanli_huowutupian5.jpg','员工工号3','员工姓名3'),(54,'2024-12-11 08:06:48','4444444444','货物名称4','货物类型4','规格4',4,4,4,'2024-12-11','出库备注4','upload/chukuguanli_huowutupian4.jpg,upload/chukuguanli_huowutupian5.jpg,upload/chukuguanli_huowutupian6.jpg','员工工号4','员工姓名4'),(55,'2024-12-11 08:06:48','5555555555','货物名称5','货物类型5','规格5',5,5,5,'2024-12-11','出库备注5','upload/chukuguanli_huowutupian5.jpg,upload/chukuguanli_huowutupian6.jpg,upload/chukuguanli_huowutupian7.jpg','员工工号5','员工姓名5'),(56,'2024-12-11 08:06:48','6666666666','货物名称6','货物类型6','规格6',6,6,6,'2024-12-11','出库备注6','upload/chukuguanli_huowutupian6.jpg,upload/chukuguanli_huowutupian7.jpg,upload/chukuguanli_huowutupian8.jpg','员工工号6','员工姓名6'),(57,'2024-12-11 08:06:48','7777777777','货物名称7','货物类型7','规格7',7,7,7,'2024-12-11','出库备注7','upload/chukuguanli_huowutupian7.jpg,upload/chukuguanli_huowutupian8.jpg,upload/chukuguanli_huowutupian9.jpg','员工工号7','员工姓名7'),(58,'2024-12-11 08:06:48','8888888888','货物名称8','货物类型8','规格8',8,8,8,'2024-12-11','出库备注8','upload/chukuguanli_huowutupian8.jpg,upload/chukuguanli_huowutupian9.jpg,upload/chukuguanli_huowutupian10.jpg','员工工号8','员工姓名8'),(59,'2024-12-11 08:14:00','1724055225763','XX货物','XX类型','XX',30,150,4500,'2024-12-11','XX备注','upload/1724055149497.jpg','111','张三');
/*!40000 ALTER TABLE `chukuguanli` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  `url` varchar(500) DEFAULT NULL COMMENT 'url',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg',NULL),(2,'picture2','upload/picture2.jpg',NULL),(3,'picture3','upload/picture3.jpg',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gongyingshang`
--

DROP TABLE IF EXISTS `gongyingshang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gongyingshang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gongyingshangmingcheng` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '供应商名称',
  `fuzeren` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '负责人',
  `dianhua` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '电话',
  `dizhi` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='供应商';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gongyingshang`
--

LOCK TABLES `gongyingshang` WRITE;
/*!40000 ALTER TABLE `gongyingshang` DISABLE KEYS */;
INSERT INTO `gongyingshang` VALUES (71,'2024-12-11 08:06:48','供应商名称1','负责人1','13823888881','地址1'),(72,'2024-12-11 08:06:48','供应商名称2','负责人2','13823888882','地址2'),(73,'2024-12-11 08:06:48','供应商名称3','负责人3','13823888883','地址3'),(74,'2024-12-11 08:06:48','供应商名称4','负责人4','13823888884','地址4'),(75,'2024-12-11 08:06:48','供应商名称5','负责人5','13823888885','地址5'),(76,'2024-12-11 08:06:48','供应商名称6','负责人6','13823888886','地址6'),(77,'2024-12-11 08:06:48','供应商名称7','负责人7','13823888887','地址7'),(78,'2024-12-11 08:06:48','供应商名称8','负责人8','13823888888','地址8'),(79,'2024-12-11 08:13:09','XX供应商','李四','15111111111','XX地址'),(80,'2024-12-11 08:14:54','XX供应商','赵六','18111111111','XX地址');
/*!40000 ALTER TABLE `gongyingshang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huowuleixing`
--

DROP TABLE IF EXISTS `huowuleixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huowuleixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huowuleixing` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '货物类型',
  PRIMARY KEY (`id`),
  KEY `huowuleixing_huowuleixing` (`huowuleixing`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='货物类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huowuleixing`
--

LOCK TABLES `huowuleixing` WRITE;
/*!40000 ALTER TABLE `huowuleixing` DISABLE KEYS */;
INSERT INTO `huowuleixing` VALUES (31,'2024-12-11 08:06:48','货物类型1'),(32,'2024-12-11 08:06:48','货物类型2'),(33,'2024-12-11 08:06:48','货物类型3'),(34,'2024-12-11 08:06:48','货物类型4'),(35,'2024-12-11 08:06:48','货物类型5'),(36,'2024-12-11 08:06:48','货物类型6'),(37,'2024-12-11 08:06:48','货物类型7'),(38,'2024-12-11 08:06:48','货物类型8'),(39,'2024-12-11 08:12:04','XX类型');
/*!40000 ALTER TABLE `huowuleixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huowuxinxi`
--

DROP TABLE IF EXISTS `huowuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huowuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huowumingcheng` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '货物名称',
  `huowuleixing` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '货物类型',
  `guige` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '规格',
  `shuliang` int(11) DEFAULT NULL COMMENT '库存',
  `jinjia` int(11) DEFAULT NULL COMMENT '进价',
  `shoujia` int(11) DEFAULT NULL COMMENT '售价',
  `gongyingshang` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '供应商',
  `cangkuhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '仓库号',
  `huowujieshao` longtext COLLATE utf8mb4_unicode_ci COMMENT '货物介绍',
  `huowutupian` longtext COLLATE utf8mb4_unicode_ci COMMENT '货物图片',
  PRIMARY KEY (`id`),
  KEY `huowuleixing` (`huowuleixing`),
  CONSTRAINT `huowuxinxi_ibfk_1` FOREIGN KEY (`huowuleixing`) REFERENCES `huowuleixing` (`huowuleixing`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='货物信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huowuxinxi`
--

LOCK TABLES `huowuxinxi` WRITE;
/*!40000 ALTER TABLE `huowuxinxi` DISABLE KEYS */;
INSERT INTO `huowuxinxi` VALUES (21,'2024-12-11 08:06:48','货物名称1','货物类型1','规格1',1,1,1,'供应商1','仓库号1','货物介绍1','upload/huowuxinxi_huowutupian1.jpg,upload/huowuxinxi_huowutupian2.jpg,upload/huowuxinxi_huowutupian3.jpg'),(22,'2024-12-11 08:06:48','货物名称2','货物类型2','规格2',2,2,2,'供应商2','仓库号2','货物介绍2','upload/huowuxinxi_huowutupian2.jpg,upload/huowuxinxi_huowutupian3.jpg,upload/huowuxinxi_huowutupian4.jpg'),(23,'2024-12-11 08:06:48','货物名称3','货物类型3','规格3',3,3,3,'供应商3','仓库号3','货物介绍3','upload/huowuxinxi_huowutupian3.jpg,upload/huowuxinxi_huowutupian4.jpg,upload/huowuxinxi_huowutupian5.jpg'),(24,'2024-12-11 08:06:48','货物名称4','货物类型4','规格4',4,4,4,'供应商4','仓库号4','货物介绍4','upload/huowuxinxi_huowutupian4.jpg,upload/huowuxinxi_huowutupian5.jpg,upload/huowuxinxi_huowutupian6.jpg'),(25,'2024-12-11 08:06:48','货物名称5','货物类型5','规格5',5,5,5,'供应商5','仓库号5','货物介绍5','upload/huowuxinxi_huowutupian5.jpg,upload/huowuxinxi_huowutupian6.jpg,upload/huowuxinxi_huowutupian7.jpg'),(26,'2024-12-11 08:06:48','货物名称6','货物类型6','规格6',6,6,6,'供应商6','仓库号6','货物介绍6','upload/huowuxinxi_huowutupian6.jpg,upload/huowuxinxi_huowutupian7.jpg,upload/huowuxinxi_huowutupian8.jpg'),(27,'2024-12-11 08:06:48','货物名称7','货物类型7','规格7',7,7,7,'供应商7','仓库号7','货物介绍7','upload/huowuxinxi_huowutupian7.jpg,upload/huowuxinxi_huowutupian8.jpg,upload/huowuxinxi_huowutupian9.jpg'),(28,'2024-12-11 08:06:48','货物名称8','货物类型8','规格8',8,8,8,'供应商8','仓库号8','货物介绍8','upload/huowuxinxi_huowutupian8.jpg,upload/huowuxinxi_huowutupian9.jpg,upload/huowuxinxi_huowutupian10.jpg'),(29,'2024-12-11 08:12:33','XX货物','XX类型','XX',40,80,150,'供应商名称1','仓库号1','<p>文本框支持输入详情内容和图片文本框支持输入详情内容和图片</p><p>文本框支持输入详情内容和图片文本框支持输入详情内容和图片</p><p>文本框支持输入详情内容和图片文本框支持输入详情内容和图片</p><p>文本框支持输入详情内容和图片文本框支持输入详情内容和图片</p><p>文本框支持输入详情内容和图片文本框支持输入详情内容和图片</p><p>文本框支持输入详情内容和图片文本框支持输入详情内容和图片</p><p><br></p>','upload/1724055149497.jpg');
/*!40000 ALTER TABLE `huowuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kucunpandian`
--

DROP TABLE IF EXISTS `kucunpandian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kucunpandian` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huowumingcheng` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '货物名称',
  `huowuleixing` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '货物类型',
  `guige` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '规格',
  `shuliang` int(11) DEFAULT NULL COMMENT '库存量',
  `pandianshuliang` int(11) DEFAULT NULL COMMENT '盘点数量',
  `pandianshijian` date DEFAULT NULL COMMENT '盘点时间',
  `pandianbeizhu` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '盘点备注',
  `huowutupian` longtext COLLATE utf8mb4_unicode_ci COMMENT '货物图片',
  `yuangonggonghao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '员工姓名',
  PRIMARY KEY (`id`),
  KEY `yuangonggonghao` (`yuangonggonghao`,`yuangongxingming`),
  CONSTRAINT `kucunpandian_ibfk_1` FOREIGN KEY (`yuangonggonghao`, `yuangongxingming`) REFERENCES `yuangong` (`yuangonggonghao`, `yuangongxingming`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='库存盘点';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kucunpandian`
--

LOCK TABLES `kucunpandian` WRITE;
/*!40000 ALTER TABLE `kucunpandian` DISABLE KEYS */;
INSERT INTO `kucunpandian` VALUES (61,'2024-12-11 08:06:48','货物名称1','货物类型1','规格1',1,1,'2024-12-11','盘点备注1','upload/kucunpandian_huowutupian1.jpg,upload/kucunpandian_huowutupian2.jpg,upload/kucunpandian_huowutupian3.jpg','员工工号1','员工姓名1'),(62,'2024-12-11 08:06:48','货物名称2','货物类型2','规格2',2,2,'2024-12-11','盘点备注2','upload/kucunpandian_huowutupian2.jpg,upload/kucunpandian_huowutupian3.jpg,upload/kucunpandian_huowutupian4.jpg','员工工号2','员工姓名2'),(63,'2024-12-11 08:06:48','货物名称3','货物类型3','规格3',3,3,'2024-12-11','盘点备注3','upload/kucunpandian_huowutupian3.jpg,upload/kucunpandian_huowutupian4.jpg,upload/kucunpandian_huowutupian5.jpg','员工工号3','员工姓名3'),(64,'2024-12-11 08:06:48','货物名称4','货物类型4','规格4',4,4,'2024-12-11','盘点备注4','upload/kucunpandian_huowutupian4.jpg,upload/kucunpandian_huowutupian5.jpg,upload/kucunpandian_huowutupian6.jpg','员工工号4','员工姓名4'),(65,'2024-12-11 08:06:48','货物名称5','货物类型5','规格5',5,5,'2024-12-11','盘点备注5','upload/kucunpandian_huowutupian5.jpg,upload/kucunpandian_huowutupian6.jpg,upload/kucunpandian_huowutupian7.jpg','员工工号5','员工姓名5'),(66,'2024-12-11 08:06:48','货物名称6','货物类型6','规格6',6,6,'2024-12-11','盘点备注6','upload/kucunpandian_huowutupian6.jpg,upload/kucunpandian_huowutupian7.jpg,upload/kucunpandian_huowutupian8.jpg','员工工号6','员工姓名6'),(67,'2024-12-11 08:06:48','货物名称7','货物类型7','规格7',7,7,'2024-12-11','盘点备注7','upload/kucunpandian_huowutupian7.jpg,upload/kucunpandian_huowutupian8.jpg,upload/kucunpandian_huowutupian9.jpg','员工工号7','员工姓名7'),(68,'2024-12-11 08:06:48','货物名称8','货物类型8','规格8',8,8,'2024-12-11','盘点备注8','upload/kucunpandian_huowutupian8.jpg,upload/kucunpandian_huowutupian9.jpg,upload/kucunpandian_huowutupian10.jpg','员工工号8','员工姓名8'),(69,'2024-12-11 08:14:26','XX货物','XX类型','XX',40,39,'2024-12-11','XX备注','upload/1724055149497.jpg','111','张三');
/*!40000 ALTER TABLE `kucunpandian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rukuguanli`
--

DROP TABLE IF EXISTS `rukuguanli`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rukuguanli` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `rukudanhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '入库单号',
  `huowumingcheng` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '货物名称',
  `huowuleixing` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '货物类型',
  `guige` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '规格',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `jinjia` int(11) DEFAULT NULL COMMENT '进价',
  `zongjia` double DEFAULT NULL COMMENT '总价',
  `gongyingshang` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '供应商',
  `rukushijian` date DEFAULT NULL COMMENT '入库时间',
  `rukubeizhu` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '入库备注',
  `huowutupian` longtext COLLATE utf8mb4_unicode_ci COMMENT '货物图片',
  `yuangonggonghao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '员工姓名',
  PRIMARY KEY (`id`),
  UNIQUE KEY `rukudanhao` (`rukudanhao`),
  KEY `yuangonggonghao` (`yuangonggonghao`,`yuangongxingming`),
  CONSTRAINT `rukuguanli_ibfk_1` FOREIGN KEY (`yuangonggonghao`, `yuangongxingming`) REFERENCES `yuangong` (`yuangonggonghao`, `yuangongxingming`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='入库管理';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rukuguanli`
--

LOCK TABLES `rukuguanli` WRITE;
/*!40000 ALTER TABLE `rukuguanli` DISABLE KEYS */;
INSERT INTO `rukuguanli` VALUES (41,'2024-12-11 08:06:48','1111111111','货物名称1','货物类型1','规格1',1,1,1,'供应商1','2024-12-11','入库备注1','upload/rukuguanli_huowutupian1.jpg,upload/rukuguanli_huowutupian2.jpg,upload/rukuguanli_huowutupian3.jpg','员工工号1','员工姓名1'),(42,'2024-12-11 08:06:48','2222222222','货物名称2','货物类型2','规格2',2,2,2,'供应商2','2024-12-11','入库备注2','upload/rukuguanli_huowutupian2.jpg,upload/rukuguanli_huowutupian3.jpg,upload/rukuguanli_huowutupian4.jpg','员工工号2','员工姓名2'),(43,'2024-12-11 08:06:48','3333333333','货物名称3','货物类型3','规格3',3,3,3,'供应商3','2024-12-11','入库备注3','upload/rukuguanli_huowutupian3.jpg,upload/rukuguanli_huowutupian4.jpg,upload/rukuguanli_huowutupian5.jpg','员工工号3','员工姓名3'),(44,'2024-12-11 08:06:48','4444444444','货物名称4','货物类型4','规格4',4,4,4,'供应商4','2024-12-11','入库备注4','upload/rukuguanli_huowutupian4.jpg,upload/rukuguanli_huowutupian5.jpg,upload/rukuguanli_huowutupian6.jpg','员工工号4','员工姓名4'),(45,'2024-12-11 08:06:48','5555555555','货物名称5','货物类型5','规格5',5,5,5,'供应商5','2024-12-11','入库备注5','upload/rukuguanli_huowutupian5.jpg,upload/rukuguanli_huowutupian6.jpg,upload/rukuguanli_huowutupian7.jpg','员工工号5','员工姓名5'),(46,'2024-12-11 08:06:48','6666666666','货物名称6','货物类型6','规格6',6,6,6,'供应商6','2024-12-11','入库备注6','upload/rukuguanli_huowutupian6.jpg,upload/rukuguanli_huowutupian7.jpg,upload/rukuguanli_huowutupian8.jpg','员工工号6','员工姓名6'),(47,'2024-12-11 08:06:48','7777777777','货物名称7','货物类型7','规格7',7,7,7,'供应商7','2024-12-11','入库备注7','upload/rukuguanli_huowutupian7.jpg,upload/rukuguanli_huowutupian8.jpg,upload/rukuguanli_huowutupian9.jpg','员工工号7','员工姓名7'),(48,'2024-12-11 08:06:48','8888888888','货物名称8','货物类型8','规格8',8,8,8,'供应商8','2024-12-11','入库备注8','upload/rukuguanli_huowutupian8.jpg,upload/rukuguanli_huowutupian9.jpg,upload/rukuguanli_huowutupian10.jpg','员工工号8','员工姓名8'),(49,'2024-12-11 08:13:42','1724055215108','XX货物','XX类型','XX',20,80,1600,'供应商名称1','2024-12-11','XX备注','upload/1724055149497.jpg','111','张三');
/*!40000 ALTER TABLE `rukuguanli` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'admin','users','管理员','olzs6fe9qdrwvonhprwfsyfglap9gt7e','2024-12-11 08:11:14','2024-12-11 09:15:10'),(2,1724055096491,'111','yuangong','管理员','i5q72lvakbhybe7h14zgm3yu7qau6569','2024-12-11 08:13:30','2024-12-11 09:13:30');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `image` varchar(200) DEFAULT NULL COMMENT '头像',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='管理员表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','upload/image1.jpg','管理员','2024-12-11 08:06:48');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuangong`
--

DROP TABLE IF EXISTS `yuangong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuangong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuangonggonghao` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '员工工号',
  `mima` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '密码',
  `yuangongxingming` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '员工姓名',
  `xingbie` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '性别',
  `dianhua` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '电话',
  `touxiang` longtext COLLATE utf8mb4_unicode_ci COMMENT '头像',
  `status` int(11) DEFAULT '0' COMMENT '状态',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuangonggonghao` (`yuangonggonghao`),
  KEY `yuangong_yuangonggonghao_yuangongxingming` (`yuangonggonghao`,`yuangongxingming`)
) ENGINE=InnoDB AUTO_INCREMENT=1724055096492 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='员工';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuangong`
--

LOCK TABLES `yuangong` WRITE;
/*!40000 ALTER TABLE `yuangong` DISABLE KEYS */;
INSERT INTO `yuangong` VALUES (11,'2024-12-11 08:06:48','员工工号1','123456','员工姓名1','男','13823888881','upload/yuangong_touxiang1.jpg',0),(12,'2024-12-11 08:06:48','员工工号2','123456','员工姓名2','男','13823888882','upload/yuangong_touxiang2.jpg',0),(13,'2024-12-11 08:06:48','员工工号3','123456','员工姓名3','男','13823888883','upload/yuangong_touxiang3.jpg',0),(14,'2024-12-11 08:06:48','员工工号4','123456','员工姓名4','男','13823888884','upload/yuangong_touxiang4.jpg',0),(15,'2024-12-11 08:06:48','员工工号5','123456','员工姓名5','男','13823888885','upload/yuangong_touxiang5.jpg',0),(16,'2024-12-11 08:06:48','员工工号6','123456','员工姓名6','男','13823888886','upload/yuangong_touxiang6.jpg',0),(17,'2024-12-11 08:06:48','员工工号7','123456','员工姓名7','男','13823888887','upload/yuangong_touxiang7.jpg',0),(18,'2024-12-11 08:06:48','员工工号8','123456','员工姓名8','男','13823888888','upload/yuangong_touxiang8.jpg',0),(1724055096491,'2024-12-11 08:11:36','111','111','张三','男','13111111111','upload/1724055092688.jpg',0);
/*!40000 ALTER TABLE `yuangong` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-20 10:38:01
