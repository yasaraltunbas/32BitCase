

CREATE DATABASE `customerdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

customerCREATE TABLE `customer` (
  `customer_id` int NOT NULL,
  `customer_age` int NOT NULL,
  `customer_name` varchar(255) DEFAULT NULL,
  `customer_surname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO `` (`customer_id`,`customer_age`,`customer_name`,`customer_surname`) VALUES (2,20,'yasar','alt');
INSERT INTO `` (`customer_id`,`customer_age`,`customer_name`,`customer_surname`) VALUES (3,22,'tar','alt');
INSERT INTO `` (`customer_id`,`customer_age`,`customer_name`,`customer_surname`) VALUES (4,30,'sde','alwwt');
INSERT INTO `` (`customer_id`,`customer_age`,`customer_name`,`customer_surname`) VALUES (5,32,'weer','ddee');
INSERT INTO `` (`customer_id`,`customer_age`,`customer_name`,`customer_surname`) VALUES (6,33,'dde','dde');
