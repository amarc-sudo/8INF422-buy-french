CREATE DATABASE IF NOT EXISTS u8inf422;
USE u8inf422;

DROP TABLE IF EXISTS productCommand;
DROP TABLE IF EXISTS command;
DROP TABLE IF EXISTS product;
DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS userType;
DROP TABLE IF EXISTS seller;

CREATE TABLE `product` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` text NOT NULL,
  `description` text NOT NULL,
  `price` double NOT NULL,
  `photo` text NOT NULL,
  `nutritionalValue` text,
  `idSeller` int NOT NULL
);

CREATE TABLE `user` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `firstName` text NOT NULL,
  `lastName` text NOT NULL,
  `salt` text NOT NULL,
  `password` text NOT NULL,
  `mail` text NOT NULL,
  `phone` text NOT NULL,
  `typeID` int NOT NULL
);

CREATE TABLE `userType` (
	`id` int PRIMARY KEY AUTO_INCREMENT,
	`type` text NOT NULL
);

CREATE TABLE `seller` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` text NOT NULL,
  `lat` double NOT NULL,
  `long` double NOT NULL
);

CREATE TABLE `command` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `idUser` int,
  `date` date,
  `idDeliver` int
);

CREATE TABLE `productCommand` (
	`productID` int,
	`commandID` int, 
	PRIMARY KEY (`productID`, `commandID`)
);

ALTER TABLE `product` ADD FOREIGN KEY (`idSeller`) REFERENCES `seller` (`id`);

ALTER TABLE `command` ADD FOREIGN KEY (`idUser`) REFERENCES `user` (`id`);

ALTER TABLE `command` ADD FOREIGN KEY (`idDeliver`) REFERENCES `user` (`id`);

ALTER TABLE `user` ADD FOREIGN KEY (`typeID`) REFERENCES `userType` (`id`);

ALTER TABLE `productCommand` ADD FOREIGN KEY (`productID`) REFERENCES `product` (`id`);

ALTER TABLE `productCommand` ADD FOREIGN KEY (`commandID`) REFERENCES `command` (`id`);
