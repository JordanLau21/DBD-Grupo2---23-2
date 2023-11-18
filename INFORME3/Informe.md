# MODELAMIENTO CONCEPTUAL

# MODELAMIENTO RELACIONAL 

# CREACION DE TABLAS
## CODIGO COMPLETO
/*Primero creamos las tablas independientes (que no tienen foreign keys)*/

### REGIMEN PENSIONARIO
```
CREATE TABLE Regimen_pensionario(
	id_regimen_pensionario INTEGER PRIMARY KEY NOT NULL,
	tipo_regimen CHAR(3) NOT NULL,
);
```
### SEGURO MÉDICO
```
CREATE TABLE Seguro_medico(
	id_seguro_medico INTEGER PRIMARY KEY NOT NULL,
	tipo_seguro VARCHAR(10) NOT NULL
);
```
### SITUACIÓN DISCAPACITADO
```
CREATE TABLE Situacion_discapacidad(
	id_situacion_discapacidad INTEGER PRIMARY KEY NOT NULL,
	tipo_discapacidad VARCHAR(10) NOT NULL
);
```
### ESTADO CONTRATO
```
CREATE TABLE Estado_contrato(
	id_estado_contrato INTEGER PRIMARY KEY NOT NULL,
	estado_contrato VARCHAR(10) NOT NULL
);
```
### TIPO CONTRATO
```
CREATE TABLE Tipo_contrato(
	id_tipo_contrato INTEGER PRIMARY KEY NOT NULL,
	tipo_contrato VARCHAR(15) NOT NULL
);
```
### TIPO JORNADA
```
CREATE TABLE Tipo_jornada(
	id_tipo_jornada INTEGER PRIMARY KEY NOT NULL,
	tipo_jornada VARCHAR(15) NOT NULL
);
```
### DETALLE PAGO
```
CREATE TABLE Detalle_pago(
	id_detalle_pago INTEGER PRIMARY KEY NOT NULL,
	frecuencia_pago VARCHAR(30) NOT NULL,
	dia_pago_mes INT NOT NULL,
	medio_pago VARCHAR(30) NOT NULL,
	entidad_financiera VARCHAR(30) NOT NULL,
	cuenta NUMERIC(14) NOT NULL
);
```
### ESTADO SOLICITUD
```
CREATE TABLE Estado_solicitud(
	id_estado_solicitud INTEGER PRIMARY KEY NOT NULL,
	descripcion VARCHAR(15) NOT NULL,
);
```
### TIPO SOLICITUD
```
CREATE TABLE Tipo_solicitud(
	id_tipo_solicitud INTEGER PRIMARY KEY NOT NULL,
	descripcion VARCHAR(50) NOT NULL,
);
```
### PLANILLA
```
CREATE TABLE Planilla
(
  id_planilla INTEGER NOT NULL,
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
### TIPO OPERACIÓN
```
create table tipo_operacion (
	id_tipo_operacion INTEGER not null,
	descripcion_operacion VARCHAR(20) not null,
	primary key (id_tipo_operacion)
);
```
### ESTADO CONCEPTO
```
create table estado_concepto (
	id_estado INTEGER not null,
	descripcion_estado VARCHAR(20) not null,
	primary key (id_estado)
);
```
### ESTADO CUENTA
```
CREATE TABLE Estado_cuenta(
	id_estado_cuenta INTEGER PRIMARY KEY NOT NULL,
	estado_cuenta VARCHAR(30) NOT NULL,
);
```
### CUENTA
```
CREATE TABLE Cuenta(
	id_cuenta INTEGER PRIMARY KEY NOT NULL,
	usuario VARCHAR(50) NOT NULL,
	contraseña VARCHAR(50) NOT NULL,
	id_estado_cuenta INTEGER NOT NULL,
	FOREIGN KEY (id_estado_cuenta) REFERENCES Estado_cuenta(id_estado_cuenta),
);
```
### EMPRESA
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
        id_cuenta INTEGER NOT NULL,<br>
	FOREIGN KEY (id_cuenta) REFERENCES Cuenta(id_cuenta)<br>
);
```
### CARGO
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
### ÁREA
```
CREATE TABLE Area(
    id_area INTEGER PRIMARY KEY NOT NULL,
    nombre_area VARCHAR(50) NOT NULL,
	descripcion_area TEXT NOT NULL,
    id_empresa INTEGER NOT NULL,
    FOREIGN KEY (id_empresa) REFERENCES Empresa(id_empresa)
);
```
### EMPLEADO
```
CREATE TABLE Empleado(
	id_empleado INTEGER PRIMARY KEY NOT NULL,
	nombres VARCHAR(20) NOT NULL,
	apellidos VARCHAR(50) NOT NULL,
	fecha_nacimiento DATE NOT NULL,
	edad INT NOT NULL,
	telefono NUMERIC(9) NOT NULL,
	email VARCHAR(50) NOT NULL,
	dni NUMERIC(8) NOT NULL,
	estado_civil VARCHAR(15) NOT NULL,
	sexo VARCHAR(10) NOT NULL,
	id_regimen_pensionario INTEGER NOT NULL,
	FOREIGN KEY (id_regimen_pensionario) REFERENCES Regimen_pensionario(id_regimen_pensionario),
	id_seguro_medico INTEGER NOT NULL,
	FOREIGN KEY (id_seguro_medico) REFERENCES Seguro_medico(id_seguro_medico),
	id_situacion_discapacidad INTEGER NOT NULL,
	FOREIGN KEY (id_situacion_discapacidad) REFERENCES Situacion_discapacidad(id_situacion_discapacidad),
	id_empresa INTEGER NOT NULL,
	FOREIGN KEY (id_empresa) REFERENCES Empresa(id_empresa)
	id_cuenta INTEGER NOT NULL,
	FOREIGN KEY (id_cuenta) REFERENCES Cuenta(id_cuenta)
);
```
### SOLICITUD
```
CREATE TABLE Solicitud(
	id_solicitud INTEGER PRIMARY KEY NOT NULL,
	detalles VARCHAR(100) NOT NULL,
	fec_solicitud DATE NOT NULL,
	hora_solicitud TIME WITHOUT TIME ZONE NOT NULL,
	monto NUMERIC(5,2),
	id_estado_solicitud INTEGER NOT NULL,
	FOREIGN KEY (id_estado_solicitud) REFERENCES Estado_solicitud(id_estado_solicitud),
	id_tipo_solicitud INTEGER NOT NULL,
	FOREIGN KEY (id_tipo_solicitud) REFERENCES Tipo_solicitud(id_tipo_solicitud),
	id_empleado INTEGER NOT NULL,
	FOREIGN KEY (id_empleado) REFERENCES Empleado( id_empleado),
	id_empresa INTEGER NOT NULL,
	FOREIGN KEY (id_empresa) REFERENCES Empresa(id_empresa)
);
```
### CONTRATO
```
CREATE TABLE Contrato(
	id_contrato INTEGER PRIMARY KEY NOT NULL,
	fecha_firma_contrato DATE NOT NULL,
	fecha_inicio_laboral DATE NOT NULL,
	fecha_termino_contrato DATE NOT NULL,
	sueldo_base FLOAT NOT NULL,
	liquido_teorico FLOAT NOT NULL,
	id_area INTEGER NOT NULL,
	FOREIGN KEY (id_area) REFERENCES Area(id_area),
	id_cargo INTEGER NOT NULL,
	FOREIGN KEY (id_cargo) REFERENCES Cargo(id_cargo),
	id_empleado INTEGER NOT NULL,
	FOREIGN KEY (id_empleado) REFERENCES Empleado(id_empleado),
	id_estado_contrato INTEGER NOT NULL,
	FOREIGN KEY (id_estado_contrato) REFERENCES Estado_contrato(id_estado_contrato),
	id_tipo_contrato INTEGER NOT NULL,
	FOREIGN KEY (id_tipo_contrato) REFERENCES Tipo_contrato(id_tipo_contrato),
	id_tipo_jornada INTEGER NOT NULL,
	FOREIGN KEY (id_tipo_jornada) REFERENCES Tipo_jornada(id_tipo_jornada),
	id_detalle_pago INTEGER NOT NULL,
	FOREIGN KEY (id_detalle_pago) REFERENCES Detalle_pago(id_detalle_pago)
);
```
### ASISTENCIA
```
CREATE TABLE Asistencia(
	id_asistencia INTEGER PRIMARY KEY,
	fecha_inicio DATE,
	fecha_final DATE,
	comentario VARCHAR(200),
	valor NUMERIC(100),
	id_contrato INTEGER,
	id_nomina INTEGER,
	id_boleta INTEGER,
	FOREIGN KEY (id_contrato) REFERENCES Contrato(id_contrato),
	FOREIGN KEY (id_nomina) REFERENCES Concepto_Nomina(id_nomina),
	FOREIGN KEY (id_boleta) REFERENCES Boleta(id_boleta)
);
```
### MOVIMIENTO PLANILLA
```
CREATE TABLE Movimiento_planilla(
	id_movimiento INTEGER PRIMARY KEY,
	fecha DATE,
	monto NUMERIC(10,2),
	id_contrato INTEGER,
	id_nomina INTEGER,
	FOREIGN KEY (id_contrato) REFERENCES Contrato(id_contrato),
	FOREIGN KEY (id_nomina) REFERENCES Concepto_Nomina(id_nomina)
);
```
### BOLETA
```
CREATE TABLE Boleta(
  id_boleta INTEGER NOT NULL,
  TotalDescuentos NUMERIC(9,2) NOT NULL,
  TotalNeto NUMERIC(9,2) NOT NULL,
  TotalIngresos NUMERIC(9,2) NOT NULL,
  TotalAportes numeric(9,2) NOT NULL,
  id_contrato INTEGER NOT NULL,
  id_planilla INTEGER NOT NULL,
  PRIMARY KEY (id_boleta),
  FOREIGN KEY (id_contrato) REFERENCES Contrato(id_contrato),
  FOREIGN KEY (id_planilla) REFERENCES Planilla(id_planilla)
);
```
### EMPRESA
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
### REPRESENTANTE LEGAL
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

### Régimen Pensionario
```
CREATE TABLE Regimen_pensionario(
	id_regimen_pensionario INTEGER PRIMARY KEY NOT NULL,
	tipo_regimen CHAR(3) NOT NULL,
);
```
### Seguro Médico
```
CREATE TABLE Seguro_medico(
	id_seguro_medico INTEGER PRIMARY KEY NOT NULL,<
	tipo_seguro VARCHAR(10) NOT NULL
);
```
### Situación de Discapacidad
```
CREATE TABLE Situacion_discapacidad(
	id_situacion_discapacidad INTEGER PRIMARY KEY NOT NULL,
	tipo_discapacidad VARCHAR(10) NOT NULL
);
```

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

### Estado de Contrato
```
CREATE TABLE Estado_contrato(
	id_estado_contrato INTEGER PRIMARY KEY NOT NULL,
	estado_contrato VARCHAR(10) NOT NULL 
);
```
### Tipo de Contrato
```
CREATE TABLE Tipo_contrato(
	id_tipo_contrato INTEGER PRIMARY KEY NOT NULL,
	tipo_contrato VARCHAR(15) NOT NULL
);
```

### Tipo de Jornada
```
CREATE TABLE Tipo_jornada(
	id_tipo_jornada INTEGER PRIMARY KEY NOT NULL,
	tipo_jornada VARCHAR(15) NOT NULL
);
```
### Detalle de Pago
```
CREATE TABLE Detalle_pago(
	id_detalle_pago INTEGER PRIMARY KEY NOT NULL,
	frecuencia_pago VARCHAR(30) NOT NULL,
  	dia_pago_mes INT NOT NULL,
	medio_pago VARCHAR(30) NOT NULL,
	entidad_financiera VARCHAR(30) NOT NULL,
	cuenta NUMERIC(14) NOT NULL
);
```
### Contrato
```
CREATE TABLE Contrato(
	id_contrato INTEGER PRIMARY KEY NOT NULL,
	fecha_firma_contrato DATE NOT NULL,
	fecha_inicio_laboral DATE NOT NULL,
	fecha_termino_contrato DATE NOT NULL,
	sueldo_base FLOAT NOT NULL,
	liquido_teorico FLOAT NOT NULL,
	id_area INTEGER NOT NULL,
	FOREIGN KEY  (id_area) REFERENCES Area(id_area),
	id_cargo INTEGER NOT NULL,
	FOREIGN KEY (id_cargo) REFERENCES Cargo(id_cargo),
	id_empleado INTEGER NOT NULL,
	FOREIGN KEY (id_empleado) REFERENCES Empleado(id_empleado),
	id_estado_contrato INTEGER NOT NULL,
	FOREIGN KEY (id_estado_contrato) REFERENCES Estado_contrato(id_estado_contrato),
	id_tipo_contrato INTEGER NOT NULL,
	FOREIGN KEY (id_tipo_contrato) REFERENCES Tipo_contrato(id_tipo_contrato),
	id_tipo_jornada INTEGER NOT NULL,
	FOREIGN KEY (id_tipo_jornada) REFERENCES Tipo_jornada(id_tipo_jornada),
	id_detalle_pago INTEGER NOT NULL,
	FOREIGN KEY (id_detalle_pago) REFERENCES Detalle_pago(id_detalle_pago)
);
```
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
  id_boleta NUMERIC(6) NOT NULL,
  total_descuentos NUMERIC(9,2) NOT NULL,
  total_neto NUMERIC(9,2) NOT NULL,
  total_ingresos NUMERIC(9,2) NOT NULL,
  total_aportes numeric(9,2) NOT NULL,
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
```
SELECT usuario, contraseña from Cuenta
WHERE usuario = <1> AND contraseña = <2>
```
### OLVIDAR CONTRASEÑA
```
SELECT nombres, apellidos, dni FROM Empleado WHERE nombres = <1> AND apellidos = <2> AND dni = < 3 >
```
### CAMBIAR CONTRASEÑA E INICIAR SESION
```
UPDATE Cuenta SET contraseña = <1> WHERE contraseña = < 3 > AND <1> = <2>;
SELECT usuario, contraseña from Cuenta
WHERE usuario = <1> AND contraseña = <2>
```
### REGISTRAR EMPLEADOS
```
CREATE SEQUENCE Empleado_seq(
	START WITH 12625
	INCREMENT 101
	MAXVALUE 63125
);
CREATE SEQUENCE Cuenta_seq(
	START WITH 23625
	INCREMENT 101
	MAXVALUE 89451
);


INSERT INTO Empleado (id_empleado,nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad,id_empresa,id_cuenta) VALUES (NEXTVAL('Empleado_seq'),<1>,<2>,<3>,<4>,<5>,<6>,<7>,,<9>,<10>,<11>,<12>,<13>,<14>,NEXTVAL('Cuenta_seq');
<11>:
SELECT tipo_regimen FROM Regimen_pensionario;
<12>:
SELECT tipo_seguro FROM Seguro_medico;
<13>:
SELECT tipo_discapacidad FROM Situacion_discapacidad;
<14>:
SELECT razon_social FROM Empresa;
```

### MOSTRAR USUARIOS VIGENTES
```
SELECT Empleado.dni,Empleado.nombre_empleado,Empleado.apellido_paterno,Empleado.apellid_materno, Contrato.fecha_inicio_contrato,Contrato.fecha_termino_contrato
FROM Empleado INNER JOIN Contrato 
ON Empleado.id_empleado=Contrato.id_empleado INNER JOIN Cuenta 
ON Contrato.id_contrato = Cuenta.id_contrato WHERE Cuenta.id_estado_cuenta=1;
```


### MOSTRAR USUARIOS DESVINCULADOS
```
SELECT Empleado.dni,Empleado.nombre_empleado,Empleado.apellido_paterno,Empleado.apellid_materno, Contrato.fecha_inicio_contrato,Contrato.fecha_termino_contrato
FROM Empleado INNER JOIN Contrato 
ON Empleado.id_empleado=Contrato.id_empleado INNER JOIN Cuenta 
ON Contrato.id_contrato = Cuenta.id_contrato WHERE Cuenta.id_estado_cuenta=2;

```

### PANTALLA SOLICITUDES (ADMINISTRADOR)
```
SELECT em.nombres, em.apellidos, so.fec_solicitud, ti.descripcion FROM Empleado em, Solicitud so, Tipo_solicitud ti, Estado_solicitud es
WHERE so.id_estado_solicitud = es.id_estado_solicitud AND em.id_empleado = so.id_empleado
AND ti.id_tipo_solicitud = so.id_tipo_solicitud
```
### BOTON DETALLES
```
SELECT so.id_solicitud, em.nombres, em.apellidos, em.dni, so.fec_solicitud, so.hora_solicitud, ti.descripcion, so.detalles, es.descripcion
FROM Empleado em, Solicitud so, Tipo_solicitud ti, Estado_solicitud es
WHERE so.id_estado_solicitud = es.id_estado_solicitud AND em.id_empleado = so.id_empleado
AND ti.id_tipo_solicitud = so.id_tipo_solicitud
```
### BOTON ESTADO
```
UPDATE Solicitud SET id_estado_solicitud = <1> WHERE id_estado_solicitud = 2 AND id_solicitud = <2>
```
### PANTALLA SOLICITUDES (EMPLEADOS)
```
SELECT so.id_solicitud, so.fec_solicitud, ti.descripcion, es.descripcion
FROM Solicitud so, Tipo_solicitud ti, Estado_solicitud es
WHERE ti.id_tipo_solicitud = so.id_tipo_solicitud AND es.id_estado_solicitud = so.id_estado_solicitud
AND id_empleado = <1>
```
### BOTON NUEVA SOLICITUD
```
CREATE SEQUENCE id_solicitud START WITH 1
INSERT INTO Solicitud VALUES (NEXTVAL(id_solicitud),2, <1>, <2>, date, time,<3>,<4>,<5>)
```
### PLANILLAS PRIMERA PAGINA
```
select id_planilla, fecha_inicio, periodicidad from planilla;
```
### DETALLE PLANILLA
```
SELECT * FROM Empleado em, contrato co, detallepago de, planilla pla, estado_contrato est WHERE em.id_contrato=co.id_contrato AND de.id_detalle=co.id_detalle
pla.periodicidad=de.frecuencia_pago AND pla.fecha_inicio>c.fecha_inicio and pla.fecha_fin<=c.fecha_fin
AND est.estado='Activo';
```
### CREAR PLANILLA
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
select e.nombres, e.apellido_materno, e.apellido_paterno, e.dni, b.total_neto, b.total_ingresos,
b.total_descuentos, b.total_aportes, tc.tipo_contrato,c.sueldo_base 
from planilla p, empleado e, contrato c, concepto_nomina cn, boleta b, movimiento_planilla mp,tipo_contrato tc
where b.id_boleta =<1> and c.id_tipo_contrato=tp.id_tipo_contrato and c.id_empleado=e.id_empleado and b.id_planilla=p.id_planilla; --ingresos, descuentos y aportes

select cn.nombre_nomina,mv.monto from movimiento_planilla mp, concepto nomina cn, boleta b, planilla p, contrato c
where b.id_boleta =<1> and p.fecha_inicio<mv.fecha and p.fecha_fin>=mv.fecha and b.id_planilla=p.id_planilla 
and c.id_contrato=b.id_contrato and c.id_contrato=mp.id_contrato; -- detalles de movimiento de planilla
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
### P2.1: Crear Nuevo Cargo
```
-- Mostrar la lista de cargos de una empresa en específica
SELECT
    ROW_NUMBER() OVER (ORDER BY c.id_cargo) AS "N°",
    c.nombre_cargo AS "Descripción",
    c.estado AS "Estado",
    a.nombre_area AS "Área"
FROM
    Cargo c
JOIN
    Empresa e ON c.id_empresa = e.id_empresa
JOIN
    Area a ON c.id_empresa = a.id_empresa
WHERE
    e.id_empresa = 1
```
### P2.2: Crear Nuevo Cargo
```
INSERT INTO Cargo (id_cargo, nombre_cargo, codigo_cargo, descripcion_cargo, requerimientos, estado, id_empresa)
VALUES (16, 'Jefe RRHH', 'jefe_rrhh', 'Gestor y controller del área de recursos humanos, considerando remuneraciones, selección y gestión por procesos', 'Técnico o Ingeniería a fin (DO, RRHH), Metódico', 'Activo', 1);

SELECT
    ROW_NUMBER() OVER (ORDER BY c.id_cargo) AS "N°",
    c.nombre_cargo AS "Descripción",
    c.estado AS "Estado",
    a.nombre_area AS "Área"
FROM
    Cargo c
JOIN
    Empresa e ON c.id_empresa = e.id_empresa
JOIN
    Area a ON c.id_empresa = a.id_empresa
WHERE
    e.id_empresa = 1
```

### P3.1: Crear Nueva Area
```
SELECT e.razon_social AS empresa, a.nombre_area AS area, COUNT(c.id_cargo) AS empleados
FROM Empresa e
INNER JOIN Area a ON e.id_empresa = a.id_empresa
LEFT JOIN Cargo c ON a.id_empresa = c.id_empresa
WHERE e.razon_social = 'Ferrer SpA'
GROUP BY e.razon_social, a.nombre_area;
```
### P3.2: Crear Nueva Area
```
INSERT INTO Area (id_area, nombre_area, descripcion_area, id_empresa)
VALUES 
(16, 'Investigación y Desarrollo', 'Área encargada de la investigación y creación de nuevos productos.', 9);
SELECT e.razon_social AS empresa, a.nombre_area AS area, COUNT(c.id_cargo) AS empleados
FROM Empresa e
INNER JOIN Area a ON e.id_empresa = a.id_empresa
LEFT JOIN Cargo c ON a.id_empresa = c.id_empresa
WHERE e.razon_social = 'Ferrer SpA'
GROUP BY e.razon_social, a.nombre_area;
```
### MOVIMIENTO DE PLANILLA
```
SELECT em.dni,em.nombre,em.apellidos,car.nombre,co.fecha_inicio,co.fecha_final FROM Contrato co,Empleado em,Cargo car 
WHERE em.id_empleado=co.id_empleado AND car.id_cargo=co.id_cargo AND <1> >=EXTRACT(YEAR FROM co.fecha_inicio) AND <2> <= EXTRACT(YEAR FROM co.fecha_final));

WHERE em.id_empleado=co.id_empleado AND car.id_cargo=co.id_cargo AND ((<2> >=EXTRACT(YEAR FROM co.fecha_inicio) AND <1> >= EXTRACT(MONTH FROM co.fecha_inicio)) OR (<2> <=EXTRACT(YEAR FROM co.fecha_final) EXTRACT(YEAR FROM co.fecha_final)));

SELECT em.dni,em.nombre,em.apellidos, FROM Empleado em WHERE em.id_empleado=<1>; --relativo al codigo del empleado

SELECT co.nombre,mo.valor FROM Empleado em,concepto_nominal co, Movimiento_planilla mo, tipo_operacion ti 
WHERE co.id_nomina=mo.id_nomina AND co.id_tipo_operacion=ti.id_tipo_operacion AND ti.id_tipo_operacion=1 AND em.id_empleado=<1>;

SELECT co.nombre,mo.valor FROM Empleado em,concepto_nominal co, Movimiento_planilla mo, tipo_operacion ti 
WHERE co.id_nomina=mo.id_nomina AND co.id_tipo_operacion=ti.id_tipo_operacion AND ti.id_tipo_operacion=2 AND em.id_empleado=<1>;

create sequence secuencia_mov start WITH 1;
INSERT INTO Movimiento_planilla VALUES (NEXTVAL(secuencia_mov),CURRENT_DATE,<1>,<2>,<3>,<4>);
INSERT INTO Movimiento_planilla VALUES (NEXTVAL(secuencia_mov),CURRENT_DATE,<1>,<2>,<3>,<4>);

UPDATE Movimiento_planilla mov SET mov.valor=<2> WHERE mov.id_mov=<1>;

DELETE FROM Movimiento_planilla mov WHERE mov.id_movimiento=<1>;
```
### REGISTRO DE ASISTENCIA
```
SELECT em.dni,em.nombre,em.apellidos,car.nombre,co.fecha_inicio,co.fecha_final FROM Contrato co,Empleado em,Cargo car 
WHERE em.id_empleado=co.id_empleado AND car.id_cargo=co.id_cargo AND em.dni = <1> AND ORDER BY em.dni;

SELECT em.dni,em.nombre,em.apellidos, FROM Empleado em WHERE em.id_empleado=<1>; --relativo al codigo del empleado

INSERT INTO Asistencia VALUES (<1>,<2>,<3>,<4>,<5>,<6>,<7>);

DELETE FROM Asistencia as WHERE as.id_asistencia=<1>;
```
# ASIGNACIÓN DE CÓDIGOS POR REQUERIMIENTOS Y PROTOTIPOS DE INTERFACES

## Codificación de Requerimientos

| Código | R001  |
|----------|----------|
|Nombre|Autenticación de Usuario|
|Objetivo|Validar el correo del usuario (empleado o administrador) para que de esta manera pueda acceder a su cuenta y poder hacer sus gestiones.|
|Descripción|El usuario ingresará su nombre de usuario y su contraseña el cual se verificará segun lo registrado en la base de datos del sistema de planillas.|

| Código | R002  |
|----------|----------|
|Nombre|Olvido de contraseña|
|Objetivo|Validar veracidad de usuario para cambiar la contraseña que el usuario ha olvidado.|
|Descripción|El usuario ingresará sus datos personales para asi poder validar la veracidad de su persona, para que así tenga la potestad de poder cambiarla.|

| Código | R003 |
|----------|----------|
|Nombre| Cambiar contraseña e iniciar sesión|
|Objetivo|Cambiar la contraseña que el usuario ha olvidado e iniciar sesión.|
|Descripción|Una vez verificado la veracidad del usuario, se le enviará un mensaje de texto a su celular registrado en la base de datos para que asi este pueda cambiar la contraseña anterior y poder iniciar sesión en su cuenta.|

| Código | R004  |
|----------|----------|
|Nombre| Ver solicitudes (Administrador) |
|Objetivo|Verficiar todas las solicitudes que el administrador tiene pendientes de aceptar o rechazar.|
|Descripción|Una vez que el administrador ingrese a la parte de solicitudes, este podrá visualizar todas las solicitudes que se han hecho hasta el momento, donde tendrá acceso a verfiicar los detalles de la solicitud y tendrá la potestad de aprobar o rechazar la solicitud.|



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
INSERT INTO Empleado (id_empleado,nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad,id_empresa,id_cuenta) VALUES
(1,'DANIEL','SIFUENTES GRADOS',TO_DATE('1993-05-11', 'YYYY-MM-DD'),30,964701287,'daniel.sifuentes@harlamsyo.pe',47756342,'Soltero','Masculino',2,1,1,1,1),
(2,'EDUARDO SAUL','ESCOBEDO VILLANUEVA',TO_DATE('1979-04-18', 'YYYY-MM-DD'),44,991961400,'',40157917,'Casado','Masculino',2,2,1,1,2),
(3,'JAPHET CHARLIE JESUS','TORRES HUARINGA',TO_DATE('1985-05-29', 'YYYY-MM-DD'),38,926270930,'',43044175,'Casado','Masculino',2,3,1,2,3),
(4,'JHON ERIK','CAMPO VELÁSQUEZ',TO_DATE('1991-04-13', 'YYYY-MM-DD'),32,931854954,'campovelas@gmail.com',47231764,'Soltero','Masculino',2,3,1,4,4),
(5,'KEVYN ANTHONY','PLASENCIA BLANCO',TO_DATE('1991-04-13', 'YYYY-MM-DD'),28,998400448,'kevpb95@gmail.com',75363683,'Soltero','Masculino',1,3,1,4,5),
(6,'FRANCISCO ROBERTO','GRADOS PAREDES',TO_DATE('1987-10-04', 'YYYY-MM-DD'),36,918099146,'gradosparadesfrank@gmail.com',44569138,'Casado','Masculino',1,3,1,4,6),
(7,'JORGE LUIS','HOLGUIN ALARCON',TO_DATE('2001-06-04', 'YYYY-MM-DD'),22,938197568,'jorholguinalarcon@gmail.com',72756436,'Soltero','Masculino',2,3,2,2,7),
(8,'RONALD HERBERT','PRUDENCIO ALIAGA',TO_DATE('1994-12-12', 'YYYY-MM-DD'),29,920852657,'ronaldhpa12@hotmail.com',72079266,'Casado','Masculino',2,3,1,2,8),
(9,'YESSICA ISABEL','FLORES VELARDE',TO_DATE('1990-11-17', 'YYYY-MM-DD'),33,989686976,'yessicflores@gmail.com',46698999,'Casado','Femenino',2,3,1,2,9),
(10,'OMAR ADRIAN','ANAYA AYALA',TO_DATE('1992-01-05', 'YYYY-MM-DD'),31,992423368,'anayaayala@gmail.com',46850431,'Casado','Masculino',2,3,1,2,10),
(11,'CLAUDIA JOSELIN','CAMONES ALEGRIA',TO_DATE('1983-06-22', 'YYYY-MM-DD'),40,993904334,'',42201690,'Viudo','Femenino',2,4,2,3,11),
(12,'GAYMO LUIS','PEREZ MUÑOZ',TO_DATE('1992-05-30', 'YYYY-MM-DD'),31,970897522,'',71902155,'Casado','Masculino',2,4,1,3,12),
(13,'JORGE OSWALDO','ARGUEDAS PUCUTAY',TO_DATE('1991-08-10', 'YYYY-MM-DD'),31,981378149,'larguedas1010@gmail.com',71395354,'Casado','Masculino',1,3,1,3,13),
(14,'JORGE LUIS','DIAZ LEYTON',TO_DATE('1982-09-17', 'YYYY-MM-DD'),41,997935493,'leyton17_14@hotmail.com',41473747,'Divorciado','Masculino',2,4,1,3,14),
(15,'KAREN EDITH','POMA CAMACHO DE SALAZAR',TO_DATE('1983-07-22', 'YYYY-MM-DD'),40,936131832,'karenpomakp30@gmail.com',42685693,'Divorciado','Femenino',1,3,1,3,15)
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
### Estado de Contrato 
```
INSERT INTO Estado_contrato (id_estado_contrato, estado_contrato) VALUES ('1', 'Vigente'),
('2', 'Finalizado'),
('3', 'Rescindido');
```
### Tipo de Contrato
```
INSERT INTO Tipo_contrato (id_tipo_contrato, tipo_contrato) VALUES ('1', 'Indefinido'),
('2', 'Plazo Definido'),
('3', 'Obra o Proyecto');
```
### Tipo de Jornada
```
INSERT INTO Tipo_jornada (id_tipo_jornada, tipo_jornada) VALUES ('1', 'Ordinaria'),
('2', 'Parcial'),
('3', 'Excenta');
```
### Detalle de Pago
```
INSERT INTO Detalle_pago (id_detalle_pago, frecuencia_pago, dia_pago_mes, medio_pago, entidad_financiera, cuenta) VALUES ('1','Mensual',00,'Efectivo','-',0),
('2','Mensual',00,'Cheque','',0),
('3','Mensual',00,'Transferencia Bancaria','',1234567890),
('4','Quincenal',00,'Efectivo','-',0),
('5','Quincenal',00,'Cheque','',0),
('6','Quincenal',00,'Transferencia Bancaria','',1234567890),
('7','Por obra o proyecto',00,'Efectivo','-',0),
('8','Quincenal',00,'Cheque','',0),
('9','Quincenal',00,'Transferencia Bancaria','',1234567890);
```
### Contrato
```
INSERT INTO Contrato (id_contrato,fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico,id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_detalle_pago) VALUES
(1,'2023-01-15','2023-02-01','2023-07-31',991.9614,991.96130080387,1,2,1,1,1,1,1),
(2,'2023-01-15','2023-02-01','2023-07-31',926.27093,926.270837372916,1,2,2,1,1,1,3),
(3,'2023-01-15','2023-02-01','2023-07-31',931.854954,931.854860814514,2,2,3,1,1,1,3),
(4,'2023-01-15','2023-02-01','2023-07-31',998.400448,998.400348159965,3,1,4,1,1,1,3),
(5,'2023-01-15','2023-02-01','2023-07-31',918.099146,918.099054190095,3,1,5,1,1,1,3),
(6,'2023-01-15','2023-02-01','2023-07-31',938.197568,938.197474180253,4,1,6,1,1,1,3),
(7,'2023-01-15','2023-02-01','2023-07-31',920.852657,920.852564914744,4,3,7,1,2,1,3),
(8,'2023-01-15','2023-02-01','2023-07-31',989.686976,925.836110771228,4,3,8,1,2,1,3),
(9,'2023-01-15','2023-02-01','2023-07-31',992.423368,992.423268757673,4,2,9,1,2,1,3),
(10,'2023-01-15','2023-02-01','2023-07-31',993.904334,993.904234609577,1,2,10,1,1,1,1),
(11,'2023-01-15','2023-02-01','2023-07-31',970.897522,970.897424910258,1,2,11,1,1,1,1),
(12,'2023-01-15','2023-02-01','2023-07-31',981.378149,981.378050862195,2,2,12,1,2,1,1),
(13,'2023-01-15','2023-02-01','2023-07-31',997.935493,997.935393206461,2,2,13,1,2,1,1),
(14,'2023-01-15','2023-02-01','2023-07-31',936.131832,905.933940374348,2,1,14,2,2,1,1),
(15,'2023-01-15','2023-02-01','2023-07-31',982.894578,982.894479710552,3,3,15,2,1,1,1);
```









### Solicitudes
```
INSERT INTO Solicitud VALUES(1,1,1,'Deseo ir a ver a mi abuela ya que se encuentra mal de salud, solo por 1 día','2010/05/14','14:45:14',null,1,1);
INSERT INTO Solicitud VALUES(2,1,4,'Solicito unas vacaciones en el mes siguiente','2011/06/18','02:24:41',null,2,1);
INSERT INTO Solicitud VALUES(3,3,3,'Deseo un aumento de 1000 dolares debido a mis ultimas horas extras del mes pasado','2011/08/12','16:21:24',1000,3,2);
INSERT INTO Solicitud VALUES(4,1,5,'Solicito cambiar mi apellido ya que está mal escrito','2012/08/20','18:47:47',null,4,4);
INSERT INTO Solicitud VALUES(5,1,1,'Solicito una licencia para asistir al matrimonio de mi hermana','2013/11/21','22:32:35',null,5,4);
INSERT INTO Solicitud VALUES(6,1,4,'Solicito unas vaciones por temas de salud mental','2014/02/14','12:23:41',null,6,4);
INSERT INTO Solicitud VALUES(7,3,1,'Solicito una licencia por motivos de asistir a un congreso en provincia','2015/04/13','10:50:50',null,7,2);
INSERT INTO Solicitud VALUES(8,1,2,'No se me ha pagado el mes pasado','2015/12/17','07:41:08',null,8,2);
INSERT INTO Solicitud VALUES(9,1,4,'Solicito vacaciones dentro de 2 meses','2015/12/10','08:14:17',null,9,2);
INSERT INTO Solicitud VALUES(10,1,3,'Debido a mis ultimos logro en la empresa, solicito un aumento de 2000 dolares','2016/05/18','04:45:10',2000,10,2);
INSERT INTO Solicitud VALUES(11,3,4,'Solicito vacaciones en el mes de febrero','2016,08/11','16:01:54',null,11,3);
INSERT INTO Solicitud VALUES(12,1,6,'Solicito un adelanto por motivos de pagar la renta de mi casa','2016/09/10','15:17:41',500,12,3);
INSERT INTO Solicitud VALUES(13,1,4,'Solicito vacaciones por motivos personales','2016/10/25','19:08:41',null,13,3);
INSERT INTO Solicitud VALUES(14,3,1,'Solicito una licencia para asistir al día del padre en la escuela de mi hija','2018/04/28','17:05:16',null,14,3);
INSERT INTO Solicitud VALUES(15,3,6,'Solicito un adelanto de 200 dolares para pagar la matricula de mi sobrino','2020/08/27','16:14:46',200,15,3);
INSERT INTO Solicitud VALUES(16,1,4,'Solicito vacaciones en el mes de noviembre','2020/10/14','18:53:31',null,12,3);
INSERT INTO Solicitud VALUES(17,1,2,'Solcito un cambio de área de trabajo','2021/05/10','11:47:15',null,10,2);
INSERT INTO Solicitud VALUES(18,3,3,'Debido a el aumento de la pensión alimenticia de mis hijos, solicito un aumento de 1200 dolares','2022/04/12','22:42:16',1200,4,4);
INSERT INTO Solicitud VALUES(19,1,2,'Solicito un cambio de jefe debido a que el mío me maltrata laboralmente','2023/05/14','01:41:52',null,14,3);
INSERT INTO Solicitud VALUES(20,1,6,'Solicito un adelante de 1600 dolares por motivos de pagar pensión alimenticia de mis hijos','2023/08/16','16:14:16',1600,2,1)
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
### Cuentas
```
INSERT INTO Cuenta VALUES(1,'DANIEL','47756342',1);
INSERT INTO Cuenta VALUES(2,'EDUARDO SAUL','40157917',1);
INSERT INTO Cuenta VALUES(3,'JAPHET CHARLIE JESUS','43044175',1);
INSERT INTO Cuenta VALUES(4,'JHON ERIK','47231764',1);
INSERT INTO Cuenta VALUES(5,'KEVYN ANTHONY','75363683',1);
INSERT INTO Cuenta VALUES(6,'FRANCISCO ROBERTO','44569138',1);
INSERT INTO Cuenta VALUES(7,'JORGE LUIS','72756436',1);
INSERT INTO Cuenta VALUES(8,'RONALD HERBERT','72079266',1);
INSERT INTO Cuenta VALUES(9,'YESSICA ISABEL','46698999',1);
INSERT INTO Cuenta VALUES(10,'OMAR ADRIAN','46850431',1);
INSERT INTO Cuenta VALUES(11,'CLAUDIA JOSELIN','42201690',1);
INSERT INTO Cuenta VALUES(12,'GAYMO LUIS','71902155',1);
INSERT INTO Cuenta VALUES(13,'JORGE OSWALDO','71395354',1);
INSERT INTO Cuenta VALUES(14,'JORGE LUIS','41473747',1);
INSERT INTO Cuenta VALUES(15,'KAREN EDITH','42685693',1);
```
### Estado de Cuenta
```
INSERT INTO Estado_cuenta VALUES (1, 'Vigente');
INSERT INTO Estado_cuenta VALUES (2, 'Desvinculado');
```
### Planilla
```
INSERT INTO planilla ("id_planilla", "periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES
	('195683', '11QI12023', '15', '2023-11-16', '2023-11-30', '2023-11-30', '45960.81', 'quincenal', '2023-11-16', '03:21:22:00'),
	('195682', '11QI22023', '15', '2023-11-01', '2023-11-15', '2023-11-15', '34694.15', 'quincenal', '2023-11-01', '08:24:14:00'),
	('195681', '11ME12023', '30', '2023-11-01', '2023-11-30', '2023-11-30', '31978.75', 'mensual', '2023-11-01', '18:40:02:00'),
	('195680', '10QI12023', '15', '2023-10-16', '2023-10-30', '2023-10-30', '36637.94', 'quincenal', '2023-10-16', '07:24:40:00'),
	('195679', '10QI22023', '15', '2023-10-01', '2023-10-15', '2023-10-15', '35494.47', 'quincenal', '2023-10-01', '04:15:43:00'),
	('195678', '10ME12023', '30', '2023-10-01', '2023-10-30', '2023-10-30', '35620.13', 'mensual', '2023-10-01', '22:31:18:00'),
	('195677', '09QI12023', '15', '2023-09-16', '2023-09-30', '2023-09-30', '38955.82', 'quincenal', '2023-09-16', '11:39:51:00'),
	('195676', '09QI22023', '15', '2023-09-01', '2023-09-15', '2023-09-15', '47768.4', 'quincenal', '2023-09-01', '11:15:59:00'),
	('195675', '09ME12023', '30', '2023-09-01', '2023-09-30', '2023-09-30', '49054.27', 'mensual', '2023-09-01', '07:29:43:00'),
	('195674', '08QI12023', '15', '2023-08-16', '2023-08-30', '2023-08-30', '38095.24', 'quincenal', '2023-08-16', '17:45:26:00'),
	('195673', '08QI22023', '15', '2023-08-01', '2023-08-15', '2023-08-15', '47359.42', 'quincenal', '2023-08-01', '15:28:28:00'),
	('195672', '08ME12023', '30', '2023-08-01', '2023-08-30', '2023-08-30', '42634.2', 'mensual', '2023-08-01', '19:25:35:00'),
	('195671', '07QI12023', '15', '2023-07-16', '2023-07-30', '2023-07-30', '49656.14', 'quincenal', '2023-07-16', '23:40:18:00'),
	('195670', '07QI22023', '15', '2023-07-01', '2023-07-15', '2023-07-15', '39402.02', 'quincenal', '2023-07-01', '19:33:00:00'),
	('195669', '07ME12023', '30', '2023-07-01', '2023-07-30', '2023-07-30', '34615.65', 'mensual', '2023-07-01', '14:15:23:00'),
	('195668', '06QI12023', '15', '2023-06-16', '2023-06-30', '2023-06-30', '45360.12', 'quincenal', '2023-06-16', '23:34:39:00'),
	('195667', '06QI22023', '15', '2023-06-01', '2023-06-15', '2023-06-15', '32546.03', 'quincenal', '2023-06-01', '01:44:42:00'),
	('195666', '06ME12023', '30', '2023-06-01', '2023-06-30', '2023-06-30', '46319.14', 'mensual', '2023-06-01', '19:02:11:00'),
	('195665', '05QI12023', '15', '2023-05-16', '2023-05-30', '2023-05-30', '40149.22', 'quincenal', '2023-05-16', '22:24:04:00'),
	('195664', '05QI22023', '15', '2023-05-01', '2023-05-15', '2023-05-15', '35696.75', 'quincenal', '2023-05-01', '04:27:35:00'),
	('195663', '05ME12023', '30', '2023-05-01', '2023-05-30', '2023-05-30', '46640.36', 'mensual', '2023-05-01', '09:41:59:00'),
	('195662', '04QI12023', '15', '2023-04-16', '2023-04-30', '2023-04-30', '34413.48', 'quincenal', '2023-04-16', '11:04:14:00'),
	('195661', '04QI22023', '15', '2023-04-01', '2023-04-15', '2023-04-15', '46689.83', 'quincenal', '2023-04-01', '20:04:34:00'),
	('195660', '04ME12023', '30', '2023-04-01', '2023-04-30', '2023-04-30', '31874.86', 'mensual', '2023-04-01', '08:10:03:00'),
	('195659', '03QI12023', '15', '2023-03-16', '2023-03-30', '2023-03-30', '35887.58', 'quincenal', '2023-03-16', '16:53:32:00'),
	('195658', '03QI22023', '15', '2023-03-01', '2023-03-15', '2023-03-15', '34426.44', 'quincenal', '2023-03-01', '18:08:32:00'),
	('195657', '03ME12023', '30', '2023-03-01', '2023-03-30', '2023-03-30', '45246.76', 'mensual', '2023-03-01', '15:20:48:00'),
	('195656', '02QI12023', '15', '2023-02-16', '2023-02-30', '2023-02-30', '36395.75', 'quincenal', '2023-02-16', '08:13:26:00'),
	('195655', '02QI22023', '15', '2023-02-01', '2023-02-15', '2023-02-15', '47574.82', 'quincenal', '2023-02-01', '22:36:46:00'),
	('195654', '02ME12023', '30', '2023-02-01', '2023-02-30', '2023-02-30', '49583.03', 'mensual', '2023-02-01', '07:15:03:00'),
	('195653', '01QI12023', '15', '2023-01-16', '2023-01-30', '2023-01-30', '41639.56', 'quincenal', '2023-01-16', '09:28:22:00'),
	('195652', '01QI22023', '15', '2023-01-01', '2023-01-15', '2023-01-15', '31966.45', 'quincenal', '2023-01-01', '15:29:18:00'),
	('195651', '01ME12023', '30', '2023-01-01', '2023-01-30', '2023-01-30', '48559.62', 'mensual', '2023-01-01', '20:39:00:00');
```

### Boleta
```
INSERT INTO boleta ("id_boleta", "total_descuentos", "total_neto", "total_ingresos", "total_aportes", "id_contrato", "id_planilla") VALUES
	('356', '98.94', '4084.85', '4183.79', '864.00', '1', '195681'),
	('357', '6.65', '3684.94', '3691.59', '867.00', '2', '195681'),
	('358', '119.71', '2956.4', '3076.11', '853.00', '3', '195681'),
	('359', '162.24', '3348.87', '3511.11', '828.00', '4', '195681'),
	('360', '147', '3653.5', '3800.5', '937.00', '5', '195681'),
	('361', '102.07', '4565.35', '4667.42', '749.00', '6', '195681'),
	('362', '94.61', '3051.2', '3145.81', '615.00', '7', '195681'),
	('363', '36.04', '4958.91', '4994.95', '840.00', '8', '195681'),
	('364', '26.43', '3654.91', '3681.34', '538.00', '9', '195681'),
	('365', '168.41', '2513.28', '2681.69', '725.00', '10', '195681'),
	('366', '50.38', '2630.47', '2680.85', '865.00', '11', '195681'),
	('367', '17.42', '2579.63', '2597.05', '692.00', '12', '195681'),
	('368', '38.32', '3341.53', '3379.85', '842.00', '13', '195681'),
	('369', '76', '1282.85', '1358.85', '802.00', '14', '195681'),
	('370', '160.94', '2662.18', '2823.12', '924.00', '15', '195681'),
	('371', '167.44', '1888', '2055.44', '552.00', '1', '195678'),
	('372', '98.58', '3322.36', '3420.94', '603.00', '2', '195678'),
	('373', '173.98', '2153.88', '2327.86', '978.00', '3', '195678'),
	('374', '104', '1401.64', '1505.64', '967.00', '4', '195678'),
	('375', '81.48', '4562.26', '4643.74', '558.00', '5', '195678'),
	('376', '9.34', '2521.02', '2530.36', '823.00', '6', '195678'),
	('377', '51.17', '3576.64', '3627.81', '954.00', '7', '195678'),
	('378', '25.74', '4655.53', '4681.27', '582.00', '8', '195678'),
	('379', '30.11', '4064.94', '4095.05', '603.00', '9', '195678'),
	('380', '119.19', '1745.96', '1865.15', '836.00', '10', '195678'),
	('381', '171.2', '3181.67', '3352.87', '595.00', '11', '195678'),
	('382', '56.48', '2154.79', '2211.27', '521.00', '12', '195678'),
	('383', '199.14', '4664.44', '4863.58', '511.00', '13', '195678'),
	('384', '149.26', '3456.54', '3605.8', '792.00', '14', '195678'),
	('385', '51.64', '3627.22', '3678.86', '545.00', '15', '195678'),
	('386', '192.75', '1297.91', '1490.66', '699.00', '1', '195675'),
	('387', '136.57', '4431.14', '4567.71', '889.00', '2', '195675'),
	('388', '149.11', '2161.58', '2310.69', '905.00', '3', '195675'),
	('389', '126.74', '4771.39', '4898.13', '991.00', '4', '195675'),
	('390', '90.44', '4744.67', '4835.11', '726.00', '5', '195675'),
	('391', '180.91', '1136.96', '1317.87', '697.00', '6', '195675'),
	('392', '119.43', '1321.53', '1440.96', '544.00', '7', '195675'),
	('393', '3.17', '4529.24', '4532.41', '810.00', '8', '195675'),
	('394', '153.53', '1741.09', '1894.62', '845.00', '9', '195675'),
	('395', '189.92', '2154.39', '2344.31', '616.00', '10', '195675'),
	('396', '172.86', '2180.97', '2353.83', '778.00', '11', '195675'),
	('397', '50.44', '2805.37', '2855.81', '592.00', '12', '195675'),
	('398', '173.94', '2709.14', '2883.08', '687.00', '13', '195675'),
	('399', '17.84', '1979.53', '1997.37', '928.00', '14', '195675'),
	('400', '157.12', '2865.48', '3022.6', '753.00', '15', '195675');
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
### movimiento_planilla
	INSERT INTO Movimiento_planilla VALUES (1,'18/06/2023',1000,1,1);
	INSERT INTO Movimiento_planilla VALUES (2,'18/06/2024',100,1,2);
	INSERT INTO Movimiento_planilla VALUES (3,'18/06/2025',50,1,3);
	INSERT INTO Movimiento_planilla VALUES (4,'18/06/2026',50,2,1);
	INSERT INTO Movimiento_planilla VALUES (5,'18/06/2027',50,2,4);
	INSERT INTO Movimiento_planilla VALUES (6,'18/06/2028',50,2,5);
	INSERT INTO Movimiento_planilla VALUES (7,'18/06/2029',50,1,7);
	INSERT INTO Movimiento_planilla VALUES (8,'18/06/2030',50,1,4);
	INSERT INTO Movimiento_planilla VALUES (9,'18/06/2031',50,3,1);
	INSERT INTO Movimiento_planilla VALUES (10,'18/06/2032',50,3,3);
	INSERT INTO Movimiento_planilla VALUES (11,'18/06/2033',50,3,4);
	INSERT INTO Movimiento_planilla VALUES (12,'18/06/2034',50,3,5);
	INSERT INTO Movimiento_planilla VALUES (13,'18/06/2035',50,2,2);
	INSERT INTO Movimiento_planilla VALUES (14,'18/06/2036',50,2,3);
	INSERT INTO Movimiento_planilla VALUES (15,'18/06/2037',50,4,5);
	INSERT INTO Movimiento_planilla VALUES (16,'18/06/2038',50,4,6);
	INSERT INTO Movimiento_planilla VALUES (17,'18/06/2039',50,5,1);
	INSERT INTO Movimiento_planilla VALUES (18,'18/06/2040',50,5,2);
	INSERT INTO Movimiento_planilla VALUES (19,'18/06/2041',50,6,3);
	INSERT INTO Movimiento_planilla VALUES (20,'18/06/2042',50,6,1);
###
INSERT INTO Movimiento_planilla VALUES (1,'18/06/2023',1000,1,15);
INSERT INTO Movimiento_planilla VALUES (2,'18/06/2024',200,1,5);
INSERT INTO Movimiento_planilla VALUES (3,'18/06/2025',300,1,6);
INSERT INTO Movimiento_planilla VALUES (4,'18/06/2026',500,2,15);
INSERT INTO Movimiento_planilla VALUES (5,'18/06/2027',300,2,5);
INSERT INTO Movimiento_planilla VALUES (6,'18/06/2028',400,2,6);
INSERT INTO Movimiento_planilla VALUES (7,'18/06/2029',102.5,1,8);
INSERT INTO Movimiento_planilla VALUES (8,'18/06/2030',100,1,13);
INSERT INTO Movimiento_planilla VALUES (9,'18/06/2031',250,3,5);
INSERT INTO Movimiento_planilla VALUES (10,'18/06/2032',350,3,6);
INSERT INTO Movimiento_planilla VALUES (11,'18/06/2033',500,3,15);
INSERT INTO Movimiento_planilla VALUES (12,'18/06/2034',1000,3,22);
INSERT INTO Movimiento_planilla VALUES (15,'18/06/2037',200,4,5);
INSERT INTO Movimiento_planilla VALUES (16,'18/06/2038',300,4,6);
INSERT INTO Movimiento_planilla VALUES (17,'18/06/2039',500,1,22);
INSERT INTO Movimiento_planilla VALUES (18,'18/06/2040',300,1,23);

INSERT INTO Asistencia VALUES (1,'18/06/2023','12/07/2023',24,'Lo que pasa es que',1,1);
INSERT INTO Asistencia VALUES (2,'18/06/2024','14/07/2024',26,'No cambia nada',1,2);
INSERT INTO Asistencia VALUES (3,'18/06/2025','12/07/2025',24,'Lo que pasa es que',1,3);
INSERT INTO Asistencia VALUES (4,'18/06/2026','12/07/2026',24,'No cambia nada',1,4);
INSERT INTO Asistencia VALUES (5,'18/06/2027','12/07/2027',24,'Lo que pasa es que',2,1);
INSERT INTO Asistencia VALUES (6,'18/06/2028','12/07/2028',24,'No cambia nada',2,2);
# FUNCIONALIDAD PRIMARIA ELEGIDA (POR MÓDULO)



#STACK TECNOLÓGICO ELEGIDO PARA SU APLICACIÓN







