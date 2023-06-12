CREATE TABLE IF NOT EXISTS `workcategory` (
      `id`         LONG  PRIMARY KEY AUTO_INCREMENT,
      `name` VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS `city` (
     `id` LONG  PRIMARY KEY AUTO_INCREMENT,
     `name` VARCHAR(50) NOT NULL,
     `postcode` VARCHAR,
     `county` VARCHAR(50) NOT NULL,
     `country` VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS `artisan` (
    `id` LONG  PRIMARY KEY AUTO_INCREMENT,
    `company` VARCHAR(50) NOT NULL,
    `email` VARCHAR(50) NOT NULL,
    `address` VARCHAR(50) NOT NULL,
    `city_id` INTEGER,
    `phonenumber` VARCHAR(255) NOT NULL,
    `activity_ids` VARCHAR(255) NOT NULL,
    `keywords` TEXT(2000) NOT NULL
);

INSERT INTO `workcategory` (name)
VALUES ('plombier'),
    ('peintre'),
    ('menuisier')
;

INSERT INTO `city`(name, postcode, county, country)
VALUES ('Nimes', 43444, 'Gard', 'France');

INSERT INTO `artisan` (company, email, phonenumber, address, city_id, activity_ids, keywords)
VALUES ('companyA', 'companya@test.com', '33856554877', '2, rue du moulin', 1, '1,2', 'ravalement');
