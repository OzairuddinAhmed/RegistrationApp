DROP TABLE IF EXISTS customers_account;

CREATE TABLE `customers_account` (
	`idcustomers_account` int(11) NOT NULL AUTO_INCREMENT,
	`username` varchar(45) DEFAULT NULL,
	`first_name` varchar(45) DEFAULT NULL,
	`last_name` varchar(45) DEFAULT NULL,
	`dob` varchar(45) DEFAULT NULL,
	`ssn` varchar(45) DEFAULT NULL,
	`email` varchar(45) DEFAULT NULL,
	`mobile_number` varchar(45) DEFAULT NULL,
	`home_address` varchar(45) DEFAULT NULL,
	`mailing_address` varchar(45) DEFAULT NULL,
	`account_type` varchar(45) DEFAULT NULL,
	`balance` int(11) DEFAULT NULL,
	`password` varchar(45) DEFAULT NULL,
	PRIMARY KEY (`idcustomers_account`)
)