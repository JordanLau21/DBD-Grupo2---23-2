```
CREATE TABLE Regimen_pensionario(
	id_regimen_pensionario INTEGER PRIMARY KEY NOT NULL,
	tipo_regimen CHAR(3) NOT NULL
);

CREATE TABLE Seguro_medico(
	id_seguro_medico INTEGER PRIMARY KEY NOT NULL,
	tipo_seguro VARCHAR(10) NOT NULL
);

CREATE TABLE Situacion_discapacidad(
	id_situacion_discapacidad INTEGER PRIMARY KEY NOT NULL,
	tipo_discapacidad VARCHAR(10) NOT NULL
);

CREATE TABLE Empleado(
	id_empleado INTEGER PRIMARY KEY NOT NULL,
	nombre VARCHAR(20) NOT NULL,
	apellidos VARCHAR(50) NOT NULL,
	fecha_nacimiento DATE NOT NULL,
	edad INT NOT NULL,
	telefono NUMERIC(9) NOT NULL,
	email VARCHAR(50) NOT NULL,
	dni NUMERIC(8) NOT NULL,
	estado_civil VARCHAR(15) NOT NULL,
	sexo VARCHAR(10) NOT NULL,
	cantidad_menores_cargo INT NOT NULL,
	id_regimen_pensionario INTEGER NOT NULL,
	FOREIGN KEY (id_regimen_pensionario) REFERENCES Regimen_pensionario(id_regimen_pensionario),
	id_seguro_medico INTEGER NOT NULL,
	FOREIGN KEY (id_seguro_medico) REFERENCES Seguro_medico(id_seguro_medico),
	id_situacion_discapacidad INTEGER NOT NULL,
	FOREIGN KEY (id_situacion_discapacidad) REFERENCES Situacion_discapacidad(id_situacion_discapacidad),
	id_empresa INTEGER NOT NULL,
	FOREIGN KEY (id_empresa) REFERENCES Empresa(id_empresa),
	id_cuenta INTEGER NOT NULL,
	FOREIGN KEY (id_cuenta) REFERENCES Cuenta(id_cuenta)
);

CREATE TABLE Estado_contrato(
	id_estado_contrato INTEGER PRIMARY KEY NOT NULL,
	estado_contrato VARCHAR(10) NOT NULL
);

CREATE TABLE Tipo_contrato(
	id_tipo_contrato INTEGER PRIMARY KEY NOT NULL,
	tipo_contrato VARCHAR(15) NOT NULL
);

CREATE TABLE Tipo_jornada(
	id_tipo_jornada INTEGER PRIMARY KEY NOT NULL,
	tipo_jornada VARCHAR(15) NOT NULL
);

CREATE TABLE Frecuencia_pago(
	id_frecuencia_pago INTEGER PRIMARY KEY NOT NULL,
	frecuencia_pago VARCHAR(50) NOT NULL
);

CREATE TABLE Medio_pago(
	id_medio_pago INTEGER PRIMARY KEY NOT NULL,
	medio_pago VARCHAR(50) NOT NULL,
	entidad_financiera VARCHAR(50),
	cuenta NUMERIC
);


CREATE TABLE Estado_solicitud(
	id_estado_solicitud INTEGER PRIMARY KEY NOT NULL,
	descripcion VARCHAR(15) NOT NULL
);

CREATE TABLE Tipo_solicitud(
	id_tipo_solicitud INTEGER PRIMARY KEY NOT NULL,
	descripcion VARCHAR(50) NOT NULL
);

CREATE TABLE Planilla(
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

create table tipo_operacion (
	id_tipo_operacion INTEGER not null,
	descripcion_operacion VARCHAR(20) not null,
	primary key (id_tipo_operacion)
);

create table estado_concepto (
	id_estado INTEGER not null,
	descripcion_estado VARCHAR(20) not null,
	primary key (id_estado)
);

CREATE TABLE Estado_cuenta(
	id_estado_cuenta INTEGER PRIMARY KEY NOT NULL,
	estado_cuenta VARCHAR(30) NOT NULL
);

CREATE TABLE concepto_nomina(
  id_nomina INTEGER NOT NULL,
  nombre_nomina VARCHAR(50) NOT NULL,
  valor_nomina numeric(10,2) NOT NULL,
  id_tipo_operacion INTEGER NOT NULL,
  id_estado INTEGER NOT NULL,
  PRIMARY KEY (id_nomina),
  FOREIGN KEY (id_tipo_operacion) REFERENCES tipo_operacion(id_tipo_operacion),
  FOREIGN KEY (id_estado) REFERENCES estado_concepto(id_estado)
);

CREATE TABLE Cuenta(
	id_cuenta INTEGER PRIMARY KEY NOT NULL,
	usuario VARCHAR(50) NOT NULL,
	contraseña VARCHAR(50) NOT NULL,
	id_estado_cuenta INTEGER NOT NULL,
	FOREIGN KEY (id_estado_cuenta) REFERENCES Estado_cuenta(id_estado_cuenta)
);

CREATE TABLE Empresa(
	id_empresa INTEGER PRIMARY KEY NOT NULL,
	ruc VARCHAR(20) NOT NULL,
	regimen VARCHAR(25) NOT NULL,
	estado VARCHAR(20) NOT NULL,
	razon_social VARCHAR(50) NOT NULL,
	direccion VARCHAR(200) NOT NULL,
	giro VARCHAR(50) NOT NULL,
	ciudad VARCHAR(25) NOT NULL,
	logo VARCHAR(200) NOT NULL,
    id_cuenta INTEGER NOT NULL,
	FOREIGN KEY (id_cuenta) REFERENCES Cuenta(id_cuenta)
);

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

CREATE TABLE Area(
    id_area INTEGER PRIMARY KEY NOT NULL,
    nombre_area VARCHAR(50) NOT NULL,
	descripcion_area TEXT NOT NULL,
    id_empresa INTEGER NOT NULL,
    FOREIGN KEY (id_empresa) REFERENCES Empresa(id_empresa)
);

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
	FOREIGN KEY (id_nomina) REFERENCES concepto_Nomina(id_nomina)
);

CREATE TABLE Movimiento_planilla(
	id_movimiento INTEGER PRIMARY KEY,
	fecha DATE,
	monto NUMERIC(10,2),
	id_contrato INTEGER,
	id_nomina INTEGER,
	FOREIGN KEY (id_contrato) REFERENCES Contrato(id_contrato),
	FOREIGN KEY (id_nomina) REFERENCES Concepto_Nomina(id_nomina)
);

CREATE TABLE Boleta(
  id_boleta INTEGER NOT NULL,
  TotalNeto NUMERIC(9,2) NOT NULL,
  TotalIngresos NUMERIC(9,2) NOT NULL,
  TotalDescuentos NUMERIC(9,2) NOT NULL,
  TotalAportes numeric(9,2) NOT NULL,
  id_contrato INTEGER NOT NULL,
  id_planilla INTEGER NOT NULL,
  PRIMARY KEY (id_boleta),
  FOREIGN KEY (id_contrato) REFERENCES Contrato(id_contrato),
  FOREIGN KEY (id_planilla) REFERENCES Planilla(id_planilla)
);
/*
/INSERCION DE DATOS/
*/
INSERT INTO Regimen_pensionario (id_regimen_pensionario, tipo_regimen) VALUES
('1', 'ONP'),
('2', 'AFP');

INSERT INTO Seguro_medico (id_seguro_medico, tipo_seguro) VALUES
('1', 'EPS'),
('2', 'SIS'),
('3', 'EsSalud'),
('4', 'Privado');

INSERT INTO Situacion_discapacidad (id_situacion_discapacidad, tipo_discapacidad) VALUES ('1', 'Ninguna'),
('2', 'Parcial'),
('3', 'Total');

INSERT INTO Estado_contrato (id_estado_contrato, estado_contrato) VALUES ('1', 'Vigente'),
('2', 'Finalizado'),
('3', 'Rescindido');

INSERT INTO Tipo_contrato (id_tipo_contrato, tipo_contrato) VALUES ('1', 'Indefinido'),
('2', 'Plazo Definido'),
('3', 'Obra o Proyecto');

INSERT INTO Tipo_jornada (id_tipo_jornada, tipo_jornada) VALUES ('1', 'Ordinaria'),
('2', 'Parcial'),
('3', 'Excenta');

INSERT INTO Detalle_pago (id_detalle_pago, frecuencia_pago, dia_pago_mes, medio_pago, entidad_financiera, cuenta) VALUES ('1','Mensual',00,'Efectivo','-',0),
('2','Mensual',00,'Cheque','',0),
('3','Mensual',00,'Transferencia Bancaria','',1234567890),
('4','Quincenal',00,'Efectivo','-',0),
('5','Quincenal',00,'Cheque','',0),
('6','Quincenal',00,'Transferencia Bancaria','',1234567890),
('7','Por obra o proyecto',00,'Efectivo','-',0),
('8','Quincenal',00,'Cheque','',0),
('9','Quincenal',00,'Transferencia Bancaria','',1234567890);

INSERT INTO Estado_solicitud VALUES (1, 'Aceptado');
INSERT INTO Estado_solicitud VALUES (2, 'En Espera');
INSERT INTO Estado_solicitud VALUES (3, 'Rechazado');

INSERT INTO Tipo_solicitud VALUES (1,'Licencia');
INSERT INTO Tipo_solicitud VALUES (2,'Reclamo');
INSERT INTO Tipo_solicitud VALUES (3,'Aumento');
INSERT INTO Tipo_solicitud VALUES (4,'Vacaciones');
INSERT INTO Tipo_solicitud VALUES (5,'Configuración de Información');
INSERT INTO Tipo_solicitud VALUES (6,'Adelanto');

INSERT INTO Estado_cuenta VALUES (1, 'Vigente');
INSERT INTO Estado_cuenta VALUES (2, 'Desvinculado');

insert into tipo_operacion (id_tipo_operacion,descripcion_operacion) 
values (1,'Ingreso'), (2,'Descuento'), (3,'Aportes'), (4,'Neutro');

insert into estado_concepto (id_estado,descripcion_estado) 
values (1,'Activo'), (2,'Inactivo');

INSERT INTO concepto_nomina ("id_nomina", "nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") 
VALUES
	('1', 'Dias Subsidiados Laborados', '0', '4', '1'),
	('2', 'Dias Vacaciones', '0', '4', '1'),
	('3', 'Dias No Laborados', '0', '4', '1'),
	('4', 'Horas ordinarias', '0', '4', '1'),
	('5', 'Horas Extras 25%', '0', '4', '1'),
	('6', 'Horas Extras 35%', '0', '4', '1'),
	('7', 'Sueldo Básico a pagar', '0', '1', '1'),
	('8', 'Asig.Familiar', '0.10', '1', '1'),
	('9', 'Pago Horas Extras 25%', '0.25', '1', '1'),
	('10', 'Pago Horas Extras 35%', '0.25', '1', '1'),
	('11', 'Vacaciones', '0', '1', '1'),
	('12', 'OTROS INGRESOS', '0', '1', '1'),
	('13', 'DSCTOS. INASISTENCIA', '0', '2', '1'),
	('14', 'GratifIcacion', '0', '1', '1'),
	('15', 'Bono Extraord. Essalud', '0', '3', '1'),
	('16', 'Total Gratif. Diciembre', '0', '1', '1'),
	('17', 'ONP 13%', '0.13', '3', '1'),
	('18', 'AFP Obligatorio 10%', '0', '3', '1'),
	('19', 'AFP Comisión', '0', '3', '1'),
	('20', 'AFP Seguro', '0', '3', '1'),
	('21', 'Renta 5ta.', '0', '2', '1'),
	('22', 'Adelanto', '0', '1', '1'),
	('23', 'OTROS DESCUENTOS', '0', '2', '1'),
	('24', 'REINTEGRO', '0', '1', '1'),
	('25', 'Essalud 9%', '0.09', '3', '1')
	('26', 'Sueldo minimo', '1025', '4', '1');
	
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
INSERT INTO Cuenta VALUES(16,'Empresa A S.A.','42685693',1);
INSERT INTO Cuenta VALUES(17,'Empresa B SAC','42685693',1);
INSERT INTO Cuenta VALUES(18,'Empresa C EIRL','42685693',1);
INSERT INTO Cuenta VALUES(19,'Empresa D SRL','42685693',1);
INSERT INTO Cuenta VALUES(20,'Empresa E SAC','42685693',1);
INSERT INTO Cuenta VALUES(21,'Empresa F SAC','42685693',1);
INSERT INTO Cuenta VALUES(22,'Empresa G SAC','42685693',1);
INSERT INTO Cuenta VALUES(23, 'Empresa H SRL','42685693',1);
INSERT INTO Cuenta VALUES(24,'Empresa I EIRL','42685693',1);
INSERT INTO Cuenta VALUES(25,'Empresa J SAC','42685693',1);
INSERT INTO Cuenta VALUES(26,'Empresa K SRL','42685693',1);
INSERT INTO Cuenta VALUES(27,'Empresa L SAC','42685693',1);
INSERT INTO Cuenta VALUES(28,'Empresa M SAC','42685693',1);
INSERT INTO Cuenta VALUES(29,'Empresa N SRL','42685693',1);
INSERT INTO Cuenta VALUES(30, 'Empresa O SAC','42685693',1);

INSERT INTO planilla ("id_planilla", "periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES
	('195683', '11QI12023', '15', '2023-11-16', '2023-11-30', '2023-11-30', '45960.81', 'Quincenal', '2023-11-16', '03:21:22'),
	('195682', '11QI22023', '15', '2023-11-01', '2023-11-15', '2023-11-15', '34694.15', 'Quincenal', '2023-11-01', '08:24:14'),
	('195681', '11ME12023', '30', '2023-11-01', '2023-11-30', '2023-11-30', '31978.75', 'Mensual', '2023-11-01', '18:40:02'),
	('195680', '10QI12023', '15', '2023-10-16', '2023-10-30', '2023-10-30', '36637.94', 'Quincenal', '2023-10-16', '07:24:40'),
	('195679', '10QI22023', '15', '2023-10-01', '2023-10-15', '2023-10-15', '35494.47', 'Quincenal', '2023-10-01', '04:15:43'),
	('195678', '10ME12023', '30', '2023-10-01', '2023-10-30', '2023-10-30', '35620.13', 'Mensual', '2023-10-01', '22:31:18'),
	('195677', '09QI12023', '15', '2023-09-16', '2023-09-30', '2023-09-30', '38955.82', 'Quincenal', '2023-09-16', '11:39:51'),
	('195676', '09QI22023', '15', '2023-09-01', '2023-09-15', '2023-09-15', '47768.4', 'Quincenal', '2023-09-01', '11:15:59'),
	('195675', '09ME12023', '30', '2023-09-01', '2023-09-30', '2023-09-30', '49054.27', 'Mensual', '2023-09-01', '07:29:43'),
	('195674', '08QI12023', '15', '2023-08-16', '2023-08-30', '2023-08-30', '38095.24', 'Quincenal', '2023-08-16', '17:45:26'),
	('195673', '08QI22023', '15', '2023-08-01', '2023-08-15', '2023-08-15', '47359.42', 'Quincenal', '2023-08-01', '15:28:28'),
	('195672', '08ME12023', '30', '2023-08-01', '2023-08-30', '2023-08-30', '42634.2', 'Mensual', '2023-08-01', '19:25:35'),
	('195671', '07QI12023', '15', '2023-07-16', '2023-07-30', '2023-07-30', '49656.14', 'Quincenal', '2023-07-16', '23:40:18'),
	('195670', '07QI22023', '15', '2023-07-01', '2023-07-15', '2023-07-15', '39402.02', 'Quincenal', '2023-07-01', '19:33:00'),
	('195669', '07ME12023', '30', '2023-07-01', '2023-07-30', '2023-07-30', '34615.65', 'Qensual', '2023-07-01', '14:15:23'),
	('195668', '06QI12023', '15', '2023-06-16', '2023-06-30', '2023-06-30', '45360.12', 'Quincenal', '2023-06-16', '23:34:39'),
	('195667', '06QI22023', '15', '2023-06-01', '2023-06-15', '2023-06-15', '32546.03', 'Quincenal', '2023-06-01', '01:44:42'),
	('195666', '06ME12023', '30', '2023-06-01', '2023-06-30', '2023-06-30', '46319.14', 'Mensual', '2023-06-01', '19:02:11'),
	('195665', '05QI12023', '15', '2023-05-16', '2023-05-30', '2023-05-30', '40149.22', 'Quincenal', '2023-05-16', '22:24:04'),
	('195664', '05QI22023', '15', '2023-05-01', '2023-05-15', '2023-05-15', '35696.75', 'Quincenal', '2023-05-01', '04:27:35'),
	('195663', '05ME12023', '30', '2023-05-01', '2023-05-30', '2023-05-30', '46640.36', 'Mensual', '2023-05-01', '09:41:59'),
	('195662', '04QI12023', '15', '2023-04-16', '2023-04-30', '2023-04-30', '34413.48', 'Quincenal', '2023-04-16', '11:04:14'),
	('195661', '04QI22023', '15', '2023-04-01', '2023-04-15', '2023-04-15', '46689.83', 'Quincenal', '2023-04-01', '20:04:34'),
	('195660', '04ME12023', '30', '2023-04-01', '2023-04-30', '2023-04-30', '31874.86', 'Mensual', '2023-04-01', '08:10:03'),
	('195659', '03QI12023', '15', '2023-03-16', '2023-03-30', '2023-03-30', '35887.58', 'Quincenal', '2023-03-16', '16:53:32'),
	('195658', '03QI22023', '15', '2023-03-01', '2023-03-15', '2023-03-15', '34426.44', 'Quincenal', '2023-03-01', '18:08:32'),
	('195657', '03ME12023', '30', '2023-03-01', '2023-03-30', '2023-03-30', '45246.76', 'Mensual', '2023-03-01', '15:20:48'),
	('195656', '02QI12023', '15', '2023-02-16', '2023-02-28', '2023-02-28', '36395.75', 'Quincenal', '2023-02-16', '08:13:26'),
	('195655', '02QI22023', '15', '2023-02-01', '2023-02-15', '2023-02-15', '47574.82', 'Quincenal', '2023-02-01', '22:36:46'),
	('195654', '02ME12023', '30', '2023-02-01', '2023-02-15', '2023-02-15', '49583.03', 'Mensual', '2023-02-01', '07:15:03'),
	('195653', '01QI12023', '15', '2023-01-16', '2023-01-30', '2023-01-30', '41639.56', 'Quincenal', '2023-01-16', '09:28:22'),
	('195652', '01QI22023', '15', '2023-01-01', '2023-01-15', '2023-01-15', '31966.45', 'Quincenal', '2023-01-01', '15:29:18'),
	('195651', '01ME12023', '30', '2023-01-01', '2023-01-30', '2023-01-30', '48559.62', 'Mensual', '2023-01-01', '20:39:00');

INSERT INTO Empresa (id_empresa, ruc, regimen, estado, razon_social, direccion, giro, ciudad, logo,id_cuenta)
VALUES 
(1, '20123456789', 'Régimen General', 'Activa', 'Empresa A S.A.', 'Av. Principal 123', 'Tecnología', 'Lima', 'https://empresa-a.com/logo.png',16),
(2, '20567890123', 'Régimen Especial', 'Inactiva', 'Empresa B SAC', 'Calle Secundaria 456', 'Servicios', 'Arequipa', 'https://empresa-b.com/logo.png',17),
(3, '20987654321', 'Régimen Simplificado', 'Activa', 'Empresa C EIRL', 'Jr. Importante 789', 'Manufactura', 'Trujillo', 'https://empresa-c.com/logo.png',18),
(4, '20345678901', 'Régimen General', 'Activa', 'Empresa D SRL', 'Av. Central 456', 'Comercial', 'Piura', 'https://empresa-d.com/logo.png',19),
(5, '20678901234', 'Régimen Especial', 'Inactiva', 'Empresa E SAC', 'Calle Innovación 789', 'Consultoría', 'Cusco', 'https://empresa-e.com/logo.png',20),
(6, '20234567890', 'Régimen Simplificado', 'Activa', 'Empresa F SAC', 'Av. Progreso 567', 'Desarrollo', 'Iquitos', 'https://empresa-f.com/logo.png',21),
(7, '20198765432', 'Régimen General', 'Activa', 'Empresa G SAC', 'Jr. Modelo 234', 'Ventas', 'Chiclayo', 'https://empresa-g.com/logo.png',22),
(8, '20901234567', 'Régimen Especial', 'Inactiva', 'Empresa H SRL', 'Av. Demo 789', 'Servicios Financieros', 'Tacna', 'https://empresa-h.com/logo.png',23),
(9, '20678901234', 'Régimen Simplificado', 'Activa', 'Empresa I EIRL', 'Calle Prueba 890', 'Consultoría', 'Huancayo', 'https://empresa-i.com/logo.png',24),
(10, '20345678901', 'Régimen General', 'Activa', 'Empresa J SAC', 'Av. Ejemplo 567', 'Desarrollo Web', 'Pucallpa', 'https://empresa-j.com/logo.png',25),
(11, '20901234567', 'Régimen Especial', 'Inactiva', 'Empresa K SRL', 'Jr. ABC 123', 'Servicios', 'Ayacucho', 'https://empresa-k.com/logo.png',26),
(12, '20567890123', 'Régimen Simplificado', 'Activa', 'Empresa L SAC', 'Av. Innovadora 890', 'Tecnología', 'Puno', 'https://empresa-l.com/logo.png',27),
(13, '20123456789', 'Régimen General', 'Activa', 'Empresa M SAC', 'Calle Software 456', 'Desarrollo de Software', 'Tarapoto', 'https://empresa-m.com/logo.png',28),
(14, '20987654321', 'Régimen Especial', 'Inactiva', 'Empresa N SRL', 'Av. Avanzada 123', 'Consultoría', 'Ica', 'https://empresa-n.com/logo.png',29),
(15, '20234567890', 'Régimen Simplificado', 'Activa', 'Empresa O SAC', 'Jr. XYZ 789', 'Innovación', 'Chimbote', 'https://empresa-o.com/logo.png',30);

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

INSERT INTO Empleado (id_empleado,nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo,cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad,id_empresa,id_cuenta)
VALUES 
(1,'DANIEL','SIFUENTES GRADOS','1993/05/11',30,964701287,'daniel.sifuentes@harlamsyo.pe',47756342,'Soltero','Masculino',0,2,1,1,1,1),
(2,'EDUARDO SAUL','ESCOBEDO VILLANUEVA','1979/04/18',44,991961400,'',40157917,'Casado','Masculino',1,2,2,1,1,2),
(3,'JAPHET CHARLIE JESUS','TORRES HUARINGA','1985/05/29',38,926270930,'',43044175,'Casado','Masculino',1,2,3,1,2,3),
(4,'JHON ERIK','CAMPO VELÁSQUEZ','1991/04/13',32,931854954,'campovelas@gmail.com',47231764,'Soltero','Masculino',0,2,3,1,4,4),
(5,'KEVYN ANTHONY','PLASENCIA BLANCO','1991/04/13',28,998400448,'kevpb95@gmail.com',75363683,'Soltero','Masculino',0,1,3,1,4,5),
(6,'FRANCISCO ROBERTO','GRADOS PAREDES','1987/10/04',36,918099146,'gradosparadesfrank@gmail.com',44569138,'Casado','Masculino',2,1,3,1,4,6),
(7,'JORGE LUIS','HOLGUIN ALARCON','2001/06/04',22,938197568,'jorholguinalarcon@gmail.com',72756436,'Soltero','Masculino',0,2,3,2,2,7),
(8,'RONALD HERBERT','PRUDENCIO ALIAGA','1994/12/12',29,920852657,'ronaldhpa12@hotmail.com',72079266,'Casado','Masculino',1,2,3,1,2,8),
(9,'YESSICA ISABEL','FLORES VELARDE','1990/11/17',33,989686976,'yessicflores@gmail.com',46698999,'Casado','Femenino',0,2,3,1,2,9),
(10,'OMAR ADRIAN','ANAYA AYALA','1992/01/05',31,992423368,'anayaayala@gmail.com',46850431,'Casado','Masculino',1,2,3,1,2,10),
(11,'CLAUDIA JOSELIN','CAMONES ALEGRIA','1983/06/22',40,993904334,'',42201690,'Viudo','Femenino',2,2,4,2,3,11),
(12,'GAYMO LUIS','PEREZ MUÑOZ','1992-05-30',31,970897522,'',71902155,'Casado','Masculino',1,2,4,1,3,12),
(13,'JORGE OSWALDO','ARGUEDAS PUCUTAY','1991/08/10',31,981378149,'larguedas1010@gmail.com',71395354,'Casado','Masculino',1,1,3,1,3,13),
(14,'JORGE LUIS','DIAZ LEYTON','1982/09/17',41,997935493,'leyton17_14@hotmail.com',41473747,'Divorciado','Masculino',1,2,4,1,3,14),
(15,'KAREN EDITH','POMA CAMACHO DE SALAZAR','1983/07/22',40,936131832,'karenpomakp30@gmail.com',42685693,'Divorciado','Femenino',1,1,3,1,3,15);

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

INSERT INTO Solicitud VALUES(1, 'Deseo ir a ver a mi abuela ya que se encuentra mal de salud, solo por 1 día', '2010/05/14', '14:45:14', NULL, 1, 1, 1, 1);
INSERT INTO Solicitud VALUES(2, 'Solicito unas vacaciones en el mes siguiente', '2011/06/18', '02:24:41', NULL, 1, 4, 2, 1);
INSERT INTO Solicitud VALUES(3, 'Deseo un aumento de 100 dolares debido a mis ultimas horas extras del mes pasado', '2011/08/12', '16:21:24', 100, 3, 3, 3, 2);
INSERT INTO Solicitud VALUES(4, 'Solicito cambiar mi apellido ya que está mal escrito', '2012/08/20', '18:47:47', NULL, 1, 5, 4, 4);
INSERT INTO Solicitud VALUES(5, 'Solicito una licencia para asistir al matrimonio de mi hermana', '2013/11/21', '22:32:35', NULL, 1, 1, 5, 4);
INSERT INTO Solicitud VALUES(6, 'Solicito unas vaciones por temas de salud mental', '2014/02/14', '12:23:41', NULL, 1, 4, 6, 4);
INSERT INTO Solicitud VALUES(7, 'Solicito una licencia por motivos de asistir a un congreso en provincia', '2015/04/13', '10:50:50', NULL, 3, 1, 7, 2);
INSERT INTO Solicitud VALUES(8, 'No se me ha pagado el mes pasado', '2015/12/17', '07:41:08', NULL, 1, 2, 8, 2);
INSERT INTO Solicitud VALUES(9, 'Solicito vacaciones dentro de 2 meses', '2015/12/10', '08:14:17', NULL, 1, 4, 9, 2);
INSERT INTO Solicitud VALUES(10, 'Debido a mis ultimos logro en la empresa, solicito un aumento de 200 dolares', '2016/05/18', '04:45:10', 200, 1, 3, 10, 2);
INSERT INTO Solicitud VALUES(11, 'Solicito vacaciones en el mes de febrero', '2016/08/11', '16:01:54', NULL, 3, 4, 11, 3);
INSERT INTO Solicitud VALUES(12, 'Solicito un adelanto por motivos de pagar la renta de mi casa', '2016/09/10', '15:17:41', 500, 1, 6, 12, 3);
INSERT INTO Solicitud VALUES(13, 'Solicito vacaciones por motivos personales', '2016/10/25', '19:08:41', NULL, 1, 4, 13, 3);
INSERT INTO Solicitud VALUES(14, 'Solicito una licencia para asistir al día del padre en la escuela de mi hija', '2018/04/28', '17:05:16', NULL, 3, 1, 14, 3);
INSERT INTO Solicitud VALUES(15, 'Solicito un adelanto de 200 dolares para pagar la matricula de mi sobrino', '2020/08/27', '16:14:46', 200, 3, 6, 15, 3);
INSERT INTO Solicitud VALUES(16, 'Solicito vacaciones en el mes de noviembre', '2020/10/14', '18:53:31', NULL, 1, 4, 6, 3);
INSERT INTO Solicitud VALUES(17, 'Solcito un cambio de área de trabajo', '2021/05/10', '11:47:15', NULL, 1, 2, 13, 2);
INSERT INTO Solicitud VALUES(18, 'Debido a el aumento de la pensión alimenticia de mis hijos, solicito un aumento de 200 dolares', '2022/04/12', '22:42:16', 200, 3, 3, 11, 4);
INSERT INTO Solicitud VALUES(19, 'Solicito un cambio de jefe debido a que el mío me maltrata laboralmente', '2023/05/14', '01:41:52', NULL, 1, 2, 14, 3);
INSERT INTO Solicitud VALUES(20, 'Solicito un adelante de 600 dolares por motivos de pagar pensión alimenticia de mis hijos', '2023/08/16', '16:14:16', 600, 1, 6, 2, 1);


INSERT INTO Contrato (id_contrato,fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico,id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) 
VALUES 
(1,'15-01-2020','01-02-2020','31-12-2023',991.9614,991.96130080387,1,2,1,1,1,1,1,3),
(2,'18-02-2021','01-03-2021','31-12-2023',926.27093,926.270837372916,1,2,2,1,1,1,1,3),
(3,'20-01-2020','01-02-2020','31-12-2023',931.854954,931.854860814514,2,2,3,1,1,1,1,3),
(4,'01-01-2022','15-01-2022','15-06-2024',998.400448,998.400348159965,3,1,4,1,1,1,2,3),
(5,'11-03-2022','15-03-2022','31-11-2023',918.099146,918.099054190095,3,1,5,1,1,1,2,1),
(6,'05-05-2020','15-05-2020','15-01-2024',938.197568,938.197474180253,4,1,6,1,1,1,1,1),
(7,'25-08-2021','01-09-2021','31-12-2023',920.852657,920.852564914744,4,3,7,1,2,1,1,3),
(8,'30-06-2021','01-07-2021','31-12-2023',989.686976,925.836110771228,4,3,8,1,2,1,1,3),
(9,'10-04-2022','15-04-2022','15-12-2023',992.423368,992.423268757673,4,2,9,1,2,1,1,3),
(10,'11-03-2023','15-03-2023','15-03-2024',993.904334,993.904234609577,1,2,10,1,1,1,1,3),
(11,'14-07-2022','01-08-2022','15-07-2024',970.897522,970.897424910258,1,2,11,1,1,1,1,3),
(12,'18-10-2021','01-11-2021','15-10-2024',981.378149,981.378050862195,2,2,12,1,2,1,1,2),
(13,'20-11-2021','01-12-2021','31-11-2024',997.935493,997.935393206461,2,2,13,1,2,1,1,3),
(14,'08-11-2022','15-11-2022','15-08-2023',936.131832,905.933940374348,2,1,14,2,2,1,1,1),
(15,'04-12-2022','15-12-2022','31-08-2023',982.894578,982.894479710552,3,3,15,2,1,1,2,3);

INSERT INTO Boleta ("id_boleta", "totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES
('356', '4084.85', '4183.79', '98.94', '864.00', '1', '195681'),
('357', '3684.94', '3691.59', '6.65', '867.00', '2', '195681'),
('358', '2956.4', '3076.11', '119.71', '853.00', '3', '195681'),
('359', '3348.87', '3511.11', '162.24', '828.00', '4', '195681'),
('360', '3653.5', '3800.5', '147', '937.00', '5', '195681'),
('361', '4565.35', '4667.42', '102.07', '749.00', '6', '195681'),
('362', '3051.2', '3145.81', '94.61', '615.00', '7', '195681'),
('363', '4958.91', '4994.95', '36.04', '840.00', '8', '195681'),
('364', '3654.91', '3681.34', '26.43', '538.00', '9', '195681'),
('365', '2513.28', '2681.69', '168.41', '725.00', '10', '195681'),
('366', '2630.47', '2680.85', '50.38', '865.00', '11', '195681'),
('367', '2579.63', '2597.05', '17.42', '692.00', '12', '195681'),
('368', '3341.53', '3379.85', '38.32', '842.00', '13', '195681'),
('369', '1282.85', '1358.85', '76', '802.00', '14', '195681'),
('370', '2662.18', '2823.12', '160.94', '924.00', '15', '195681'),
('371', '1888', '2055.44', '167.44', '552.00', '1', '195678'),
('372', '3322.36', '3420.94', '98.58', '603.00', '2', '195678'),
('373', '2153.88', '2327.86', '173.98', '978.00', '3', '195678'),
('374', '1401.64', '1505.64', '104', '967.00', '4', '195678'),
('375', '4562.26', '4643.74', '81.48', '558.00', '5', '195678'),
('376', '2521.02', '2530.36', '9.34', '823.00', '6', '195678'),
('377', '3576.64', '3627.81', '51.17', '954.00', '7', '195678'),
('378', '4655.53', '4681.27', '25.74', '582.00', '8', '195678'),
('379', '4064.94', '4095.05', '30.11', '603.00', '9', '195678'),
('380', '1745.96', '1865.15', '119.19', '836.00', '10', '195678'),
('381', '3181.67', '3352.87', '171.2', '595.00', '11', '195678'),
('382', '2154.79', '2211.27', '56.48', '521.00', '12', '195678'),
('383', '4664.44', '4863.58', '199.14', '511.00', '13', '195678'),
('384', '3456.54', '3605.8', '149.26', '792.00', '14', '195678'),
('385', '3627.22', '3678.86', '51.64', '545.00', '15', '195678'),
('386', '1297.91', '1490.66', '192.75', '699.00', '1', '195675'),
('387', '4431.14', '4567.71', '136.57', '889.00', '2', '195675'),
('388', '2161.58', '2310.69', '149.11', '905.00', '3', '195675'),
('389', '4771.39', '4898.13', '126.74', '991.00', '4', '195675'),
('390', '4744.67', '4835.11', '90.44', '726.00', '5', '195675'),
('391', '1136.96', '1317.87', '180.91', '697.00', '6', '195675'),
('392', '1321.53', '1440.96', '119.43', '544.00', '7', '195675'),
('393', '4529.24', '4532.41', '3.17', '810.00', '8', '195675'),
('394', '1741.09', '1894.62', '153.53', '845.00', '9', '195675'),
('395', '2154.39', '2344.31', '189.92', '616.00', '10', '195675'),
('396', '2180.97', '2353.83', '172.86', '778.00', '11', '195675'),
('397', '2805.37', '2855.81', '50.44', '592.00', '12', '195675'),
('398', '2709.14', '2883.08', '173.94', '687.00', '13', '195675'),
('399', '1979.53', '1997.37', '17.84', '928.00', '14', '195675'),
('400', '2865.48', '3022.6', '157.12', '753.00', '15', '195675')


```
