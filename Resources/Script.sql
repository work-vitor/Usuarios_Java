create database Usuarios_Java;

create table Usuarios_Java.Usuarios(
	id int primary key auto_increment,
    Nome varchar(45) not null,
    Sobrenome varchar(80) not null,
    Idade int,
    DataDCriacao datetime,
    UltimaAtualizacao datetime
    );