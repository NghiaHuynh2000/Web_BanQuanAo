create database web_ban_quan_ao character set utf8 collate utf8_general_ci;
use web_ban_quan_ao;
create table User
(
	id int auto_increment,
    avatar varchar(50),
	email varchar(50),
	userName varchar(50) unique not null,
	password varchar(36) not null,
	address varchar(50),
	permission int,
	primary key(id)
);

Insert into user(avatar,email,userName,password,address,permission) values
('image.jpg','huynhtrongnghia1090@gmail.com','Huỳnh Trọng Nghĩa','123456','134 Tân Vĩnh Thuận',0);

create table Category(
	cate_id int primary key auto_increment,
	cate_name varchar(255) not null
);

Insert into Category(cate_name) values('Giày');

create table Product(
	id int primary key auto_increment,
    image varchar(50),
	name varchar(255) not null,
	price float ,
	cate_id int not null references Category(cate_id) ,
	des varchar(2000)
);

Insert into Product(image,name,price,cate_id,des) values('image_product1.png','Giày Gucci', 2000, 1,'Màu xám nâu, hoa văn đẹp mắt');

create table Cart(
	id varchar(50) primary key,
	u_id int not null  references User(id) ,
	buyDate date,
    action bit
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
	date_create date,
	new_category varchar(50),
	date_open date,
	date_close date
);
