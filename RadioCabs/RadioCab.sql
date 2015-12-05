use master
go
if exists (select name from sys.databases where name = 'RadioCab')
drop database RadioCab
go
create database RadioCab
go
use RadioCab
go

create table [User](
	UserName varchar(50) not null primary key,
	Pass varchar(50) not null,
	Email varchar(50)
)
go
create table Driver(
	DId int identity(1,1) not null primary key,
	UserName varchar(50) not null FOREIGN KEY REFERENCES [User](UserName),
	Name nvarchar(100),
	Contact nvarchar(200),
	[Address] nvarchar(200),
	City nvarchar(50),
	Mobile varchar(20),
	Telephone varchar(20),
	[Exp] nvarchar(50),
	[Description] nvarchar(2000),
	PaymentType int,
)
go

create table Advertisement(
	AId int identity(1,1) not null primary key,
	UserName varchar(50) not null FOREIGN KEY REFERENCES [User](UserName),
	Designation nvarchar(50),
	Name nvarchar(100),
	[Address] nvarchar(200),
	Mobile varchar(20),
	Telephone varchar(20),
	[Description] nvarchar(2000),
	PaymentType int,
)
go

create table Registration(
	RId int identity(1,1) not null primary key,
	UserName varchar(50) not null FOREIGN KEY REFERENCES [User](UserName),
	Designation nvarchar(50),
	Name nvarchar(100),
	[Address] nvarchar(200),
	Mobile varchar(20),
	Telephone varchar(20),
	Fax varchar(50),
	PaymentType int,
)
go

create table Feedback(
	Fid int identity(1,1) not null primary key,
	Name nvarchar(100),
	Mobile varchar(20),
	Email varchar(50),
	City nvarchar(100),
	Rate int,
	[Decription] nvarchar(1000)
)
go

create table PaymentType(
	PTId int identity(1,1) not null primary key,
	Price float,
	PaymentType int
)
go
create table [ExpireDate](
	EdId int identity(1,1) not null primary key,
	UserName varchar(50) not null FOREIGN KEY REFERENCES [User](UserName),
	[ExpireDate] date,
	TypeUser int 
)
go

create table Payment(
	PId int identity(1,1) not null primary key,
	UserName varchar(50) not null FOREIGN KEY REFERENCES [User](UserName),
	PTId int not null FOREIGN KEY REFERENCES PaymentType(PTId),
	PaymentDate date,
	TypeUser int 
)
go
select * from [User]
select * from Registration
select * from Driver
select * from Advertisement