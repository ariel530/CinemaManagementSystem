-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 21, 2022 at 02:55 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cinematicketbookingsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `bookedticketstable`
--

CREATE TABLE `bookedticketstable` (
  `BT_Id` int(11) NOT NULL COMMENT 'Booked Tickets Id, unique, autoincrement',
  `BT_UId` varchar(200) NOT NULL COMMENT 'email Id of the user name who has booked the tickets',
  `BT_TotalPrice` double NOT NULL COMMENT 'Total price for the current booking'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `halltable`
--

CREATE TABLE `halltable` (
  `H_Id` int(11) NOT NULL COMMENT 'Id for the hall, unique and auto increment',
  `H_Name` varchar(100) NOT NULL COMMENT 'Name of the hall',
  `H_IsDeleted` tinyint(1) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `halltable`
--

INSERT INTO `halltable` (`H_Id`, `H_Name`, `H_IsDeleted`) VALUES
(1, 'Hall 1', 1),
(2, 'Hall 2', 1),
(3, 'Hall 3', 1),
(4, 'new HAll', 1),
(5, 'kzxj', 1),
(6, 'askll', 1),
(7, 'a', 0);

-- --------------------------------------------------------

--
-- Table structure for table `moviestable`
--

CREATE TABLE `moviestable` (
  `M_Id` int(11) NOT NULL COMMENT 'movie id ,unique ,aut increment',
  `M_Name` varchar(200) NOT NULL COMMENT 'name of the movie',
  `M_Date` date NOT NULL COMMENT 'release date of movie',
  `M_Time` varchar(200) NOT NULL COMMENT 'release time of movie',
  `M_Price` double NOT NULL COMMENT 'price of the movie ticket',
  `M_TId` int(11) NOT NULL COMMENT 'ticket type id ',
  `M_HId` int(11) NOT NULL COMMENT 'hall id ',
  `M_ImagePath` varchar(2000) DEFAULT NULL,
  `M_IsDeleted` tinyint(1) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `paymentdetailtable`
--

CREATE TABLE `paymentdetailtable` (
  `P_Id` int(11) NOT NULL COMMENT 'Payment Id, auto increament unique',
  `P_BTId` int(11) NOT NULL COMMENT 'Id of the booked tickets record',
  `P_CardHolderName` varchar(200) DEFAULT NULL COMMENT 'Card Holder Name',
  `P_CCVNumber` varchar(5) DEFAULT NULL COMMENT 'CCV Number on card',
  `P_CardNumber` varchar(100) DEFAULT NULL,
  `P_PaymentMethod` varchar(200) NOT NULL COMMENT 'Payment Method either be cash or master card'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tickettypetable`
--

CREATE TABLE `tickettypetable` (
  `T_Id` int(11) NOT NULL COMMENT 'Ticket Type Id, unique and autoincrement',
  `T_Name` varchar(100) NOT NULL COMMENT 'Ticket type Name',
  `T_IsDeleted` tinyint(1) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tickettypetable`
--

INSERT INTO `tickettypetable` (`T_Id`, `T_Name`, `T_IsDeleted`) VALUES
(1, 'Diamond', 0),
(2, 'Silver', 0);

-- --------------------------------------------------------

--
-- Table structure for table `userstable`
--

CREATE TABLE `userstable` (
  `U_Email` varchar(300) NOT NULL COMMENT 'The email for the username which is unique and used for login',
  `U_Password` varchar(300) NOT NULL COMMENT 'Password of the user',
  `U_FirstName` varchar(300) NOT NULL COMMENT 'first Name of the user\r\n',
  `U_LastName` varchar(300) NOT NULL COMMENT 'Last Name of the user',
  `U_Address` varchar(500) NOT NULL COMMENT 'Address of the user',
  `U_UserType` varchar(100) NOT NULL COMMENT 'Type of the user. It will be admin or customer'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userstable`
--

INSERT INTO `userstable` (`U_Email`, `U_Password`, `U_FirstName`, `U_LastName`, `U_Address`, `U_UserType`) VALUES
('a@a.com', 'a', 'a', 'a', 'a', 'CUSTOMER'),
('admin1@admin.com', 'admin1', 'Akbar', 'Ahmad', 'Street 214, Madinah', 'ADMIN'),
('admin@admin.com', 'admin', 'Ahmad', 'Ali', 'Street 214, Riyadh', 'ADMIN'),
('fatima@gmail.com', 'fatima124@!', 'Fatima', 'Mehmad', 'Room 1', 'USER'),
('sz@gmail.com', '123', 'zain', 'rehman', 'sahiwal', 'CUSTOMER'),
('talha@gmail.com', 'talha1234@', 'Talha', 'Aslam', 'Street 414', 'USER');

-- --------------------------------------------------------

--
-- Table structure for table `userticketseattable`
--

CREATE TABLE `userticketseattable` (
  `UTS_Id` int(11) NOT NULL COMMENT 'id, autoincrement unique',
  `UTS_BId` int(11) NOT NULL COMMENT 'Booking of the booked tickets',
  `UTS_MId` int(11) NOT NULL COMMENT 'Id of the movie for which ticket is booked',
  `UTS_SeatNumber` int(11) NOT NULL COMMENT 'Booked seat number'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bookedticketstable`
--
ALTER TABLE `bookedticketstable`
  ADD PRIMARY KEY (`BT_Id`),
  ADD KEY `BT_UId` (`BT_UId`);

--
-- Indexes for table `halltable`
--
ALTER TABLE `halltable`
  ADD PRIMARY KEY (`H_Id`);

--
-- Indexes for table `moviestable`
--
ALTER TABLE `moviestable`
  ADD PRIMARY KEY (`M_Id`),
  ADD KEY `M_HId` (`M_HId`),
  ADD KEY `M_TId` (`M_TId`);

--
-- Indexes for table `paymentdetailtable`
--
ALTER TABLE `paymentdetailtable`
  ADD PRIMARY KEY (`P_Id`),
  ADD KEY `P_BTId` (`P_BTId`);

--
-- Indexes for table `tickettypetable`
--
ALTER TABLE `tickettypetable`
  ADD PRIMARY KEY (`T_Id`);

--
-- Indexes for table `userstable`
--
ALTER TABLE `userstable`
  ADD PRIMARY KEY (`U_Email`);

--
-- Indexes for table `userticketseattable`
--
ALTER TABLE `userticketseattable`
  ADD PRIMARY KEY (`UTS_Id`),
  ADD KEY `UTS_BId` (`UTS_BId`),
  ADD KEY `UTS_MId` (`UTS_MId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bookedticketstable`
--
ALTER TABLE `bookedticketstable`
  MODIFY `BT_Id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Booked Tickets Id, unique, autoincrement', AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `halltable`
--
ALTER TABLE `halltable`
  MODIFY `H_Id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Id for the hall, unique and auto increment', AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `moviestable`
--
ALTER TABLE `moviestable`
  MODIFY `M_Id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'movie id ,unique ,aut increment', AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `paymentdetailtable`
--
ALTER TABLE `paymentdetailtable`
  MODIFY `P_Id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Payment Id, auto increament unique', AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tickettypetable`
--
ALTER TABLE `tickettypetable`
  MODIFY `T_Id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Ticket Type Id, unique and autoincrement', AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `userticketseattable`
--
ALTER TABLE `userticketseattable`
  MODIFY `UTS_Id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id, autoincrement unique', AUTO_INCREMENT=22;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bookedticketstable`
--
ALTER TABLE `bookedticketstable`
  ADD CONSTRAINT `bookedticketstable_ibfk_1` FOREIGN KEY (`BT_UId`) REFERENCES `userstable` (`U_Email`);

--
-- Constraints for table `moviestable`
--
ALTER TABLE `moviestable`
  ADD CONSTRAINT `moviestable_ibfk_1` FOREIGN KEY (`M_HId`) REFERENCES `halltable` (`H_Id`),
  ADD CONSTRAINT `moviestable_ibfk_2` FOREIGN KEY (`M_TId`) REFERENCES `tickettypetable` (`T_Id`);

--
-- Constraints for table `paymentdetailtable`
--
ALTER TABLE `paymentdetailtable`
  ADD CONSTRAINT `paymentdetailtable_ibfk_1` FOREIGN KEY (`P_BTId`) REFERENCES `bookedticketstable` (`BT_Id`);

--
-- Constraints for table `userticketseattable`
--
ALTER TABLE `userticketseattable`
  ADD CONSTRAINT `userticketseattable_ibfk_1` FOREIGN KEY (`UTS_BId`) REFERENCES `bookedticketstable` (`BT_Id`),
  ADD CONSTRAINT `userticketseattable_ibfk_2` FOREIGN KEY (`UTS_MId`) REFERENCES `moviestable` (`M_Id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
