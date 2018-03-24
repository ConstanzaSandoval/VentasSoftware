drop database bd_ventas;
create database bd_ventas;

use bd_ventas;

create table producto(
    id int auto_increment,
    nombre varchar(50),
    valor int,
    cantidad int,
    primary key(id)

);

create table venta(
    id int auto_increment,
    pkProducto int,
    numVenta int,
    cantProducto int,
    valorTotal int,
    primary key(id),
    FOREIGN KEY(pkProducto) REFERENCES producto(id)
);




