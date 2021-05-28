use sampledb;
create table customer(
id int AUTO_INCREMENT PRIMARY KEY,
code varchar(20),
first_name varchar(100),
last_name varchar(100),
date_of_birth int 
);