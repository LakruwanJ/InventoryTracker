-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 14, 2023 at 02:04 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventorytracker`
--

-- --------------------------------------------------------

--
-- Table structure for table `addremove`
--

CREATE TABLE `addremove` (
  `ARID` varchar(10) NOT NULL,
  `SKID` varchar(10) NOT NULL,
  `SID` varchar(10) NOT NULL,
  `itemID` varchar(10) NOT NULL,
  `Quantity` varchar(30) NOT NULL,
  `Date` date NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `addremove`
--

INSERT INTO `addremove` (`ARID`, `SKID`, `SID`, `itemID`, `Quantity`, `Date`, `Status`) VALUES
('ar0001', 'SK0001', 'sup0002', 'item0003', '24', '2022-08-11', 'add'),
('ar0002', 'SK0001', 'sup0001', 'item0017', '5', '2023-08-02', 'remove');

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Aid` varchar(10) NOT NULL,
  `username` varchar(150) NOT NULL,
  `phoneNo` varchar(10) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Aid`, `username`, `phoneNo`, `email`, `password`) VALUES
('Ad0001', 'PabodaniL', '0772529442', 'Pabodani@gmail.com', 'pabo123'),
('Ad0002', 'ChaminL', '0772529443', 'Chamin@gmail.com', 'aaa111AAA!!!');

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `itemID` varchar(10) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `type` varchar(30) NOT NULL,
  `UnitCapacity` varchar(10) NOT NULL,
  `UnitPrice` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`itemID`, `Name`, `type`, `UnitCapacity`, `UnitPrice`) VALUES
('item0001', 'aaaa', 'aaaaa', '', '3232323.0'),
('item0002', 'aaaa', 'aaaaa', '', '12.3'),
('item0003', '', 'aaaaa', '', '0.0'),
('item0004', '', 'aaaaa', '', '12.3'),
('item0005', '', 'aaaaa', '', '12.3'),
('item0006', 'ss', 'aaaaa', '', '12.3'),
('item0007', 'aaa', 'aaaaa', '', '15.0'),
('item0008', 'aaa', 'fgf', '', '34.0'),
('item0009', 'aaa', 'Raw materia', '', '34.0'),
('item0010', 'abcdefg', 'Raw materia', '', '34.0'),
('item0011', 'dsgsdfgsdfg', 'Raw materia', '', '129000.0'),
('item0012', 'zDfasdfsdf', 'Product', '', '15.0'),
('item0013', 'sdfsdf', 'Raw materia', '', '12.0'),
('item0014', 'aaa', 'Product', '', '34.0'),
('item0015', 'sdfsdf', 'Product', '', '12.0'),
('item0016', 'aaa', 'Product', '', '12.0'),
('item0017', 'aaa', 'Raw materia', '', '10.0'),
('item0020', 'aaa', 'Product', '4', '43.0'),
('item0021', 'ss', 'Product', '4', '12.0'),
('item0023', 'phone', 'Product', '4', '34.0');

-- --------------------------------------------------------

--
-- Table structure for table `marketingteam`
--

CREATE TABLE `marketingteam` (
  `MID` varchar(10) NOT NULL,
  `username` varchar(150) NOT NULL,
  `phoneNo` varchar(10) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `marketingteam`
--

INSERT INTO `marketingteam` (`MID`, `username`, `phoneNo`, `email`, `password`) VALUES
('mkt0001', 'JanarthanaK', '0772145600', 'Janarthana@gmail.com', 'jana123'),
('mkt0002', 'KavinduG', '0772145605', 'Kavindu@gmail.com', 'kavi123');

-- --------------------------------------------------------

--
-- Table structure for table `releaseitem`
--

CREATE TABLE `releaseitem` (
  `RLID` varchar(10) NOT NULL,
  `SKID` varchar(10) NOT NULL,
  `MID` varchar(10) NOT NULL,
  `itemID` varchar(10) NOT NULL,
  `Quantity` varchar(30) NOT NULL,
  `Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `releaseitem`
--

INSERT INTO `releaseitem` (`RLID`, `SKID`, `MID`, `itemID`, `Quantity`, `Date`) VALUES
('rtm0001', 'SK0002', 'mkt0002', 'item0002', '24', '2022-08-11'),
('rtm0002', 'SK0002', 'mkt0001', 'item0015', '5', '2023-08-02');

-- --------------------------------------------------------

--
-- Table structure for table `requestitemm`
--

CREATE TABLE `requestitemm` (
  `RmID` varchar(10) NOT NULL,
  `SKID` varchar(10) NOT NULL,
  `MID` varchar(10) NOT NULL,
  `itemID` varchar(10) NOT NULL,
  `Quantity` varchar(30) NOT NULL,
  `Date` date NOT NULL,
  `Status` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `requestitemm`
--

INSERT INTO `requestitemm` (`RmID`, `SKID`, `MID`, `itemID`, `Quantity`, `Date`, `Status`) VALUES
('rbm0001', 'SK0001', 'mkt0001', 'item0001', '24', '2022-08-11', 'req'),
('rbm0002', 'SK0002', 'mkt0002', 'item0017', '5', '2023-08-02', 'close'),
('rbm0003', 'SK0002', 'mkt0002', 'item0003', '1', '2023-08-10', 'Pending'),
('rbm0004', 'SK0002', 'mkt0002', 'item0001', '1', '2023-08-10', 'Not Available'),
('rbm0005', 'SK0002', 'mkt0002', 'item0001', '1', '2023-08-10', 'Not Available'),
('rbm0006', 'SK0001', 'mkt0002', 'item0001', '500', '2023-08-10', 'Not Available'),
('rbm0007', 'SK0001', 'mkt0002', 'item0001', '500', '2023-08-10', 'Not Available'),
('rbm0008', 'SK0001', 'mkt0002', 'item0003', '1', '2023-08-10', 'Pending'),
('rbm0009', 'SK0002', 'mkt0002', 'item0003', '1', '2023-08-10', 'Pending'),
('rbm0010', 'SK0001', 'mkt0002', 'item0001', '500', '2023-08-10', 'Not Available'),
('rbm0011', 'SK0001', 'mkt0001', 'item0001', '1', '2023-08-13', 'Not Available'),
('rbm0012', 'SK0001', 'mkt0001', 'item0001', '1', '2023-08-14', 'Not Available'),
('rbm0013', 'SK0001', 'mkt0001', 'item0001', '1', '2023-08-14', 'Not Available');

-- --------------------------------------------------------

--
-- Table structure for table `requestitems`
--

CREATE TABLE `requestitems` (
  `RID` varchar(10) NOT NULL,
  `SKID` varchar(10) NOT NULL,
  `SID` varchar(10) NOT NULL,
  `itemID` varchar(10) NOT NULL,
  `Quantity` varchar(30) NOT NULL,
  `Date` date NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `requestitems`
--

INSERT INTO `requestitems` (`RID`, `SKID`, `SID`, `itemID`, `Quantity`, `Date`, `Status`) VALUES
('rbs0001', 'SK0001', 'sup0001', 'item0002', '24', '2022-08-04', 'Sent'),
('rbs0002', 'SK0002', 'sup0002', 'item0016', '3', '2023-08-02', 'Sent'),
('rbs0003', 'SK0001', 'sup0001', 'item0023', '1', '2022-08-13', 'Pending'),
('rbs0004', 'SK0002', 'sup0002', 'item0023', '1', '2022-08-13', 'Pending'),
('rbs0005', 'SK0002', 'sup0001', 'item0023', '500', '2022-08-13', 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE `stock` (
  `StockID` varchar(10) NOT NULL,
  `Location` varchar(500) NOT NULL,
  `FullCapacity` varchar(50) NOT NULL,
  `StoredCapacity` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stock`
--

INSERT INTO `stock` (`StockID`, `Location`, `FullCapacity`, `StoredCapacity`) VALUES
('Sto0001', 'Kandy', '100', '52'),
('Sto0002', 'Badulla', '80', '34');

-- --------------------------------------------------------

--
-- Table structure for table `stockkeeper`
--

CREATE TABLE `stockkeeper` (
  `SKID` varchar(10) NOT NULL,
  `username` varchar(150) NOT NULL,
  `phoneNo` varchar(10) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stockkeeper`
--

INSERT INTO `stockkeeper` (`SKID`, `username`, `phoneNo`, `email`, `password`) VALUES
('SK0001', 'HasanM', '0772145683', 'HasanM@gmail.com', 'hasa123'),
('SK0002', 'FarhathF', '0772145685', 'Farhath@gmail.com', 'far123');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `SID` varchar(10) NOT NULL,
  `username` varchar(150) NOT NULL,
  `phoneNo` varchar(10) NOT NULL,
  `email` varchar(150) NOT NULL,
  `password` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`SID`, `username`, `phoneNo`, `email`, `password`) VALUES
('sup0001', 'LakruwanJ', '0772529441', 'lakruwan@gmail.com', 'laka123'),
('sup0002', 'IsuruD', '0778965412', 'Isuru@gmail.com', 'aaaSSS111@@@'),
('sup0003', 'Lakruwanlk', '0772529441', 'Lakruwan987@gmail.com', '6f513c7c0c6aff5814caf9e3d9b1d2ee'),
('sup0004', 'Lakruwan', '111111', 'tejay28326@chnlog.com', '6f513c7c0c6aff5814caf9e3d9b1d2ee'),
('sup0005', 's', '111111', 'jefer41354@rxcay.com', '6f513c7c0c6aff5814caf9e3d9b1d2ee');

-- --------------------------------------------------------

--
-- Table structure for table `supply`
--

CREATE TABLE `supply` (
  `SupplyID` varchar(10) NOT NULL,
  `SID` varchar(10) NOT NULL,
  `SKID` varchar(10) NOT NULL,
  `itemID` varchar(10) NOT NULL,
  `Quantity` varchar(30) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `supply`
--

INSERT INTO `supply` (`SupplyID`, `SID`, `SKID`, `itemID`, `Quantity`, `date`) VALUES
('si0001', 'sup0001', 'SK0002', 'item0002', '24', '2023-07-22'),
('si0002', 'sup0002', 'SK0002', 'item0003', '5', '2023-08-01'),
('si0003', 'sup0002', 'SK0001', 'item0001', '1', '2023-08-07'),
('si0004', 'sup0002', 'SK0001', 'item0001', '1', '2023-08-07'),
('si0005', 'sup0002', 'SK0002', 'item0016', '5', '2023-08-07'),
('si0006', 'sup0002', 'SK0002', 'item0016', '5', '2023-08-07'),
('si0007', 'sup0002', 'SK0002', 'item0016', '5', '2023-08-07'),
('si0008', 'sup0002', 'SK0002', 'item0002', '2', '2023-08-07'),
('si0009', 'sup0002', 'SK0001', 'item0001', '23', '2023-08-07'),
('si0010', 'sup0002', 'SK0002', 'item0016', '3', '2023-08-07'),
('si0011', 'sup0002', 'SK0002', 'item0016', '3', '2023-08-09'),
('si0012', 'sup0002', 'SK0002', 'item0002', '3', '2023-08-10'),
('si0014', 'sup0001', 'SK0001', 'item0004', '20', '2023-08-13'),
('si0015', 'sup0001', 'SK0001', 'item0002', '24', '2023-08-13'),
('si0016', 'sup0001', 'SK0001', 'item0023', '1', '2023-08-14');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addremove`
--
ALTER TABLE `addremove`
  ADD PRIMARY KEY (`ARID`),
  ADD KEY `SKID` (`SKID`),
  ADD KEY `SID` (`SID`),
  ADD KEY `itemID` (`itemID`);

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Aid`);

--
-- Indexes for table `items`
--
ALTER TABLE `items`
  ADD PRIMARY KEY (`itemID`);

--
-- Indexes for table `marketingteam`
--
ALTER TABLE `marketingteam`
  ADD PRIMARY KEY (`MID`);

--
-- Indexes for table `releaseitem`
--
ALTER TABLE `releaseitem`
  ADD PRIMARY KEY (`RLID`),
  ADD KEY `itemID` (`itemID`),
  ADD KEY `SKID` (`SKID`),
  ADD KEY `MID` (`MID`);

--
-- Indexes for table `requestitemm`
--
ALTER TABLE `requestitemm`
  ADD PRIMARY KEY (`RmID`),
  ADD KEY `SKID` (`SKID`),
  ADD KEY `MID` (`MID`),
  ADD KEY `itemID` (`itemID`);

--
-- Indexes for table `requestitems`
--
ALTER TABLE `requestitems`
  ADD PRIMARY KEY (`RID`),
  ADD KEY `SKID` (`SKID`),
  ADD KEY `SID` (`SID`),
  ADD KEY `itemID` (`itemID`);

--
-- Indexes for table `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`StockID`);

--
-- Indexes for table `stockkeeper`
--
ALTER TABLE `stockkeeper`
  ADD PRIMARY KEY (`SKID`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`SID`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `supply`
--
ALTER TABLE `supply`
  ADD PRIMARY KEY (`SupplyID`),
  ADD KEY `itemID` (`itemID`),
  ADD KEY `SKID` (`SKID`),
  ADD KEY `SID` (`SID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `addremove`
--
ALTER TABLE `addremove`
  ADD CONSTRAINT `addremove_ibfk_1` FOREIGN KEY (`SKID`) REFERENCES `stockkeeper` (`SKID`),
  ADD CONSTRAINT `addremove_ibfk_10` FOREIGN KEY (`SKID`) REFERENCES `stockkeeper` (`SKID`),
  ADD CONSTRAINT `addremove_ibfk_11` FOREIGN KEY (`SID`) REFERENCES `supplier` (`SID`),
  ADD CONSTRAINT `addremove_ibfk_12` FOREIGN KEY (`itemID`) REFERENCES `items` (`itemID`),
  ADD CONSTRAINT `addremove_ibfk_13` FOREIGN KEY (`SKID`) REFERENCES `stockkeeper` (`SKID`),
  ADD CONSTRAINT `addremove_ibfk_14` FOREIGN KEY (`SID`) REFERENCES `supplier` (`SID`),
  ADD CONSTRAINT `addremove_ibfk_15` FOREIGN KEY (`itemID`) REFERENCES `items` (`itemID`),
  ADD CONSTRAINT `addremove_ibfk_2` FOREIGN KEY (`SID`) REFERENCES `supplier` (`SID`),
  ADD CONSTRAINT `addremove_ibfk_3` FOREIGN KEY (`itemID`) REFERENCES `items` (`itemID`),
  ADD CONSTRAINT `addremove_ibfk_4` FOREIGN KEY (`SKID`) REFERENCES `stockkeeper` (`SKID`),
  ADD CONSTRAINT `addremove_ibfk_5` FOREIGN KEY (`SID`) REFERENCES `supplier` (`SID`),
  ADD CONSTRAINT `addremove_ibfk_6` FOREIGN KEY (`itemID`) REFERENCES `items` (`itemID`),
  ADD CONSTRAINT `addremove_ibfk_7` FOREIGN KEY (`SKID`) REFERENCES `stockkeeper` (`SKID`),
  ADD CONSTRAINT `addremove_ibfk_8` FOREIGN KEY (`SID`) REFERENCES `supplier` (`SID`),
  ADD CONSTRAINT `addremove_ibfk_9` FOREIGN KEY (`itemID`) REFERENCES `items` (`itemID`);

--
-- Constraints for table `releaseitem`
--
ALTER TABLE `releaseitem`
  ADD CONSTRAINT `releaseitem_ibfk_1` FOREIGN KEY (`itemID`) REFERENCES `items` (`itemID`),
  ADD CONSTRAINT `releaseitem_ibfk_2` FOREIGN KEY (`SKID`) REFERENCES `stockkeeper` (`SKID`),
  ADD CONSTRAINT `releaseitem_ibfk_3` FOREIGN KEY (`MID`) REFERENCES `marketingteam` (`MID`);

--
-- Constraints for table `requestitemm`
--
ALTER TABLE `requestitemm`
  ADD CONSTRAINT `requestitemm_ibfk_1` FOREIGN KEY (`SKID`) REFERENCES `stockkeeper` (`SKID`),
  ADD CONSTRAINT `requestitemm_ibfk_2` FOREIGN KEY (`MID`) REFERENCES `marketingteam` (`MID`),
  ADD CONSTRAINT `requestitemm_ibfk_3` FOREIGN KEY (`itemID`) REFERENCES `items` (`itemID`);

--
-- Constraints for table `requestitems`
--
ALTER TABLE `requestitems`
  ADD CONSTRAINT `requestitems_ibfk_1` FOREIGN KEY (`SKID`) REFERENCES `stockkeeper` (`SKID`),
  ADD CONSTRAINT `requestitems_ibfk_2` FOREIGN KEY (`SID`) REFERENCES `supplier` (`SID`),
  ADD CONSTRAINT `requestitems_ibfk_3` FOREIGN KEY (`itemID`) REFERENCES `items` (`itemID`);

--
-- Constraints for table `supply`
--
ALTER TABLE `supply`
  ADD CONSTRAINT `supply_ibfk_1` FOREIGN KEY (`itemID`) REFERENCES `items` (`itemID`),
  ADD CONSTRAINT `supply_ibfk_2` FOREIGN KEY (`SKID`) REFERENCES `stockkeeper` (`SKID`),
  ADD CONSTRAINT `supply_ibfk_3` FOREIGN KEY (`SID`) REFERENCES `supplier` (`SID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
