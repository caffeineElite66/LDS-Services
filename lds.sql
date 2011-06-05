-- MySQL dump 10.13  Distrib 5.1.54, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: lds
-- ------------------------------------------------------
-- Server version	5.1.54-1ubuntu4

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
-- Table structure for table `MemberAnswer`
--

DROP TABLE IF EXISTS `MemberAnswer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MemberAnswer` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `member_question_id` int(10) unsigned NOT NULL,
  `answer_text` varchar(128) NOT NULL,
  `answer_value` varchar(32) NOT NULL,
  `applicable` tinyint(4) NOT NULL DEFAULT '0',
  `default_answer` tinyint(1) NOT NULL DEFAULT '0' COMMENT 'pre select this for the question',
  PRIMARY KEY (`id`),
  KEY `new_index` (`member_question_id`,`answer_text`,`answer_value`)
) ENGINE=MyISAM AUTO_INCREMENT=323 DEFAULT CHARSET=latin1 COMMENT='latin1_swedish_ci';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MemberAnswer`
--

LOCK TABLES `MemberAnswer` WRITE;
/*!40000 ALTER TABLE `MemberAnswer` DISABLE KEYS */;
INSERT INTO `MemberAnswer` VALUES (319,1,'yes','yes',1,1),(320,1,'no','no',0,0),(321,2,'yes','yes',1,1),(322,2,'no','no',0,0);
/*!40000 ALTER TABLE `MemberAnswer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MemberQuestion`
--

DROP TABLE IF EXISTS `MemberQuestion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MemberQuestion` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `question_text` varchar(512) NOT NULL DEFAULT '',
  `cap` int(10) unsigned NOT NULL DEFAULT '0',
  `price` decimal(6,2) NOT NULL DEFAULT '0.00',
  `active` tinyint(1) NOT NULL DEFAULT '1',
  `member_question_id` int(10) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=163 DEFAULT CHARSET=latin1 COMMENT='latin1_swedish_ci';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MemberQuestion`
--

LOCK TABLES `MemberQuestion` WRITE;
/*!40000 ALTER TABLE `MemberQuestion` DISABLE KEYS */;
INSERT INTO `MemberQuestion` VALUES (2,'Visa','Sign up for a new visa card.',200,'1.30',1,0),(1,'News','Do you want some free news leters?',500,'1.40',1,0);
/*!40000 ALTER TABLE `MemberQuestion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MemberQuestionTag`
--

DROP TABLE IF EXISTS `MemberQuestionTag`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MemberQuestionTag` (
  `member_question_id` bigint(20) NOT NULL,
  `member_tag_id` bigint(20) NOT NULL,
  PRIMARY KEY (`member_question_id`,`member_tag_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MemberQuestionTag`
--

LOCK TABLES `MemberQuestionTag` WRITE;
/*!40000 ALTER TABLE `MemberQuestionTag` DISABLE KEYS */;
INSERT INTO `MemberQuestionTag` VALUES (1,1),(1,3),(2,2),(2,3);
/*!40000 ALTER TABLE `MemberQuestionTag` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MemberTag`
--

DROP TABLE IF EXISTS `MemberTag`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MemberTag` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MemberTag`
--

LOCK TABLES `MemberTag` WRITE;
/*!40000 ALTER TABLE `MemberTag` DISABLE KEYS */;
INSERT INTO `MemberTag` VALUES (1,'male'),(2,'female'),(3,'default');
/*!40000 ALTER TABLE `MemberTag` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2011-05-23 12:27:04
