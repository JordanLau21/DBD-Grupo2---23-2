# MODELAMIENTO CONCEPTUAL

# MODELAMIENTO RELACIONAL 

# CREACION DE TABLAS
### Empresa
```
CREATE TABLE Empresa(
	id_empresa INTEGER PRIMARY KEY NOT NULL,
	ruc INTEGER NOT NULL,
	regimen VARCHAR(25) NOT NULL,
	estado VARCHAR(20) NOT NULL,
	razon_social VARCHAR(50) NOT NULL,
	direccion VARCHAR(200) NOT NULL,
	giro VARCHAR(50) NOT NULL,
	ciudad VARCHAR(25) NOT NULL,
	logo VARCHAR(200) NOT NULL
);
```

### Representante Legal
```
CREATE TABLE RepresentanteLegal(
	id_representante INTEGER PRIMARY KEY NOT NULL,
	nombres VARCHAR(20) NOT NULL,
	apellido_paterno VARCHAR(50) NOT NULL,
	apellido_materno VARCHAR(50) NOT NULL,
	dni INTEGER NOT NULL,
	estado BOOLEAN NOT NULL,
	id_empresa INTEGER NOT NULL,
	FOREIGN KEY (id_empresa) REFERENCES Empresa(id_empresa)
);
```

CREATE TABLE Regimen_pensionario(<br>
	id_regimen_pensionario INTEGER PRIMARY KEY NOT NULL,<br>
	tipo_regimen CHAR(3) NOT NULL,<br>
	administradora VARCHAR(20) NOT NULL<br>
);

CREATE TABLE Seguro_medico(<br>
	id_seguro_medico INTEGER PRIMARY KEY NOT NULL,<br>
	tipo_seguro VARCHAR(10) NOT NULL<br>
);

CREATE TABLE Situacion_discapacidad(<br>
	id_situacion_discapacidad INTEGER PRIMARY KEY NOT NULL,<br>
	tipo_discapacidad VARCHAR(10) NOT NULL<br>
);

CREATE TABLE Empleado(<br>
	id_empleado INTEGER PRIMARY KEY NOT NULL,<br>
	nombres VARCHAR(20) NOT NULL,<br>
	apellidos VARCHAR(50) NOT NULL,<br>
	fecha_nacimiento DATE NOT NULL,<br>
	edad INT NOT NULL,<br>
	telefono NUMERIC(9) NOT NULL,<br>
	email VARCHAR(50) NOT NULL,<br>
	direccion VARCHAR(200) NOT NULL,<br>
	dni NUMERIC(8) NOT NULL,<br>
	estado_civil VARCHAR(15) NOT NULL,<br>
	sexo VARCHAR(10) NOT NULL,<br>
	id_regimen_pensionario INTEGER NOT NULL,<br>
	FOREIGN KEY (id_regimen_pensionario) REFERENCES Regimen_pensionario(id_regimen_pensionario),<br>
	id_seguro_medico INTEGER NOT NULL,<br>
	FOREIGN KEY (id_seguro_medico) REFERENCES Seguro_medico(id_seguro_medico),<br>
	id_situacion_discapacidad INTEGER NOT NULL,<br>
	FOREIGN KEY (id_situacion_discapacidad) REFERENCES Situacion_discapacidad(id_situacion_discapacidad),<br>
	id_empresa INTEGER NOT NULL,<br>
	FOREIGN KEY (id_empresa) REFERENCES Empresa(id_empresa)<br>
);

### Cargo
```
CREATE TABLE Cargo(
	id_cargo INTEGER PRIMARY KEY NOT NULL,
	nombre_cargo VARCHAR(50) NOT NULL,
	codigo_cargo VARCHAR(50) NOT NULL,
	descripcion_cargo TEXT NOT NULL,
	requerimientos TEXT NOT NULL,
	estado VARCHAR(20) NOT NULL,
	id_empresa INTEGER NOT NULL,
	FOREIGN KEY  (id_empresa) REFERENCES Empresa(id_empresa)
); 
```
### Area
```
CREATE TABLE Area(
    id_area INTEGER PRIMARY KEY NOT NULL,
    nombre_area VARCHAR(50) NOT NULL,
	descripcion_area TEXT NOT NULL,
    id_empresa INTEGER NOT NULL,
    FOREIGN KEY (id_empresa) REFERENCES Empresa(id_empresa)
);
```

CREATE TABLE Estado_contrato(<br>
	id_estado_contrato INTEGER PRIMARY KEY NOT NULL,<br>
	estado_contrato VARCHAR(10) NOT NULL <br>
);

CREATE TABLE Tipo_contrato(<br>
	id_tipo_contrato INTEGER PRIMARY KEY NOT NULL,<br>
	tipo_contrato VARCHAR(15) NOT NULL<br>
);

CREATE TABLE Tipo_jornada(<br>
	id_tipo_jornada INTEGER PRIMARY KEY NOT NULL,<br>
	tipo_jornada VARCHAR(15) NOT NULL<br>
);

CREATE TABLE Detalle_pago(<br>
	id_detalle_pago INTEGER PRIMARY KEY NOT NULL,<br>
	frecuencia_pago VARCHAR(30) NOT NULL,<br>
  	dia_pago_mes INT NOT NULL,<br>
	medio_pago VARCHAR(30) NOT NULL,<br>
	entidad_financiera VARCHAR(30) NOT NULL,<br>
	cuenta NUMERIC(14) NOT NULL<br>
);

CREATE TABLE Contrato(<br>
	id_contrato INTEGER PRIMARY KEY NOT NULL,<br>
	fecha_firma_contrato DATE NOT NULL,<br>
	fecha_inicio_laboral DATE NOT NULL,<br>
	fecha_termino_contrato DATE NOT NULL,<br>
	sueldo_base FLOAT NOT NULL,<br>
	liquido_teorico FLOAT NOT NULL,<br>
	id_area INTEGER NOT NULL,<br>
	FOREIGN KEY  (id_area) REFERENCES Area(id_area),<br>
	id_cargo INTEGER NOT NULL,<br>
	FOREIGN KEY (id_cargo) REFERENCES Cargo(id_cargo),<br>
	id_empleado INTEGER NOT NULL,<br>
	FOREIGN KEY (id_empleado) REFERENCES Empleado(id_empleado),<br>
	id_estado_contrato INTEGER NOT NULL,<br>
	FOREIGN KEY (id_estado_contrato) REFERENCES Estado_contrato(id_estado_contrato),<br>
	id_tipo_contrato INTEGER NOT NULL,<br>
	FOREIGN KEY (id_tipo_contrato) REFERENCES Tipo_contrato(id_tipo_contrato),<br>
	id_tipo_jornada INTEGER NOT NULL,<br>
	FOREIGN KEY (id_tipo_jornada) REFERENCES Tipo_jornada(id_tipo_jornada),<br>
	id_detalle_pago INTEGER NOT NULL,<br>
	FOREIGN KEY (id_detalle_pago) REFERENCES Detalle_pago(id_detalle_pago)<br>
);
## JORDAN LAUREANO

CREATE TABLE Solicitud(<br>
	id_solicitud INTEGER PRIMARY KEY NOT NULL,<br>
        detalles VARCHAR(100) NOT NULL,<br>
        fec_solicitud DATE NOT NULL,<br>
        hora_solicitud TIME WITHOUT TIME ZONE NOT NULL,<br>
        monto INTEGER,<br>
        id_estado_solicitud INTEGER NOT NULL,<br>
	FOREIGN KEY  (id_estado_solicitud) REFERENCES Estado_solicitud(id_estado_solicitud),<br>
        id_tipo_solicitud INTEGER NOT NULL,<br>
	FOREIGN KEY  (id_tipo_solicitud) REFERENCES Tipo_solicitud(id_tipo_solicitud),<br>
        id_empleado INTEGER NOT NULL,<br>
	FOREIGN KEY  (id_empleado) REFERENCES Empleado( id_empleado),<br>
        id_empresa INTEGER NOT NULL,<br>
	FOREIGN KEY  (id_empresa) REFERENCES Empresa(id_empresa),<br>
 );

 CREATE TABLE Estado_solicitud(<br>
	id_estado_solicitud INTEGER PRIMARY KEY NOT NULL,<br>
        descripcion VARCHAR(15) NOT NULL,<br>
 );

  CREATE TABLE Tipo_solicitud(<br>
	id_tipo_solicitud INTEGER PRIMARY KEY NOT NULL,<br>
        descripcion VARCHAR(50) NOT NULL,<br>
 );

 CREATE TABLE Cuenta(<br>
	id_cuenta INTEGER PRIMARY KEY NOT NULL,<br>
        usuario VARCHAR(50) NOT NULL,<br>
	contraseña VARCHAR(50) NOT NULL,<br>
        id_contrato INTEGER NOT NULL,<br>
	FOREIGN KEY  (id_contrato) REFERENCES Contrato(id_contrato),<br>
        id_estado_cuenta INTEGER NOT NULL,<br>
	FOREIGN KEY  (id_estado_cuenta) REFERENCES Estado_cuenta(id_estado_cuenta),<br>
        id_empleado INTEGER NOT NULL,<br>
	FOREIGN KEY  (id_empleado) REFERENCES Empleado( id_empleado),<br>
        id_empresa INTEGER NOT NULL,<br>
	FOREIGN KEY  (id_empresa) REFERENCES Empresa(id_empresa),<br>
 );

 CREATE TABLE Estado_cuenta(<br>
	id_estado_cuenta INTEGER PRIMARY KEY NOT NULL,<br>
        estado_cuenta VARCHAR(30) NOT NULL,<br>
 );

### planilla
```
CREATE TABLE Planilla
(
  id_planilla NUMERIC(6) NOT NULL,
  periodo VARCHAR(10) NOT NULL,
  dias_laborables NUMERIC(3) not null,
  fecha_inicio DATE not null,
  fecha_fin DATE not null,
  fecha_calculo date,
  monto_emitido NUMERIC(12,5),
  periodicidad VARCHAR(10) not null,
  fecha_creacion date not null,
  hora_creacion time not null,
  PRIMARY KEY (id_planilla)
);
```
### boleta
```
CREATE TABLE Boleta
(
  id_boleta NUMERIC(9,2) NOT NULL,
  TotalDescuentos NUMERIC(9,2) NOT NULL,
  TotalNeto NUMERIC(9,2) NOT NULL,
  TotalIngresos NUMERIC(9,2) NOT NULL,
  TotalAportes numeric(9,2) NOT NULL,
  id_contrato numeric(6)NOT NULL,
  id_planilla numeric(6) NOT NULL,
  PRIMARY KEY (id_boleta),
  FOREIGN KEY (id_contrato) REFERENCES Contrato(id_contrato),
  FOREIGN KEY (id_planilla) REFERENCES Planilla(id_planilla)
);
```
### tipo_operacion
```
create table tipo_operacion 
(
	id_tipo_operacion VARCHAR(3) not null,
	descripcion_operacion VARCHAR(20) not null,
	primary key (id_tipo_operacion)
);
```

### estado_concepto
```
create table estado_concepto 
(
	id_estado VARCHAR(3) not null,
	descripcion_estado VARCHAR(20) not null,
	primary key (id_estado)
);
```
### concepto_nomina
```
CREATE TABLE concepto_nomina
(
  id_nomina serial NOT NULL,
  nombre_nomina VARCHAR(50) NOT NULL,
  valor_nomina numeric(3,2) NOT NULL,
  id_tipo_operacion varchar(6) CHECK (id_tipo_operacion IN ('TO1', 'TO2', 'TO3')),
  id_estado varchar(6) CHECK (id_estado IN ('EC1', 'EC2') ),
  PRIMARY KEY (id_nomina),
  FOREIGN KEY (id_tipo_operacion) REFERENCES tipo_operacion(id_tipo_operacion),
  FOREIGN KEY (id_estado) REFERENCES estado_concepto(id_estado)
);
```
 

# CONSULTAS O QUERYS

### VALIDAR DATOS 
SELECT usuario, contraseña from Cuenta
WHERE usuario = <1> AND contraseña = <2>

### OLVIDAR CONTRASEÑA
SELECT nombres, apellidos, dni FROM Empleado WHERE nombres = <1> AND apellidos = <2> AND dni = < 3 >

### CAMBIAR CONTRASEÑA E INICIAR SESION
UPDATE Cuenta SET contraseña = <1> WHERE contraseña = < 3 > AND <1> = <2>;
SELECT usuario, contraseña from Cuenta
WHERE usuario = <1> AND contraseña = <2>

### PANTALLA SOLICITUDES (ADMINISTRADOR)
SELECT em.nombres, em.apellidos, so.fec_solicitud, ti.descripcion FROM Empleado em, Solicitud so, Tipo_solicitud ti, Estado_solicitud es
WHERE so.id_estado_solicitud = es.id_estado_solicitud AND em.id_empleado = so.id_empleado
AND ti.id_tipo_solicitud = so.id_tipo_solicitud

### BOTON DETALLES 
SELECT so.id_solicitud, em.nombres, em.apellidos, em.dni, so.fec_solicitud, so.hora_solicitud, ti.descripcion, so.detalles, es.descripcion
FROM Empleado em, Solicitud so, Tipo_solicitud ti, Estado_solicitud es
WHERE so.id_estado_solicitud = es.id_estado_solicitud AND em.id_empleado = so.id_empleado
AND ti.id_tipo_solicitud = so.id_tipo_solicitud

### BOTON ESTADO 
UPDATE Solicitud SET id_estado_solicitud = <1> WHERE id_estado_solicitud = 2 AND id_solicitud = <2>

### PANTALLA SOLICITUDES (EMPLEADOS)
SELECT so.id_solicitud, so.fec_solicitud, ti.descripcion, es.descripcion
FROM Solicitud so, Tipo_solicitud ti, Estado_solicitud es
WHERE ti.id_tipo_solicitud = so.id_tipo_solicitud AND es.id_estado_solicitud = so.id_estado_solicitud
AND id_empleado = <1>

### BOTON NUEVA SOLICITUD
CREATE SEQUENCE id_solicitud START WITH 1
INSERT INTO Solicitud VALUES (NEXTVAL(id_solicitud),2, <1>, <2>, date, time,<3>,<4>,<5>)



#### Planillas primera pagina
```
select id_planilla, fecha_inicio, periodicidad from planilla;
```


#### Detalle planilla ** falta :,c
```
select p.id_planilla,e.nombre,c.fecha_de_contrato ca.nombre_de_cargo from planilla p,contrato c, empleado e, cargo ca
where p.id_planilla = , e.id_empleado = c.id_contrato, c.id_cargo = ca.id_cargo;
```

#### Crear planilla
```
insert into planilla (periodo, fecha_inicio, fecha_fin, fecha_creacion, hora_creacion) values (<1>,<2>,<3>,current_date,current_time);
```


#### Crear planilla, verificar empleado empleados
```
select e.id_empleado, e.nombre, c.fecha_de_contrato, ca.nombre  from empleado e, contrato c, detalle_pago d,cargo ca 
where c.fecha_de_contrato < current_date and c.fecha_termino_contrato > current_date and d.frecuencia_pago= <1> --periodicidad
```

#### Boletas de pago. primera pagina
```
select id_planilla, fecha_calculo, periodo, monto_emitido from planilla where fecha_calculo is not null
and monto_emitido is not null;
```

--generar pago es crear boletas es el calculo, el proceso bach falta :c

#### Detalle boletas - planilla(monto a cada empleado)
```
select e.nombres, e.apellido_materno, e.apellido_paterno, b.total_neto, b.id_boleta  from planilla p, empleado e,boleta b 
where p.id_planilla =<1> and p.id_planilla=b.id_planilla; --la tabla
select id_planilla, fecha_calculo,monto_emitido, periodo from planilla where planilla =<1>;--la parte de arriba,falta count
```


#### Detalle de una boleta (montos de cada empleado)
```
select e.nombres, e.apellido_materno, e.apellido_paterno, e.dni, b.total_neto, b.total_ingresos, b.total_descuentos, b.total_aportes, tc.tipo_contrato,c sueldo_base 
from planilla p, empleado e, contrato c, concepto_nomina cn, boleta b, movimiento_planilla mp,tipo_contrato tc
where b.id_boleta =<1> and c.id_tipo_contrato=tp.id_tipo_contrato and c.id_empleado=e.id_empleado;--duda
```



# ASIGNACIÓN DE CÓDIGOS POR REQUERIMIENTOS Y PROTOTIPOS DE INTERFACES

## Codificación de Requerimientos



| Código | R008  |
|----------|----------|
|Nombre|Crear Empleado y Usuario|
|Objetivo|Introducir los datos de un empleado con contrato vigente con la empresa, de manera que se cree un usuario y contraseña.|
|Descripción|A través de la subida de datos del empleado, se crea un usuario que le permitirá a este poder ver su sistema de planillas.|


| Código | R009  |
|----------|----------|
|Nombre|Visualizar los usuarios vigentes o activos|
|Objetivo|Visualizar los usuarios activos en el sistema de planillas.|
|Descripción|El administrador podrá visualizar los usuarios cuyo estado es activo en el momento, es decir, los empleados que tienen contrato vigente con la empresa.|


| Código | R010  |
|----------|----------|
|Nombre|Renovar contrato de empleado|
|Objetivo|Renovar el contrato de un empleado.|
|Descripción|El administrador podrá renovar el contrato del empleado bajo las mismas condiciones o cambiar los datos que hayan sido modificados, como por ejemplo, el cargo, área, sueldo, etc.|


| Código | R011  |
|----------|----------|
|Nombre|Visualizar los usuarios desvinculados|
|Objetivo|Desvincular a un empleado activo o visualizar a los empleados desvinculados.|
|Descripción|El administrador podrá desvincular usuarios activos, por término de contrato, además de poder visualizar los empleados desvinculados anteriormente.|



## Codificación Prototipo de Interfaz

| Código Interfaz | I000  |
|-----------------|--------------------------------------------------|
|Imagen Interfaz|*colocar imagen*|





# SENTENCIAS SQL POR CADA PROTOTIPO

Codigo Requerimiento: R-001
Codigo interfaz: I-001
Imagen Inferzas

| Código Interfaz | R000  |
|-----------------|--------------------------------------------------|
| Imagen Interfaz | I000  |
|Imagen Interfaz|*colocar imagen*|
|Sentencias SQL|*colocar sql*|




| Codigo Requerimiento | R-001 |  
|----------|----------|
| Codigo Interfaz | I-001|   



| Imagen interfaz |  
|----------|
imagen

| Sentencias SQL |  
|----------|
|Evento 1: El codigo es:
haciendo h|

| Codigo Interfaz | I-001 |  
|id_solicitud| INTEGER | 9999999| 7 dígitos | - | - | Diferencia las solicitudes hechas por los empleados|
| fec_solicitud | DATE | AAAAMMDD | Válido en calendario | - | - | Fecha de cuando se hizo la solicitud |
| hora_solicitud | TIME | HH:MM:SS | Válido en tiempo | - | - | Hora en la que se hizo la solicitud |
| monto | NUMERIC  | 999999.99 | >= 0| En soles | - | Monto que pide de adelanto el empleado | 
| descripcion | VARCHAR | X(32) | NOT NULL | - | - | Descropción de la solicitud del empleado |
| id_tipo_solicitud | INTEGER | 99999 | 5 dígitos | - | - | Doferencia el tipo de solicitud del empleado |
| id_est_solicitud | INTEGER | 99999 | 5 dígitos | - | - | Diferencia el estado de la solicitud de un empleado |
| id_empleado |INTEGER|999999|6 dígitos|||Identificar al empleado a nivel de la empresa|
| id_empresa | NUMERIC | 9999 | 4 dígitos | - | - | Identificador de la empresa |

#### Nombre entidad: ESTADO SOLICITUD
Semantica: Entidad que representa el estado de las solicitudes hechas por los empleados

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| id_est_solicitud | INTEGER | 99999 | 5 dígitos | - | - | Diferencia el estado de la solicitud de un empleado |
| descripcion_solicitud | CHAR | X(3) | NOT NULL | - | - | Representa el estado de la solicitud de un empleado |


#### Nombre entidad: TIPO SOLICITUD
Semantica: Entidad que representa el tipo de las solicitudes hechas por los empleados

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| id_tipo_solicitud | INTEGER | 99999 | 5 dígitos | - | - | Diferencia el tipo de solicitud del empleado |
| descripcion_tipo_solicitud | CHAR | X(3) | NOT NULL | - | - | Representa el tipo de solicitud del empleado |

# CARGA DE DATOS

Lookup Tables (Luis): <br>
<br>
--Régimen Pensionario<br>
INSERT INTO Regimen_pensionario (id_regimen_pensionario, tipo_regimen, administradora) VALUES 
('1', 'ONP','Estado');<br>
INSERT INTO Regimen_pensionario (id_regimen_pensionario, tipo_regimen, administradora) VALUES 
('2', 'AFP','');<br>
<br>
--Seguro Médico<br>
INSERT INTO Seguro_medico (id_seguro_medico, tipo_seguro) VALUES ('1', 'EPS');<br>
INSERT INTO Seguro_medico (id_seguro_medico, tipo_seguro) VALUES ('2', 'SIS');<br>
INSERT INTO Seguro_medico (id_seguro_medico, tipo_seguro) VALUES ('3', 'EsSalud');<br>
INSERT INTO Seguro_medico (id_seguro_medico, tipo_seguro) VALUES ('4', 'Privado');<br>
<br>
--Situación de Discapacidad<br>
INSERT INTO Situacion_discapacidad (id_situacion_discapacidad, tipo_discapacidad) VALUES
('1', 'Ninguna');<br>
INSERT INTO Situacion_discapacidad (id_situacion_discapacidad, tipo_discapacidad) VALUES
('2', 'Parcial');<br>
INSERT INTO Situacion_discapacidad (id_situacion_discapacidad, tipo_discapacidad) VALUES
('3', 'Total');<br>

### Estado de Solicitud
```
INSERT INTO Estado_solicutud VALUES (1, 'Aceptado');
INSERT INTO Estado_solicutud VALUES (2, 'En Espera');
INSERT INTO Estado_solicutud VALUES (3, 'Rechazado');
```

### Tipo de Solicitud
```
INSERT INTO Tipo_solicitud VALUES (1,'Licencia'):
INSERT INTO Tipo_solicitud VALUES (2,'Reclamo'):
INSERT INTO Tipo_solicitud VALUES (3,'Aumento'):
INSERT INTO Tipo_solicitud VALUES (4,'Vacaciones'):
INSERT INTO Tipo_solicitud VALUES (5,'Configuración de Información'):
INSERT INTO Tipo_solicitud VALUES (6,'Adelanto'):
```
### Estado de Cuenta
```
INSERT INTO Estado_cuenta VALUES (1, 'Vigente');
INSERT INTO Estado_cuenta VALUES (2, 'Desvinculado');
```

### tipo_operacion
```
insert into tipo_operacion (id_tipo_operacion,descripcion_operacion) 
values ('TO1'.'Ingreso'), ('TO2','Descuento'), ('TO3','aportes');
```
### estado_concepto
```
insert into estado_concepto (id_estado,descripcion_estado) 
values ('EC1'.'Activo'), ('EC2','Inactivo');
```

### concepto_nomina
```
INSERT INTO concepto_nomina ("id_nomina", "nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") 
VALUES
	('1', 'Dias Subsidiados Laborados', '0', 'TO1', 'EC1'),
	('2', 'Dias Vacaciones', '0', 'TO1', 'EC1'),
	('3', 'Dias No Laborados', '0', 'TO2', 'EC1'),
	('4', 'Horas ordinarias', '0', 'TO1', 'EC1'),
	('5', 'Horas Extras 25%', '0', 'TO1', 'EC1'),
	('6', 'Horas Extras 35%', '0', 'TO1', 'EC1'),
	('7', 'Sueldo Básico a pagar', '0', 'TO1', 'EC1'),
	('8', 'Asig.Familiar', '0', 'TO1', 'EC1'),
	('9', 'Horas Extras 25%', '0', 'TO1', 'EC1'),
	('10', 'Horas Extras 35%', '0', 'TO1', 'EC1'),
	('11', 'Vacaciones', '0', 'TO1', 'EC1'),
	('12', 'OTROS INGRESOS', '0', 'TO1', 'EC1'),
	('13', 'DSCTOS. INASISTENCIA', '0', 'TO2', 'EC1'),
	('14', 'GratifIcacion', '0', 'TO1', 'EC1'),
	('15', 'Bono Extraord. Essalud', '0', 'TO3', 'EC1'),
	('16', 'Total Gratif. Diciembre', '0', 'TO1', 'EC1'),
	('17', 'ONP 13%', '0', 'TO3', 'EC1'),
	('18', 'AFP Obligatorio 10%', '0', 'TO3', 'EC1'),
	('19', 'AFP Comisión', '0', 'TO3', 'EC1'),
	('20', 'AFP Seguro', '0', 'TO3', 'EC1'),
	('21', 'Renta 5ta.', '0', 'TO2', 'EC1'),
	('22', 'Adelanto', '0', 'TO1', 'EC1'),
	('23', 'OTROS DESCUENTOS', '0', 'TO2', 'EC1'),
	('24', 'REINTEGRO', '0', 'TO1', 'EC1'),
	('25', 'Essalud 9%', '0.09', 'TO3', 'EC1');
```




# FUNCIONALIDAD PRIMARIA ELEGIDA (POR MÓDULO)



#STACK TECNOLÓGICO ELEGIDO PARA SU APLICACIÓN







