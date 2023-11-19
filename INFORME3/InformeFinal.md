# MODELAMIENTO CONCEPTUAL

# MODELAMIENTO RELACIONAL 

# CREACION DE TABLAS
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
### ASIGNACIÓN FAMILIAR
```
CREATE TABLE Asignacion_familiar(
	id_asignacion_familiar INTEGER PRIMARY KEY NOT NULL,
	cant_menor_cargo INT NOT NULL
);
```
### EMPLEADO
```
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
	id_regimen_pensionario INTEGER NOT NULL,
	FOREIGN KEY (id_regimen_pensionario) REFERENCES Regimen_pensionario(id_regimen_pensionario),
	id_seguro_medico INTEGER NOT NULL,
	FOREIGN KEY (id_seguro_medico) REFERENCES Seguro_medico(id_seguro_medico),
	id_situacion_discapacidad INTEGER NOT NULL,
	FOREIGN KEY (id_situacion_discapacidad) REFERENCES Situacion_discapacidad(id_situacion_discapacidad),
	id_empresa INTEGER NOT NULL,
	FOREIGN KEY (id_empresa) REFERENCES Empresa(id_empresa),
	id_asignacion_familiar INTEGER NOT NULL,
	FOREIGN KEY (id_asignacion_familiar) REFERENCES Asignacion_familiar(id_asignacion_familiar)
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

### RÉGIMEN PENSIONARIO
```
CREATE TABLE Regimen_pensionario(
	id_regimen_pensionario INTEGER PRIMARY KEY NOT NULL,
	tipo_regimen CHAR(3) NOT NULL,
);
```
### SEGURO MÉDICO
```
CREATE TABLE Seguro_medico(
	id_seguro_medico INTEGER PRIMARY KEY NOT NULL,<
	tipo_seguro VARCHAR(10) NOT NULL
);
```
### SITUACIÓN DE DISCAPACIDAD
```
CREATE TABLE Situacion_discapacidad(
	id_situacion_discapacidad INTEGER PRIMARY KEY NOT NULL,
	tipo_discapacidad VARCHAR(10) NOT NULL
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

### ESTADO DE CONTRATO
```
CREATE TABLE Estado_contrato(
	id_estado_contrato INTEGER PRIMARY KEY NOT NULL,
	estado_contrato VARCHAR(10) NOT NULL 
);
```
### TIPO DE CONTRATO
```
CREATE TABLE Tipo_contrato(
	id_tipo_contrato INTEGER PRIMARY KEY NOT NULL,
	tipo_contrato VARCHAR(15) NOT NULL
);
```

### TIPO DE CONTRATO
```
CREATE TABLE Tipo_jornada(
	id_tipo_jornada INTEGER PRIMARY KEY NOT NULL,
	tipo_jornada VARCHAR(15) NOT NULL
);
```
### DETALLE DE PAGO
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
### PLANILLA
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
### BOLETA
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
### TIPO DE OPERACION
```
create table tipo_operacion 
(
	id_tipo_operacion VARCHAR(3) not null,
	descripcion_operacion VARCHAR(20) not null,
	primary key (id_tipo_operacion)
);
```

### ESTADO DE CONCEPTO
```
create table estado_concepto 
(
	id_estado VARCHAR(3) not null,
	descripcion_estado VARCHAR(20) not null,
	primary key (id_estado)
);
```
### CONCEPTO DE NOMINA
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
# ASIGNACIÓN DE CÓDIGOS POR REQUERIMIENTOS Y PROTOTIPOS DE INTERFACES
## Codificacion de Requerimientos

| Código | R001  |
|----------|----------|
|Nombre  |Autenticación de Usuario|
|Objetivo  |Verificar la identidad del usuario mediante un correo y una contraseña ingresada de manera correcta|
| Descripción   | El usuario ingresará su correo y contraseña respectiva para poder acceder al sistema de planillas; dicho sistema se encargará de verificar si los datos ingresados son correctos   |
| Actor primario    | Un administrador de RRHH o otro empleado de la empresa  |
| Actor secundario    | -  |
| Precondiciones    | Los datos que ingrese el usuario deben estar en la base de datos del sistema  |

| Código | R002  |
|----------|----------|
|Nombre  |Olvido de contraseña|
|Objetivo  |Validar veracidad de usuario para cambiar la contraseña que el usuario ha olvidado.|
| Descripción   | El usuario ingresará sus datos personales para asi poder validar la veracidad de su persona, para que así tenga la potestad de poder cambiarla.   |
| Actor primario    | Un administrador de RRHH u otro empleado de la empresa  |
| Actor secundario    | -  |
| Precondiciones    | Los datos que ingrese el usuario deben estar en la base de datos del sistema  |

| Código | R003 |
|----------|----------|
|Nombre  |Cambiar contraseña e iniciar sesión|
|Objetivo  |Cambiar la contraseña que el usuario ha olvidado e iniciar sesión.|
| Descripción   | Una vez verificado la veracidad del usuario, se le enviará un mensaje de texto a su celular registrado en la base de datos (el codigo será 1234) para que asi este pueda cambiar la contraseña anterior y poder iniciar sesión en su cuenta.  |
| Actor primario    | Un administrador de RRHH u otro empleado de la empresa  |
| Actor secundario    | -  |
| Precondiciones    | Los datos que ingrese el usuario deben estar en la base de datos del sistema  |

| Código | R004  |
|----------|----------|
|Nombre  |Ver solicitudes (Administrador)|
|Objetivo  |Verficiar todas las solicitudes que el administrador tiene pendientes de aceptar o rechazar.|
| Descripción   | Una vez que el administrador ingrese a la parte de solicitudes, este podrá visualizar todas las solicitudes que se han hecho hasta el momento, donde tendrá acceso a verfiicar los detalles de la solicitud y tendrá la potestad de aprobar o rechazar la solicitud.   |
| Actor primario    | Un administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | Esta vista solo la puede obtener alguien con un correo de administración  |

| Código | R005  |
|----------|----------|
|Nombre  |Detalle de Solicitud|
|Objetivo  |Verificar la sustentación de la solicitud hecha por los empleados.|
| Descripción   | El administrador y los empleados podrán ver los detalles de las solicitudes hechas para así, en el caso de los administradores, poder evaluarlas y darles una respuesta o, en el caso de los empleados, poder verificar los detalles de la solciitud.   |
| Actor primario    | Un administrador de RRHH u otro empleado |
| Actor secundario    | -  |
| Precondiciones    | Los datos que ingrese el usuario deben estar en la base de datos del sistema  |

| Código | R006  |
|----------|----------|
|Nombre  |Respuesta Solicitud|
|Objetivo  |Modificar el estado de una solciitud en espera a Aceptado o Rechazado.|
| Descripción   | Una vez pasada la solicitud por el jefe del empleado y este habiendo dado su respuesta, el administrador podrá cambiar el estado de la solicitud a Aceptado o Rechazado dependiendo de los criterios que tenga el jefe del empleado y el mismo administrador   |
| Actor primario    | Un administrador de RRHH  |
| Actor secundario    | Jefe del empleado solicitante |
| Precondiciones    | Debe haber una solicitud para poder dar respuesta |

| Código | R007  |
|----------|----------|
|Nombre  |Pantalla Solicitudes (Empleado) |
|Objetivo  |Verificar el registro de solicitudes hechas por el empleado.|
| Descripción   | El usuario podrá verificar el historial de sus solicitudes anteriores hechas con detalles y estado incluidos. |
| Actor primario    | Un empleado de la empresa  |
| Actor secundario    | -  |
| Precondiciones    | Para ver el historial, el empleado debe haber hecho obligatoriamente una solciitud anteriormente |

| Código | R008  |
|----------|----------|
|Nombre  |Nueva Solicitud|
|Objetivo  |Generar una nueva solcitud.|
| Descripción   | El usuario podrá generar una nueva solicitud en la cual dependiendo del tipo de solicitud le apareceran 2 diferentes pantallas, una con opción de ingresar un monto (Reclamo, Aumento, Adelanto) y otra sin esa opción (Licencia, Vacaciones, Configuración de Información).   |
| Actor primario    | Un empleado de la empresa  |
| Actor secundario    | -  |
| Precondiciones    | -  |

| Paso     | Acción   |
|----------|----------|
|1|El usuario ingresa al sistema de planillas|
|2|El usuario ingresa su respectivo correo y contraseña |
|3|El sistema verifica si el correo ingresado está en su base de datos |
|4|El sistema verifica si la contraseña ingresada está en su base de datos |
|5|El sistema verifica el tipo de usuario (administrador u empleado) |
|6|Caso terminado |


| Código | R009  |
|----------|----------|
|Nombre  |Crear empleado (usuario)|
|Objetivo  |Introducir los datos de un empleado con contrato vigente con la empresa, de manera que se cree un usuario para este.|
| Descripción   |A través de la subida de datos del empleado, se crea un usuario que le permitirá a este poder ver su sistema de planillas.|
| Actor primario    |Administrador|
| Actor secundario    |Empleados|
| Precondiciones    |El empleado debe tener un contrato firmado con la empresa.|


| Código | R010  |
|----------|----------|
|Nombre  |Ver usuarios vigentes o activos|
|Objetivo  |Visualizar los usuarios activos en el sistema de planillas.|
| Descripción   |El administrador podrá visualizar los usuarios cuyo estado es activo en el momento, es decir, los empleados que tienen contrato vigente con la empresa.|
| Actor primario    |Administrador|
| Actor secundario    |Empleados|
| Precondiciones    |El usuario tiene contrato vigente con la empresa.|


| Código | R011  |
|----------|----------|
|Nombre  |Ver usuarios desvinculados o inactivos|
|Objetivo  |Desvincular a un empleado activo o visualizar a los empleados desvinculados.|
| Descripción   |El administrador podrá desvincular usuarios activos, por término de contrato, además de poder visualizar los empleados desvinculados anteriormente.|
| Actor primario    |Administrador|
| Actor secundario    |Empleados|
| Precondiciones    |El empleado no tiene contrato vigente con la empresa.|


| Código | R012  |
|----------|----------|
|Nombre  |Ver usuarios vigentes o activos|
|Objetivo  ||
| Descripción   ||
| Actor primario    ||
| Actor secundario    ||
| Precondiciones    ||




## Codificación de prototipos de interfaz

### Código interfaz : I - 001
### Imagen interfaz:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/d7d6c0aa-c02f-4200-87cc-1d6e70440dea)

### Código interfaz : I - 002
### Imagen interfaz:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/4395cef4-7cd5-4763-9eae-496070e14a8b)

### Código interfaz : I - 003
### Imagen interfaz:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/55c797cf-4b38-4916-b329-e9324ca90ae9)

### Código interfaz : I - 004
### Imagen interfaz:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/06744cac-ddc3-4582-bbb7-4ce6d4e6ed6e)

### Código interfaz : I - 005
### Imagen interfaz:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/81ef464d-ee97-45ff-b727-ca5feda8a432)

### Código interfaz : I - 006
### Imagen interfaz:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/ff159860-6d4b-40f0-a78c-5097e51c67f3)

### Código interfaz : I - 007
### Imagen interfaz:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/7bf03a59-db93-4534-b5fb-f8785dbbf529)

### Código interfaz : I - 008
### Imagen interfaz:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/5b79c089-1e91-4107-b80f-e39e4c91b1b3)

### Código interfaz : I - 009
### Imagen interfaz:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/fddb795c-32ef-4ba5-8e68-a186cec548b2)

### Código interfaz : I - 001
### Imagen interfaz:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/1a4a3448-f46c-4251-8139-8eeef1f57d1d)

### Código interfaz : I - 002
### Imagen interfaz:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/f534d16e-2300-4c33-9915-7ebe273bca1a)

# SENTENCIA SQL POR CADA PROTOTIPO
## CASO 1
### Código Requerimiento : R - 001
### Codigo interfaz : I - 001
### Imagen interfaz : 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/e8412cf3-66de-4947-b0c4-d007af60f40f)
### Sentecias SQL:
### Eventos: 
* **Autenticación de Usuario:** Se verificará la autenticidad de la persona ingresante a su cuenta.
```
SELECT usuario, contraseña from Cuenta
WHERE usuario = <1> AND contraseña = <2>
```
Donde los valores del 1 al 2 se capturarán de la interfaz de inicio de sesión según se muestran en la imagen.

## CASO 2
### Código Requerimiento : R - 002
### Codigo interfaz : I - 002
### Imagen interfaz : 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/31d8b522-39de-4136-b0b7-3cddb2861812)
### Sentecias SQL:
### Eventos: 
* **Olvidar contraseña:** Se insertan datos en la interfaz para asi corroborar dichos datos con los datos registrados en la base de datos.
```
SELECT nombres, apellidos, dni FROM Empleado WHERE nombres = <1> AND apellidos = <2> AND dni = < 3 >
```
Donde los valores del 1 al 3 se capturarán de la interfaz de olvido de contraseña según se muestran en la imagen.

# CARGA DE DATOS

- ESTADO SOLICITUD
```
INSERT INTO ESTADO_SOLICITUD (id_est_solicitud, descripcion_solicitud)
VALUES (42579, 'EN ESPERA')
INSERT INTO ESTADO_SOLICITUD (id_est_solicitud, descripcion_solicitud)
VALUES (41258, 'ACEPTADO')
INSERT INTO ESTADO_SOLICITUD (id_est_solicitud, descripcion_solicitud)
VALUES (42546, 'DENEGADO')
INSERT INTO ESTADO_SOLICITUD (id_est_solicitud, descripcion_solicitud)
VALUES (42649, 'ACEPTADO')
```

# FUNCIONALIDAD PRIMARIA ELEGIDA (POR MODULO)
## MODULO : REGISTRO DE MOVIMIENTOS DE PLANILLA Y CONCEPTOS ASISTENCIA

| Actividad     | Descripcion        | 
|:-------------:|:---------------:|
| 1       | **R003**        | 
| 2    |    ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/0d4639f7-f270-4fb3-ace6-7f7a4a0e024f) | 

# STACL TECNOLÓGICO
## Frontend
Para la parte del Frontend se dispone de las herramientas de HTML, CSS, Javascript, además
utilizaremos framework de Angular y tailwind CSS.
### ANGULAR: 
Es un framework modular y escalable que se adapta a nuestras necesidades.  
La importancia de usar Angular radica en su capacidad para simplificar el desarrollo de
nuestra aplicación web sistema de matrícula. Nos proporciona un conjunto de herramientas y
bibliotecas integradas que facilitan la creación de componentes reutilizables, el manejo del
enrutamiento, la gestión de formularios y la comunicación con servidores, entre otros
aspectos. Los beneficios de usar este framework son:
- Modularidad: Angular promueve la creación de componentes independientes y
reutilizables, lo que facilita la mantenibilidad y escalabilidad de las aplicaciones.
- Productividad: Angular proporciona un conjunto de herramientas y características
que agilizan el proceso de desarrollo, como la generación automática de código, la
validación de formularios y las pruebas unitarias integradas.
- Rendimiento: Angular utiliza técnicas de optimización, como el cambio detector,
que minimiza la cantidad de actualizaciones innecesarias en la interfaz de usuario, lo
que mejora el rendimiento de las aplicaciones.
- Comunidad activa: Angular cuenta con una gran comunidad de desarrolladores, lo
que significa que hay abundante documentación, tutoriales y recursos disponibles para
ayudar en el aprendizaje y solución de problemas.
### Tailwind CSS: 
Es un framework de CSS que se enfoca en proporcionar clases utilitarias predefinidas para facilitar la construcción de interfaces de usuario. A diferencia de otros
frameworks CSS, Tailwind CSS no impone un estilo predeterminado, sino que ofrece una
gran cantidad de clases que se pueden combinar para diseñar y personalizar la apariencia de
un sitio web de manera rápida y eficiente.
Algunos beneficios de utilizar Tailwind CSS son:
- Flexibilidad: Tailwind CSS ofrece una gran variedad de clases utilitarias que
abarcan desde el espaciado y el tamaño de texto hasta los colores y los diseños
flexibles. Esto permite una gran flexibilidad en el diseño de la interfaz de usuario sin
la necesidad de escribir CSS personalizado.
- Productividad: Al utilizar clases predefinidas, los desarrolladores pueden construir
rápidamente interfaces de usuario sin tener que preocuparse por escribir estilos CSS
desde cero. Esto acelera el desarrollo y reduce el tiempo de codificación.
- Diseño consistente: Tailwind CSS promueve la consistencia en el diseño al
proporcionar una paleta de colores y clases predefinidas. Esto ayuda a mantener una
apariencia coherente en toda la aplicación.
- Personalización: Aunque Tailwind CSS ofrece muchas clases utilitarias, también
permite la personalización a través de la configuración de temas y la creación de
clases propias. Esto permite adaptar el framework a las necesidades específicas de
cada proyecto.
## Backend 
El lenguaje de programación Java es ampliamente utilizado en el desarrollo de software y
ofrece una serie de beneficios que lo hacen atractivo para los desarrolladores y las empresas.
A continuación, se presentan algunos de los principales beneficios de utilizar Java:
- Orientado a objetos: Java es un lenguaje de programación orientado a objetos, lo que
facilita el diseño y la organización de los programas. El enfoque orientado a objetos
permite crear código modular, reutilizable y fácilmente mantenible, lo que facilita el
desarrollo y la evolución del software a largo plazo.
- Seguridad: La seguridad es una preocupación importante en muchas aplicaciones,
especialmente en entornos empresariales y en Internet. Java cuenta con una serie de
características y mecanismos de seguridad integrados que protegen contra amenazas
como la ejecución de código malicioso y el acceso no autorizado a recursos del
sistema. Además, Java tiene una sólida comunidad de desarrolladores y una amplia
biblioteca estándar que proporciona herramientas para abordar la seguridad de manera
efectiva.
- Gran cantidad de bibliotecas y frameworks: Java cuenta con una amplia gama de
bibliotecas y frameworks que permiten a los desarrolladores acelerar el desarrollo de
aplicaciones. Estas bibliotecas cubren áreas como la interfaz de usuario, el acceso a
bases de datos, el procesamiento de datos, la seguridad y muchas más. Los
frameworks populares como Spring y Hibernate proporcionan una infraestructura
sólida y estructurada para el desarrollo de aplicaciones empresariales.
## Databases
### PostgreeSQL 
PostgreSQL es una base de datos muy versátil que se puede utilizar para una amplia gama de aplicaciones.   
Es una buena opción para aplicaciones web, aplicaciones empresariales, aplicaciones de análisis de datos y más.  
Los beneficios de usar PostgreSQL son muchos y variados. Algunos de los más importantes incluyen:
Fiabilidad: PostgreSQL es una base de datos muy fiable y estable. Ha demostrado su capacidad para manejar grandes volúmenes de datos y cargas de trabajo intensivas.  
Robustez de funciones: PostgreSQL tiene una amplia gama de características y funciones que lo hacen adecuado para una amplia gama de aplicaciones.  
Rendimiento: PostgreSQL es un sistema de gestión de bases de datos muy eficiente. Puede escalar para manejar grandes volúmenes de datos y cargas de trabajo intensivas.  
Seguridad: PostgreSQL es una base de datos segura. Soporta una amplia gama de funciones de seguridad que ayudan a proteger los datos.  
Coste: PostgreSQL es una base de datos de código abierto, lo que significa que es gratuita de usar y distribuir.  
## Diagrama de interracion de los componentes
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/a3f2988d-7664-427d-9cea-24418da0ea2d)

# Primera Version de sus aplicacion (BONUS)
