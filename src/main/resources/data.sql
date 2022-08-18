drop table if exists cajas;
drop table if exists Almacenes;

Create table Almacenes (
codigo int auto_increment not null,
lugar varchar(100),
capacidad int,
PRIMARY KEY (codigo)
);

create table cajas(
numReferencia char(5),
Contenido varchar(100),
Valor int,
Almacen int,
Primary key(numReferencia),
constraint fk_codigoAlmacenes FOREIGN KEY (Almacen ) 
REFERENCES Almacenes (codigo)
ON DELETE CASCADE ON UPDATE CASCADE

);

insert into almacenes (lugar,capacidad) values
('Tarragona',20),
('Reus',30),
('Amposta',15),
('Vila-Seca',35);

insert into cajas values
('RF1','Refresco de cola',2,1),
('RF2','Refresco de limon',1,2),
('DG1','Lejia',2,3);