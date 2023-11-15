![imagen](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966578/3cd3aad7-8014-4c33-9e74-01598a5698b9)# MODELAMIENTO CONCEPTUAL

# MODELAMIENTO RELACIONAL 

# CREACION DE TABLAS
### Empresa
```
CREATE TABLE Empresa(
	id_empresa INTEGER PRIMARY KEY NOT NULL,
	ruc VARCHAR(50) NOT NULL,
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
	dni VARCHAR(20) NOT NULL,
	estado VARCHAR(20) NOT NULL, 
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
        id_cuenta INTEGER NOT NULL,<br>
	FOREIGN KEY (id_cuenta) REFERENCES Cuenta(id_cuenta)<br>
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
        monto NUMERIC(7,2),<br>
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
        id_estado_cuenta INTEGER NOT NULL,<br>
	FOREIGN KEY  (id_estado_cuenta) REFERENCES Estado_cuenta(id_estado_cuenta),<br>
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

### P1.1: Editar Información de la empresa
```
SELECT 
    Empresa.ruc AS RUC, 
    Empresa.razon_social AS Razón_Social,
	CONCAT(RepresentanteLegal.nombres, ' ', RepresentanteLegal.apellido_paterno, ' ', RepresentanteLegal.apellido_materno) AS Representante,
    Empresa.direccion AS Dirección,
	Empresa.estado AS Estado    
FROM Empresa
LEFT JOIN RepresentanteLegal ON Empresa.id_empresa = RepresentanteLegal.id_empresa
WHERE Empresa.id_empresa = 3;
```
### P1.2: Editar Información de la empresa
```
SELECT 
    Empresa.id_empresa, 
    Empresa.ruc, 
    Empresa.regimen, 
    Empresa.estado, 
    Empresa.razon_social, 
    Empresa.direccion, 
    Empresa.giro, 
    Empresa.ciudad, 
    Empresa.logo,
    RepresentanteLegal.id_representante,
    RepresentanteLegal.nombres,
    RepresentanteLegal.apellido_paterno,
    RepresentanteLegal.apellido_materno,
    RepresentanteLegal.dni
FROM Empresa
LEFT JOIN RepresentanteLegal ON Empresa.id_empresa = RepresentanteLegal.id_empresa
WHERE Empresa.id_empresa = 3;

-- Actualizar información de la empresa
UPDATE Empresa
SET 
    direccion = 'Jr. Nueva Dirección 789',
    estado = 'Inactiva'
WHERE id_empresa = 3;

-- Añadir algún representante
INSERT INTO RepresentanteLegal (nombres, apellido_paterno, apellido_materno, dni, estado, id_empresa)
VALUES ('Roberto Carlos', 'Flores', 'Velarde', '76071011', 'Activo', 3);

-- Borrar algún representante
DELETE FROM RepresentanteLegal WHERE id_representante = 5;
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
### Régimen Pensionario
```
INSERT INTO Regimen_pensionario (id_regimen_pensionario, tipo_regimen) VALUES
('1', 'ONP'),
('2', 'AFP');
```
### Seguro Médico
```
INSERT INTO Seguro_medico (id_seguro_medico, tipo_seguro) VALUES
('1', 'EPS'),
('2', 'SIS'),
('3', 'EsSalud'),
('4', 'Privado');
```
### Situación de Discapacidad
```
INSERT INTO Situacion_discapacidad (id_situacion_discapacidad, tipo_discapacidad) VALUES ('1', 'Ninguna'),
('2', 'Parcial'),
('3', 'Total');
```
### Empleado
```
INSERT INTO Empleado (id_empleado,nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad,id_empresa) VALUES
(1,'DANIEL','SIFUENTES GRADOS',TO_DATE('1993-05-11', 'YYYY-MM-DD'),30,964701287,'daniel.sifuentes@harlamsyo.pe',47756342,'Soltero','Masculino',2,1,1,1),
(2,'EDUARDO SAUL','ESCOBEDO VILLANUEVA',TO_DATE('18-04-1979', 'YYYY-MM-DD'),44,991961400,'',40157917,'Casado','Masculino',2,2,1,1),
(3,'JAPHET CHARLIE JESUS','TORRES HUARINGA',TO_DATE('29-05-1985', 'YYYY-MM-DD'),38,926270930,'',43044175,'Casado','Masculino',2,3,1,2),
(4,'JHON ERIK','CAMPO VELÁSQUEZ',TO_DATE('13-04-1991', 'YYYY-MM-DD'),32,931854954,'campovelas@gmail.com',47231764,'Soltero','Masculino',2,3,1,4),
(5,'KEVYN ANTHONY','PLASENCIA BLANCO',TO_DATE('11-07-1995', 'YYYY-MM-DD'),28,998400448,'kevpb95@gmail.com',75363683,'Soltero','Masculino',1,3,1,4),
(6,'FRANCISCO ROBERTO','GRADOS PAREDES',TO_DATE('04-10-1987', 'YYYY-MM-DD'),36,918099146,'gradosparadesfrank@gmail.com',44569138,'Casado','Masculino',1,3,1,4),
(7,'JORGE LUIS','HOLGUIN ALARCON',TO_DATE('04-06-2001', 'YYYY-MM-DD'),22,938197568,'jorholguinalarcon@gmail.com',72756436,'Soltero','Masculino',2,3,2,2),
(8,'RONALD HERBERT','PRUDENCIO ALIAGA',TO_DATE('12-12-1994', 'YYYY-MM-DD'),29,920852657,'ronaldhpa12@hotmail.com',72079266,'Casado','Masculino',2,3,1,2),
(9,'YESSICA ISABEL','FLORES VELARDE',TO_DATE('17-11-1990', 'YYYY-MM-DD'),33,989686976,'yessicflores@gmail.com',46698999,'Casado','Femenino',2,3,1,2),
(10,'OMAR ADRIAN','ANAYA AYALA',TO_DATE('05-01-1992', 'YYYY-MM-DD'),31,992423368,'anayaayala@gmail.com',46850431,'Casado','Masculino',2,3,1,2),
(11,'CLAUDIA JOSELIN','CAMONES ALEGRIA',TO_DATE('22-06-1983', 'YYYY-MM-DD'),40,993904334,'',42201690,'Viudo','Femenino',2,4,2,3),
(12,'GAYMO LUIS','PEREZ MUÑOZ',TO_DATE('30-05-1992', 'YYYY-MM-DD'),31,970897522,'',71902155,'Casado','Masculino',2,4,1,3),
(13,'JORGE OSWALDO','ARGUEDAS PUCUTAY',TO_DATE('10-08-1991', 'YYYY-MM-DD'),31,981378149,'larguedas1010@gmail.com',71395354,'Casado','Masculino',1,3,1,3),
(14,'JORGE LUIS','DIAZ LEYTON',TO_DATE('17-09-1982', 'YYYY-MM-DD'),41,997935493,'leyton17_14@hotmail.com',41473747,'Divorciado','Masculino',2,4,1,3),
(15,'KAREN EDITH','POMA CAMACHO DE SALAZAR',TO_DATE('22-07-1983', 'YYYY-MM-DD'),40,936131832,'karenpomakp30@gmail.com',42685693,'Divorciado','Femenino',1,3,1,3),


;



```


### Empresa
```
INSERT INTO Empresa (id_empresa, ruc, regimen, estado, razon_social, direccion, giro, ciudad, logo)
VALUES 
(1, '20123456789', 'Régimen General', 'Activa', 'Empresa A S.A.', 'Av. Principal 123', 'Tecnología', 'Lima', 'https://empresa-a.com/logo.png'),
(2, '20567890123', 'Régimen Especial', 'Inactiva', 'Empresa B SAC', 'Calle Secundaria 456', 'Servicios', 'Arequipa', 'https://empresa-b.com/logo.png'),
(3, '20987654321', 'Régimen Simplificado', 'Activa', 'Empresa C EIRL', 'Jr. Importante 789', 'Manufactura', 'Trujillo', 'https://empresa-c.com/logo.png'),
(4, '20345678901', 'Régimen General', 'Activa', 'Empresa D SRL', 'Av. Central 456', 'Comercial', 'Piura', 'https://empresa-d.com/logo.png'),
(5, '20678901234', 'Régimen Especial', 'Inactiva', 'Empresa E SAC', 'Calle Innovación 789', 'Consultoría', 'Cusco', 'https://empresa-e.com/logo.png'),
(6, '20234567890', 'Régimen Simplificado', 'Activa', 'Empresa F SAC', 'Av. Progreso 567', 'Desarrollo', 'Iquitos', 'https://empresa-f.com/logo.png'),
(7, '20198765432', 'Régimen General', 'Activa', 'Empresa G SAC', 'Jr. Modelo 234', 'Ventas', 'Chiclayo', 'https://empresa-g.com/logo.png'),
(8, '20901234567', 'Régimen Especial', 'Inactiva', 'Empresa H SRL', 'Av. Demo 789', 'Servicios Financieros', 'Tacna', 'https://empresa-h.com/logo.png'),
(9, '20678901234', 'Régimen Simplificado', 'Activa', 'Empresa I EIRL', 'Calle Prueba 890', 'Consultoría', 'Huancayo', 'https://empresa-i.com/logo.png'),
(10, '20345678901', 'Régimen General', 'Activa', 'Empresa J SAC', 'Av. Ejemplo 567', 'Desarrollo Web', 'Pucallpa', 'https://empresa-j.com/logo.png'),
(11, '20901234567', 'Régimen Especial', 'Inactiva', 'Empresa K SRL', 'Jr. ABC 123', 'Servicios', 'Ayacucho', 'https://empresa-k.com/logo.png'),
(12, '20567890123', 'Régimen Simplificado', 'Activa', 'Empresa L SAC', 'Av. Innovadora 890', 'Tecnología', 'Puno', 'https://empresa-l.com/logo.png'),
(13, '20123456789', 'Régimen General', 'Activa', 'Empresa M SAC', 'Calle Software 456', 'Desarrollo de Software', 'Tarapoto', 'https://empresa-m.com/logo.png'),
(14, '20987654321', 'Régimen Especial', 'Inactiva', 'Empresa N SRL', 'Av. Avanzada 123', 'Consultoría', 'Ica', 'https://empresa-n.com/logo.png'),
(15, '20234567890', 'Régimen Simplificado', 'Activa', 'Empresa O SAC', 'Jr. XYZ 789', 'Innovación', 'Chimbote', 'https://empresa-o.com/logo.png');
```
### Representante Legal
```
INSERT INTO RepresentanteLegal (id_representante, nombres, apellido_paterno, apellido_materno, dni, estado, id_empresa)
VALUES 
(1, 'Juan', 'González', 'Pérez', '12345678A', 'Activo', 1),
(2, 'María', 'Rodríguez', 'López', '98765432B', 'Activo', 1),
(3, 'Carlos', 'Martínez', 'Gómez', '54321678C', 'Inactivo', 2),
(4, 'Ana', 'Fernández', 'Díaz', '87654321D', 'Activo', 2),
(5, 'Pedro', 'Sánchez', 'Ruiz', '34567891E', 'Activo', 3),
(6, 'Laura', 'García', 'Hernández', '23456789F', 'Inactivo', 3),
(7, 'Diego', 'Pérez', 'Gómez', '78901234G', 'Activo', 4),
(8, 'Sofía', 'Díaz', 'Martínez', '65432109H', 'Inactivo', 4),
(9, 'Elena', 'López', 'González', '21098765I', 'Activo', 5),
(10, 'Andrés', 'Gómez', 'Fernández', '10987654J', 'Activo', 5),
(11, 'Luis', 'Hernández', 'Sánchez', '87654321K', 'Inactivo', 6),
(12, 'Marta', 'Ruiz', 'Pérez', '54321098L', 'Activo', 6),
(13, 'Pablo', 'González', 'López', '32109876M', 'Activo', 7),
(14, 'Lucía', 'Martínez', 'Díaz', '89012345N', 'Inactivo', 7),
(15, 'Carmen', 'Sánchez', 'Gómez', '67890123O', 'Activo', 8);
```
### Cargo
```
INSERT INTO Cargo (id_cargo, nombre_cargo, codigo_cargo, descripcion_cargo, requerimientos, estado, id_empresa)
VALUES 
(1, 'Gerente de Ventas', 'GC001', 'Responsable de supervisar el equipo de ventas.', 'Experiencia en liderazgo y ventas', 'Activo', 1),
(2, 'Analista de Marketing', 'MK002', 'Encargado de análisis de mercado y estrategias de marketing.', 'Conocimientos en análisis de datos y marketing digital', 'Activo', 1),
(3, 'Jefe de Recursos Humanos', 'RH001', 'Gestión del personal y desarrollo de estrategias de RRHH.', 'Experiencia en gestión de equipos y conocimientos legales', 'Inactivo', 2),
(4, 'Contador Financiero', 'CF002', 'Encargado de la contabilidad y finanzas de la empresa.', 'Conocimientos en contabilidad y manejo de herramientas financieras', 'Activo', 2),
(5, 'Desarrollador de Software Senior', 'DS001', 'Desarrollo de software y liderazgo de equipos de programación.', 'Experiencia en desarrollo de software y habilidades técnicas avanzadas', 'Activo', 3),
(6, 'Diseñador Gráfico', 'DG002', 'Creación de diseños gráficos para campañas de marketing.', 'Habilidades en diseño gráfico y creatividad', 'Inactivo', 3),
(7, 'Supervisor de Producción', 'SP001', 'Supervisión y control de la producción.', 'Experiencia en producción y habilidades de liderazgo', 'Activo', 4),
(8, 'Especialista en Ventas Online', 'VO002', 'Desarrollo de estrategias de ventas en plataformas online.', 'Conocimientos en marketing digital y ventas online', 'Inactivo', 4),
(9, 'Asistente de Recursos Humanos', 'ARH001', 'Apoyo en labores administrativas del área de RRHH.', 'Conocimientos básicos en gestión de personal', 'Activo', 5),
(10, 'Técnico en Soporte IT', 'TI002', 'Brindar soporte técnico en sistemas y tecnologías de la información.', 'Experiencia en atención al cliente y conocimientos en IT', 'Activo', 5),
(11, 'Analista de Datos', 'AD001', 'Análisis de datos para la toma de decisiones.', 'Experiencia en análisis de datos y manejo de herramientas estadísticas', 'Inactivo', 6),
(12, 'Ejecutivo de Cuentas', 'EC002', 'Gestión de cuentas y relaciones con clientes.', 'Habilidades de comunicación y ventas', 'Activo', 6),
(13, 'Ingeniero de Software', 'IS001', 'Desarrollo y diseño de software.', 'Experiencia en desarrollo de software y conocimientos técnicos avanzados', 'Activo', 7),
(14, 'Community Manager', 'CM002', 'Gestión de redes sociales y comunidades online.', 'Conocimientos en redes sociales y habilidades de comunicación', 'Inactivo', 7),
(15, 'Asesor Financiero', 'AF001', 'Asesoramiento en temas financieros y de inversión.', 'Experiencia en asesoramiento financiero y conocimientos en inversiones', 'Activo', 8);

```
### Area
```
INSERT INTO Area (id_area, nombre_area, descripcion_area, id_empresa)
VALUES 
(1, 'Ventas', 'Área encargada de las estrategias y procesos de ventas.', 1),
(2, 'Recursos Humanos', 'Área responsable de la gestión del personal y desarrollo de recursos humanos.', 1),
(3, 'Finanzas', 'Área encargada de la gestión financiera y contable de la empresa.', 2),
(4, 'Desarrollo de Software', 'Área dedicada al desarrollo de soluciones y productos de software.', 2),
(5, 'Producción', 'Área responsable de la producción y fabricación de productos.', 3),
(6, 'Marketing', 'Área encargada de las estrategias de marketing y publicidad.', 3),
(7, 'Soporte Técnico', 'Área dedicada a brindar soporte técnico a clientes y sistemas.', 4),
(8, 'Servicio al Cliente', 'Área centrada en la atención y satisfacción del cliente.', 4),
(9, 'Logística', 'Área encargada de la gestión y optimización de la cadena de suministro.', 5),
(10, 'Innovación', 'Área enfocada en la investigación y desarrollo de nuevas ideas y productos.', 5),
(11, 'Calidad', 'Área responsable del control y aseguramiento de la calidad de productos y procesos.', 6),
(12, 'Comunicación', 'Área encargada de la comunicación interna y externa de la empresa.', 6),
(13, 'Tecnologías de la Información', 'Área dedicada a la gestión y mantenimiento de sistemas y tecnologías.', 7),
(14, 'Diseño Gráfico', 'Área especializada en la creación y diseño gráfico.', 7),
(15, 'Consultoría', 'Área dedicada a brindar asesoramiento y consultoría a clientes.', 8);
```
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







