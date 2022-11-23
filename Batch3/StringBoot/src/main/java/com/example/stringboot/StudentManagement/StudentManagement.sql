use SpringBootJava

create table Student(
id int primary key,
code varchar(10),
name varchar(50),
address varchar(50),
phone varchar(50),
email varchar(50),
classid int
)

create table Subject(
id int primary key,
name varchar(50),
description varchar(50),
sem int,
duration int
)

create table Mark(
id int primary key,
idsv int,
idsub int,
mark decimal,
note varchar(50)
)

create table Class(
id int primary key,
name varchar(50),
note varchar(50)
)