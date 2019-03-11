create database Music;
drop database Music;

--drop database restaurantDB

if db_id(N'Music') is not null
drop database Music;
go
create database Music;
go

alter database Music
modify name = MusicDb

create table Artist(
	artistId int identity(1,1) not null primary key,
	artistName varchar(50) not null,
	age smallint not null default 18,
	activeSince date,
	isAlive bit default 1
);
go
--Multiplicity: 1 on 1, 1 to many(*), many to many
create table Albums(
	albumId int identity(1,1) not null primary key,
	albumName varchar(max) not null,
	numOfSongs smallint,
	releaseDate date,
	artistId int not null,
		--references Artist(artistId)
	genreId varchar(50) null
	constraint FK_Album_Artist foreign key (artistId)
		references Artist(artistId)
	on delete cascade -- or no action
	on update cascade -- or no action
);

create schema Music
alter schema Music
transfer dbo.Albums

create schema Person

create table Person.Listeners (
	listenerId int identity(1,1) not null,
	email varchar(50) null,
	communicationPreferences bit default 1,
	age int check (age > 10 and age < 110)
);

-- create table Genre

insert into Music.Artist
	values ('Rihana', 60, '1960-01-01')

select * from Music.Artist

insert into Music.Artist
	values ('Demi Lovato', 29, '1999-01-01')

select * from Music.Artist

insert into Music.Artist (Age, artistName, isAlive, activeSince)
	values (40, 'Enrique', 1, '1999-01-05'),
	(30, 'Rick astley', 1, '1989-01-05'),
	(35, 'Priyanka Chopra', 1, '1982-01-05')

select *
into Artist_Archive
from Music.Artist

select * from Artist_Archive

update Music.Artist
set age = 37
where artistName = 'Priyanka Chopra'

select * from Music.Artist

delete from Music.Artist

truncate table Music.Artist

select * from Music.Artist

insert into Music.Artist (artistName, age, activeSince, isAlive)
(select artistName,age, activeSince, isAlive
from Artist_Archive)

select * from Music.Artist

insert into Music.Albums
	values('Jal', 10, '1995-06-08', 13, 1)


