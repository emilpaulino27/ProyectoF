-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: clinica_dental_ep
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `cargos`
--

DROP TABLE IF EXISTS `cargos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cargos` (
  `ID_Cargo` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) NOT NULL,
  PRIMARY KEY (`ID_Cargo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cargos`
--

LOCK TABLES `cargos` WRITE;
/*!40000 ALTER TABLE `cargos` DISABLE KEYS */;
INSERT INTO `cargos` VALUES (1,'Secretaria'),(2,'Dentista'),(3,'Asistente');
/*!40000 ALTER TABLE `cargos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `citas`
--

DROP TABLE IF EXISTS `citas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `citas` (
  `ID_Citas` int NOT NULL AUTO_INCREMENT COMMENT 'ID con el que se identifica la cita.',
  `Nom_Paciente` varchar(45) NOT NULL COMMENT 'Nombre del Paciente',
  `Nom_Doctor` varchar(45) NOT NULL COMMENT 'Nombre del Doctor',
  `Num_Tel_Pac` char(15) NOT NULL COMMENT 'Teléfono del Paciente.',
  `Fecha` date NOT NULL COMMENT 'Fecha pautada para la cita.',
  `Hora` time NOT NULL COMMENT 'Hora pautada para la cita',
  `Estado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID_Citas`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `citas`
--

LOCK TABLES `citas` WRITE;
/*!40000 ALTER TABLE `citas` DISABLE KEYS */;
INSERT INTO `citas` VALUES (1,'Ylianni Paulino','Eddy Paulino','829-356-4470','2022-03-21','15:00:00','Realizada'),(3,'Amauris','Eddy Paulino','809-612-2506','2022-03-03','14:30:00','Realizada'),(4,'Alma Abreu','Oriana Álvarez','809-654-5546','2022-03-26','17:00:00','Realizada'),(7,'Annibel','Arturo Rodríguez','485-120-1450','2022-04-06','15:00:00','Realizada'),(8,'Armando','Oriana Álvarez','809-580-5842','2022-04-06','16:00:00','Realizada'),(11,'Alexaa','Oriana Álvarez','809-696-0248','2022-04-02','16:00:00','Realizada'),(12,'Keilin','Oriana Álvarez','849-207-6986','2022-05-31','15:00:00','Realizada'),(15,'Eddy Paulino','Eddy Paulino','8929561','2022-06-22','12:00:00','Pendiente');
/*!40000 ALTER TABLE `citas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_factura`
--

DROP TABLE IF EXISTS `detalle_factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalle_factura` (
  `ID_DetalleFac` int NOT NULL AUTO_INCREMENT,
  `ID_Detalle_Fact` int NOT NULL,
  `ID_Servicio` int NOT NULL,
  `Servicio` varchar(45) NOT NULL,
  `Precio` int NOT NULL,
  `Cantidad` int NOT NULL,
  `id_factura` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_DetalleFac`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_factura`
--

LOCK TABLES `detalle_factura` WRITE;
/*!40000 ALTER TABLE `detalle_factura` DISABLE KEYS */;
INSERT INTO `detalle_factura` VALUES (1,1,2,'Retenedor Con Trampa Lingual',5300,2,'1'),(2,1,1,'Retenedor Post-Ortodontico',7500,3,'1'),(3,2,6,'Limpieza Dental',3000,3,'2'),(4,2,9,'Extraccion',300,1,'2'),(5,3,3,'Disyuntor Hirax',48000,4,'3'),(6,3,5,'Bionator',52000,4,'3'),(7,3,19,'Arco Transpalatino',25500,3,'3'),(8,4,5,'Bionator',13000,1,'4'),(9,5,5,'Bionator',117000,9,'5'),(10,6,6,'Limpieza Dental',1000,1,'6'),(11,6,17,'Pendulo de cuatro bandas',4800,3,'6'),(12,7,9,'Extraccion',600,2,'7'),(13,8,16,'Pendulo de dos bandas',29000,2,'8'),(14,9,15,'Bandas con tubos simples (Sin Torque)',3000,2,'9'),(15,9,5,'Bionator',13000,1,'9'),(16,10,6,'Limpieza Dental',3000,3,'10'),(17,11,5,'Bionator',26000,2,'11'),(18,12,6,'Limpieza Dental',1000,1,'12'),(19,13,9,'Extraccion',4800,4,'13'),(20,13,18,'Barra Lingual',15000,2,'13'),(21,13,2,'Retenedor Con Trampa Lingual',5300,2,'13'),(22,14,20,'Pantalla Oral',37500,5,'14'),(23,14,4,'Mascara Facial y Elasticos',52000,8,'14'),(24,15,16,'Pendulo de dos bandas',43500,3,'15'),(25,15,4,'Mascara Facial y Elasticos',26000,4,'15'),(26,15,1,'Retenedor Post-Ortodontico',12500,5,'15');
/*!40000 ALTER TABLE `detalle_factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_ganancia`
--

DROP TABLE IF EXISTS `detalle_ganancia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalle_ganancia` (
  `ID_Detalle_Ganancia` int NOT NULL AUTO_INCREMENT,
  `No_Detalle_Ganancia` int DEFAULT NULL,
  `Nombre_Paciente` varchar(45) DEFAULT NULL,
  `Apellido_Paciente` varchar(45) DEFAULT NULL,
  `Total_Factura` int DEFAULT NULL,
  PRIMARY KEY (`ID_Detalle_Ganancia`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_ganancia`
--

LOCK TABLES `detalle_ganancia` WRITE;
/*!40000 ALTER TABLE `detalle_ganancia` DISABLE KEYS */;
INSERT INTO `detalle_ganancia` VALUES (1,1,'Keilin','Caraballo',3300),(2,1,'Andrea','Flores',125500),(3,1,'Armando','Castillo',13000),(4,1,'Alexa','Casado',117000),(5,1,'Caroline','Jiménez',5800),(6,2,'Keilin','Caraballo',3300),(7,2,'Andrea','Flores',125500),(8,2,'Armando','Castillo',13000),(9,2,'Alexa','Casado',117000),(10,2,'Caroline','Jiménez',5800),(11,3,'Emil','Paulino',16000),(12,3,'Alexa','Casado',3000),(13,4,'Armando','Castillo',26000),(14,5,'Jeverlin','Ramos',1000);
/*!40000 ALTER TABLE `detalle_ganancia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleados` (
  `ID_Empleado` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `Apellido` varchar(45) NOT NULL,
  `Cedula` varchar(13) NOT NULL,
  `Telefono` char(15) NOT NULL,
  `Direccion` varchar(60) NOT NULL,
  `Cargo` varchar(30) NOT NULL,
  PRIMARY KEY (`ID_Empleado`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES (1,'Ana Maria','Santana','09512131421','8298149946','Calle Principal Las Palomas','Asistente'),(2,'Eddy','Paulino','09500129029','8094329767','Calle Principal Las Palomas','Dentista'),(3,'Angela','Batista','09645822132','8096122003','Monte Adentro','Secretaria'),(5,'Maria','Alvarez','6895230335','8096581510','Calle Girasol','Enc. Limpieza'),(12,'Erwin','Martinez','095-005648-0','809-680-779','Circunvalacion Norte','Asistente'),(17,'Oriana','Alvarez','095-898787-9','829-648-0558','Sabana Iglesia','Dentista'),(18,'Clara Ines','D´ Oleo','402-0364805-6','849-408-5528','Res. Don Nicolas #15, La Otra Banda','Contable'),(19,'Isai','Almanzar','408-989852-6','809-546-8020','El Embrujo','Dentista');
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `factura` (
  `ID_Factura` int NOT NULL AUTO_INCREMENT,
  `Fecha` date NOT NULL,
  `ID_DetalleFac` int NOT NULL,
  `Nombre_Paciente` varchar(45) NOT NULL,
  `Apellido_Paciente` varchar(45) NOT NULL,
  `Tipo_Pago` varchar(45) NOT NULL,
  `Usuario` varchar(45) DEFAULT NULL,
  `Total` int NOT NULL,
  `Doctor` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID_Factura`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` VALUES (1,'2022-08-10',1,'Ylianni','Paulino','Efectivo','admin',12800,'Oriana Alvarez'),(2,'2022-08-10',2,'Keilin','Caraballo','Efectivo','admin',3300,'Eddy Paulino'),(3,'2022-08-10',3,'Andrea','Flores','Efectivo','admin',125500,'Eddy Paulino'),(4,'2022-08-10',4,'Armando','Castillo','Efectivo','admin',13000,'Eddy Paulino'),(5,'2022-08-10',5,'Alexa','Casado','Efectivo','admin',117000,'Eddy Paulino'),(6,'2022-08-10',6,'Caroline','Jiménez','Efectivo','admin',5800,'Eddy Paulino'),(7,'2022-08-11',7,'Keilin','Caraballo','Efectivo','admin',600,'Eddy Paulino'),(8,'2022-08-11',8,'Keilin','Caraballo','Efectivo','admin',29000,'Oriana Alvarez'),(9,'2022-10-11',9,'Emil','Paulino','Efectivo','admin',16000,'Eddy Paulino'),(10,'2022-10-11',10,'Alexa','Casado','Efectivo','admin',3000,'Eddy Paulino'),(11,'2022-10-18',11,'Armando','Castillo','Efectivo','admin',26000,'Oriana Alvarez'),(12,'2022-11-01',12,'Jeverlin','Ramos','Efectivo','admin',1000,'Oriana Alvarez'),(13,'2022-11-08',13,'Alesa','Soltero','Efectivo','admin',25100,'Eddy Paulino'),(14,'2022-11-08',14,'Jeverlin','Ramos','Efectivo','admin',89500,'Oriana Alvarez'),(15,'2022-11-08',15,'Wady','Muñoz','Efectivo','admin',82000,'Oriana Alvarez');
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ganancias`
--

DROP TABLE IF EXISTS `ganancias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ganancias` (
  `ID_Ganancia` int NOT NULL AUTO_INCREMENT,
  `No_Detalle_Ganancia` int DEFAULT NULL,
  `Fecha` date DEFAULT NULL,
  `Doctor` varchar(45) DEFAULT NULL,
  `Total_Facturado` int DEFAULT NULL,
  `Porciento_Clinica` int DEFAULT NULL,
  `Ganancia_Neta` int DEFAULT NULL,
  PRIMARY KEY (`ID_Ganancia`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ganancias`
--

LOCK TABLES `ganancias` WRITE;
/*!40000 ALTER TABLE `ganancias` DISABLE KEYS */;
INSERT INTO `ganancias` VALUES (1,1,'2022-08-10','Eddy Paulino',264600,52920,211680),(2,2,'2022-08-10','Eddy Paulino',264600,52920,211680),(3,3,'2022-10-11','Eddy Paulino',19000,3800,15200),(4,4,'2022-10-18','Oriana Alvarez',26000,5200,20800),(5,5,'2022-11-01','Oriana Alvarez',1000,200,800);
/*!40000 ALTER TABLE `ganancias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `iniciosesion`
--

DROP TABLE IF EXISTS `iniciosesion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `iniciosesion` (
  `id_Usuario` int NOT NULL AUTO_INCREMENT,
  `Usuario` varchar(40) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Rol` varchar(45) NOT NULL,
  PRIMARY KEY (`id_Usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `iniciosesion`
--

LOCK TABLES `iniciosesion` WRITE;
/*!40000 ALTER TABLE `iniciosesion` DISABLE KEYS */;
INSERT INTO `iniciosesion` VALUES (1,'Emil','emil@gmail.com','2020','admin'),(2,'Ana Santan','anamarias@gmail.com','121250','user'),(4,'Santiago','','12345','admin'),(5,'SilvanaMaria','','silvanaperez10','user'),(6,'Alejandro','alejandro@gmail.com','021546','user'),(7,'alexa','alexa@4','123','user'),(9,'ransel','ransel@gmail.com','alexa','user'),(15,'admin','','admin','admin'),(16,'user','','user','user');
/*!40000 ALTER TABLE `iniciosesion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pacientes`
--

DROP TABLE IF EXISTS `pacientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pacientes` (
  `ID_Paciente` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `Apellido` varchar(45) NOT NULL,
  `Cedula` varchar(20) NOT NULL,
  `Email` varchar(60) NOT NULL,
  `numTel` varchar(12) NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  `FechaDeNacimiento` date NOT NULL,
  PRIMARY KEY (`ID_Paciente`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pacientes`
--

LOCK TABLES `pacientes` WRITE;
/*!40000 ALTER TABLE `pacientes` DISABLE KEYS */;
INSERT INTO `pacientes` VALUES (1,'Ylianni','Paulino','9569820123','yliannipaulino@gmail.com','8496645201','Las Palomas','2005-08-21'),(2,'Emil','Paulino','5417850021','emilpaulino@gmail.com','8296645800','Las Palomas','2005-09-27'),(5,'Armando','Castillo','0957878546','armando@mail.com','809-528-2564','Embrujo III #25','2005-09-27'),(7,'Keilin','Caraballo','031003859','rkeilyn2222@hotmail.com','8492076986','Arenoso Puñal','2005-07-22'),(8,'Alexa','Casado','0937392','apcasado04@gmail.com','8497393837','Ingenio Arriba','2005-03-04'),(9,'Caroline','Jiménez','0988524320','','847496849','nsjfbkn jsfdjbkj','2005-06-06'),(11,'Almer ','Alvarez','351653132','','654689415','Villa Maria','2005-06-04'),(12,'Silvana','Perez','651653132','dxkjgbk@gmail.com','8297825500','Villa Olimpica','2005-05-08'),(13,'Andrea','Flores','30848209','','8098889999','ijgidsjfklga','1999-09-23');
/*!40000 ALTER TABLE `pacientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recibo`
--

DROP TABLE IF EXISTS `recibo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recibo` (
  `ID_Recibo` int NOT NULL AUTO_INCREMENT,
  `Fecha` date NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Suma` int NOT NULL,
  `Concepto` varchar(255) NOT NULL,
  `TipoPago` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_Recibo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recibo`
--

LOCK TABLES `recibo` WRITE;
/*!40000 ALTER TABLE `recibo` DISABLE KEYS */;
INSERT INTO `recibo` VALUES (1,'2022-05-27','Morelis',1500,'Yo no se','Efectivo'),(2,'2022-06-08','Alexa',125,'no se','Efectivo');
/*!40000 ALTER TABLE `recibo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicios`
--

DROP TABLE IF EXISTS `servicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `servicios` (
  `ID_Servicio` int NOT NULL AUTO_INCREMENT,
  `Nombre_serv` varchar(45) NOT NULL,
  `Descripcion` varchar(60) DEFAULT NULL,
  `Precio` int NOT NULL,
  PRIMARY KEY (`ID_Servicio`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicios`
--

LOCK TABLES `servicios` WRITE;
/*!40000 ALTER TABLE `servicios` DISABLE KEYS */;
INSERT INTO `servicios` VALUES (1,'Retenedor Post-Ortodontico','',2500),(2,'Retenedor Con Trampa Lingual','',2650),(3,'Disyuntor Hirax','',12000),(4,'Mascara Facial y Elasticos','',6500),(5,'Bionator','Estimula el crecimiento mandibular. Precio depende el tipo.',13000),(6,'Limpieza Dental','',1000),(9,'Extraccion','',300),(15,'Bandas con tubos simples (Sin Torque)','',1500),(16,'Pendulo de dos bandas','',14500),(17,'Pendulo de cuatro bandas','',1600),(18,'Barra Lingual','',7500),(19,'Arco Transpalatino','',8500),(20,'Pantalla Oral','',7500),(21,'Placa Progenie','',15000);
/*!40000 ALTER TABLE `servicios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipos_pago`
--

DROP TABLE IF EXISTS `tipos_pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipos_pago` (
  `ID_T_Pago` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_T_Pago`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipos_pago`
--

LOCK TABLES `tipos_pago` WRITE;
/*!40000 ALTER TABLE `tipos_pago` DISABLE KEYS */;
INSERT INTO `tipos_pago` VALUES (1,'Efectivo'),(2,'Cheque'),(3,'Tarjeta');
/*!40000 ALTER TABLE `tipos_pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `vista_doc`
--

DROP TABLE IF EXISTS `vista_doc`;
/*!50001 DROP VIEW IF EXISTS `vista_doc`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vista_doc` AS SELECT 
 1 AS `nombres`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `vista_doc`
--

/*!50001 DROP VIEW IF EXISTS `vista_doc`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vista_doc` AS select concat(`empleados`.`Nombre`,' ',`empleados`.`Apellido`) AS `nombres` from `empleados` where (`empleados`.`Cargo` = 'Dentista') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-11  9:06:55
