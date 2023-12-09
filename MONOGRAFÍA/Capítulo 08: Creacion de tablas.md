# Capítulo 08: Creacion de tablas


-Tabla: RÉGIMEN PENSIONARIO 
```
CREATE TABLE Regimen_pensionario(
	id_regimen_pensionario SERIAL PRIMARY KEY NOT NULL,
	tipo_regimen CHAR(3) NOT NULL
);
```
-Tabla: SEGURO MÉDICO
```
CREATE TABLE Seguro_medico(
	id_seguro_medico SERIAL NOT NULL,
	tipo_seguro VARCHAR(10) NOT null,
	primary key(id_seguro_medico)
);
```
-Tabla: SITUACIÓN DISCAPACIDAD
```
CREATE TABLE Situacion_discapacidad(
	id_situacion_discapacidad SERIAL NOT NULL,
	tipo_discapacidad VARCHAR(10) NOT null,
	primary key(id_situacion_discapacidad)
);
```
-Tabla: ESTADO DE SOLICITUD
```
CREATE TABLE Estado_solicitud(
	id_estado_solicitud SERIAL PRIMARY KEY NOT NULL,
	descripcion VARCHAR(15) NOT NULL
);
```
-Tabla: TIPO DE SOLICITUD
```
CREATE TABLE Tipo_solicitud(
	id_tipo_solicitud SERIAL PRIMARY KEY NOT NULL,
	descripcion VARCHAR(50) NOT NULL
);	
```
-Tabla: ESTADO DE CONTRATO
```
CREATE TABLE Estado_contrato(
	id_estado_contrato SERIAL PRIMARY KEY NOT NULL,
	estado_contrato VARCHAR(20) NOT NULL
);
```
-Tabla: TIPO DE CONTRATO
```
CREATE TABLE Tipo_contrato(
	id_tipo_contrato SERIAL PRIMARY KEY NOT NULL,
	tipo_contrato VARCHAR(30) NOT NULL
);
```
-Tabla: TIPO DE JORNADA
```
CREATE TABLE Tipo_jornada(
	id_tipo_jornada SERIAL PRIMARY KEY NOT NULL,
	tipo_jornada VARCHAR(20) NOT NULL
);
```
-Tabla: FRECUENCIA DE PAGO
```
CREATE TABLE Frecuencia_pago(
	id_frecuencia_pago SERIAL PRIMARY KEY NOT NULL,
	frecuencia_pago VARCHAR(50) NOT NULL
);
```
-Tabla: MEDIO DE PAGO
```
CREATE TABLE Medio_pago(
	id_medio_pago SERIAL PRIMARY KEY NOT NULL,
	medio_pago VARCHAR(50) NOT NULL,
	entidad_financiera VARCHAR(50),
	cuenta NUMERIC
);
```
-Tabla: PLANILLA
```
CREATE TABLE Planilla
(
  id_planilla SERIAL NOT NULL,
  periodo VARCHAR(10) NOT NULL,
  dias_laborables NUMERIC(3) not null,
  fecha_inicio DATE  not null,
  fecha_fin DATE  not null,
  fecha_calculo DATE,
  monto_emitido NUMERIC(12,5),
  periodicidad VARCHAR(10) not null,
  fecha_creacion DATE not null,
  hora_creacion time not null,
  PRIMARY KEY (id_planilla)
);
```
-Tabla: TIPO DE OPERACIÓN
```
create table Tipo_operacion (
	id_tipo_operacion SERIAL not null,
	descripcion_operacion VARCHAR(20) not null,
	primary key (id_tipo_operacion)
);
```
-Tabla: ESTADO CONCEPTO
```
create table Estado_concepto (
	id_estado SERIAL not null,
	descripcion_estado VARCHAR(20) not null,
	primary key (id_estado)
);
```
-Tabla: CONCEPTO NOMINA
```
CREATE TABLE Concepto_nomina(
  id_nomina SERIAL NOT NULL,
  nombre_nomina VARCHAR(50) NOT NULL,
  valor_nomina numeric(7,2) NOT NULL,
  id_tipo_operacion SERIAL NOT NULL,
  id_estado SERIAL NOT NULL,
  PRIMARY KEY (id_nomina),
  FOREIGN KEY (id_tipo_operacion) REFERENCES Tipo_operacion(id_tipo_operacion),
  FOREIGN KEY (id_estado) REFERENCES Estado_concepto(id_estado)
);
```
-Tabla: ESTADO DE CUENTA
```
CREATE TABLE Estado_cuenta(
	id_estado_cuenta SERIAL PRIMARY KEY NOT NULL,
	estado_cuenta VARCHAR(30) NOT NULL
);
```
-Tabla: EMPRESA
```
CREATE TABLE Empresa(
	id_empresa SERIAL PRIMARY KEY NOT NULL,
	ruc NUMERIC(12) NOT NULL,
	regimen VARCHAR(25) NOT NULL,
	estado VARCHAR(20) NOT NULL,
	razon_social VARCHAR(50) NOT NULL,
	direccion VARCHAR(200) NOT NULL,
	giro VARCHAR(50) NOT NULL,
	ciudad VARCHAR(25) NOT NULL,
	logo VARCHAR(200) NOT NULL
);
```
-Tabla: CUENTA_EMPRESA
```
CREATE TABLE Cuenta_empresa(
	id_cuenta SERIAL PRIMARY KEY NOT NULL,
	usuario VARCHAR(50) NOT NULL,
	contraseña VARCHAR(50) NOT NULL,
	rol VARCHAR(30) NOT NULL,
	id_estado_cuenta SERIAL NOT NULL,
	FOREIGN KEY (id_estado_cuenta) REFERENCES Estado_cuenta(id_estado_cuenta),
	id_empresa SERIAL NOT NULL,
	FOREIGN KEY (id_empresa) REFERENCES Empresa(id_empresa )
);
```
-Tabla: REPRESENTANTE LEGAL
```
CREATE TABLE RepresentanteLegal(
	id_representante SERIAL PRIMARY KEY NOT NULL,
	nombres VARCHAR(20) NOT NULL,
	apellido_paterno VARCHAR(50) NOT NULL,
	apellido_materno VARCHAR(50) NOT NULL,
	dni VARCHAR(20) NOT NULL,
	estado VARCHAR(20) NOT NULL, 
	id_empresa SERIAL NOT NULL,
	FOREIGN KEY (id_empresa) REFERENCES Empresa(id_empresa)
); 
```
-Tabla: CARGO
```
CREATE TABLE Cargo(
	id_cargo SERIAL PRIMARY KEY NOT NULL,
	nombre_cargo VARCHAR(50) NOT NULL,
	codigo_cargo VARCHAR(50) NOT NULL,
	descripcion_cargo TEXT NOT NULL,
	requerimientos TEXT NOT NULL,
	estado VARCHAR(20) NOT NULL,
	id_empresa SERIAL NOT NULL,
	FOREIGN KEY  (id_empresa) REFERENCES Empresa(id_empresa)
);

```
-Tabla: AREA
```
CREATE TABLE Area(
    id_area SERIAL PRIMARY KEY NOT NULL,
    nombre_area VARCHAR(50) NOT NULL,
	descripcion_area TEXT NOT NULL,
    id_empresa SERIAL NOT NULL,
    FOREIGN KEY (id_empresa) REFERENCES Empresa(id_empresa)
);
```
-Tabla: EMPLEADO
```
CREATE TABLE Empleado(
	id_empleado SERIAL PRIMARY KEY NOT NULL,
	nombre VARCHAR(20) NOT NULL,
	apellidos VARCHAR(50) NOT NULL,
	fecha_nacimiento DATE  NOT NULL,
	edad INT NOT NULL,
	telefono NUMERIC(9) NOT NULL,
	email VARCHAR(50) NOT NULL,
	dni NUMERIC(8) NOT NULL,
	estado_civil VARCHAR(15) NOT NULL,
	sexo VARCHAR(10) NOT NULL,
	cantidad_menores_cargo INT NOT NULL,
	id_regimen_pensionario SERIAL NOT NULL,
	FOREIGN KEY (id_regimen_pensionario) REFERENCES Regimen_pensionario(id_regimen_pensionario),
	id_seguro_medico SERIAL NOT NULL,
	FOREIGN KEY (id_seguro_medico) REFERENCES Seguro_medico(id_seguro_medico),
	id_situacion_discapacidad SERIAL NOT NULL,
	FOREIGN KEY (id_situacion_discapacidad) REFERENCES Situacion_discapacidad(id_situacion_discapacidad),
	id_empresa SERIAL NOT NULL,
	FOREIGN KEY (id_empresa) REFERENCES Empresa(id_empresa)
);
```
-Tabla:CUENTA_EMPLEADO 
```
CREATE TABLE Cuenta_empleado(
	id_cuenta SERIAL PRIMARY KEY NOT NULL,
	usuario VARCHAR(50) NOT NULL,
	contraseña VARCHAR(50) NOT NULL,
	rol VARCHAR(30) NOT NULL,
	id_estado_cuenta SERIAL NOT NULL,
	FOREIGN KEY (id_estado_cuenta) REFERENCES Estado_cuenta(id_estado_cuenta),
	id_empleado SERIAL NOT NULL,
	FOREIGN KEY (id_empleado) REFERENCES Empleado(id_empleado)
);
```
-Tabla: SOLICITUD
```
CREATE TABLE Solicitud(
	id_solicitud SERIAL PRIMARY KEY NOT NULL,
	detalles VARCHAR(100) NOT NULL,
	fec_solicitud DATE  NOT NULL,
	hora_solicitud TIME WITHOUT TIME ZONE NOT NULL,
	monto NUMERIC(7,2),
	id_estado_solicitud SERIAL NOT NULL,
	FOREIGN KEY (id_estado_solicitud) REFERENCES Estado_solicitud(id_estado_solicitud),
	id_tipo_solicitud SERIAL NOT NULL,
	FOREIGN KEY (id_tipo_solicitud) REFERENCES Tipo_solicitud(id_tipo_solicitud),
	id_empleado SERIAL NOT NULL,
	FOREIGN KEY (id_empleado) REFERENCES Empleado( id_empleado),
	id_empresa SERIAL NOT NULL,
	FOREIGN KEY (id_empresa) REFERENCES Empresa(id_empresa)
);
```
-Tabla: CONTRATO
```
CREATE TABLE Contrato(
	id_contrato SERIAL PRIMARY KEY NOT NULL,
	fecha_firma_contrato DATE NOT NULL,
	fecha_inicio_laboral DATE  NOT NULL,
	fecha_termino_contrato DATE  NOT NULL,
	sueldo_base FLOAT NOT NULL,
	liquido_teorico FLOAT NOT NULL,
	id_area SERIAL NOT NULL,
	FOREIGN KEY  (id_area) REFERENCES Area(id_area),
	id_cargo SERIAL NOT NULL,
	FOREIGN KEY (id_cargo) REFERENCES Cargo(id_cargo),
	id_empleado SERIAL NOT NULL,
	FOREIGN KEY (id_empleado) REFERENCES Empleado(id_empleado),
	id_estado_contrato SERIAL NOT NULL,
	FOREIGN KEY (id_estado_contrato) REFERENCES Estado_contrato(id_estado_contrato),
	id_tipo_contrato SERIAL NOT NULL,
	FOREIGN KEY (id_tipo_contrato) REFERENCES Tipo_contrato(id_tipo_contrato),
	id_tipo_jornada SERIAL NOT NULL,
	FOREIGN KEY (id_tipo_jornada) REFERENCES Tipo_jornada(id_tipo_jornada),
	id_frecuencia_pago SERIAL NOT NULL,
	FOREIGN KEY (id_frecuencia_pago) REFERENCES Frecuencia_pago(id_frecuencia_pago),
	id_medio_pago SERIAL NOT NULL,
	FOREIGN KEY (id_medio_pago) REFERENCES Medio_pago(id_medio_pago)
);
```
-Tabla: ASISTENCIA
```
CREATE TABLE Asistencia(
	id_asistencia SERIAL PRIMARY KEY,
	fecha_inicio DATE ,
	fecha_final DATE ,
	comentario VARCHAR(200),
	valor NUMERIC(100),
	id_contrato SERIAL,
	id_nomina SERIAL,
	FOREIGN KEY (id_contrato) REFERENCES Contrato(id_contrato),
	FOREIGN KEY (id_nomina) REFERENCES Concepto_Nomina(id_nomina)
);
```
-Tabla: MOVIMIENTO DE PLANILLA
```
CREATE TABLE Movimiento_planilla(
	id_movimiento SERIAL PRIMARY KEY,
	fecha DATE ,
	monto NUMERIC(10,2),
	id_contrato SERIAL,
	id_nomina SERIAL,
	FOREIGN KEY (id_contrato) REFERENCES Contrato(id_contrato),
	FOREIGN KEY (id_nomina) REFERENCES Concepto_Nomina(id_nomina)
);
```
-Tabla: BOLETA
```
CREATE TABLE Boleta(
  id_boleta SERIAL NOT NULL,
  TotalDescuentos NUMERIC(9,2) NOT NULL,
  TotalNeto NUMERIC(9,2) NOT NULL,
  TotalIngresos NUMERIC(9,2) NOT NULL,
  TotalAportes numeric(9,2) NOT NULL,
  id_contrato SERIAL NOT NULL,
  id_planilla SERIAL NOT NULL,
  PRIMARY KEY (id_boleta),
  FOREIGN KEY (id_contrato) REFERENCES Contrato(id_contrato),
  FOREIGN KEY (id_planilla) REFERENCES Planilla(id_planilla)
);
```
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/GEN%20TAB.png?raw=true)




