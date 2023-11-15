# MODELAMIENTO CONCEPTUAL

# MODELAMIENTO RELACIONAL 

# CREACION DE TABLAS
CREATE TABLE Empresa(

);

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

CREATE TABLE Area(

);

CREATE TABLE Cargo(

);

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

# CONSULTAS O QUERYS

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

Lookup Tables (Luis):
INSERT INTO Regimen_pensionario (id_regimen_pensionario, tipo_regimen, administradora) VALUES 
('1', 'ONP','Estado');
INSERT INTO Regimen_pensionario (id_regimen_pensionario, tipo_regimen, administradora) VALUES 
('2', 'AFP','');
--Seguro medico
INSERT INTO Seguro_medico (id_seguro_medico, tipo_seguro) VALUES ('1', 'EPS');
INSERT INTO Seguro_medico (id_seguro_medico, tipo_seguro) VALUES ('2', 'SIS');
INSERT INTO Seguro_medico (id_seguro_medico, tipo_seguro) VALUES ('3', 'EsSalud');
INSERT INTO Seguro_medico (id_seguro_medico, tipo_seguro) VALUES ('4', 'Privado');
--Situacion de discapacidad
INSERT INTO Situacion_discapacidad (id_situacion_discapacidad, tipo_discapacidad) VALUES
('1', 'Ninguna');
INSERT INTO Situacion_discapacidad (id_situacion_discapacidad, tipo_discapacidad) VALUES
('2', 'Parcial');
INSERT INTO Situacion_discapacidad (id_situacion_discapacidad, tipo_discapacidad) VALUES
('3', 'Total');





# FUNCIONALIDAD PRIMARIA ELEGIDA (POR MÓDULO)



#STACK TECNOLÓGICO ELEGIDO PARA SU APLICACIÓN







