DROP table IF EXISTS Employee;


CREATE TABLE ROrder(
id int not null primary key auto_increment,
FIRST_NAME varchar(225) not null,
LAST_NAME varchar(255) not null,
ORDER_NAME varchar(255) not null,
ORDER_DATE timestamp default(CURRENT_TIME)
)