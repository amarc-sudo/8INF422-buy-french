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

INSERT INTO `userType` (type) VALUES ('user'), ('deliverer');

INSERT INTO `seller` (`name`, `lat`, `long`) VALUES 
('La Charcuterie de la Gare', 48.4294881460894, -71.05446135431934),
('Café Cambio Coop de Travail', 48.42815053342069, -71.055517318137),
('Marché Centre ville', 48.42693087614907, -71.06967844629985),
('21 Rue Price E', 48.42548041908624, -71.06810835133184);

INSERT INTO `product` (`name`, `description`, `price`, `photo`, `nutritionaleValue`, `idSeller`) VALUES
('Camembert de normandie', 'Camembert de Normandie AOP au lait cru, Fromage au lait cru 20% mat.GrAppellation d''Origine ProtegeeAdresse du site production:Domaine de St-Loup 14340 Livarot, LAIT cru de vache, sel, ferments (dont LAIT), présure.', 30.25, '/media/Camembert de normandie.jpg', 'pour 100g : Energie (kJ) : 1112 Energie (kcal) : 268 Graisses (g) : 20 minimum dont acides gras saturés (g) : 13 Glucides (g) : < 0.5 dont sucres (g) : < 0.5 Protéines (g) : 22 Sel (g) : 1.8', 1),
('Galettes fines au beurre salé', 'La touche subtile de ces galettes croustillantes, c''est leur petite note salée, glanée dans les salines de Guérande. Des biscuits d''une finesse surprenante, harmonie légère et gourmande. Des galettes qui ont su rester nature.', 12.99, '/media/200_01.jpg', 'Valeurs nutritionnelles moyennes pour 100 gr / Nutrition: typical values per 100 g: Énergie / Energy: 1 887 kJ - 451 kcal Matières grasses / Fat dont acides gras saturés / of which saturates: 24 g 15 g Glucides / Carbohydrate dont sucres / of which sugars: 54 g 27 g Protéines / Protein: 4,7 g Sel / Salt:1,3 g', 1),
('Baguette Française', 'Magnifique baguette croustillante à l''extérieur et moelleuse à l''intérieur', 8.99, '/media/baguette.jpg', 'Pain', 3),
('Jambon de paris', 'Jambon parisien, parce que oui, les cochons de paris sont différent d''ici... ', 9.99, '/media/Jambon_blanc_de_Paris.png', 'du fer ?', 4),
('Madelaine St-Michel', 'Mini Madelaines française traditionnel', 6.99, '/media/5e95f8859735b75c84f1ae99_Mini_20french_20sponge_20cake_20_St-Michel_800x.jpg,', 'Ben du beure pour ton petit coeur :)', 2),
('Canelé de bordeaux', 'Fait avec de la canelle et de l''alcool... Genre... ', 12.88, '/media/1200px-Caneles_stemilion.jpg', 'probablement une valeur nutritive!', 3);