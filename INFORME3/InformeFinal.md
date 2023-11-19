# MODELAMIENTO CONCEPTUAL

# MODELAMIENTO RELACIONAL 
![image (3)](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/5d57cebf-c501-4cef-8590-e74b2b579b6d)
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
```
### ESTADO CONTRATO
```
CREATE TABLE Estado_contrato(
	id_estado_contrato INTEGER PRIMARY KEY NOT NULL,
	estado_contrato VARCHAR(20) NOT NULL
);
```
### TIPO CONTRATO
```
CREATE TABLE Tipo_contrato(
	id_tipo_contrato INTEGER PRIMARY KEY NOT NULL,
	tipo_contrato VARCHAR(30) NOT NULL
);
```
### TIPO DE JORNADA
```
CREATE TABLE Tipo_jornada(
	id_tipo_jornada INTEGER PRIMARY KEY NOT NULL,
	tipo_jornada VARCHAR(20) NOT NULL
);
```
### FRECUENCIA DE PAGO
```
CREATE TABLE Frecuencia_pago(
	id_frecuencia_pago INTEGER PRIMARY KEY NOT NULL,
	frecuencia_pago VARCHAR(50) NOT NULL
);
```
### MEDIO DE PAGO
```
CREATE TABLE Medio_pago(
	id_medio_pago INTEGER PRIMARY KEY NOT NULL,
	medio_pago VARCHAR(50) NOT NULL,
	entidad_financiera VARCHAR(50),
	cuenta NUMERIC
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
### Modulo Autenticacion de usuario
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
### Modulo Solicitudes
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
### Modulo Empleados
| Código | R009  |
|----------|----------|
|Nombre  |Registrar Empleado en Sistema|
|Objetivo  |Introducir los datos de un empleado con contrato vigente con la empresa al sistema de planillas.|
| Descripción   |A través de la subida de datos del empleado, este podrá visualizar sus planillas.|
| Actor primario    |Administrador|
| Actor secundario    |Empleado|
| Precondiciones    |El empleado debe tener un contrato firmado y vigente con la empresa.|


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
|Nombre  |Ver datos de empleados vigentes o actuales de la empresa.|
|Objetivo  |Visualizar los datos de un empleado, su contrato y la forma de pago que recibe.|
| Descripción   |Se podrá ver los datos que se ingresaron del empleado en el momento de su registro en el sistema.|
| Actor primario    |Administrador|
| Actor secundario    |Empleado|
| Precondiciones    |El empleado debe estar ligado a la empresa a través de la firma de un contrato.|


| Código | R012  |
|----------|----------|
|Nombre  |Ver usuarios desvinculados o inactivos|
|Objetivo  |Desvincular a un empleado activo o visualizar a los empleados desvinculados.|
| Descripción   |El administrador podrá desvincular usuarios activos, por término de contrato, además de poder visualizar los empleados desvinculados anteriormente.|
| Actor primario    |Administrador|
| Actor secundario    |Empleados|
| Precondiciones    |El empleado no tiene contrato vigente con la empresa.|


| Código | R013  |
|----------|----------|
|Nombre  |Ver datos de exempleados de la empresa.|
|Objetivo  |Visualizar los datos de un exempleado, el contrato y la forma de pago que recibió.|
| Descripción   |Se podrá ver los datos que se ingresaron del exempleado cuando estaba registrado en el sistema.|
| Actor primario    |Administrador|
| Actor secundario    |Empleado|
| Precondiciones    |El empleado debe haber estado a la empresa a través de la firma de un contrato.|

### Modulo Registro de Movimientos y Asistencias
| Código | R012  |
|----------|----------|
|Nombre  |Registrar movimiento de planilla|
|Objetivo  |Registrar los movimientos que modifiquen el pago habitual de los empleados|
| Descripción   |El administrador podrá registrar los movimientos que influyan en el pago de los empleados, como por ejemplo: horas extras, descuentos por cafetería, bonificación extraordinaria, minutos de tardanza, etc, por periodo de planilla|
| Actor primario    |Un administrador de RRHH|
| Actor secundario    |-|
| Precondiciones    |Informe de los movimientos de ingresos y descuentos por parte de la empresa|

| Código | R012  |
|----------|----------|
|Nombre  |Registrar licencias, inasistencias y vacaciones|
|Objetivo  |Registrar las licencias, inasistencias y vacaciones a partir del periodo de planilla activo|
| Descripción   |Se podrán registrar inasistencias, licencias y otros conceptos mas de cada empleado dentro de su periodo de planilla activo.|
| Actor primario    |Administrador de RRHH|
| Actor secundario    |-|
| Precondiciones    |Informe de las licencias, inasistencias y vacaciones del empleado|


## Codificación de prototipos de interfaz
### Modulo de Autenticacion usuario

| Código Interfaz | I001  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/d7d6c0aa-c02f-4200-87cc-1d6e70440dea)|

| Código Interfaz | I002  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/4395cef4-7cd5-4763-9eae-496070e14a8b)|

| Código Interfaz | I003  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/55c797cf-4b38-4916-b329-e9324ca90ae9)|

| Código Interfaz | I004  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/cedbba2c-b6e4-4d28-b269-7b2a81b25f96)|

| Código Interfaz | I005  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/81ef464d-ee97-45ff-b727-ca5feda8a432)|

| Código Interfaz | I006 |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/ff159860-6d4b-40f0-a78c-5097e51c67f3)|

| Código Interfaz | I007  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/7bf03a59-db93-4534-b5fb-f8785dbbf529)|

| Código Interfaz | I008  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/5b79c089-1e91-4107-b80f-e39e4c91b1b3)|

| Código Interfaz | I009  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/fddb795c-32ef-4ba5-8e68-a186cec548b2)|

### Módulo Empleados
| Código Interfaz | I010  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/luisfhs712/DBD_LUIS__PERS_23-1/blob/main/Frame%2047.png)|

| Código Interfaz | I011  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/luisfhs712/DBD_LUIS__PERS_23-1/blob/main/Frame%2048.png)|

| Código Interfaz | I012  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/luisfhs712/DBD_LUIS__PERS_23-1/blob/main/vigentes.png)|

| Código Interfaz | I013  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/luisfhs712/DBD_LUIS__PERS_23-1/blob/main/Datos%20Empleado.png)|

| Código Interfaz | I014  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/luisfhs712/DBD_LUIS__PERS_23-1/blob/main/Datos%20Contrato.png)|


| Código Interfaz | I015  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/luisfhs712/DBD_LUIS__PERS_23-1/blob/main/Datos%20Pago.png)|


| Código Interfaz | I016  |
|----------|----------|
|Imagen interfaz|![image]()|

### Código interfaz: I - 017
### Imagen interfaz:

### Modulo Registro planilla y asistencia

| Código Interfaz | I001  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/f2922732-04e4-4511-9671-e6ec9c6f7428)|
| Código Interfaz | I001  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/c5bd74eb-a33b-4336-bc63-74629cc82879)|

| Código Interfaz | I001  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/5f72cdb3-f8ac-4f3a-a7b0-694cb0690038)
|

| Código Interfaz | I001  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/940378ab-3cd2-4e36-97fc-4e2398048ef0)|

| Código Interfaz | I001  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/0bfa8910-a4ee-41b5-840d-1b61cfba25cd)|

| Código Interfaz | I001  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/fcc7d905-811f-4b5f-86e5-7e73c010f6ea)|

| Código Interfaz | I001  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/ee805bb3-fba9-4f43-9159-47c04acfc201)|
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

## CASO 3
### Código Requerimiento : R - 003
### Codigo interfaz : I - 001 y I - 003
### Imagen interfaz : 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/810c4a06-7a8c-4d2c-b7a1-5d30d1d41951)
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/3458369c-f54b-4d9d-b303-b1efa3316e2b)

### Sentecias SQL:
### Eventos: 
* **Cambiar contraseña e inicio de sesión:** Una vez verificados los datos, el usuario ingresa una nueva contraseña para que asi esta sea cambiada por la anterior y así iniciar sesión con su nueva contraseña ya actualizada.
```
UPDATE Cuenta SET contraseña= <3> WHERE contraseña= <2> AND usuario = <1>;
SELECT usuario, contraseña from Cuenta
WHERE usuario = <1> AND contraseña = <3>
```
Donde los valores del 1 al 4 se capturarán de las interfaces de inicio de sesión e ingresar nueva contraseña según se muestran en la imagen.

## CASO 4
### Código Requerimiento : R - 004
### Codigo interfaz : I - 004
### Imagen interfaz : 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/8ef6f6c8-3aa2-4e65-9a17-ab0490e4a21f)
### Sentecias SQL:
### Eventos: 
* **Ver solicitudes:** Se mostrará en la pantalla todas la solicitudes pendientes y ya respondidas para que asi el administrador pueda responderla.
```
SELECT so.id_solicitud, em.nombres, em.apellidos, so.fec_solicitud, ti.descripcion FROM Empleado em, Solicitud so, Tipo_solicitud ti, Estado_solicitud es
WHERE so.id_estado_solicitud = es.id_estado_solicitud AND em.id_empleado = so.id_empleado
AND ti.id_tipo_solicitud = so.id_tipo_solicitud
```

## CASO 5
### Código Requerimiento : R - 005
### Codigo interfaz : I - 005
### Imagen interfaz : 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/1eb1b037-b250-46ea-a22f-efd9f6674668)
### Sentecias SQL:
### Eventos: 
* **Boton Detalles:** Se mostrará los detalles de la solicitud hecha por el empleado el cual tendrá acceso tanto administrador como empleado, el atractivo principal de este boton es conocer los fundamentos del empleado acerca de su solicitud.
```
SELECT so.id_solicitud, em.nombres, em.apellidos, em.dni, so.fec_solicitud, so.hora_solicitud, ti.descripcion, so.detalles, es.descripcion
FROM Empleado em, Solicitud so, Tipo_solicitud ti, Estado_solicitud es
WHERE so.id_estado_solicitud = es.id_estado_solicitud AND em.id_empleado = so.id_empleado
AND ti.id_tipo_solicitud = so.id_tipo_solicitud
```

## CASO 6
### Código Requerimiento : R - 006
### Codigo interfaz : I - 004
### Imagen interfaz : 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/cb3c7535-2422-40b9-b160-5b1b487cace6)
### Sentecias SQL:
### Eventos: 
* **Boton Estado:** El boton sirve para que el administrador pueda cambiar el estado de espera de la solicitud a Aceptado o Rechazado.
```
UPDATE Solicitud SET id_estado_solicitud = <1> WHERE id_estado_solicitud = 2 AND id_solicitud = <2>
```

## CASO 7
### Código Requerimiento : R - 007
### Codigo interfaz : I - 006
### Imagen interfaz : 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/e433215f-d373-4566-aa33-7e8741907696)
### Sentecias SQL:
### Eventos: 
* **Pantalla Solicitudes (Empleados):** Se mostrará el historial de todo el registro de solicitudes anteriores del empleado junto con los actuales que se encuentran en espera.
```
SELECT so.id_solicitud, so.fec_solicitud, ti.descripcion, es.descripcion
FROM Solicitud so, Tipo_solicitud ti, Estado_solicitud es
WHERE ti.id_tipo_solicitud = so.id_tipo_solicitud AND es.id_estado_solicitud = so.id_estado_solicitud
AND id_empleado = <1>
```
El id_empleado <1> se obtiene de la base de datos donde esta registrada la cuenta del mismo empleado.

## CASO 8
### Código Requerimiento : R - 008
### Codigo interfaz : I - 007, I - 008 y I - 009
### Imagen interfaz : 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/24662302-75da-4744-a056-6f80b0eb505b)
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/adeec56f-4dc9-49a8-acd4-0d1feebb1d72)
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/5e808ffc-375f-4a5b-84cf-1ed7af990bc1)
### Sentecias SQL:
### Eventos: 
* **Nueva Solicitud:** El usuario podrá enviar una nueva solicitud primero seleccionando el tipo de solicitud que desea, dependiendo de la opción del tipo de solicitud que elija, le pueden aparecer 2 tipos de pantallas, las cuales son una con opción de ingresar un monto y la otra sin la mencionada opción.
#### Opción 1
Al elegirse esta opción, se está eligiendo un tipo de solicitud con monto, por ello aparecerá una nueva pantalla con la opción de ingresar monto, donde al enviar la solicitud, la consulta será:
```
CREATE SEQUENCE id_solicitud START WITH 1
INSERT INTO Solicitud VALUES (NEXTVAL(id_solicitud),<3>, <4>, <5> , <6> , 2 , <1>, <7> ,<8>)
```
#### Opción 2
Al elegirse esta opción, se esta eligiendo un tipo de solicitud el cual no requiere de ingresarse un monto, debido a ello, aparecerá una pantalla el cual no tiene incluida la opción para ingresar un monto, donde al enviar la solicitud, la consulta será:
```
CREATE SEQUENCE id_solicitud START WITH 1
INSERT INTO Solicitud VALUES (NEXTVAL(id_solicitud),<3>, <4>, <5> , null , 2 , <2>, <7> ,<8>)
```
id_empleado <7>: Se obtiene de la base de datos en la cual esta registrada la cuenta. <br>
id_empresa <8>: Se obtiene de la base de datos en la cual esta registrada la cuenta.

## CASO 9
### Código de Requerimiento: R009
### Código de Interfaz: I010, I011, I012
### Imagen Interfaz: 
![image](https://github.com/luisfhs712/DBD_LUIS__PERS_23-1/blob/main/Frame%2047.png)
![image](https://github.com/luisfhs712/DBD_LUIS__PERS_23-1/blob/main/Frame%2048.png)
### Sentecias SQL:
### Eventos:
1. Llenado de Datos del Empleado: Se mostrarán los campos con datos del usuario que se tiene que ingresar manualmente o elegir entre las que cuentan con opciones (Régimen Pensionario, Seguro Médico, Situación de Discapacidad, Empresa)

- Llenado de Campos
SELECT tipo_regimen FROM Regimen_pensionario;
SELECT tipo_seguro FROM Seguro_medico;
SELECT tipo_discapacidad FROM Situacion_discapacidad;
SELECT razon_social FROM Empresa;

INSERT INTO Empleado (id_empleado,nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo,cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad,id_empresa,id_cuenta) VALUES (<1>,<2>,<3>,<4>,<5>,<6>,<7>,<8>,<9>,<10>,<11>,<12>,<13>,<14>)
Donde los valores del 1 al 14, se capturan de la interfaz de usuario, como se muestra en la imagen.

- Botón Siguiente 
Se pasa a la siguiente pestaña, para ingresar los datos del contrato del empleado.

2. Llenado de Datos del Contrato del Empleado: Se mostrarán los campos con datos del contrato del empleado que se tiene que ingresar manualmente o elegir entre las opciones de los lookup tables (Área,Cargo,Estado de Contrato, Tipo de Contrato,Tipo de Jornada)
- Llenado de Campos
SELECT nombre_cargo FROM Cargo;
SELECT nombre_area FROM Area;
SELECT estado_contrato FROM Estado_contrato;
SELECT tipo_contrato FROM Tipo_contrato;
SELECT tipo_jornada FROM Tipo_jornada;

INSERT INTO Contrato(id_contrato,fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico,id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) VALUES
(<1>,<2>,<3>,<4>,<5>,<6>,<7>,1,<8>,<9>,<10>,<11>,<12>,<13>,<14>);
El 1 que está entre <7> y <8>, es el id del estado de contrato, este representa un estado de contrato VIGENTE, el cuál será el único estado de contrato que se permitirá a la hora de Registrar empleados en el sistema, ya una vez registrado se podrá cambiar en base a la actualidad del empleado.
Para <13> y <14>:
En caso de elegir como Medio de Pago(<12>) el Efectivo, esos 2 campos tomarán el valor de NULL.


## CASO 10
### Código de Requerimiento: R010
### Código de Interfaz: 
### Imagen Interfaz: 
![image]()
### Sentecias SQL:
### Eventos:


## CASO 11
### Código de Requerimiento: 
### Código de Interfaz: 
### Imagen Interfaz: 
![image]()
### Sentecias SQL:
### Eventos:



## CASO 5
### Código Requerimiento : R - 005
### Codigo interfaz : I - 005
### Imagen interfaz : 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/0c2419cd-b212-4a4b-ad4b-6db2404b5ff4)

### Sentecias SQL:
### Eventos:

## CASO 5
### Código Requerimiento : R - 005
### Codigo interfaz : I - 005
### Imagen interfaz : 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/1eb1b037-b250-46ea-a22f-efd9f6674668)
### Sentecias SQL:
### Eventos:

## CASO 5
### Código Requerimiento : R - 005
### Codigo interfaz : I - 005
### Imagen interfaz : 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/1eb1b037-b250-46ea-a22f-efd9f6674668)
### Sentecias SQL:
### Eventos:

## CASO 9
### Código Requerimiento : R - 007
### Codigo interfaz : I - 006
### Imagen interfaz : 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/3b239f7e-1f62-428d-b87b-215d7f9ec422)
### Sentecias SQL:
### Eventos:
* **Mostrar empleados filtrados:** Se mostrara en pantalla el listado de contratos activos 
```
SELECT so.id_solicitud, em.nombres, em.apellidos, so.fec_solicitud, ti.descripcion FROM Empleado em, Solicitud so, Tipo_solicitud ti, Estado_solicitud es
WHERE so.id_estado_solicitud = es.id_estado_solicitud AND em.id_empleado = so.id_empleado
AND ti.id_tipo_solicitud = so.id_tipo_solicitud
```
## CASO 9
### Código Requerimiento : R - 007
### Codigo interfaz : I - 006
### Imagen interfaz : 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/be19dad0-9762-4c6e-b408-1a7d59ecf00b)
### Sentecias SQL:
### Eventos:
* **Mostrar empleados filtrados:** Se mostrara en pantalla el listado de contratos dentro de dicho periodo.
```
SELECT em.dni,em.nombres,em.apellidos,car.nombre_cargo,co.fecha_inicio_laboral,co.fecha_termino_contrato 
FROM Contrato co,Empleado em,Cargo car,Planilla pe WHERE em.id_empleado=co.id_empleado AND car.id_cargo=co.id_cargo 
AND pe.periodo = <1> AND co.fecha_inicio_laboral<=pe.fecha_inicio AND pe.fecha_fin<=co.fecha_termino_contrato; 
```
## CASO 9
### Código Requerimiento : R - 007
### Codigo interfaz : I - 006
### Imagen interfaz : 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/16303985-92b0-44c7-88db-628451c05ac0)
### Sentecias SQL:
### Eventos: 
* **Mostrar datos de empleado:** Se mostrara en pantalla los datos del empleado 
```
SELECT em.dni,em.nombres ,em.apellidos FROM Empleado em WHERE em.id_empleado=<1>;
```
* **Mostrar listado de ingresos:** Se mostrara en el lado izquierdo el listado de ingresos
```
SELECT co.nombre_nomina, mo.monto FROM Empleado em,Concepto_nomina co, Movimiento_planilla mo, Tipo_operacion ti 
WHERE co.id_nomina=mo.id_nomina AND co.id_tipo_operacion=ti.id_tipo_operacion AND ti.id_tipo_operacion=1 AND em.id_empleado=<1>;
```
* **Mostrar listado de descuentos:** Se mostrara en pantalla los datos del empleado 
```
SELECT co.nombre_nomina, mo.monto FROM Empleado em,Concepto_nomina co, Movimiento_planilla mo, tipo_operacion ti 
WHERE co.id_nomina=mo.id_nomina AND co.id_tipo_operacion=ti.id_tipo_operacion AND ti.id_tipo_operacion=2 AND em.id_empleado=<1>;
```
* **Eliminar concepto registrado:** Se mostrara en pantalla los datos del empleado 
```
DELETE FROM Movimiento_planilla mov WHERE mov.id_movimiento=<2>;
```
## CASO 9
### Código Requerimiento : R - 007
### Codigo interfaz : I - 006
### Imagen interfaz : 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/3b2f83cf-1ce4-435b-8741-b5336fbfbed9)
### Sentecias SQL:
### Eventos:
* **Registrar un concepto:** Se mostrara en pantalla los datos del empleado 
```
INSERT INTO Movimiento_planilla VALUES (<1>,CURRENT_DATE,<2>,<3>,<4>,<5>);
```
* **Actualizar concepto registrado:** Se mostrara en pantalla los datos del empleado 
```
UPDATE Movimiento_planilla mov SET mov.valor=<3> WHERE mov.id_movimiento=<2>;
```
## CASO 9
### Código Requerimiento : R - 007
### Codigo interfaz : I - 006
### Imagen interfaz : 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/2c1e3766-31e9-46ff-be3a-4078c5646f89)
### Sentecias SQL:
### Eventos: 
* **Mostrar datos de empleado:** Se mostrara en pantalla los datos del empleado 
```
SELECT em.dni,em.nombres, em.apellidos FROM Empleado em WHERE em.id_empleado=<1>;
```
* **Mostrar conceptos de asistencia registrados:** Se mostrara en pantalla los conceptos registrados 
```
SELECT co.nombre_nomina, asi.fecha_inicio,asi.fecha_final,(fecha_final-fecha_inicio) as valor FROM Empleado em,
Concepto_nomina co, Asistencia asi, tipo_operacion ti WHERE co.id_nomina=asi.id_nomina AND 
co.id_tipo_operacion=ti.id_tipo_operacion AND em.id_empleado=1;
```
* **Eliminar concepto registrado:** Se eliminara el concepto elegido 
```
DELETE FROM Asistencia asi WHERE asi.id_asistencia=<1>;
```
## CASO 9
### Código Requerimiento : R - 007
### Codigo interfaz : I - 006
### Imagen interfaz : 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/201c9c54-68a4-4f35-9a5a-4eedce2783b0)
### Sentecias SQL:
### Eventos:
* **Registrar un concepto asistencia:** Se mostrara en pantalla los datos del empleado 
```
INSERT INTO Asistencia VALUES (<1>,<2>,<3>,<4>,<5>,<6>,<7>);
```
* **Actualizar concepto registrado:** M
```
UPDATE Asistencia mov SET mov.valor=<2> WHERE mov.id_mov=<1>;
```
# CARGA DE DATOS
- Régimen Pensionario
```
INSERT INTO Regimen_pensionario (id_regimen_pensionario, tipo_regimen) VALUES
('1', 'ONP'),
('2', 'AFP');
```
- Seguro Médico
```
INSERT INTO Seguro_medico (id_seguro_medico, tipo_seguro) VALUES
('1', 'EPS'),
('2', 'SIS'),
('3', 'EsSalud'),
('4', 'Privado');
```
- Situación de Discapacidad
```
INSERT INTO Situacion_discapacidad (id_situacion_discapacidad, tipo_discapacidad) VALUES ('1', 'Ninguna'),
('2', 'Parcial'),
('3', 'Total');
```
- Empleado
```
INSERT INTO Empleado (id_empleado,nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad,id_empresa,,id_cuenta) VALUES
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
(15,'KAREN EDITH','POMA CAMACHO DE SALAZAR',TO_DATE('1983-07-22', 'YYYY-MM-DD'),40,936131832,'karenpomakp30@gmail.com',42685693,'Divorciado','Femenino',1,3,1,3,15);
```
- Estado de Contrato
```
INSERT INTO Estado_contrato (id_estado_contrato, estado_contrato) VALUES ('1', 'Vigente'),
('2', 'Finalizado'),
('3', 'Rescindido');
```
- Tipo de Contrato
```
INSERT INTO Tipo_contrato (id_tipo_contrato, tipo_contrato) VALUES ('1', 'Indefinido'),
('2', 'Plazo Definido'),
('3', 'Obra o Proyecto');
```
- Tipo de Jornada
```
INSERT INTO Tipo_jornada (id_tipo_jornada, tipo_jornada) VALUES ('1', 'Ordinaria'),
('2', 'Parcial'),
('3', 'Excenta');
```
- Frecuencia de Pago
```
INSERT INTO Frecuencia_pago(id_frecuencia_pago,frecuencia_pago) VALUES (1,'Mensual'),
(2,'Quincenal'),
(3,'Por obra o proyecto');
```
- Medio de Pago
```
INSERT INTO Medio_pago(id_medio_pago,medio_pago,entidad_financiera,cuenta) VALUES (1,'Efectivo',NULL,NULL),
(2,'Cheque','',NULL),
(3,'Transferencia Bancaria','',0);
```
- Contrato
```
INSERT INTO Contrato (id_contrato,fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico,
					  id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) 
					  VALUES 
(1,'2020-01-15','2020-02-01','2023-12-31',991.9614,991.96130080387,1,2,1,1,1,1,1,3),
(2,'2021-02-18','2021-03-01','2023-12-31',926.27093,926.270837372916,1,2,2,1,1,1,1,3),
(3,'2020-01-20','2020-02-01','2023-12-31',931.854954,931.854860814514,2,2,3,1,1,1,1,3),
(4,'2022-01-01','2022-01-15','2024-06-15',998.400448,998.400348159965,3,1,4,1,1,1,2,3),
(5,'2022-03-11','2022-03-15','2023-11-31',918.099146,918.099054190095,3,1,5,1,1,1,2,1),
(6,'2020-05-05','2020-05-15','2024-01-15',938.197568,938.197474180253,4,1,6,1,1,1,1,1),
(7,'2021-08-25','2021-09-01','2023-12-31',920.852657,920.852564914744,4,3,7,1,2,1,1,3),
(8,'2021-06-30','2021-07-01','2023-12-31',989.686976,925.836110771228,4,3,8,1,2,1,1,3),
(9,'2022-04-10','2022-04-15','2023-12-15',992.423368,992.423268757673,4,2,9,1,2,1,1,3),
(10,'2023-03-11','2023-03-15','2024-03-15',993.904334,993.904234609577,1,2,10,1,1,1,1,3),
(11,'2022-07-14','2022-08-01','2024-07-15',970.897522,970.897424910258,1,2,11,1,1,1,1,3),
(12,'2021-10-18','2021-11-01','2024-10-15',981.378149,981.378050862195,2,2,12,1,2,1,1,2),
(13,'2021-11-20','2021-12-01','2024-11-31',997.935493,997.935393206461,2,2,13,1,2,1,1,3),
(14,'2022-11-08','2022-11-15','2023-08-15',936.131832,905.933940374348,2,1,14,2,2,1,1,1),
(15,'2022-12-04','2022-12-15','2023-08-31',982.894578,982.894479710552,3,3,15,2,1,1,2,3);
```

- ESTADO SOLICITUD
```
INSERT INTO Estado_solicitud VALUES (1, 'Aceptado');
INSERT INTO Estado_solicitud VALUES (2, 'En Espera');
INSERT INTO Estado_solicitud VALUES (3, 'Rechazado');
```

# FUNCIONALIDAD PRIMARIA ELEGIDA (POR MODULO)
## MÓDULO : AUTENTICACIÓN DE USUARIO Y OLVIDO DE CONTRASEÑA
**Funcionalidad primaria elegida:** Gestionar el proceso de inicio de sesión para los trabajadores de la empresa registrada (empleados y administradores) <br>
**Sustentación:** El inicio de sesión y la recuperación de contraseña son funcionalidades fundamentales para el trabajador de la empresa, ya que gracias estas funcionalidades pueden acceder a todos los beneficios que trae nuestro sistema de planillas de manera segura. Por otro lado, tener la posibilidad de recuperar tu contraseña por si en algún momento la olvidas es un salvavidas que ayuda a muchos usuarios. <br>

Esta funcionalidad permitirá cumplir con los requerimientos de Autenticación de Usuario (R001), Olvido de contraseña (R002), Cambio de contraseña e inicio de sesión (R003) los cuales se encuentran relacionados con las interfaces I-001, I-002, e I-003.

| Actividad     | Descripcion        | 
|:-------------:|:---------------:|
| 1       | Se mostrará la pantalla I-001 en la cual el usuario tendrá que ingresar su nombre de usuario para poder acceder a su cuenta, una vez el usuario le dé a la opción de "INICIAR SESIÓN" el sistema verificará los datos ingresados con los registros que se tenga en la base de datos. Una vez verificado los datos mediante una consulta, el sistema le dará acceso al usuario a todos los beneficios que ofrece el sistema de planillas en su cuenta![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/889f54a4-8acb-48b1-9777-fa37007fb49d) | 
| 2    | En el caso de que el sistema verifique que los datos ingresados no coincide con ninguna información registrada en su base de datos, se apreciará una pantalla con el mnesaje "**DATOS ERRONEOS**, por favor vuelve a intentarlo"| 
| 3  | Si el usuario llegara a olvidar su contraseña, este podrá reestablecerla dando click en la opción "¿Olvidó su contraseña? ¡Restaurela aquí!", en donde el usuario tendrá que probar que es quien dice ser ingresando su nombre y su dni, de tal manera que el sistema al encontrar dichos datos, le enviará mediante un mensaje SMS a su celular(registrado previamente en la base de datos) con un codigo de verificación (codigo: 1234) donde despues tendrá que ingresar su nueva contraseña y confirmarla para que así el sistema inicie sesión con su nueva contraseña ya cambiada en la base de datos. <br> ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/8598b432-8471-428f-a02b-9d165fc1e2c4) ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/834818bd-c978-49d3-9e82-e003dc9d9cfe) ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/ead48069-0cd7-4eb2-9a7f-131d2e42bac2) | 

## MÓDULO : SOLICITUDES
**Funcionalidad primaria elegida:** Gestionar todas las solicitudes hechas por los empleados de la empresa <br>
**Sustentación:** La gestión de solicitudes en una empresa es una funcionalidad importante debido a que se requiere de un buen manejo de solicitudes para asi atender las necesidades de los empleados de la empresa. <br>

Esta funcionalidad permitirá cumplir con los requerimientos de Pantalla Solicitudes (Administrador) (R004), Detalle de Solicitud (R005), Respuesta de Solicitud (R006), Pantalla de Solicitudes (Empleado) (R007) y Nueva Solicitud (R008) los cuales se encuentran relacionados con las interfaces I-004, I-005, I-006, I-007, I-008 e I-009.

| Actividad     | Descripcion        | 
|:-------------:|:---------------:|
| 1       | Al ingresar en la opción de solicitudes en el sistema de planillas (desde un correo tipo administrador) se podrá verificar todas las solicitudes pendientes y las solicitudes ya respondidas, en las cuales el administrador tendrá la potestad de responder a dicha solicitud dependiendo de la respuesta del jefe del empleado solicitante. En dicha Pantalla tambien se contará con la opción de ver los detalles de la solicitud hecha por el empleado en donde fundamenta la solicitud que ha hecho. <br> ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/cb040585-2f70-40a9-9d5d-d0e1f30d3ffb) ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/82fe3841-d3b4-4e6f-a789-0440404ebdee) | 
| 2    | En el caso de la cuenta de un empleado, este al darle a la opción de solicitudes, tendrá vista del historial de todas las solcitudes que ha hecho anteriormente con acceso a los detalles y el estado de sus solicitude. Además Tendrá la opción de hacer una nueva solicitud. <br> ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/827564fb-52fd-4bef-97ad-6e3913cd6e3a) | 
| 3  | En el caso de que un empleado desee hacer una solicitud, primero obtendrá la vista del tipo de solicitud que desee hacer, dependiendo de las opciones que elija, le saldrán 2 posibles opciones, una con la opción de ingresar un monto (Adelanto, Aumento y Reclamo) y otra sin mencionada opción (Licencia, Vacaciones, Configuración de Información). Una vez seleccionado el tipo de solciitud, el empleado deberá fundamentar las razones de su solicitud en la parte de detalles y en el caso haya escogido una de los tipos de solicitudes que incluye monto, deberá ingresar o no una cantidad dependiendo de la solicitud. Todos estos datos se aplicaran en un INSERT apenas se de click en el boton "Enviar". <br> ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/cd8350c8-9c33-4a84-8078-f187bfdc14a6) ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/51a0b9e3-706b-475e-9c97-10c301819f0e) ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/033bbdec-0212-4606-be2c-bd42878956a3) | 


# STACK TECNOLÓGICO
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
