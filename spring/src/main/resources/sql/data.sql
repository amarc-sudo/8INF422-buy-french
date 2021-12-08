CREATE DATABASE IF NOT EXISTS u8inf422;
USE u8inf422;

DROP TABLE IF EXISTS productCommand;
DROP TABLE IF EXISTS command;
DROP TABLE IF EXISTS product;
DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS userType;
DROP TABLE IF EXISTS seller;

CREATE TABLE IF NOT EXISTS `product` (
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
    `id` int PRIMARY KEY AUTO_INCREMENT,
	`productID` int,
	`commandID` int
);

ALTER TABLE `product` ADD FOREIGN KEY (`idSeller`) REFERENCES `seller` (`id`);

ALTER TABLE `command` ADD FOREIGN KEY (`idUser`) REFERENCES `user` (`id`);

ALTER TABLE `command` ADD FOREIGN KEY (`idDeliver`) REFERENCES `user` (`id`);

ALTER TABLE `user` ADD FOREIGN KEY (`typeID`) REFERENCES `userType` (`id`);

ALTER TABLE `productCommand` ADD FOREIGN KEY (`productID`) REFERENCES `product` (`id`);

ALTER TABLE `productCommand` ADD FOREIGN KEY (`commandID`) REFERENCES `command` (`id`);

INSERT INTO u8inf422.userType (type) VALUES ('user'),('deliver');

INSERT INTO u8inf422.user (firstName, lastName, salt, password, mail, phone, typeID) VALUES
('Florian', 'Tremblay', 'ss', '8f60c8102d29fcd525162d02eed4566b', 'florian@icloud.com', '+33 7 81 03 68 56', 1),
('Maxim', 'Girard', 'salt', 'c82a365250565c8dcb605f9e50c84dd4', 'maxim@icloud.com', '+1 (418) 506-0020', 2);;

INSERT INTO `seller` (`name`, `lat`, `long`) VALUES
('La Charcuterie de la Gare', 48.4294881460894, -71.05446135431934),
('Café Cambio Coop de Travail', 48.42815053342069, -71.055517318137),
('Marché Centre ville', 48.42693087614907, -71.06967844629985),
('21 Rue Price E', 48.42548041908624, -71.06810835133184);

INSERT INTO `product` (`name`, `description`, `price`, `photo`, `nutritionalValue`, `idSeller`) VALUES
('Camembert de normandie', 'Camembert de Normandie AOP au lait cru, Fromage au lait cru 20% mat.GrAppellation d''Origine ProtegeeAdresse du site production:Domaine de St-Loup 14340 Livarot, LAIT cru de vache, sel, ferments (dont LAIT), présure.', 30.25, 'assets/media/Camembert de normandie.jpg', 'pour 100g : Energie (kJ) : 1112 Energie (kcal) : 268 Graisses (g) : 20 minimum dont acides gras saturés (g) : 13 Glucides (g) : < 0.5 dont sucres (g) : < 0.5 Protéines (g) : 22 Sel (g) : 1.8', 1),
('Galettes fines au beurre salé', 'La touche subtile de ces galettes croustillantes, c''est leur petite note salée, glanée dans les salines de Guérande. Des biscuits d''une finesse surprenante, harmonie légère et gourmande. Des galettes qui ont su rester nature.', 12.99, 'assets/media/200_01.jpg', 'Valeurs nutritionnelles moyennes pour 100 gr / Nutrition: typical values per 100 g: Énergie / Energy: 1 887 kJ - 451 kcal Matières grasses / Fat dont acides gras saturés / of which saturates: 24 g 15 g Glucides / Carbohydrate dont sucres / of which sugars: 54 g 27 g Protéines / Protein: 4,7 g Sel / Salt:1,3 g', 1),
('Baguette Française', 'Magnifique baguette croustillante à l''extérieur et moelleuse à l''intérieur', 8.99, 'assets/media/baguette.jpg', 'Pain', 3),
('Jambon de paris', 'Jambon parisien, parce que oui, les cochons de paris sont différent d''ici... ', 9.99, 'assets/media/Jambon_blanc_de_Paris.png', 'du fer ?', 4),
('Madelaine St-Michel', 'Mini Madelaines française traditionnel', 6.99, 'assets/media/5e95f8859735b75c84f1ae99_Mini_20french_20sponge_20cake_20_St-Michel_800x.jpg', 'Ben du beure pour ton petit coeur :)', 2),
('Canelé de bordeaux', 'Fait avec de la canelle et de l''alcool... Genre... ', 12.88, 'assets/media/1200px-Caneles_stemilion.jpg', 'probablement une valeur nutritive!', 3);

INSERT INTO u8inf422.command (idUser, date, idDeliver) VALUES (1, '2021-12-07', null);

INSERT INTO u8inf422.productCommand (id, productID, commandID) VALUES (null, 1, 1);
INSERT INTO u8inf422.productCommand (id, productID, commandID) VALUES (null, 2, 1);
INSERT INTO u8inf422.productCommand (id, productID, commandID) VALUES (null, 3, 1);