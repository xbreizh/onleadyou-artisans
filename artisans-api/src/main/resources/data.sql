CREATE TABLE IF NOT EXISTS `workcategory` (
      `id` INT  PRIMARY KEY AUTO_INCREMENT,
      `name` VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS `city` (
     `id` INT  PRIMARY KEY AUTO_INCREMENT,
     `name` VARCHAR(50) NOT NULL,
     `postcode` VARCHAR,
     `county` VARCHAR(50) NOT NULL,
     `country` VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS `artisan` (
    `id` INT  PRIMARY KEY AUTO_INCREMENT,
    `company` VARCHAR(50) NOT NULL,
    `email` VARCHAR(50) NOT NULL,
    `address` VARCHAR(50) NOT NULL,
    `city_id` INT,
    FOREIGN KEY (`city_id`) REFERENCES `city`(`id`) ,
    `phonenumber` VARCHAR(255) NOT NULL,
    `workcategory_id` INT,
    FOREIGN KEY (`workcategory_id`) REFERENCES `workcategory`(`id`),
    `keywords` TEXT(2000) NOT NULL
);

INSERT INTO `workcategory` (name)
VALUES ('plombier'),
    ('peintre'),
    ('menuisier'),
    ('maçon')
;

INSERT INTO `city`(name, postcode, county, country)
VALUES
    ('Nimes', '43444', 'Gard', 'France'),
    ('Mons', '43444', 'Wallonie', 'Belgique'),
    ('Paris', '75440', 'Ile de France', 'France');

INSERT INTO `artisan` (company, email, phonenumber, address, city_id, workcategory_id, keywords)
VALUES
    ('compagnie A', 'companya@test.com', '33856554877', '2, rue du moulin', 1, 1, 'ravalement'),
    ('compagnie B', 'companyb@test.com', '33856554878', '55, avenue bourguignon', 2, 3, 'alu, pvc'),
    ('compagnie C', 'companyc@test.com', '33856554879', '28, plage sic', 3, 3, 'bois'),
    ('compagnie D', 'companyd@test.com', '33856554875', '45, rue de Lyon', 1, 4, 'mur d''enceinte');
