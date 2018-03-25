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
select * from producto;

create table venta( /*SUBTOTAL??*/
    id int auto_increment,
    pkProducto int,
    /*numVenta int,/*Es necesario, si ya esta el ID?*/
    cantProducto int,
    valorTotal int,
    primary key(id),
    FOREIGN KEY(pkProducto) REFERENCES producto(id)
);


