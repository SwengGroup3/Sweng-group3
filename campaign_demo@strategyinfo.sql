-- MySQLShell dump 2.0.1  Distrib Ver 8.1.1-g2 for Win64 on x86_64 - for MySQL 8.1.0 (MySQL Community Server (GPL)), for Win64 (x86_64)
--
-- Host: localhost    Database: campaign_demo    Table: strategyinfo
-- ------------------------------------------------------
-- Server version	8.0.36

--
-- Table structure for table `strategyinfo`
--

/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE IF NOT EXISTS `strategyinfo` (
  `customer_id` bigint NOT NULL AUTO_INCREMENT,
  `account_activated_state` tinyint DEFAULT '1',
  `improvedkpi` varchar(20) DEFAULT NULL,
  `keyword_label` varchar(20) DEFAULT NULL,
  `owner_name` varchar(50) DEFAULT NULL,
  `paid_marketing` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
