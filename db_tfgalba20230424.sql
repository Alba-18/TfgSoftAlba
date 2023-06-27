CREATE DATABASE  IF NOT EXISTS `db_tfgalba` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `db_tfgalba`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: db_tfgalba
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `article`
--

DROP TABLE IF EXISTS `article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `article` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `image` varchar(50) DEFAULT NULL,
  `s_body` varchar(2500) NOT NULL,
  `s_title` varchar(250) NOT NULL,
  -- `vector` longblob,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `article`
--

LOCK TABLES `article` WRITE;
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
INSERT INTO `article` VALUES (1,'1','El Real Madrid CF de EspaÃ±a avanza hacia las semifinales de la UEFA Champions League 22/23, al derrotar al Chelsea de Inglaterra 2 a 0 en el partido de vuelta de los cuartos de final de la competiciÃ³n europea.\r\nAhora se enfrentarÃ¡ al Manchester City de la Premier League en semifinales.','Real Madrid CF avanza a semifinales de la UEFA Champions League 22/23');-- (2,'2','Tras la sanciÃ³n de cinco segundos impuesta a Carlos Sainz en el Gran Premio de Australia, la FederaciÃ³n Internacional del AutomÃ³vil (FIA) ha desestimado hoy el recurso de Ferrari, que habÃ­a solicitado reconsiderar el veredicto teniendo en cuenta los datos de telemetrÃ­a del coche del espaÃ±ol.','La FIA desestima el recurso de Ferrari tras la sanciÃ³n al espaÃ±ol Sainz en Australia',_binary '¬\í\0sr\0\Zorg.json.simple.JSONObjectùh¼D\0\0xr\0java.util.HashMap\ÚÁ\Ã`\Ñ\0F\0\nloadFactorI\0	thresholdxp?@\0\0\0\0\0w\0\0\0 \0\0\0t\0recurssr\0java.lang.Integerâ ¤÷8\0I\0valuexr\0java.lang.Number¬\à\0\0xp\0\0\0t\0premisq\0~\0\0\0\0t\0	automovilq\0~\0t\0australiq\0~\0t\0espaÃ±olq\0~\0t\0sainzq\0~\0t\0ferrariq\0~\0t\0sancionq\0~\0t\0segundq\0~\0t\0telemetrq\0~\0t\0solicitq\0~\0t\0\rinternacionalq\0~\0t\0impuestq\0~\0t\0desestimq\0~\0t\0carlq\0~\0t\0datq\0~\0t\0\nreconsiderq\0~\0t\0federq\0~\0t\0veredictq\0~\0t\0fiaq\0~\0t\0cochq\0~\0x'),(3,'3','Super Mario Bros. La PelÃ­cula estÃ¡ siendo todo un Ã©xito de estreno. Ha superado ya a Frozen 2 y a Ant-Man y la Avispa: Quantumania, y va camino a ser recordada como una de las grandes pelÃ­culas de animaciÃ³n. La uniÃ³n entre la mÃ­tica saga de videojuegos y un largometraje divertido para los mÃ¡s pequeÃ±os y con referencias para los mayores estÃ¡ causando furor.\r\n\r\nTanto que hay quien se ha decidido jugar el tipo para aprovechar el tirÃ³n. La cadena argentina de televisiÃ³n Gen TV ha decidido que, aunque la pelÃ­cula se estÃ© estrenando en cines y sea ilegal sacarla en directo, era buen momento para mostrarla de manera Ã­ntegra en su canal.','Una televisiÃ³n estrenÃ³ en directo e ilegalmente Super Mario Bros. La PelÃ­cula',_binary '¬\í\0sr\0\Zorg.json.simple.JSONObjectùh¼D\0\0xr\0java.util.HashMap\ÚÁ\Ã`\Ñ\0F\0\nloadFactorI\0	thresholdxp?@\0\0\0\0\00w\0\0\0@\0\0\0,t\0\0sr\0java.lang.Integerâ ¤÷8\0I\0valuexr\0java.lang.Number¬\à\0\0xp\0\0\0t\0tvq\0~\0t\0miticq\0~\0t\0referentq\0~\0t\0frozq\0~\0t\0directsq\0~\0\0\0\0t\0cinq\0~\0t\0supq\0~\0t\0cadenq\0~\0t\0genq\0~\0t\0causq\0~\0t\0caminq\0~\0t\0sacq\0~\0t\0	videojuegq\0~\0t\0divertq\0~\0t\0recordq\0~\0t\0sagq\0~\0t\0antmanq\0~\0t\0brosq\0~\0t\0tipq\0~\0t\0canalq\0~\0t\0argentinq\0~\0t\0mayorq\0~\0t\0\ntelevisionq\0~\0t\0\nquantumaniq\0~\0t\0pequeÃ±q\0~\0t\0aprovechq\0~\0t\0tironq\0~\0t\0unionq\0~\0t\0decidq\0~\0t\0superq\0~\0t\0integrq\0~\0t\0estrensq\0~\0\0\0\0t\0exitq\0~\0t\02q\0~\0t\0furorq\0~\0t\0mariq\0~\0t\0mostrq\0~\0t\0animq\0~\0t\0jugq\0~\0t\0ilegalq\0~\0t\0peliculsq\0~\0\0\0\0t\0avispq\0~\0t\0largometrajq\0~\0x');
/*!40000 ALTER TABLE `article` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rol`
--

DROP TABLE IF EXISTS `rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rol` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
INSERT INTO `rol` VALUES (1,'ADMIN'),(2,'USER');
/*!40000 ALTER TABLE `rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_article_like`
--

DROP TABLE IF EXISTS `user_article_like`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_article_like` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `active` bit(1) DEFAULT NULL,
  `article_id` bigint DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK49wb7bphntuxc1ssrvu59pe94` (`article_id`),
  KEY `FKpyk23rwwyihlxeo3ymyq4ukbr` (`user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_article_like`
--

LOCK TABLES `user_article_like` WRITE;
/*!40000 ALTER TABLE `user_article_like` DISABLE KEYS */;
INSERT INTO `user_article_like` VALUES (1,_binary '',1,1),(2,_binary '',2,1),(3,_binary '',1,2);
/*!40000 ALTER TABLE `user_article_like` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_article_sim`
--

-- DROP TABLE IF EXISTS `user_article_sim`;
-- /*!40101 SET @saved_cs_client     = @@character_set_client */;
-- /*!50503 SET character_set_client = utf8mb4 */;
-- CREATE TABLE `user_article_sim` (
 --  `id` bigint NOT NULL AUTO_INCREMENT,
 --  `article_id` bigint DEFAULT NULL,
--   `user_id` bigint DEFAULT NULL,
--   `val_cos` double DEFAULT NULL,
 --  PRIMARY KEY (`id`)
-- ) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
-- /*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_article_sim`
--

-- LOCK TABLES `user_article_sim` WRITE;
-- /*!40000 ALTER TABLE `user_article_sim` DISABLE KEYS */;
-- INSERT INTO `user_article_sim` VALUES (2,2,2,0.018932061141568826);
-- /*!40000 ALTER TABLE `user_article_sim` ENABLE KEYS */;
-- UNLOCK TABLES;

--
-- Table structure for table `user_rol`
--

DROP TABLE IF EXISTS `user_rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_rol` (
  `user_id` bigint NOT NULL,
  `rol_id` bigint NOT NULL,
  KEY `FKpfraq7jod5w5xd3sxm3m6y1o` (`rol_id`),
  KEY `FK3xg2nuaohq3m1jidxctddln2j` (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_rol`
--

LOCK TABLES `user_rol` WRITE;
/*!40000 ALTER TABLE `user_rol` DISABLE KEYS */;
INSERT INTO `user_rol` VALUES (1,1),(2,2);
/*!40000 ALTER TABLE `user_rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(50) NOT NULL,
  `name` varchar(500) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK6dotkott2kjsp8vw4d0m25fb7` (`email`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin@tfg.com','admin','$2a$10$Vu4TMkaI1V0nQ1I0K42tzeMujmYdaMu63YYpVHndpCOutmW3AXmTW'),(2,'jmedina@tfg.com','Jesus Medina','$2a$10$Dk0QijyDIw8/vStjP42HVegg8ybNhnwcBis9slFe9IiYPb9Q7eFH2');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vector`
--

-- DROP TABLE IF EXISTS `vector`;
-- /*!40101 SET @saved_cs_client     = @@character_set_client */;
-- /*!50503 SET character_set_client = utf8mb4 */;
-- CREATE TABLE `vector` (
 --  `id` bigint NOT NULL AUTO_INCREMENT,
--  `vector` longblob,
 --  `user_id` bigint DEFAULT NULL,
 --  PRIMARY KEY (`id`),
 --  KEY `FK1jd7tpashahpb5kjes5ip7dpr` (`user_id`)
-- ) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
-- /*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vector`
--

-- LOCK TABLES `vector` WRITE;
-- /*!40000 ALTER TABLE `vector` DISABLE KEYS */;
-- INSERT INTO `vector` VALUES (1,_binary '¬\í\0sr\0\Zorg.json.simple.JSONObjectùh¼D\0\0xr\0java.util.HashMap\ÚÁ\Ã`\Ñ\0F\0\nloadFactorI\0	thresholdxp?@\0\0\0\0\00w\0\0\0@\0\0\0-t\0	inglaterrsr\0java.lang.Integerâ ¤÷8\0I\0valuexr\0java.lang.Number¬\à\0\0xp\0\0\0t\0cityq\0~\0t\0chelseq\0~\0t\0partq\0~\0t\0sancionsq\0~\0\0\0\0t\0enfrentq\0~\0t\0segundq\0~\0t\0derrotq\0~\0t\0madrq\0~\0t\0manchestq\0~\0t\0desestimq\0~\0t\0avanzq\0~\0t\02223q\0~\0t\0datq\0~\0t\0uefq\0~\0t\0cuartq\0~\0t\0competicionq\0~\0t\0europeq\0~\0t\0	semifinalsq\0~\0\0\0\0t\0premiq\0~\0t\0recursq\0~\0t\0	automovilq\0~\0t\0australiq\0~\0t\0cfq\0~\0t\0	championsq\0~\0t\0espaÃ±olq\0~\0t\0sainzq\0~\0t\0ferrariq\0~\0t\0realq\0~\0t\0telemetrq\0~\0t\0solicitq\0~\0t\0leagq\0~\0\Zt\0\rinternacionalq\0~\0t\00q\0~\0t\02q\0~\0t\0impuestq\0~\0t\0carlq\0~\0t\0espaÃ±q\0~\0t\0finalq\0~\0t\0vueltq\0~\0t\0\nreconsiderq\0~\0t\0federq\0~\0t\0veredictq\0~\0t\0fiaq\0~\0t\0cochq\0~\0x',1),(2,_binary '¬\í\0sr\0\Zorg.json.simple.JSONObjectùh¼D\0\0xr\0java.util.HashMap\ÚÁ\Ã`\Ñ\0F\0\nloadFactorI\0	thresholdxp?@\0\0\0\0\00w\0\0\0@\0\0\0t\0	inglaterrsr\0java.lang.Integerâ ¤÷8\0I\0valuexr\0java.lang.Number¬\à\0\0xp\0\0\0t\0cityq\0~\0t\0chelseq\0~\0t\0partq\0~\0t\0enfrentq\0~\0t\0derrotq\0~\0t\0madrsq\0~\0\0\0\0t\0manchestq\0~\0t\0avanzq\0~\0\rt\02223q\0~\0\rt\0uefq\0~\0\rt\0cuartq\0~\0t\0competicionq\0~\0t\0europeq\0~\0t\0	semifinalsq\0~\0\0\0\0t\0premiq\0~\0t\0cfq\0~\0\rt\0	championsq\0~\0\rt\0realq\0~\0\rt\0leagq\0~\0t\00q\0~\0t\02q\0~\0t\0espaÃ±q\0~\0t\0finalq\0~\0t\0vueltq\0~\0x',2);
-- /*!40000 ALTER TABLE `vector` ENABLE KEYS */;
-- UNLOCK TABLES;

--
-- Dumping routines for database 'db_tfgalba'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-24 17:28:48
