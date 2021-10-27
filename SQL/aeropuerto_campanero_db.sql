-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 27, 2021 at 05:24 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 7.4.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aeropuerto_campanero_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_admin`
--

CREATE TABLE `tb_admin` (
  `id` int(11) NOT NULL,
  `email_admin` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_airline`
--

CREATE TABLE `tb_airline` (
  `id` int(11) NOT NULL,
  `code_airline` varchar(50) NOT NULL,
  `name` varchar(100) NOT NULL,
  `address` varchar(250) NOT NULL,
  `id_airport` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_airline`
--

INSERT INTO `tb_airline` (`id`, `code_airline`, `name`, `address`, `id_airport`) VALUES
(1, '1001', 'Travel-World', 'Address airline', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_airline_staff`
--

CREATE TABLE `tb_airline_staff` (
  `id` int(11) NOT NULL,
  `id_airline_staff` varchar(15) NOT NULL,
  `name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(60) NOT NULL,
  `user_staff` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `password_staff` varchar(200) NOT NULL,
  `id_airline` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_airline_staff_delete`
--

CREATE TABLE `tb_airline_staff_delete` (
  `id` int(11) NOT NULL,
  `id_airline_staff` varchar(15) NOT NULL,
  `name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(60) NOT NULL,
  `user_staff` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `password_staff` varchar(200) NOT NULL,
  `description` varchar(500) NOT NULL,
  `id_airline` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_airline_staff_delete`
--

INSERT INTO `tb_airline_staff_delete` (`id`, `id_airline_staff`, `name`, `last_name`, `phone`, `email`, `user_staff`, `password_staff`, `description`, `id_airline`) VALUES
(1, '123456789', 'User', 'user', '0', 'user2@aerolinea.com', 'user', 'sFgSHi+uAtw=', 'Por que si. :)', 1),
(2, '123456789', 'User name', 'User last name', '3178660000', 'email@aerolinea.com', 'usuario legal', 'sFgSHi+uAtw=', 'Se elimina por que me equivoque de empresa. :3', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_airport`
--

CREATE TABLE `tb_airport` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `address` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_airport`
--

INSERT INTO `tb_airport` (`id`, `name`, `address`) VALUES
(1, 'El Campanero', 'Pasto');

-- --------------------------------------------------------

--
-- Table structure for table `tb_airport_staff`
--

CREATE TABLE `tb_airport_staff` (
  `id` int(11) NOT NULL,
  `id_Airport_staff` varchar(15) NOT NULL,
  `name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(60) NOT NULL,
  `user_staff` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `password_staff` varchar(200) NOT NULL,
  `id_airport` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_airport_staff`
--

INSERT INTO `tb_airport_staff` (`id`, `id_Airport_staff`, `name`, `last_name`, `phone`, `email`, `user_staff`, `password_staff`, `id_airport`) VALUES
(11, '123456789', 'Nombre', 'Apellido', '3178660000', 'user6@elcampanero.com', 'User_funcional', 'sFgSHi+uAtw=', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_airport_staff_delete`
--

CREATE TABLE `tb_airport_staff_delete` (
  `id` int(11) NOT NULL,
  `id_Airport_staff` varchar(15) NOT NULL,
  `name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(60) NOT NULL,
  `user_staff` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `password_staff` varchar(200) NOT NULL,
  `description` varchar(500) NOT NULL,
  `id_airport` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_airport_staff_delete`
--

INSERT INTO `tb_airport_staff_delete` (`id`, `id_Airport_staff`, `name`, `last_name`, `phone`, `email`, `user_staff`, `password_staff`, `description`, `id_airport`) VALUES
(1, '1234567890', 'Nombre User', 'Apellido User', '465', 'user@elcampanero.com', 'user_1', 'u3z7BVMkEImbHcAUXSHqPA==', 'Porque si', 1),
(2, '123456', 'q', 'qq', '0', 'q@elcampanero.com', 'user', 'A6oxY75RKa8=', 'No me gusta esta empresa. :)', 1),
(3, '0', 'qw', 'qw', '0', 'w@elcampanero.com', 'user_2', 'ICwqWdJS76M=', 'Porque no se.', 1),
(4, '0', 'nombre_', 'apellido_', '0', 'user4@elcampanero.com', 'user_4', 'ICwqWdJS76M=', 'Por que no me gusta.', 1),
(5, '123456789', 'User', 'User', '0', 'user5@elcampanero.com', 'useer', 'ICwqWdJS76M=', 'Por que si. :)', 1),
(6, '123', 'user', 'user', '0', 'user6@elcampanero.com', 'user', 'ICwqWdJS76M=', 'No.', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_arrival`
--

CREATE TABLE `tb_arrival` (
  `id` int(11) NOT NULL,
  `code_arrival` varchar(15) NOT NULL,
  `id_flight` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_departure`
--

CREATE TABLE `tb_departure` (
  `id` int(11) NOT NULL,
  `code_departure` varchar(15) NOT NULL,
  `id_flight` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_flight`
--

CREATE TABLE `tb_flight` (
  `id` int(11) NOT NULL,
  `code_flight` varchar(15) NOT NULL,
  `type_flight` varchar(100) NOT NULL,
  `flight_selection` varchar(100) NOT NULL,
  `crew_plane` varchar(100) NOT NULL,
  `destination` varchar(250) NOT NULL,
  `runway` varchar(50) DEFAULT NULL,
  `date_flight` date DEFAULT NULL,
  `time_flight` time DEFAULT NULL,
  `id_airline` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_flight`
--

INSERT INTO `tb_flight` (`id`, `code_flight`, `type_flight`, `flight_selection`, `crew_plane`, `destination`, `runway`, `date_flight`, `time_flight`, `id_airline`) VALUES
(32, 'A040', 'Vuelo de carga', 'Vuelo de llegada', 'piloto y copiloto', 'Colombia - Bogotá - América', 'pista - 01B', '2021-05-04', '01:01:00', 1),
(33, 'A004', 'Vuelo de carga', 'Vuelo de salida', 'piloto y copiloto', 'Andorra - Andorra la Vieja - Europa', 'pista - 012B', '2025-06-05', '01:01:00', 1),
(34, 'A028', 'Vuelo de carga', 'Vuelo de salida', 'piloto y copiloto', 'Burkina Faso - Uagadugú - África', 'pista - 01B', '2024-05-05', '03:02:00', 1),
(35, 'A002', 'Vuelo de carga', 'Vuelo de llegada', 'Piloto', 'Albania - Tirana - Europa', 'pista - 03A', '2023-03-03', '03:01:00', 1),
(36, 'A012', 'Vuelo de carga', 'Vuelo de salida', 'Piloto', 'Azerbaiyán - Bakú - Asia', 'pista - 03B', '2024-05-03', '02:00:00', 1),
(37, 'A011', 'Vuelo de pasajeros', 'Vuelo de llegada', 'piloto y copiloto', 'Austria - Viena - Europa', 'pista - 01A', '2025-06-06', '03:01:00', 1),
(38, 'A016', 'Vuelo de carga', 'Vuelo de llegada', 'piloto y copiloto', 'Baréin - Manama - Asia', 'pista - 06A', '2025-07-04', '02:01:00', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_flight_cancelation_agenda`
--

CREATE TABLE `tb_flight_cancelation_agenda` (
  `id` int(11) NOT NULL,
  `code_flight` varchar(20) NOT NULL,
  `type_flight` varchar(50) NOT NULL,
  `flight_selection` varchar(50) NOT NULL,
  `crew_plane` varchar(50) NOT NULL,
  `destination` varchar(200) NOT NULL,
  `runway` varchar(50) DEFAULT NULL,
  `date_flight` date DEFAULT NULL,
  `time_flight` time DEFAULT NULL,
  `description` varchar(700) DEFAULT NULL,
  `id_airline` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_flight_cancelation_agenda`
--

INSERT INTO `tb_flight_cancelation_agenda` (`id`, `code_flight`, `type_flight`, `flight_selection`, `crew_plane`, `destination`, `runway`, `date_flight`, `time_flight`, `description`, `id_airline`) VALUES
(4, 'A003', 'Vuelo de pasajeros', 'Vuelo de llegada', 'piloto y copiloto', 'Alemania - Berlín - Europa', 'pista - 06A', '2021-10-14', '02:00:00', 'Vuelo cancelado por aeropuerto\n\nSe cancela el vuelo por terrorismo.', 1),
(5, 'A020', 'Vuelo de carga', 'Vuelo de llegada', 'Piloto', 'Bielorrusia - Minsk - Europa', 'pista - 06A', '2021-11-09', '20:20:00', 'Vuelo cancelado por aerolinea\n\nTerrorismo', 1),
(6, 'A001', 'Vuelo de pasajeros', 'Vuelo de salida', 'piloto y copiloto', 'Afganistán - Kabul - Asia', 'pista - 01B', '2021-10-12', '20:00:00', 'Vuelo cancelado por aerolinea\n\nCancelado...', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_flight_cancelation_airline`
--

CREATE TABLE `tb_flight_cancelation_airline` (
  `id` int(11) NOT NULL,
  `code_flight` varchar(15) NOT NULL,
  `model_plane` varchar(50) NOT NULL,
  `Type_flight` varchar(50) NOT NULL,
  `flight_selection` varchar(50) NOT NULL,
  `capacity_plane` varchar(50) NOT NULL,
  `crew_plane` varchar(50) NOT NULL,
  `date_flight` date DEFAULT NULL,
  `time_flight` time DEFAULT NULL,
  `destination` varchar(200) NOT NULL,
  `description` varchar(700) DEFAULT NULL,
  `id_airline` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_flight_cancelation_airline`
--

INSERT INTO `tb_flight_cancelation_airline` (`id`, `code_flight`, `model_plane`, `Type_flight`, `flight_selection`, `capacity_plane`, `crew_plane`, `date_flight`, `time_flight`, `destination`, `description`, `id_airline`) VALUES
(2, 'A007', 'UF-555', 'Vuelo de pasajeros', 'Vuelo de salida', '250', 'piloto y copiloto', '2021-10-29', '03:00:00', 'Arabia Saudita - Riad - Asia', 'Vuelo cancelado por aerolinea\n\nSe cancela el vuelo por error en sistema.', 1),
(3, 'A006', 'QK-428', 'Vuelo de pasajeros', 'Vuelo de salida', '280', 'piloto y copiloto', '2021-10-20', '22:00:00', 'Antigua y Barbuda - Saint John - América', 'Vuelo cancelado por aerolinea\n\nTerrorismo', 1),
(4, 'A008', 'DEF-710', 'Vuelo de carga', 'Vuelo de salida', '800', 'piloto y copiloto', '2021-12-22', '01:45:00', 'Argelia - Argel - África', 'Vuelo cancelado por aerolinea\n\nCancelado...', 1),
(5, 'A010', 'TYJ-124', 'Vuelo de carga', 'Vuelo de llegada', '950', 'Piloto', '2021-10-18', '15:00:00', 'Australia - Canberra - Oceanía', 'Vuelo cancelado por aerolinea\n\nCancelado...', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_flight_declined`
--

CREATE TABLE `tb_flight_declined` (
  `id` int(11) NOT NULL,
  `code_flight` varchar(15) NOT NULL,
  `Type_flight` varchar(50) NOT NULL,
  `flight_selection` varchar(50) NOT NULL,
  `date_flight` date DEFAULT NULL,
  `time_flight` time DEFAULT NULL,
  `model_plane` varchar(50) NOT NULL,
  `capacity_plane` varchar(50) NOT NULL,
  `crew_plane` varchar(50) NOT NULL,
  `destiny` varchar(50) NOT NULL,
  `description` varchar(700) NOT NULL,
  `id_airline` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_flight_declined`
--

INSERT INTO `tb_flight_declined` (`id`, `code_flight`, `Type_flight`, `flight_selection`, `date_flight`, `time_flight`, `model_plane`, `capacity_plane`, `crew_plane`, `destiny`, `description`, `id_airline`) VALUES
(9, 'A022', 'Vuelo de carga', 'Vuelo de llegada', '2021-11-11', '08:50:00', 'WED-321', '350', 'Piloto', 'Bolivia - Sucre - América', 'Se rechaza e vuelo porque la fecha solicitada el aeropuerto estar cerrado.', 1),
(10, 'A042', 'Vuelo de pasajeros', 'Vuelo de llegada', '2021-12-01', '18:20:00', 'AX-179', '250', 'piloto y copiloto', 'Congo - Brazzaville - África', 'Se rechaza e vuelo porque la fecha solicitada el aeropuerto estar cerrado.', 1),
(11, 'A057', 'Vuelo de carga', 'Vuelo de salida', '2021-12-16', '05:35:00', 'VCB-960', '1060', 'Piloto', 'Eslovenia - Liubliana - Europa', 'Se rechaza e vuelo porque la fecha solicitada el aeropuerto estar cerrado.', 1),
(12, 'A009', 'Vuelo de carga', 'Vuelo de llegada', '2021-10-31', '12:00:00', 'DEF-710', '800', 'Piloto', 'Armenia - Ereván - Asia', 'Rechazado...', 1),
(13, 'A005', 'Vuelo de pasajeros', 'Vuelo de salida', '2021-10-16', '05:00:00', 'YX-578', '100', 'piloto y copiloto', 'Angola - Luanda - África', 'Rechazado...', 1),
(14, 'A029', 'Vuelo de carga', 'Vuelo de salida', '2021-11-18', '18:16:00', 'SSD-898', '950', 'piloto y copiloto', 'Burundi - Buyumbura - África', 'Rechazado...', 1),
(15, 'A031', 'Vuelo de pasajeros', 'Vuelo de salida', '2021-11-20', '21:20:00', 'YV-366', '80', 'piloto y copiloto', 'Cabo Verde - Praia - África', 'Rechazado...', 1),
(16, 'A013', 'Vuelo de pasajeros', 'Vuelo de salida', '2021-11-02', '02:00:00', 'GB-780', '150', 'piloto y copiloto', 'Bahamas - Nasáu - América', 'Rechazado...', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_flight_reprogramation`
--

CREATE TABLE `tb_flight_reprogramation` (
  `id` int(11) NOT NULL,
  `code_flight` varchar(20) NOT NULL,
  `type_flight` varchar(50) NOT NULL,
  `flight_selection` varchar(50) NOT NULL,
  `crew_plane` varchar(50) NOT NULL,
  `destination` varchar(200) NOT NULL,
  `runway` varchar(50) DEFAULT NULL,
  `date_flight` date DEFAULT NULL,
  `time_flight` time DEFAULT NULL,
  `description` varchar(700) NOT NULL,
  `id_airline` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_flight_reprogramation`
--

INSERT INTO `tb_flight_reprogramation` (`id`, `code_flight`, `type_flight`, `flight_selection`, `crew_plane`, `destination`, `runway`, `date_flight`, `time_flight`, `description`, `id_airline`) VALUES
(15, 'A040', 'Vuelo de carga', 'Vuelo de llegada', 'piloto y copiloto', 'Colombia - Bogotá - América', 'pista - 09A', '2021-11-30', '16:00:00', 'Se reprograma el vuelo por mal clima.', 1),
(16, 'A040', 'Vuelo de carga', 'Vuelo de llegada', 'piloto y copiloto', 'Colombia - Bogotá - América', 'pista - 01B', '2021-05-04', '01:01:00', '123', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_flight_reprogramation_airline`
--

CREATE TABLE `tb_flight_reprogramation_airline` (
  `id` int(11) NOT NULL,
  `code_flight` varchar(20) NOT NULL,
  `type_flight` varchar(50) NOT NULL,
  `flight_selection` varchar(50) NOT NULL,
  `crew_plane` varchar(50) NOT NULL,
  `destination` varchar(200) NOT NULL,
  `capacity_plane` varchar(50) DEFAULT NULL,
  `model_plane` varchar(50) DEFAULT NULL,
  `date_flight` date DEFAULT NULL,
  `time_flight` time DEFAULT NULL,
  `description` varchar(700) DEFAULT NULL,
  `id_airline` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_flight_reprogramation_airline`
--

INSERT INTO `tb_flight_reprogramation_airline` (`id`, `code_flight`, `type_flight`, `flight_selection`, `crew_plane`, `destination`, `capacity_plane`, `model_plane`, `date_flight`, `time_flight`, `description`, `id_airline`) VALUES
(1, 'A008', 'Vuelo de carga', 'Vuelo de salida', 'piloto y copiloto', 'Argelia - Argel - África', '800', 'DEF-710', '2021-12-22', '01:45:00', 'Vuelo reprogramado por aerolinea\n\nSe reprograma el vuelo por cuestión de clima.', 1),
(2, 'A006', 'Vuelo de pasajeros', 'Vuelo de salida', 'piloto y copiloto', 'Antigua y Barbuda - Saint John - América', '280', 'QK-428', '2021-10-20', '22:00:00', 'Vuelo reprogramado por aerolinea\n\nSe reprograma el vuelo por mal clima.', 1),
(3, 'A004', 'Vuelo de carga', 'Vuelo de salida', 'piloto y copiloto', 'Andorra - Andorra la Vieja - Europa', '500', 'WED-321', '2022-02-02', '02:00:00', 'Vuelo reprogramado por aerolinea\n\nSe reprograma', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_flight_requeriment_airline`
--

CREATE TABLE `tb_flight_requeriment_airline` (
  `id` int(11) NOT NULL,
  `code_flight` varchar(15) NOT NULL,
  `model_plane` varchar(50) NOT NULL,
  `Type_flight` varchar(50) NOT NULL,
  `flight_selection` varchar(50) NOT NULL,
  `capacity_plane` varchar(50) NOT NULL,
  `crew_plane` varchar(50) NOT NULL,
  `date_flight` date DEFAULT NULL,
  `time_flight` time DEFAULT NULL,
  `id_airline` int(11) NOT NULL,
  `destination` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_flight_requeriment_airline`
--

INSERT INTO `tb_flight_requeriment_airline` (`id`, `code_flight`, `model_plane`, `Type_flight`, `flight_selection`, `capacity_plane`, `crew_plane`, `date_flight`, `time_flight`, `id_airline`, `destination`) VALUES
(38, 'A014', 'TYG-001', 'Vuelo de carga', 'Vuelo de llegada', '1060', 'piloto y copiloto', '2021-11-03', '20:00:00', 1, 'Bangladés - Daca - Asia'),
(39, 'A015', 'YX-578', 'Vuelo de pasajeros', 'Vuelo de llegada', '100', 'piloto y copiloto', '2021-11-04', '01:20:00', 1, 'Barbados - Bridgetown - América'),
(41, 'A017', 'SWD-300', 'Vuelo de carga', 'Vuelo de salida', '700', 'piloto y copiloto', '2021-11-06', '14:00:00', 1, 'Bélgica - Bruselas - Europa'),
(42, 'A018', 'MK-340', 'Vuelo de pasajeros', 'Vuelo de llegada', '150', 'piloto y copiloto', '2021-11-07', '14:30:00', 1, 'Belice - Belmopán - América'),
(43, 'A019', 'SSD-898', 'Vuelo de carga', 'Vuelo de salida', '800', 'piloto y copiloto', '2021-11-08', '05:00:00', 1, 'Benín - Porto - Novo - África'),
(45, 'A021', 'UF-555', 'Vuelo de pasajeros', 'Vuelo de salida', '280', 'piloto y copiloto', '2021-11-10', '13:40:00', 1, 'Birmania - Naipyidó - Asia'),
(47, 'A023', 'QWE-309', 'Vuelo de carga', 'Vuelo de llegada', '350', 'Piloto', '2021-11-12', '10:35:00', 1, 'Bosnia - Herzegovina - Sarajevo - Europa'),
(48, 'A024', 'QW-826', 'Vuelo de pasajeros', 'Vuelo de salida', '200', 'piloto y copiloto', '2021-11-13', '23:10:00', 1, 'Botsuana - Gaborone - África'),
(49, 'A025', 'CDV-005', 'Vuelo de carga', 'Vuelo de salida', '350', 'Piloto', '2021-11-14', '15:45:00', 1, 'Brasil - Brasilia - América'),
(50, 'A026', 'QWS-450', 'Vuelo de carga', 'Vuelo de salida', '1060', 'piloto y copiloto', '2021-11-15', '22:18:00', 1, 'Brunéi - Bandar Seri Begawan - Asia'),
(51, 'A027', 'LP-895', 'Vuelo de pasajeros', 'Vuelo de llegada', '280', 'piloto y copiloto', '2021-11-16', '20:15:00', 1, 'Bulgaria - Sofía - Europa'),
(54, 'A030', 'TYG-001', 'Vuelo de carga', 'Vuelo de llegada', '500', 'Piloto', '2021-11-19', '17:15:00', 1, 'Bután - Thimphu - Asia'),
(56, 'A032', 'HJ-034', 'Vuelo de pasajeros', 'Vuelo de llegada', '50', 'piloto y copiloto', '2021-11-21', '21:40:00', 1, 'Camboya - Nom Pen - Asia'),
(58, 'A034', 'VCB-960', 'Vuelo de carga', 'Vuelo de llegada', '800', 'Piloto', '2021-11-23', '20:20:00', 1, 'Canadá - Ottawa - América'),
(59, 'A035', 'GB-780', 'Vuelo de pasajeros', 'Vuelo de llegada', '50', 'piloto y copiloto', '2021-11-24', '22:40:00', 1, 'Catar - Doha - Asia'),
(60, 'A036', 'VJ-931', 'Vuelo de pasajeros', 'Vuelo de llegada', '280', 'piloto y copiloto', '2021-11-25', '18:50:00', 1, 'Chad - Yamena - África'),
(61, 'A037', 'LP-895', 'Vuelo de pasajeros', 'Vuelo de llegada', '200', 'piloto y copiloto', '2021-11-26', '17:15:00', 1, 'Chile - Santiago - América'),
(62, 'A038', 'AX-179', 'Vuelo de pasajeros', 'Vuelo de llegada', '200', 'piloto y copiloto', '2021-11-27', '15:45:00', 1, 'China - Pekín - Asia'),
(63, 'A039', 'QW-826', 'Vuelo de pasajeros', 'Vuelo de salida', '280', 'piloto y copiloto', '2021-10-28', '02:00:00', 1, 'Chipre - Nicosia - Europa'),
(65, 'A041', 'WED-321', 'Vuelo de carga', 'Vuelo de salida', '600', 'piloto y copiloto', '2021-11-30', '19:45:00', 1, 'Comoras - Moroni - África'),
(67, 'A043', 'ZXC-987', 'Vuelo de carga', 'Vuelo de salida', '950', 'piloto y copiloto', '2021-12-02', '05:18:00', 1, 'Corea del Norte - Pionyang - Asia'),
(68, 'A044', 'ZM-001', 'Vuelo de pasajeros', 'Vuelo de llegada', '280', 'piloto y copiloto', '2021-12-03', '09:00:00', 1, 'Corea del Sur - Seúl - Asia'),
(69, 'A045', 'TYG-001', 'Vuelo de carga', 'Vuelo de llegada', '950', 'piloto y copiloto', '2021-12-04', '13:45:00', 1, 'Costa de Marfil - Yamusukro - África'),
(70, 'A046', 'YX-578', 'Vuelo de pasajeros', 'Vuelo de salida', '100', 'piloto y copiloto', '2021-12-05', '21:25:00', 1, 'Costa Rica - San José - América'),
(71, 'A047', 'ZX-825', 'Vuelo de pasajeros', 'Vuelo de llegada', '250', 'piloto y copiloto', '2021-12-06', '07:15:00', 1, 'Croacia - Zagreb - Europa'),
(72, 'A048', 'DEF-710', 'Vuelo de carga', 'Vuelo de salida', '600', 'Piloto', '2021-12-07', '23:30:00', 1, 'Cuba - La Habana - América'),
(73, 'A049', 'SSD-898', 'Vuelo de carga', 'Vuelo de llegada', '700', 'Piloto', '2021-12-08', '23:00:00', 1, 'Dinamarca - Copenhague - Europa'),
(74, 'A050', 'SSD-898', 'Vuelo de carga', 'Vuelo de salida', '1060', 'piloto y copiloto', '2021-12-09', '02:15:00', 1, 'Dominica - Roseau - América'),
(75, 'A051', 'XZC-606', 'Vuelo de carga', 'Vuelo de llegada', '350', 'Piloto', '2021-12-10', '19:00:00', 1, 'Ecuador - Quito - América'),
(76, 'A052', 'AX-179', 'Vuelo de pasajeros', 'Vuelo de llegada', '100', 'piloto y copiloto', '2021-10-11', '04:18:00', 1, 'Egipto - El Cairo - África'),
(77, 'A053', 'ZXC-987', 'Vuelo de carga', 'Vuelo de salida', '500', 'Piloto', '2021-12-12', '07:25:00', 1, 'El Salvador - San Salvador - América'),
(78, 'A054', 'SWD-300', 'Vuelo de carga', 'Vuelo de llegada', '700', 'Piloto', '2021-12-13', '04:50:00', 1, 'Emiratos Árabes Unidos - Abu Dabi - Asia'),
(79, 'A055', 'GB-780', 'Vuelo de pasajeros', 'Vuelo de llegada', '50', 'piloto y copiloto', '2022-01-01', '01:00:00', 1, 'Eritrea - Asmara - África'),
(80, 'A056', 'DEF-710', 'Vuelo de carga', 'Vuelo de salida', '600', 'Piloto', '2021-12-15', '17:15:00', 1, 'Eslovaquia - Bratislava - Europa'),
(82, 'A058', 'CDV-005', 'Vuelo de carga', 'Vuelo de llegada', '950', 'Piloto', '2021-12-18', '16:00:00', 1, 'España - Madrid - Europa'),
(83, 'A080', 'YX-578', 'Vuelo de pasajeros', 'Vuelo de salida', '150', 'Piloto', '2022-03-03', '02:01:00', 1, 'Albania - Tirana - Europa'),
(84, 'A090', 'ZX-825', 'Vuelo de pasajeros', 'Vuelo de llegada', '250', 'piloto y copiloto', '2025-02-05', '02:02:00', 1, 'Alemania - Berlín - Europa');

-- --------------------------------------------------------

--
-- Table structure for table `tb_freight`
--

CREATE TABLE `tb_freight` (
  `id` int(11) NOT NULL,
  `code_freight` varchar(15) NOT NULL,
  `supported_weight` double NOT NULL,
  `id_plane` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_passengers`
--

CREATE TABLE `tb_passengers` (
  `id` int(11) NOT NULL,
  `code_passenger` varchar(15) NOT NULL,
  `supported_passengers` int(11) NOT NULL,
  `id_plane` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_pilots`
--

CREATE TABLE `tb_pilots` (
  `id` int(11) NOT NULL,
  `id_pilot` varchar(15) NOT NULL,
  `name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(60) NOT NULL,
  `experience` varchar(200) NOT NULL,
  `medical_checkup` varchar(200) NOT NULL,
  `id_flight` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_plane`
--

CREATE TABLE `tb_plane` (
  `id` int(11) NOT NULL,
  `code_plane` varchar(15) NOT NULL,
  `model` varchar(100) NOT NULL,
  `capacity` varchar(255) NOT NULL,
  `storage_type` varchar(60) NOT NULL,
  `id_airport` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_timetable`
--

CREATE TABLE `tb_timetable` (
  `id` int(11) NOT NULL,
  `codigo` varchar(20) NOT NULL,
  `date` varchar(100) NOT NULL,
  `time` varchar(100) NOT NULL,
  `runway_takeoff` varchar(250) DEFAULT NULL,
  `runway_landing` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_timetable`
--

INSERT INTO `tb_timetable` (`id`, `codigo`, `date`, `time`, `runway_takeoff`, `runway_landing`) VALUES
(1, 'AT0001', '2022-1-2 : 2022-2-4', '00:00:00 - 00:00:00', 'Disponible pista despegue', 'Disponible pista aterrizaje'),
(2, 'AT0002', '2022-3-2 : 2022-5-2', '00:00:00 - 02:00:00', 'No disponible pista despegue', 'No disponible pista aterrizaje');

-- --------------------------------------------------------

--
-- Table structure for table `tb_type_flight`
--

CREATE TABLE `tb_type_flight` (
  `id` int(11) NOT NULL,
  `code_flight` varchar(100) NOT NULL,
  `type_flight` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_type_flight`
--

INSERT INTO `tb_type_flight` (`id`, `code_flight`, `type_flight`) VALUES
(1, 'A004', 'Vuelo agendado'),
(2, 'A028', 'Vuelo agendado'),
(3, 'A009', 'Vuelo rechazado'),
(4, 'A005', 'Vuelo rechazado'),
(5, 'A029', 'Vuelo rechazado'),
(6, 'A031', 'Vuelo rechazado'),
(7, 'A022', 'Vuelo rechazado'),
(8, 'A042', 'Vuelo rechazado'),
(9, 'A057', 'Vuelo rechazado'),
(11, 'A040', 'Vuelo agendado'),
(12, 'A008', 'Vuelo cancelado'),
(13, 'A080', 'Vuelo solicitado'),
(23, 'A014', 'Vuelo solicitado'),
(24, 'A015', 'Vuelo solicitado'),
(26, 'A017', 'Vuelo solicitado'),
(27, 'A018', 'Vuelo solicitado'),
(28, 'A019', 'Vuelo solicitado'),
(29, 'A021', 'Vuelo solicitado'),
(30, 'A023', 'Vuelo solicitado'),
(31, 'A024', 'Vuelo solicitado'),
(32, 'A025', 'Vuelo solicitado'),
(33, 'A026', 'Vuelo solicitado'),
(34, 'A027', 'Vuelo solicitado'),
(35, 'A030', 'Vuelo solicitado'),
(36, 'A032', 'Vuelo solicitado'),
(37, 'A034', 'Vuelo solicitado'),
(38, 'A035', 'Vuelo solicitado'),
(39, 'A036', 'Vuelo solicitado'),
(40, 'A037', 'Vuelo solicitado'),
(41, 'A038', 'Vuelo solicitado'),
(42, 'A039', 'Vuelo solicitado'),
(43, 'A041', 'Vuelo solicitado'),
(44, 'A043', 'Vuelo solicitado'),
(45, 'A044', 'Vuelo solicitado'),
(46, 'A045', 'Vuelo solicitado'),
(47, 'A046', 'Vuelo solicitado'),
(48, 'A047', 'Vuelo solicitado'),
(49, 'A048', 'Vuelo solicitado'),
(50, 'A049', 'Vuelo solicitado'),
(51, 'A050', 'Vuelo solicitado'),
(52, 'A051', 'Vuelo solicitado'),
(53, 'A052', 'Vuelo solicitado'),
(54, 'A053', 'Vuelo solicitado'),
(55, 'A054', 'Vuelo solicitado'),
(56, 'A055', 'Vuelo solicitado'),
(57, 'A056', 'Vuelo solicitado'),
(58, 'A058', 'Vuelo solicitado'),
(59, 'A080', 'Vuelo solicitado'),
(61, 'A012', 'Vuelo agendado'),
(62, 'A011', 'Vuelo agendado'),
(63, 'A010', 'Vuelo cancelado'),
(64, 'A001', 'Vuelo cancelado'),
(65, 'A013', 'Vuelo rechazado'),
(66, 'A090', 'Vuelo solicitado'),
(67, 'A016', 'Vuelo agendado');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_admin`
--
ALTER TABLE `tb_admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_airline`
--
ALTER TABLE `tb_airline`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_airport` (`id_airport`);

--
-- Indexes for table `tb_airline_staff`
--
ALTER TABLE `tb_airline_staff`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_airline` (`id_airline`);

--
-- Indexes for table `tb_airline_staff_delete`
--
ALTER TABLE `tb_airline_staff_delete`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_airline` (`id_airline`);

--
-- Indexes for table `tb_airport`
--
ALTER TABLE `tb_airport`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_airport_staff`
--
ALTER TABLE `tb_airport_staff`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_airport` (`id_airport`);

--
-- Indexes for table `tb_airport_staff_delete`
--
ALTER TABLE `tb_airport_staff_delete`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_airport` (`id_airport`);

--
-- Indexes for table `tb_arrival`
--
ALTER TABLE `tb_arrival`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_flight` (`id_flight`);

--
-- Indexes for table `tb_departure`
--
ALTER TABLE `tb_departure`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_flight` (`id_flight`);

--
-- Indexes for table `tb_flight`
--
ALTER TABLE `tb_flight`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_airline` (`id_airline`);

--
-- Indexes for table `tb_flight_cancelation_agenda`
--
ALTER TABLE `tb_flight_cancelation_agenda`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_airline` (`id_airline`);

--
-- Indexes for table `tb_flight_cancelation_airline`
--
ALTER TABLE `tb_flight_cancelation_airline`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_airline` (`id_airline`);

--
-- Indexes for table `tb_flight_declined`
--
ALTER TABLE `tb_flight_declined`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_airline` (`id_airline`);

--
-- Indexes for table `tb_flight_reprogramation`
--
ALTER TABLE `tb_flight_reprogramation`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_airline` (`id_airline`);

--
-- Indexes for table `tb_flight_reprogramation_airline`
--
ALTER TABLE `tb_flight_reprogramation_airline`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_airline` (`id_airline`);

--
-- Indexes for table `tb_flight_requeriment_airline`
--
ALTER TABLE `tb_flight_requeriment_airline`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_airline` (`id_airline`);

--
-- Indexes for table `tb_freight`
--
ALTER TABLE `tb_freight`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_plane` (`id_plane`);

--
-- Indexes for table `tb_passengers`
--
ALTER TABLE `tb_passengers`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_plane` (`id_plane`);

--
-- Indexes for table `tb_pilots`
--
ALTER TABLE `tb_pilots`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_flight` (`id_flight`);

--
-- Indexes for table `tb_plane`
--
ALTER TABLE `tb_plane`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_airport` (`id_airport`);

--
-- Indexes for table `tb_timetable`
--
ALTER TABLE `tb_timetable`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_type_flight`
--
ALTER TABLE `tb_type_flight`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_admin`
--
ALTER TABLE `tb_admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_airline`
--
ALTER TABLE `tb_airline`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tb_airline_staff`
--
ALTER TABLE `tb_airline_staff`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `tb_airline_staff_delete`
--
ALTER TABLE `tb_airline_staff_delete`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tb_airport`
--
ALTER TABLE `tb_airport`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tb_airport_staff`
--
ALTER TABLE `tb_airport_staff`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `tb_airport_staff_delete`
--
ALTER TABLE `tb_airport_staff_delete`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `tb_arrival`
--
ALTER TABLE `tb_arrival`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_departure`
--
ALTER TABLE `tb_departure`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_flight`
--
ALTER TABLE `tb_flight`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT for table `tb_flight_cancelation_agenda`
--
ALTER TABLE `tb_flight_cancelation_agenda`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tb_flight_cancelation_airline`
--
ALTER TABLE `tb_flight_cancelation_airline`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tb_flight_declined`
--
ALTER TABLE `tb_flight_declined`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `tb_flight_reprogramation`
--
ALTER TABLE `tb_flight_reprogramation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `tb_flight_reprogramation_airline`
--
ALTER TABLE `tb_flight_reprogramation_airline`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tb_flight_requeriment_airline`
--
ALTER TABLE `tb_flight_requeriment_airline`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=85;

--
-- AUTO_INCREMENT for table `tb_freight`
--
ALTER TABLE `tb_freight`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_passengers`
--
ALTER TABLE `tb_passengers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_pilots`
--
ALTER TABLE `tb_pilots`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_plane`
--
ALTER TABLE `tb_plane`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_timetable`
--
ALTER TABLE `tb_timetable`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tb_type_flight`
--
ALTER TABLE `tb_type_flight`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=68;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_airline`
--
ALTER TABLE `tb_airline`
  ADD CONSTRAINT `tb_airline_ibfk_1` FOREIGN KEY (`id_airport`) REFERENCES `tb_airport` (`id`);

--
-- Constraints for table `tb_airline_staff`
--
ALTER TABLE `tb_airline_staff`
  ADD CONSTRAINT `tb_airline_staff_ibfk_1` FOREIGN KEY (`id_airline`) REFERENCES `tb_airline` (`id`);

--
-- Constraints for table `tb_airline_staff_delete`
--
ALTER TABLE `tb_airline_staff_delete`
  ADD CONSTRAINT `tb_airline_staff_delete_ibfk_1` FOREIGN KEY (`id_airline`) REFERENCES `tb_airline` (`id`);

--
-- Constraints for table `tb_airport_staff`
--
ALTER TABLE `tb_airport_staff`
  ADD CONSTRAINT `tb_airport_staff_ibfk_1` FOREIGN KEY (`id_airport`) REFERENCES `tb_airport` (`id`);

--
-- Constraints for table `tb_airport_staff_delete`
--
ALTER TABLE `tb_airport_staff_delete`
  ADD CONSTRAINT `tb_airport_staff_delete_ibfk_1` FOREIGN KEY (`id_airport`) REFERENCES `tb_airport` (`id`);

--
-- Constraints for table `tb_arrival`
--
ALTER TABLE `tb_arrival`
  ADD CONSTRAINT `tb_arrival_ibfk_1` FOREIGN KEY (`id_flight`) REFERENCES `tb_flight` (`id`);

--
-- Constraints for table `tb_departure`
--
ALTER TABLE `tb_departure`
  ADD CONSTRAINT `tb_departure_ibfk_1` FOREIGN KEY (`id_flight`) REFERENCES `tb_flight` (`id`);

--
-- Constraints for table `tb_flight`
--
ALTER TABLE `tb_flight`
  ADD CONSTRAINT `tb_flight_ibfk_1` FOREIGN KEY (`id_airline`) REFERENCES `tb_airline` (`id`);

--
-- Constraints for table `tb_flight_cancelation_agenda`
--
ALTER TABLE `tb_flight_cancelation_agenda`
  ADD CONSTRAINT `tb_flight_cancelation_agenda_ibfk_1` FOREIGN KEY (`id_airline`) REFERENCES `tb_airline` (`id`);

--
-- Constraints for table `tb_flight_cancelation_airline`
--
ALTER TABLE `tb_flight_cancelation_airline`
  ADD CONSTRAINT `tb_flight_cancelation_airline_ibfk_1` FOREIGN KEY (`id_airline`) REFERENCES `tb_airline` (`id`);

--
-- Constraints for table `tb_flight_declined`
--
ALTER TABLE `tb_flight_declined`
  ADD CONSTRAINT `tb_flight_declined_ibfk_1` FOREIGN KEY (`id_airline`) REFERENCES `tb_airline` (`id`);

--
-- Constraints for table `tb_flight_reprogramation`
--
ALTER TABLE `tb_flight_reprogramation`
  ADD CONSTRAINT `tb_flight_reprogramation_ibfk_1` FOREIGN KEY (`id_airline`) REFERENCES `tb_airline` (`id`);

--
-- Constraints for table `tb_flight_reprogramation_airline`
--
ALTER TABLE `tb_flight_reprogramation_airline`
  ADD CONSTRAINT `tb_flight_reprogramation_airline_ibfk_1` FOREIGN KEY (`id_airline`) REFERENCES `tb_airline` (`id`);

--
-- Constraints for table `tb_flight_requeriment_airline`
--
ALTER TABLE `tb_flight_requeriment_airline`
  ADD CONSTRAINT `tb_flight_requeriment_airline_ibfk_1` FOREIGN KEY (`id_airline`) REFERENCES `tb_airline` (`id`);

--
-- Constraints for table `tb_freight`
--
ALTER TABLE `tb_freight`
  ADD CONSTRAINT `tb_freight_ibfk_1` FOREIGN KEY (`id_plane`) REFERENCES `tb_plane` (`id`);

--
-- Constraints for table `tb_passengers`
--
ALTER TABLE `tb_passengers`
  ADD CONSTRAINT `tb_passengers_ibfk_1` FOREIGN KEY (`id_plane`) REFERENCES `tb_plane` (`id`);

--
-- Constraints for table `tb_pilots`
--
ALTER TABLE `tb_pilots`
  ADD CONSTRAINT `tb_pilots_ibfk_1` FOREIGN KEY (`id_flight`) REFERENCES `tb_flight` (`id`);

--
-- Constraints for table `tb_plane`
--
ALTER TABLE `tb_plane`
  ADD CONSTRAINT `tb_plane_ibfk_1` FOREIGN KEY (`id_airport`) REFERENCES `tb_airport` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
