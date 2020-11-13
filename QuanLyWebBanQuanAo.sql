create database web_ban_quan_ao character set utf8 collate utf8_general_ci;
use web_ban_quan_ao;
create table USER
(
	id int auto_increment,
	email varchar(50),
	username varchar(50) unique not null,
	password varchar(36) not null,
	avatar varchar(50),
	Adress varchar(50),
	permission int,
	primary key(id)
);
create table Category(
	cate_id int primary key auto_increment,
	cate_name varchar(255) not null
);

create table Product(
	id int primary key auto_increment,
	name varchar(255) not null,
	price float ,
	cate_id int not null references Category(cate_id) ,
	des varchar(2000),
	image varchar(50)
);


create table Cart(
	id varchar(50) primary key,
	u_id int not null  references User(id) ,
	buyDate date
);
create table CartItem(
	id varchar(50) primary key,
	quantity int,
	unitPrice float,
	pro_id int not null references Product(id) ,
	cat_id varchar(50)  not null references Cart(id)
);

create table Promotion
(
	new_id varchar(20) primary key,
	new_name varchar(150),
	Date_create date,
	new_category varchar(50),
	Date_open date,
	date_close date
);