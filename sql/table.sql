-- MySQL dump 10.13  Distrib 8.0.18, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: keShe
-- ------------------------------------------------------
-- Server version	8.0.18-0ubuntu0.19.10.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `adminId` int(11) NOT NULL AUTO_INCREMENT,
  `adminName` varchar(50) NOT NULL,
  `adminPassword` varchar(100) NOT NULL,
  `adminSignDate` date NOT NULL,
  PRIMARY KEY (`adminId`),
  UNIQUE KEY `admin_adminName_uindex` (`adminName`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='管理员信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`adminId`, `adminName`, `adminPassword`, `adminSignDate`) VALUES (12,'test','2','2019-11-30');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `triggerName` AFTER INSERT ON `admin` FOR EACH ROW #这句话在mysql是固定的
begin
    insert into adminLog(adminName) values (new.adminName);
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `adminLog`
--

DROP TABLE IF EXISTS `adminLog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `adminLog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adminName` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `adminLog_adminName_uindex` (`adminName`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adminLog`
--

LOCK TABLES `adminLog` WRITE;
/*!40000 ALTER TABLE `adminLog` DISABLE KEYS */;
INSERT INTO `adminLog` (`id`, `adminName`) VALUES (1,'test1');
/*!40000 ALTER TABLE `adminLog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deptDesc`
--

DROP TABLE IF EXISTS `deptDesc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `deptDesc` (
  `deptId` int(11) NOT NULL AUTO_INCREMENT,
  `deptName` varchar(50) NOT NULL,
  `deptAddr` varchar(50) NOT NULL,
  PRIMARY KEY (`deptId`),
  UNIQUE KEY `deptDesc_deptName_uindex` (`deptName`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='部门信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deptDesc`
--

LOCK TABLES `deptDesc` WRITE;
/*!40000 ALTER TABLE `deptDesc` DISABLE KEYS */;
/*!40000 ALTER TABLE `deptDesc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salDesc`
--

DROP TABLE IF EXISTS `salDesc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salDesc` (
  `salId` int(11) NOT NULL AUTO_INCREMENT,
  `staffId` int(11) NOT NULL,
  `salBase` int(11) NOT NULL DEFAULT '6000',
  `salComm` int(11) NOT NULL DEFAULT '0',
  `salExtra` int(11) NOT NULL DEFAULT '0',
  `salDeduct` int(11) NOT NULL DEFAULT '0',
  `salElse` int(11) DEFAULT '0',
  PRIMARY KEY (`salId`),
  UNIQUE KEY `salDesc_staffId_uindex` (`staffId`),
  CONSTRAINT `salDesc_staffDesc_staffId_fk` FOREIGN KEY (`staffId`) REFERENCES `staffDesc` (`staffId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='工资信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salDesc`
--

LOCK TABLES `salDesc` WRITE;
/*!40000 ALTER TABLE `salDesc` DISABLE KEYS */;
/*!40000 ALTER TABLE `salDesc` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `triggerNameOnSal` AFTER INSERT ON `salDesc` FOR EACH ROW #这句话在mysql是固定的
begin
    insert into salLog(staffId, sumSal) values (new.staffId,new.salBase+new.salComm+new.salExtra+new.salElse-new.salDeduct);
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `triggerNameOnSalUpdate` AFTER UPDATE ON `salDesc` FOR EACH ROW #这句话在mysql是固定的
begin
    update salLog set sumSal= (new.salBase+new.salComm+new.salExtra+new.salElse-new.salDeduct)
    where salLog.staffId=new.staffId;
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `salLog`
--

DROP TABLE IF EXISTS `salLog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salLog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `staffId` int(11) NOT NULL,
  `sumSal` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `salLog_staffId_uindex` (`staffId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salLog`
--

LOCK TABLES `salLog` WRITE;
/*!40000 ALTER TABLE `salLog` DISABLE KEYS */;
INSERT INTO `salLog` (`id`, `staffId`, `sumSal`) VALUES (1,7,898189);
/*!40000 ALTER TABLE `salLog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staffDesc`
--

DROP TABLE IF EXISTS `staffDesc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staffDesc` (
  `staffId` int(11) NOT NULL AUTO_INCREMENT,
  `staffName` varchar(50) NOT NULL,
  `staffPost` varchar(100) NOT NULL,
  `staffBoss` varchar(20) NOT NULL DEFAULT '孙朝辉',
  `staffHireDate` date NOT NULL,
  `deptId` int(11) NOT NULL,
  PRIMARY KEY (`staffId`),
  KEY `staffDesc_deptDesc_deptId_fk` (`deptId`),
  CONSTRAINT `staffDesc_deptDesc_deptId_fk` FOREIGN KEY (`deptId`) REFERENCES `deptDesc` (`deptId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='员工信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staffDesc`
--

LOCK TABLES `staffDesc` WRITE;
/*!40000 ALTER TABLE `staffDesc` DISABLE KEYS */;
/*!40000 ALTER TABLE `staffDesc` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-06 17:00:11
