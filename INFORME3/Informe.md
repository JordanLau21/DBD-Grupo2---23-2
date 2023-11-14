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



CREATE TABLE Empleado(<br>
	id_empleado INTEGER PRIMARY KEY NOT NULL,<br>
	nombre VARCHAR(20) NOT NULL,<br>
	apellido_paterno VARCHAR(20) NOT NULL,<br>
	apellido_materno VARCHAR(20) NOT NULL,<br>
	fecha_nacimiento DATE NOT NULL,<br>
	edad INT NOT NULL,
	telefono NUMERIC(9) NOT NULL,
	email VARCHAR(50) NOT NULL,
	direccion VARCHAR(200) NOT NULL,
	dni NUMERIC(8) NOT NULL,
	id_estado_civil INTEGER NOT NULL,
	FOREIGN KEY (id_estado_civil) REFERENCES Estado_civil(id_estado_civil),
	id_sexo INTEGER NOT NULL,
	FOREIGN KEY (id_sexo) REFERENCES Sexo(id_sexo),
	id_regimen_pensionario INTEGER NOT NULL,
	FOREIGN KEY (id_regimen_pensionario) REFERENCES Regimen_pensionario(id_regimen_pensionario),
	id_seguro_medico INTEGER NOT NULL,
	FOREIGN KEY (id_seguro_medico) REFERENCES Seguro_medico(id_seguro_medico),
	id_situacion_discapacidad INTEGER NOT NULL,
	FOREIGN KEY (id_situacion_discapacidad) REFERENCES Situacion_discapacidad(id_situacion_discapacidad),
	id_empresa INTEGER NOT NULL,
	FOREIGN KEY (id_empresa) REFERENCES Empresa(id_empresa)
);





CREATE TABLE Usuario (
codUsuario CHAR(9) PRIMARY KEY NOT NULL,
contrasena VARCHAR(30) NOT NULL,
primerNombre VARCHAR(20) NOT NULL,
segundoNombre VARCHAR(20),
apellidoPaterno VARCHAR(20) NOT NULL,
apellidoMaterno VARCHAR(20) NOT NULL,
fechaNacimiento DATE NOT NULL,
correoUsuario VARCHAR(50) UNIQUE NOT NULL,
telefonoUsuario NUMERIC(9) UNIQUE NOT NULL
);

CREATE TABLE Estudiante (
codEstudiante CHAR(9) PRIMARY KEY NOT NULL,
especialidad CHAR(2) NOT NULL,
cicloRelativo NUMERIC(2) NOT NULL,
numeroCreditos NUMERIC(2) NOT NULL,
matriculaHabilitada CHAR(1) NOT NULL,
promedioPonderado NUMBER(5,2) NOT NULL,
matriculaHecha CHAR(1) NOT NULL,
codCondicionMatric CHAR(1) NOT NULL,
codTurno CHAR(5) NOT NULL,
FOREIGN KEY (codEstudiante) REFERENCES Usuario(codUsuario),
);

# Asignacion de codigos por requerimientos y Prototipos de interfaces de usuario

# Sentencias SQL por cada prototipo
## 1.
Codigo Requerimiento: R-001
Codigo interfaz: I-001
Imagen Inferzas

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

