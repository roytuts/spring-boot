CREATE DATABASE IF NOT EXISTS `roytuts`;
USE `roytuts`;

CREATE TABLE IF NOT EXISTS `emp` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `designation` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `manager` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `emp` (`id`, `name`, `designation`, `manager`) VALUES
	(100, 'Steven', 'CEO', ''),
	(101, 'Neena', 'President', 'Steven'),
	(102, 'Lex', 'Vice President', 'Neena'),
	(103, 'Alexander', 'Senior Manager', 'Lex'),
	(104, 'Bruce', 'Manager', 'Alexander'),
	(105, 'David', 'Manager', 'Alexander'),
	(106, 'Diana', 'Associate', 'Bruce'),
	(107, 'Nancy', 'Associate', 'David'),
	(108, 'Daniel', 'Associate', 'Bruce'),
	(109, 'John', 'Senior Manager', 'Lex'),
	(110, 'Jose', 'Manager', 'John'),
	(111, 'Luis', 'Associate', 'Jose'),
	(112, 'Den', 'Trainee', 'Luis');
