-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Aug 15, 2023 at 02:45 PM
-- Server version: 8.0.32
-- PHP Version: 7.3.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `v-pos`
--

-- --------------------------------------------------------

--
-- Table structure for table `available_quantity`
--

CREATE TABLE `available_quantity` (
  `Id` int NOT NULL,
  `Quantity` varchar(45) NOT NULL,
  `item_Id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `brand`
--

CREATE TABLE `brand` (
  `Id` int NOT NULL,
  `BrandName` varchar(45) NOT NULL,
  `CompanyName` varchar(45) NOT NULL,
  `CompanyAddress` varchar(45) NOT NULL,
  `CompanyRegNo` varchar(45) NOT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Mobile` varchar(15) NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `brand`
--

INSERT INTO `brand` (`Id`, `BrandName`, `CompanyName`, `CompanyAddress`, `CompanyRegNo`, `Email`, `Mobile`, `Status`) VALUES
(1, 'Hikvision', 'Colombo Global', 'Colombo 2', '656352JJ', 'Global666@gmail.com', '0754888916', 1);

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `Id` int NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`Id`, `Name`, `Status`) VALUES
(1, 'Night Color', 1),
(2, 'Night Vision Black And White', 1);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `Id` int NOT NULL,
  `FName` varchar(45) NOT NULL,
  `LName` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `TelephoneNo` varchar(14) NOT NULL,
  `NIC` varchar(15) NOT NULL,
  `JoinedDate` date NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Balance` double NOT NULL,
  `Note` varchar(45) DEFAULT NULL,
  `ActiveStatus` tinyint(1) NOT NULL DEFAULT '1',
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Id`, `FName`, `LName`, `Address`, `TelephoneNo`, `NIC`, `JoinedDate`, `Email`, `Balance`, `Note`, `ActiveStatus`, `Status`) VALUES
(1, 'vimukthi', 'Lakshan', 'gampaha', '0754888916', '200010200450', '2023-07-15', 'vimukthlakshan@gmail.com', 0, '	', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `Id` int NOT NULL,
  `FName` varchar(45) NOT NULL,
  `LName` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `TelephoneNo` varchar(45) NOT NULL,
  `NIC` varchar(14) NOT NULL,
  `DOB` date DEFAULT NULL,
  `JoinedDate` date NOT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Gender` varchar(10) NOT NULL,
  `BankName` varchar(45) DEFAULT NULL,
  `BankNumber` varchar(120) DEFAULT NULL,
  `Note` varchar(45) DEFAULT NULL,
  `ActiveStatus` tinyint(1) NOT NULL DEFAULT '1',
  `Status` tinyint(1) NOT NULL DEFAULT '1',
  `employeeposition_Id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`Id`, `FName`, `LName`, `Address`, `TelephoneNo`, `NIC`, `DOB`, `JoinedDate`, `Email`, `Gender`, `BankName`, `BankNumber`, `Note`, `ActiveStatus`, `Status`, `employeeposition_Id`) VALUES
(1, 'Vimukthi', 'Lakshan', 'Ragama', '0754888916', '200010200450', '2000-04-11', '2023-08-15', 'vimukthilakshan82@gmail.com', 'Male', 'Commercial', NULL, NULL, 1, 1, 1),
(2, 'Ashan', 'SHerath', 'Gampaha', '0754888916', '20004506842', '2000-06-15', '2023-07-15', 'Ashan@gmail.com', 'Male', '', '0', '', 1, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `employeeposition`
--

CREATE TABLE `employeeposition` (
  `Id` int NOT NULL,
  `PositionName` varchar(45) NOT NULL DEFAULT '0',
  `Sale` tinyint(1) DEFAULT '0',
  `Purchase` tinyint(1) DEFAULT '0',
  `Return` tinyint(1) DEFAULT '0',
  `RequestForQuate` tinyint(1) DEFAULT '0',
  `PurchaseOrder` tinyint(1) DEFAULT '0',
  `Customer` tinyint(1) DEFAULT '0',
  `Supplier` tinyint(1) DEFAULT '0',
  `Employee` tinyint(1) DEFAULT '0',
  `UserPosition` tinyint(1) DEFAULT '0',
  `UserProfile` tinyint(1) DEFAULT '0',
  `Product` tinyint(1) DEFAULT '0',
  `ExIncome` tinyint(1) DEFAULT '0',
  `ExCost` tinyint(1) DEFAULT '0',
  `Invoice` tinyint(1) DEFAULT '0',
  `Report` tinyint(1) DEFAULT '0',
  `Stocks` tinyint(1) DEFAULT '0',
  `Category` tinyint(1) DEFAULT '0',
  `Brand` tinyint(1) DEFAULT '0',
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `employeeposition`
--

INSERT INTO `employeeposition` (`Id`, `PositionName`, `Sale`, `Purchase`, `Return`, `RequestForQuate`, `PurchaseOrder`, `Customer`, `Supplier`, `Employee`, `UserPosition`, `UserProfile`, `Product`, `ExIncome`, `ExCost`, `Invoice`, `Report`, `Stocks`, `Category`, `Brand`, `Status`) VALUES
(1, 'Admin', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `excost`
--

CREATE TABLE `excost` (
  `Id` int NOT NULL,
  `Date` date NOT NULL,
  `Discription` varchar(45) NOT NULL,
  `Amount` double NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `exincome`
--

CREATE TABLE `exincome` (
  `Id` int NOT NULL,
  `Date` date NOT NULL,
  `Discription` varchar(45) NOT NULL,
  `Amount` double NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `Id` int NOT NULL,
  `Barcode` varchar(65) DEFAULT NULL,
  `SellingPrice` double NOT NULL,
  `Warrenty` int DEFAULT NULL,
  `ManufactureDate` date DEFAULT NULL,
  `ExpireDate` date DEFAULT NULL,
  `PurchasingPrice` double NOT NULL,
  `UpdateStatus` int NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1',
  `product_Id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `Id` int NOT NULL,
  `BrandId` int DEFAULT NULL,
  `CatId` int DEFAULT NULL,
  `SubCatId` int DEFAULT NULL,
  `Description` varchar(45) NOT NULL,
  `ActiveStatus` tinyint(1) NOT NULL DEFAULT '1',
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`Id`, `BrandId`, `CatId`, `SubCatId`, `Description`, `ActiveStatus`, `Status`) VALUES
(10, 1, 1, 1, 'Camera', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `purchase`
--

CREATE TABLE `purchase` (
  `Id` int NOT NULL,
  `Date` date NOT NULL,
  `Total` double NOT NULL,
  `Discount` double NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1',
  `supplier_Id` int NOT NULL,
  `userprofile_Id` int NOT NULL,
  `PurchaseOrderId` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `purchaseorder`
--

CREATE TABLE `purchaseorder` (
  `Id` int NOT NULL,
  `Date` date NOT NULL,
  `Subtotal` double NOT NULL,
  `Discount` double NOT NULL,
  `FinalTotal` double NOT NULL,
  `IsCompleted` tinyint(1) NOT NULL DEFAULT '0',
  `Status` tinyint(1) NOT NULL DEFAULT '1',
  `userprofile_Id` int NOT NULL,
  `supplier_Id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `purchase_item`
--

CREATE TABLE `purchase_item` (
  `Id` int NOT NULL,
  `PurchasePrice` double NOT NULL,
  `Quantity` varchar(45) NOT NULL,
  `TotalPrice` double NOT NULL,
  `Barcode` varchar(95) DEFAULT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1',
  `purchase_Id` int NOT NULL,
  `product_Id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `purchase_order_item`
--

CREATE TABLE `purchase_order_item` (
  `Id` int NOT NULL,
  `ItemPrice` double NOT NULL,
  `Quantity` varchar(45) NOT NULL,
  `TotalPrice` double NOT NULL,
  `Discount` double NOT NULL,
  `FinalAmount` double NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1',
  `purchaseorder_Id` int NOT NULL,
  `product_Id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `quatation`
--

CREATE TABLE `quatation` (
  `Id` int NOT NULL,
  `Date` date NOT NULL,
  `IsResponses` tinyint(1) NOT NULL DEFAULT '1',
  `Status` tinyint(1) DEFAULT '1',
  `userprofile_Id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `quate_item`
--

CREATE TABLE `quate_item` (
  `Id` int NOT NULL,
  `Quantity` varchar(45) NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1',
  `quatation_Id` int NOT NULL,
  `item_Id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `remove_quantity`
--

CREATE TABLE `remove_quantity` (
  `Id` int NOT NULL,
  `Quantity` varchar(45) NOT NULL,
  `Note` varchar(90) DEFAULT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1',
  `item_Id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `return`
--

CREATE TABLE `return` (
  `Id` int NOT NULL,
  `Date` date NOT NULL,
  `RefundAmount` double NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1',
  `sale_Id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `return_item`
--

CREATE TABLE `return_item` (
  `Id` int NOT NULL,
  `Resell_Status` tinyint(1) NOT NULL DEFAULT '0',
  `Quantity` varchar(45) NOT NULL,
  `ReturnPrice` double NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1',
  `return_Id` int NOT NULL,
  `sold_item_Id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `sale`
--

CREATE TABLE `sale` (
  `Id` int NOT NULL,
  `Date` date NOT NULL,
  `Time` time NOT NULL,
  `TotalRetailPrice` double NOT NULL,
  `DiscountByTotal` double NOT NULL,
  `FinalTotal` double NOT NULL,
  `Pay` double NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1',
  `userprofile_Id` int NOT NULL,
  `CustomerId` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `sold_item`
--

CREATE TABLE `sold_item` (
  `Id` int NOT NULL,
  `RetailPrice` double NOT NULL,
  `Quantity` varchar(45) NOT NULL,
  `Total` double NOT NULL,
  `DiscountFroItem` double NOT NULL,
  `ProductDescription` varchar(45) DEFAULT NULL,
  `SellingPrice` double NOT NULL,
  `Warrenty` int DEFAULT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1',
  `sale_Id` int NOT NULL,
  `item_Id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `subcat`
--

CREATE TABLE `subcat` (
  `Id` int NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `subcat`
--

INSERT INTO `subcat` (`Id`, `Name`, `Status`) VALUES
(1, '30m', 1);

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `Id` int NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Address` varchar(45) DEFAULT NULL,
  `TelephoneNo` varchar(15) NOT NULL,
  `CompanyName` varchar(45) DEFAULT NULL,
  `RegisterNo` varchar(45) DEFAULT NULL,
  `Email` varchar(55) NOT NULL,
  `ActiveStatus` tinyint(1) DEFAULT '1',
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`Id`, `Name`, `Address`, `TelephoneNo`, `CompanyName`, `RegisterNo`, `Email`, `ActiveStatus`, `Status`) VALUES
(1, 'Vimukthi', 'colombo-7', '0754888917', 'VSolutions', '002101h', 'V-Solutions@gmail.com', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `supplier_has_product`
--

CREATE TABLE `supplier_has_product` (
  `supplier_Id` int NOT NULL,
  `product_Id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `supplier_has_product`
--

INSERT INTO `supplier_has_product` (`supplier_Id`, `product_Id`) VALUES
(1, 10);

-- --------------------------------------------------------

--
-- Table structure for table `userprofile`
--

CREATE TABLE `userprofile` (
  `Id` int NOT NULL,
  `UserName` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1',
  `employee_Id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `userprofile`
--

INSERT INTO `userprofile` (`Id`, `UserName`, `Password`, `Status`, `employee_Id`) VALUES
(1, 'Vimukthi', '202cb962ac59075b964b07152d234b70', 1, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `available_quantity`
--
ALTER TABLE `available_quantity`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_available_quantity_item1_idx` (`item_Id`);

--
-- Indexes for table `brand`
--
ALTER TABLE `brand`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_employee_employeeposition_idx` (`employeeposition_Id`);

--
-- Indexes for table `employeeposition`
--
ALTER TABLE `employeeposition`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `excost`
--
ALTER TABLE `excost`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `exincome`
--
ALTER TABLE `exincome`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_item_product1_idx` (`product_Id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `purchase`
--
ALTER TABLE `purchase`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_purchase_supplier1_idx` (`supplier_Id`),
  ADD KEY `fk_purchase_userprofile1_idx` (`userprofile_Id`);

--
-- Indexes for table `purchaseorder`
--
ALTER TABLE `purchaseorder`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_purchaseorder_userprofile1_idx` (`userprofile_Id`),
  ADD KEY `fk_purchaseorder_supplier1_idx` (`supplier_Id`);

--
-- Indexes for table `purchase_item`
--
ALTER TABLE `purchase_item`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_purchase_item_purchase1_idx` (`purchase_Id`),
  ADD KEY `fk_purchase_item_product1_idx` (`product_Id`);

--
-- Indexes for table `purchase_order_item`
--
ALTER TABLE `purchase_order_item`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_purchase_order_item_purchaseorder1_idx` (`purchaseorder_Id`),
  ADD KEY `fk_purchase_order_item_product1_idx` (`product_Id`);

--
-- Indexes for table `quatation`
--
ALTER TABLE `quatation`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_quatation_userprofile1_idx` (`userprofile_Id`);

--
-- Indexes for table `quate_item`
--
ALTER TABLE `quate_item`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_quate_item_quatation1_idx` (`quatation_Id`),
  ADD KEY `fk_quate_item_item1_idx` (`item_Id`);

--
-- Indexes for table `remove_quantity`
--
ALTER TABLE `remove_quantity`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_remove_quantity_item1_idx` (`item_Id`);

--
-- Indexes for table `return`
--
ALTER TABLE `return`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_return_sale1_idx` (`sale_Id`);

--
-- Indexes for table `return_item`
--
ALTER TABLE `return_item`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_return_item_return1_idx` (`return_Id`),
  ADD KEY `fk_return_item_sold_item1_idx` (`sold_item_Id`);

--
-- Indexes for table `sale`
--
ALTER TABLE `sale`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_sale_userprofile1_idx` (`userprofile_Id`);

--
-- Indexes for table `sold_item`
--
ALTER TABLE `sold_item`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_sold_item_sale1_idx` (`sale_Id`),
  ADD KEY `fk_sold_item_item1_idx` (`item_Id`);

--
-- Indexes for table `subcat`
--
ALTER TABLE `subcat`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `supplier_has_product`
--
ALTER TABLE `supplier_has_product`
  ADD PRIMARY KEY (`supplier_Id`,`product_Id`),
  ADD KEY `fk_supplier_has_product_product1_idx` (`product_Id`),
  ADD KEY `fk_supplier_has_product_supplier1_idx` (`supplier_Id`);

--
-- Indexes for table `userprofile`
--
ALTER TABLE `userprofile`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_userprofile_employee1_idx` (`employee_Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `brand`
--
ALTER TABLE `brand`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `employeeposition`
--
ALTER TABLE `employeeposition`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `item`
--
ALTER TABLE `item`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `purchase`
--
ALTER TABLE `purchase`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `purchase_item`
--
ALTER TABLE `purchase_item`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `purchase_order_item`
--
ALTER TABLE `purchase_order_item`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `quatation`
--
ALTER TABLE `quatation`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `quate_item`
--
ALTER TABLE `quate_item`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `remove_quantity`
--
ALTER TABLE `remove_quantity`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `return`
--
ALTER TABLE `return`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `return_item`
--
ALTER TABLE `return_item`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `sale`
--
ALTER TABLE `sale`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `sold_item`
--
ALTER TABLE `sold_item`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `subcat`
--
ALTER TABLE `subcat`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `userprofile`
--
ALTER TABLE `userprofile`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `available_quantity`
--
ALTER TABLE `available_quantity`
  ADD CONSTRAINT `fk_available_quantity_item1` FOREIGN KEY (`item_Id`) REFERENCES `item` (`Id`);

--
-- Constraints for table `employee`
--
ALTER TABLE `employee`
  ADD CONSTRAINT `fk_employee_employeeposition` FOREIGN KEY (`employeeposition_Id`) REFERENCES `employeeposition` (`Id`);

--
-- Constraints for table `item`
--
ALTER TABLE `item`
  ADD CONSTRAINT `fk_item_product1` FOREIGN KEY (`product_Id`) REFERENCES `product` (`Id`);

--
-- Constraints for table `purchase`
--
ALTER TABLE `purchase`
  ADD CONSTRAINT `fk_purchase_supplier1` FOREIGN KEY (`supplier_Id`) REFERENCES `supplier` (`Id`),
  ADD CONSTRAINT `fk_purchase_userprofile1` FOREIGN KEY (`userprofile_Id`) REFERENCES `userprofile` (`Id`);

--
-- Constraints for table `purchaseorder`
--
ALTER TABLE `purchaseorder`
  ADD CONSTRAINT `fk_purchaseorder_supplier1` FOREIGN KEY (`supplier_Id`) REFERENCES `supplier` (`Id`),
  ADD CONSTRAINT `fk_purchaseorder_userprofile1` FOREIGN KEY (`userprofile_Id`) REFERENCES `userprofile` (`Id`);

--
-- Constraints for table `purchase_item`
--
ALTER TABLE `purchase_item`
  ADD CONSTRAINT `fk_purchase_item_product1` FOREIGN KEY (`product_Id`) REFERENCES `product` (`Id`),
  ADD CONSTRAINT `fk_purchase_item_purchase1` FOREIGN KEY (`purchase_Id`) REFERENCES `purchase` (`Id`);

--
-- Constraints for table `purchase_order_item`
--
ALTER TABLE `purchase_order_item`
  ADD CONSTRAINT `fk_purchase_order_item_product1` FOREIGN KEY (`product_Id`) REFERENCES `product` (`Id`),
  ADD CONSTRAINT `fk_purchase_order_item_purchaseorder1` FOREIGN KEY (`purchaseorder_Id`) REFERENCES `purchaseorder` (`Id`);

--
-- Constraints for table `quatation`
--
ALTER TABLE `quatation`
  ADD CONSTRAINT `fk_quatation_userprofile1` FOREIGN KEY (`userprofile_Id`) REFERENCES `userprofile` (`Id`);

--
-- Constraints for table `quate_item`
--
ALTER TABLE `quate_item`
  ADD CONSTRAINT `fk_quate_item_item1` FOREIGN KEY (`item_Id`) REFERENCES `item` (`Id`),
  ADD CONSTRAINT `fk_quate_item_quatation1` FOREIGN KEY (`quatation_Id`) REFERENCES `quatation` (`Id`);

--
-- Constraints for table `remove_quantity`
--
ALTER TABLE `remove_quantity`
  ADD CONSTRAINT `fk_remove_quantity_item1` FOREIGN KEY (`item_Id`) REFERENCES `item` (`Id`);

--
-- Constraints for table `return`
--
ALTER TABLE `return`
  ADD CONSTRAINT `fk_return_sale1` FOREIGN KEY (`sale_Id`) REFERENCES `sale` (`Id`);

--
-- Constraints for table `return_item`
--
ALTER TABLE `return_item`
  ADD CONSTRAINT `fk_return_item_return1` FOREIGN KEY (`return_Id`) REFERENCES `return` (`Id`),
  ADD CONSTRAINT `fk_return_item_sold_item1` FOREIGN KEY (`sold_item_Id`) REFERENCES `sold_item` (`Id`);

--
-- Constraints for table `sale`
--
ALTER TABLE `sale`
  ADD CONSTRAINT `fk_sale_userprofile1` FOREIGN KEY (`userprofile_Id`) REFERENCES `userprofile` (`Id`);

--
-- Constraints for table `sold_item`
--
ALTER TABLE `sold_item`
  ADD CONSTRAINT `fk_sold_item_item1` FOREIGN KEY (`item_Id`) REFERENCES `item` (`Id`),
  ADD CONSTRAINT `fk_sold_item_sale1` FOREIGN KEY (`sale_Id`) REFERENCES `sale` (`Id`);

--
-- Constraints for table `supplier_has_product`
--
ALTER TABLE `supplier_has_product`
  ADD CONSTRAINT `fk_supplier_has_product_product1` FOREIGN KEY (`product_Id`) REFERENCES `product` (`Id`),
  ADD CONSTRAINT `fk_supplier_has_product_supplier1` FOREIGN KEY (`supplier_Id`) REFERENCES `supplier` (`Id`);

--
-- Constraints for table `userprofile`
--
ALTER TABLE `userprofile`
  ADD CONSTRAINT `fk_userprofile_employee1` FOREIGN KEY (`employee_Id`) REFERENCES `employee` (`Id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
