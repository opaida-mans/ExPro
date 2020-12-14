DROP table IF EXISTS Employee;


CREATE TABLE ROrder(
id int not null primary key auto_increment,
FIRST_NAME varchar(225) not null,
LAST_NAME varchar(255) not null,
ORDER_NAME varchar(255) not null,
ORDER_DATE timestamp default(CURRENT_TIME)
);

CREATE TABLE `users` (
  `USERNAME` VARCHAR(225) NOT NULL,
  ` FIRST_ NAME` VARCHAR(225) NOT NULL,
  `LAST_ NAME` VARCHAR(225) NOT NULL,
  `EMAIL` VARCHAR(225) NOT NULL,
  `PHONE` VARCHAR(225) NOT NULL,
  `LOCATION` VARCHAR(225) NOT NULL,
  `TYPE` VARCHAR(225) NOT NULL,
  PRIMARY KEY (`USERNAME`));
  
  CREATE TABLE `restaurants` (
  `ID` int not null primary key auto_increment,
  `NAME` VARCHAR(255) NOT NULL,
  `LOCTION` VARCHAR(255) NOT NULL,
  `FACEBOOK_PAGE` VARCHAR(255) NULL,
  `PHONE` VARCHAR(255) NULL,
  `TYPE` VARCHAR(255) NULL);
  
  CREATE TABLE `orders` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `restaurant_id` INT NOT NULL,
  `date` DATE DEFAULT CURRENT_DATE, 
  `created_by` VARCHAR(255) NOT NULL,
  `active` BOOLEAN NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `o_restaurant_id`
    FOREIGN KEY (`restaurant_id`)
    REFERENCES `restaurants` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION); 
    
    
    CREATE TABLE `meals` (
  `id` INT NOT NULL,
  `restaurant_id` INT NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `description` VARCHAR(511) NOT NULL,
  `price` DOUBLE NOT NULL,
  `active` TINYINT NOT NULL,
  `type` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `m_restaurant_id`
    FOREIGN KEY (`restaurant_id`)
    REFERENCES `restaurants` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `ordermeals` (
  `id` INT NOT NULL,
  `meal_Id` INT NOT NULL,
  `order_id` INT NOT NULL,
  `quantity` INT NOT NULL,
  `total` DOUBLE NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `meal_Id`
    FOREIGN KEY (`meal_Id`)
    REFERENCES `meals` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `order_id`
    FOREIGN KEY (`order_id`)
    REFERENCES `orders` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

   