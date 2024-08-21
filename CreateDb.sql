use master;
create database khkt_history_2024;
use khkt_history_2024;
create table usertype (
	type VARCHAR(50) not null,
	id int not null IDENTITY(1,1) primary key
	);
create table [user] (
	name varchar(50) not null,
    age int not null,
    typeID int not null,
    foreign key (typeID) references usertype (id),
    id UNIQUEIDENTIFIER not null primary key DEFAULT (NEWID())
    );
create table champion (
    name varchar(50) not null,
    text nvarchar(4000) not null,
    status BIT not null,
    id UNIQUEIDENTIFIER not null primary key DEFAULT (NEWID())
    );
create table userchampion (
	userID UNIQUEIDENTIFIER not null,
	foreign key (userID) references [user](id),
    championID UNIQUEIDENTIFIER not null,
    foreign key (championID) references champion(id),
    id UNIQUEIDENTIFIER not null primary key DEFAULT (NEWID())
	);
create table picture (
	link nvarchar(4000) not null,
    championID UNIQUEIDENTIFIER not null,
    foreign key (championID) references champion(id),
    id UNIQUEIDENTIFIER not null primary key DEFAULT (NEWID())
	);
create table video (
	link nvarchar(4000) not null,
    championID UNIQUEIDENTIFIER not null,
    foreign key (championID) references champion(id),
    id UNIQUEIDENTIFIER not null primary key DEFAULT (NEWID())
	);

