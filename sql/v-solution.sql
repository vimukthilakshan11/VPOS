-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 16, 2022 at 05:45 PM
-- Server version: 8.0.29
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `v-solution`
--

-- --------------------------------------------------------

--
-- Table structure for table `available_quantity`
--

CREATE TABLE `available_quantity` (
  `Product_Id` int NOT NULL,
  `Quantity` int NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `brand`
--

CREATE TABLE `brand` (
  `Id` int NOT NULL,
  `BrandName` varchar(45) NOT NULL,
  `CompanyName` varchar(45) NOT NULL,
  `CompanyAddress` varchar(60) NOT NULL,
  `CompanyRegNo` varchar(45) DEFAULT NULL,
  `Email` varchar(45) NOT NULL,
  `Mobile` varchar(45) NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `Id` int NOT NULL,
  `Description` varchar(45) NOT NULL,
  `Note` varchar(100) DEFAULT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `Id` int NOT NULL,
  `FName` varchar(55) NOT NULL,
  `LName` varchar(55) NOT NULL,
  `Address` varchar(55) DEFAULT NULL,
  `TelephoneNo` varchar(13) NOT NULL,
  `NIC` varchar(14) NOT NULL,
  `JoinedDate` date NOT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Balance` double(10,2) NOT NULL DEFAULT '0.00',
  `Note` varchar(90) DEFAULT NULL,
  `ActiveStatus` tinyint(1) NOT NULL DEFAULT '1',
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `Id` int NOT NULL,
  `EmployeePosition_id` int NOT NULL,
  `Fname` varchar(55) NOT NULL,
  `Lname` varchar(45) NOT NULL,
  `Address` varchar(55) NOT NULL,
  `TelephoneNo` varchar(13) NOT NULL,
  `NIC` varchar(14) NOT NULL,
  `DOB` date NOT NULL,
  `JoinedDate` date NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `BankName` varchar(45) DEFAULT NULL,
  `BankNumber` varchar(120) DEFAULT NULL,
  `Note` varchar(90) NOT NULL,
  `ActiveStatus` tinyint(1) NOT NULL DEFAULT '1',
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `employeeposition`
--

CREATE TABLE `employeeposition` (
  `Id` int NOT NULL,
  `PositionName` varchar(45) NOT NULL,
  `Sale` tinyint NOT NULL DEFAULT '0',
  `Purchase` tinyint NOT NULL DEFAULT '0',
  `Return` tinyint NOT NULL DEFAULT '0',
  `RequestForQuate` tinyint NOT NULL DEFAULT '0',
  `PurchaseOrder` tinyint NOT NULL DEFAULT '0',
  `Customer` tinyint NOT NULL DEFAULT '0',
  `Supplier` tinyint NOT NULL DEFAULT '0',
  `Employee` tinyint NOT NULL DEFAULT '0',
  `UserPosition` tinyint NOT NULL DEFAULT '0',
  `UserProfile` tinyint NOT NULL DEFAULT '0',
  `Products` tinyint NOT NULL DEFAULT '0',
  `ExIncome` tinyint NOT NULL DEFAULT '0',
  `ExCost` tinyint NOT NULL DEFAULT '0',
  `Invoice` tinyint NOT NULL DEFAULT '0',
  `Report` tinyint NOT NULL DEFAULT '0',
  `Stocks` tinyint NOT NULL DEFAULT '0',
  `Category` tinyint NOT NULL DEFAULT '0',
  `Removeproduct` tinyint NOT NULL DEFAULT '0',
  `Brand` tinyint NOT NULL DEFAULT '0',
  `BatchesOfProducts` tinyint NOT NULL DEFAULT '0',
  `Status` tinyint NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `excost`
--

CREATE TABLE `excost` (
  `Id` int NOT NULL,
  `Date` date NOT NULL,
  `Description` varchar(100) NOT NULL,
  `CostAmount` float(15,2) NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `exincome`
--

CREATE TABLE `exincome` (
  `Id` int NOT NULL,
  `Date` date NOT NULL,
  `Description` varchar(100) NOT NULL,
  `IncomeAmount` float(15,2) NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `Id` int NOT NULL,
  `Product_Id` int NOT NULL,
  `Barcode` varchar(65) NOT NULL,
  `Selling_Price` double(10,2) NOT NULL,
  `warrenty` varchar(45) NOT NULL,
  `Status` tinyint NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `Id` int NOT NULL,
  `Brand_Id` int NOT NULL,
  `Category_Id` int NOT NULL,
  `Description` varchar(45) NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1',
  `sub_cat_Id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `purchase`
--

CREATE TABLE `purchase` (
  `Id` int NOT NULL,
  `Supplier_Id` int NOT NULL,
  `PurchaseDate` date NOT NULL,
  `Total` float(15,2) NOT NULL,
  `Discount` float(15,2) NOT NULL,
  `PurchaseOrder_ID` int DEFAULT NULL,
  `UserProfile_Id` int NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `purchaseitem`
--

CREATE TABLE `purchaseitem` (
  `Id` int NOT NULL,
  `Purchase_Id` int NOT NULL,
  `PurchasePrice` float(15,2) NOT NULL,
  `Quantity` int NOT NULL,
  `TotalPrice` float(15,2) NOT NULL,
  `Barcode` varchar(45) DEFAULT NULL,
  `product_Id` int NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `purchaseorder`
--

CREATE TABLE `purchaseorder` (
  `Id` int NOT NULL,
  `Supplier_Id` int NOT NULL,
  `Date` date NOT NULL,
  `SubTotal` float(15,2) NOT NULL,
  `Discount` float(15,2) NOT NULL,
  `FinalTotal` float(15,2) NOT NULL,
  `IsCompleted` tinyint(1) NOT NULL DEFAULT '0',
  `UserProfile_Id` int NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `purchaseorderitem`
--

CREATE TABLE `purchaseorderitem` (
  `Id` int NOT NULL,
  `PurchaseOrder_Id` int NOT NULL,
  `Product_Id` int NOT NULL,
  `ItemPrice` float(15,2) NOT NULL,
  `Quantity` int NOT NULL,
  `TotalPrice` float(15,2) NOT NULL,
  `Discount` double(10,2) NOT NULL,
  `Final Amount` double(10,2) NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `quatation`
--

CREATE TABLE `quatation` (
  `Id` int NOT NULL,
  `Date` date NOT NULL,
  `IsResponses` tinyint NOT NULL,
  `Supplier_Id` int NOT NULL,
  `UserProfile_Id` int NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `quateitem_item`
--

CREATE TABLE `quateitem_item` (
  `Id` int NOT NULL,
  `Quate_Id` int NOT NULL,
  `Product_Id` int NOT NULL,
  `Quantity` int NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `remove_quantity`
--

CREATE TABLE `remove_quantity` (
  `Quantity` int NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1',
  `item_Id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `return`
--

CREATE TABLE `return` (
  `Id` int NOT NULL,
  `Sale_Id` int NOT NULL,
  `Date` date NOT NULL,
  `RefundAmount` double(15,2) NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `returnitem`
--

CREATE TABLE `returnitem` (
  `Id` int NOT NULL,
  `Return_Id` int NOT NULL,
  `Product_Id` int NOT NULL,
  `Resell_Status` tinyint(1) NOT NULL DEFAULT '1',
  `Quantity` int NOT NULL,
  `ReturnPrice` float(15,2) NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `sale`
--

CREATE TABLE `sale` (
  `Id` int NOT NULL,
  `Date` date NOT NULL,
  `Time` time NOT NULL,
  `Customer_Id` int NOT NULL,
  `TotalRetailPrice` float(15,2) NOT NULL,
  `DiscountByTotal` float(15,2) NOT NULL,
  `FinalTotal` float(15,2) NOT NULL,
  `Pay` float(15,2) NOT NULL,
  `UserProfile_Id` int NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `solditem`
--

CREATE TABLE `solditem` (
  `Id` int NOT NULL,
  `Sale_Id` int NOT NULL,
  `Product_Id` int NOT NULL,
  `RetailPrice` float(15,2) NOT NULL,
  `Quantity` int NOT NULL,
  `Total` float(15,2) NOT NULL,
  `DiscountForItem` float(15,2) NOT NULL,
  `Product_Description` varchar(45) NOT NULL,
  `Selling_Price` float(15,2) NOT NULL,
  `Warrenty` varchar(45) NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `sub_cat`
--

CREATE TABLE `sub_cat` (
  `Id` int NOT NULL,
  `Description` varchar(45) NOT NULL,
  `Note` varchar(100) DEFAULT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `Id` int NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `TelephoneNo` varchar(13) NOT NULL,
  `CompanyName` varchar(45) NOT NULL,
  `RegisterNo` varchar(45) NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `supplierproduct`
--

CREATE TABLE `supplierproduct` (
  `Supplier_Id` int NOT NULL,
  `Product_Id` int NOT NULL,
  `ItemCode` varchar(15) NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `userprofile`
--

CREATE TABLE `userprofile` (
  `Id` int NOT NULL,
  `Employee_Id` int NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `available_quantity`
--
ALTER TABLE `available_quantity`
  ADD PRIMARY KEY (`Product_Id`),
  ADD KEY `fk_RemovedProduct_Product_idx` (`Product_Id`);

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
  ADD KEY `fk_Employee_EmployeePosition1_idx` (`EmployeePosition_id`);

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
  ADD KEY `fk_DatesOfProduct_Product1_idx` (`Product_Id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_Product_Category1_idx` (`Category_Id`),
  ADD KEY `fk_Product_Brand1_idx` (`Brand_Id`),
  ADD KEY `fk_product_sub_cat1_idx` (`sub_cat_Id`);

--
-- Indexes for table `purchase`
--
ALTER TABLE `purchase`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_Purchase_Supplier1_idx` (`Supplier_Id`),
  ADD KEY `fk_Purchase_UserProfile1_idx` (`UserProfile_Id`);

--
-- Indexes for table `purchaseitem`
--
ALTER TABLE `purchaseitem`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_PurchaseItem_Purchase1_idx` (`Purchase_Id`),
  ADD KEY `fk_purchaseitem_product1_idx` (`product_Id`);

--
-- Indexes for table `purchaseorder`
--
ALTER TABLE `purchaseorder`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_Purchase_Supplier1_idx` (`Supplier_Id`),
  ADD KEY `fk_Purchase_UserProfile1_idx` (`UserProfile_Id`);

--
-- Indexes for table `purchaseorderitem`
--
ALTER TABLE `purchaseorderitem`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_PurchaseOrderItem_PurchaseOrder1_idx` (`PurchaseOrder_Id`),
  ADD KEY `fk_PurchaseOrderItem_Product1_idx` (`Product_Id`);

--
-- Indexes for table `quatation`
--
ALTER TABLE `quatation`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_ReqForQuate_UserProfile1_idx` (`UserProfile_Id`),
  ADD KEY `fk_ReqForQuate_Supplier1_idx` (`Supplier_Id`);

--
-- Indexes for table `quateitem_item`
--
ALTER TABLE `quateitem_item`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_OrderedProducts_Product1_idx` (`Product_Id`),
  ADD KEY `fk_ReqForQuateItem_ReqForQuate1_idx` (`Quate_Id`);

--
-- Indexes for table `remove_quantity`
--
ALTER TABLE `remove_quantity`
  ADD KEY `fk_Remove_Quantity_item1_idx` (`item_Id`);

--
-- Indexes for table `return`
--
ALTER TABLE `return`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_Return_Sale1_idx` (`Sale_Id`);

--
-- Indexes for table `returnitem`
--
ALTER TABLE `returnitem`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_ReturnItem_Return1_idx` (`Return_Id`),
  ADD KEY `fk_ReturnItem_Product1_idx` (`Product_Id`);

--
-- Indexes for table `sale`
--
ALTER TABLE `sale`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_Sale_UserProfile1_idx` (`UserProfile_Id`),
  ADD KEY `fk_Sale_Customer1_idx` (`Customer_Id`);

--
-- Indexes for table `solditem`
--
ALTER TABLE `solditem`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `fk_SoldItem_Sale1_idx` (`Sale_Id`),
  ADD KEY `fk_SoldItem_Product1_idx` (`Product_Id`);

--
-- Indexes for table `sub_cat`
--
ALTER TABLE `sub_cat`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `supplierproduct`
--
ALTER TABLE `supplierproduct`
  ADD PRIMARY KEY (`Supplier_Id`,`Product_Id`),
  ADD KEY `fk_SupplierProduct_Supplier1_idx` (`Supplier_Id`),
  ADD KEY `fk_SupplierProduct_Product1_idx` (`Product_Id`);

--
-- Indexes for table `userprofile`
--
ALTER TABLE `userprofile`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `Username_UNIQUE` (`Username`),
  ADD KEY `fk_UserProfile_Employee1_idx` (`Employee_Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `brand`
--
ALTER TABLE `brand`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `employeeposition`
--
ALTER TABLE `employeeposition`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `excost`
--
ALTER TABLE `excost`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `exincome`
--
ALTER TABLE `exincome`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `item`
--
ALTER TABLE `item`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `purchase`
--
ALTER TABLE `purchase`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `purchaseitem`
--
ALTER TABLE `purchaseitem`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `purchaseorder`
--
ALTER TABLE `purchaseorder`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `purchaseorderitem`
--
ALTER TABLE `purchaseorderitem`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `quatation`
--
ALTER TABLE `quatation`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `quateitem_item`
--
ALTER TABLE `quateitem_item`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `return`
--
ALTER TABLE `return`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `returnitem`
--
ALTER TABLE `returnitem`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `sale`
--
ALTER TABLE `sale`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT for table `solditem`
--
ALTER TABLE `solditem`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `sub_cat`
--
ALTER TABLE `sub_cat`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `userprofile`
--
ALTER TABLE `userprofile`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `available_quantity`
--
ALTER TABLE `available_quantity`
  ADD CONSTRAINT `fk_RemovedProduct_Product` FOREIGN KEY (`Product_Id`) REFERENCES `product` (`Id`);

--
-- Constraints for table `employee`
--
ALTER TABLE `employee`
  ADD CONSTRAINT `fk_Employee_EmployeePosition1` FOREIGN KEY (`EmployeePosition_id`) REFERENCES `employeeposition` (`Id`);

--
-- Constraints for table `item`
--
ALTER TABLE `item`
  ADD CONSTRAINT `fk_DatesOfProduct_Product1` FOREIGN KEY (`Product_Id`) REFERENCES `product` (`Id`);

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `fk_Product_Brand1` FOREIGN KEY (`Brand_Id`) REFERENCES `brand` (`Id`),
  ADD CONSTRAINT `fk_Product_Category1` FOREIGN KEY (`Category_Id`) REFERENCES `category` (`Id`),
  ADD CONSTRAINT `fk_product_sub_cat1` FOREIGN KEY (`sub_cat_Id`) REFERENCES `sub_cat` (`Id`);

--
-- Constraints for table `purchase`
--
ALTER TABLE `purchase`
  ADD CONSTRAINT `fk_Purchase_Supplier1` FOREIGN KEY (`Supplier_Id`) REFERENCES `supplier` (`Id`),
  ADD CONSTRAINT `fk_Purchase_UserProfile1` FOREIGN KEY (`UserProfile_Id`) REFERENCES `userprofile` (`Id`);

--
-- Constraints for table `purchaseitem`
--
ALTER TABLE `purchaseitem`
  ADD CONSTRAINT `fk_purchaseitem_product1` FOREIGN KEY (`product_Id`) REFERENCES `product` (`Id`),
  ADD CONSTRAINT `fk_PurchaseItem_Purchase1` FOREIGN KEY (`Purchase_Id`) REFERENCES `purchase` (`Id`);

--
-- Constraints for table `purchaseorder`
--
ALTER TABLE `purchaseorder`
  ADD CONSTRAINT `fk_Purchase_Supplier10` FOREIGN KEY (`Supplier_Id`) REFERENCES `supplier` (`Id`),
  ADD CONSTRAINT `fk_Purchase_UserProfile10` FOREIGN KEY (`UserProfile_Id`) REFERENCES `userprofile` (`Id`);

--
-- Constraints for table `purchaseorderitem`
--
ALTER TABLE `purchaseorderitem`
  ADD CONSTRAINT `fk_PurchaseOrderItem_Product1` FOREIGN KEY (`Product_Id`) REFERENCES `product` (`Id`),
  ADD CONSTRAINT `fk_PurchaseOrderItem_PurchaseOrder1` FOREIGN KEY (`PurchaseOrder_Id`) REFERENCES `purchaseorder` (`Id`);

--
-- Constraints for table `quatation`
--
ALTER TABLE `quatation`
  ADD CONSTRAINT `fk_ReqForQuate_Supplier1` FOREIGN KEY (`Supplier_Id`) REFERENCES `supplier` (`Id`),
  ADD CONSTRAINT `fk_ReqForQuate_UserProfile1` FOREIGN KEY (`UserProfile_Id`) REFERENCES `userprofile` (`Id`);

--
-- Constraints for table `quateitem_item`
--
ALTER TABLE `quateitem_item`
  ADD CONSTRAINT `fk_OrderedProducts_Product1` FOREIGN KEY (`Product_Id`) REFERENCES `product` (`Id`),
  ADD CONSTRAINT `fk_ReqForQuateItem_ReqForQuate1` FOREIGN KEY (`Quate_Id`) REFERENCES `quatation` (`Id`);

--
-- Constraints for table `remove_quantity`
--
ALTER TABLE `remove_quantity`
  ADD CONSTRAINT `fk_Remove_Quantity_item1` FOREIGN KEY (`item_Id`) REFERENCES `item` (`Id`);

--
-- Constraints for table `return`
--
ALTER TABLE `return`
  ADD CONSTRAINT `fk_Return_Sale1` FOREIGN KEY (`Sale_Id`) REFERENCES `sale` (`Id`);

--
-- Constraints for table `returnitem`
--
ALTER TABLE `returnitem`
  ADD CONSTRAINT `fk_ReturnItem_Product1` FOREIGN KEY (`Product_Id`) REFERENCES `product` (`Id`),
  ADD CONSTRAINT `fk_ReturnItem_Return1` FOREIGN KEY (`Return_Id`) REFERENCES `return` (`Id`);

--
-- Constraints for table `sale`
--
ALTER TABLE `sale`
  ADD CONSTRAINT `fk_Sale_Customer1` FOREIGN KEY (`Customer_Id`) REFERENCES `customer` (`Id`),
  ADD CONSTRAINT `fk_Sale_UserProfile1` FOREIGN KEY (`UserProfile_Id`) REFERENCES `userprofile` (`Id`);

--
-- Constraints for table `solditem`
--
ALTER TABLE `solditem`
  ADD CONSTRAINT `fk_SoldItem_Product1` FOREIGN KEY (`Product_Id`) REFERENCES `product` (`Id`),
  ADD CONSTRAINT `fk_SoldItem_Sale1` FOREIGN KEY (`Sale_Id`) REFERENCES `sale` (`Id`);

--
-- Constraints for table `supplierproduct`
--
ALTER TABLE `supplierproduct`
  ADD CONSTRAINT `fk_SupplierProduct_Product1` FOREIGN KEY (`Product_Id`) REFERENCES `product` (`Id`),
  ADD CONSTRAINT `fk_SupplierProduct_Supplier1` FOREIGN KEY (`Supplier_Id`) REFERENCES `supplier` (`Id`);

--
-- Constraints for table `userprofile`
--
ALTER TABLE `userprofile`
  ADD CONSTRAINT `fk_UserProfile_Employee1` FOREIGN KEY (`Employee_Id`) REFERENCES `employee` (`Id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
