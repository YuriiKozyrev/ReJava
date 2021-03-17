-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: cinema
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `days_of_week_tbl`
--

LOCK TABLES `days_of_week_tbl` WRITE;
/*!40000 ALTER TABLE `days_of_week_tbl` DISABLE KEYS */;
INSERT INTO `days_of_week_tbl` VALUES (1,'Monday'),(2,'Tuesday'),(3,'Wednesday'),(4,'Thursday'),(5,'Friday'),(6,'Saturday'),(7,'Sunday');
/*!40000 ALTER TABLE `days_of_week_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `movies_tbl`
--

LOCK TABLES `movies_tbl` WRITE;
/*!40000 ALTER TABLE `movies_tbl` DISABLE KEYS */;
INSERT INTO `movies_tbl` VALUES (1,'Snatch','01:44:00'),(2,'Dumb and Dumber','01:47:00'),(3,'Lock, Stock and Two Smoking Barrels','01:50:00'),(4,'It','02:15:00'),(5,'It Two','02:49:00'),(6,'The Terminator','01:48:00'),(7,'The terminator 2: Judgment Day','02:17:00');
/*!40000 ALTER TABLE `movies_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `schedule_tbl`
--

LOCK TABLES `schedule_tbl` WRITE;
/*!40000 ALTER TABLE `schedule_tbl` DISABLE KEYS */;
INSERT INTO `schedule_tbl` VALUES (1,1,1,'10:00:00',100),(2,1,7,'12:00:00',100),(3,1,2,'14:00:00',200),(4,1,4,'16:00:00',200),(5,1,3,'18:00:00',200),(6,1,3,'20:00:00',300),(7,1,5,'22:00:00',400);
/*!40000 ALTER TABLE `schedule_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tickets_sold_tbl`
--

LOCK TABLES `tickets_sold_tbl` WRITE;
/*!40000 ALTER TABLE `tickets_sold_tbl` DISABLE KEYS */;
INSERT INTO `tickets_sold_tbl` VALUES (1,1),(2,1),(3,1),(4,1),(5,1),(6,1),(7,1),(8,1),(9,1),(10,1),(11,2),(12,2),(13,2),(14,2),(15,2),(16,2),(17,3),(18,3),(19,3),(20,3),(21,3),(22,4),(23,4),(24,4),(25,4),(26,4),(27,4),(28,5),(29,5),(30,5),(31,5),(32,6),(33,6),(34,6),(35,7),(36,7),(37,7),(38,7),(39,7),(40,7);
/*!40000 ALTER TABLE `tickets_sold_tbl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-17 17:13:52
