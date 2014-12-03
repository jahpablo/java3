--create table trabajador(id_trabajador integer primary key auto_increment,
--                       nombre varchar(120), paterno varchar(120), materno varchar(120));

create table usuarios(id_usuario integer primary key auto_increment, nombre varchar(250), edad integer, sueldo float);

create table direccion (id_direccion integer primary key auto_increment, calle varchar(120),cp integer,colonia varchar(120),estado varchar(50),
id_usuario integer, constraint foreign key (id_usuario) references usuarios(id_usuario));