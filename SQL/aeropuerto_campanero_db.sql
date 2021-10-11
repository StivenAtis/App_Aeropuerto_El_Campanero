-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 11, 2021 at 04:21 AM
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

--
-- Dumping data for table `tb_airline_staff`
--

INSERT INTO `tb_airline_staff` (`id`, `id_airline_staff`, `name`, `last_name`, `phone`, `email`, `user_staff`, `password_staff`, `id_airline`) VALUES
(7, '0', 'User Name', 'User Last name', '0', 'user@aerolinea.com', 'User', 'u3z7BVMkEIlm5qzOY1hqcw==', 1);

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
(7, '0', 'User Name', 'User Last name', '0', 'user@elcampanero.com', 'User_1', 'u3z7BVMkEIlm5qzOY1hqcw==', 1);

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

--
-- Indexes for dumped tables
--

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
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_airline`
--
ALTER TABLE `tb_airline`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tb_airline_staff`
--
ALTER TABLE `tb_airline_staff`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_airport`
--
ALTER TABLE `tb_airport`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tb_airport_staff`
--
ALTER TABLE `tb_airport_staff`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `tb_flight_cancelation_agenda`
--
ALTER TABLE `tb_flight_cancelation_agenda`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tb_flight_cancelation_airline`
--
ALTER TABLE `tb_flight_cancelation_airline`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tb_flight_declined`
--
ALTER TABLE `tb_flight_declined`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `tb_flight_reprogramation`
--
ALTER TABLE `tb_flight_reprogramation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `tb_flight_requeriment_airline`
--
ALTER TABLE `tb_flight_requeriment_airline`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

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
-- Constraints for table `tb_airport_staff`
--
ALTER TABLE `tb_airport_staff`
  ADD CONSTRAINT `tb_airport_staff_ibfk_1` FOREIGN KEY (`id_airport`) REFERENCES `tb_airport` (`id`);

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
