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

insert into producto values(null, 'leche',12,120 );
select * from producto;

create table venta( /*SUBTOTAL??*/
    id int auto_increment,
    numVenta int, /*Es necesario, si ya esta el ID?*/
    pkProducto int,
    cantProducto int,
    valorTotal int,
    primary key(id),
    FOREIGN KEY(pkProducto) REFERENCES producto(id)
);

select * from venta


