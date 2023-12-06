# MÓDULO DE PLANILLAS
## Planteamiento
La aplicación de la base de datos NoSQL CouchDB requirió de un reformulamiento en el proyecto planteado inicialmente que 
trabajaba con una base de datos SQL, en el módulo de planillas intervenian principalmente estas tablas:
```
CREATE TABLE Frecuencia_pago(
	id_frecuencia_pago SERIAL PRIMARY KEY NOT NULL,
	frecuencia_pago VARCHAR(50) NOT NULL
);
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
create table Tipo_operacion (
	id_tipo_operacion SERIAL not null,
	descripcion_operacion VARCHAR(20) not null,
	primary key (id_tipo_operacion)
);
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
CREATE TABLE Movimiento_planilla(
	id_movimiento SERIAL PRIMARY KEY,
	fecha DATE ,
	monto NUMERIC(10,2),
	id_contrato SERIAL,
	id_nomina SERIAL,
	FOREIGN KEY (id_contrato) REFERENCES Contrato(id_contrato),
	FOREIGN KEY (id_nomina) REFERENCES Concepto_Nomina(id_nomina)
);
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

Para la base de datos NoSQL CouchDB se propone el siguiente planteamiento para los documentos en formato json:
- Se propone la base de datos documental "boletas" con la siguiente estructura principal:
```
{
 "id": "fc54584461f1b4f81b70adbc53394cb6",
 "key": "fc54584461f1b4f81b70adbc53394cb6",
 "value": {
  "rev": "1-97262d0274fd19498bc6f783d8839b4b"
 },
 "doc": {
  "_id": "fc54584461f1b4f81b70adbc53394cb6",
  "_rev": "1-97262d0274fd19498bc6f783d8839b4b",
  "id": 7,
  "total_ingresos": 2150,
  "total_descuentos": 415,
  "total_aportes": 500,
  "total_neto": 1735,
  "contrato": {
   "id": 7,
   "fecha_inicio_laboral": "2023-04-02",
   "fecha_termino_contrato": "2023-07-04",
   "frecuencia_pago": {
    "id": 1,
    "fp": "Mensual"
   }
  },
  "planilla": {
   "id": 13,
   "periodicidad": "Quincenal",
   "fecha_inicio": "2023-04-19",
   "fecha_fin": "2023-10-13"
  },
  "concepto": [
   {
    "nombre": "Essalud",
    "valor": 684,
    "tipo_operación": "Descuento"
   },
   {
    "nombre": "Sueldo Básico a pagar",
    "valor": 2971,
    "tipo_operación": "Descuento"
   },
   {
    "nombre": "DSCTOS. INASISTENCIA",
    "valor": 349,
    "tipo_operación": "Aporte"
   },
   {
    "nombre": "Essalud",
    "valor": 2325,
    "tipo_operación": "Descuento"
   },
   {
    "nombre": "Renta 5ta",
    "valor": 2700,
    "tipo_operación": "Ingreso"
   },
   {
    "nombre": "AFP Seguro",
    "valor": 602,
    "tipo_operación": "Descuento"
   },
   {
    "nombre": "Vacaciones",
    "valor": 2262,
    "tipo_operación": "Ingreso"
   },
   {
    "nombre": "Bono Extraord",
    "valor": 1011,
    "tipo_operación": "Descuento"
   }
  ]
 }
}
```
Los atributos de la tabla boleta original se mantienen, ahora *contrato* y *planilla* son objetos. Además se agregó
*concepto* que representaría al concepto nomina, ahora se encuentra dentro de *boleta* como un array que almacena 
elementos con 3 datos, *nombre*, *valor*, *tipo_operación* que en el modelo anterior era presentado como
*movimiento_planilla*
- Se propone la base de datos documental "planillas" con la siguiente estructura principal:
```
{
 "id": "fc54584461f1b4f81b70adbc5360de44",
 "key": "fc54584461f1b4f81b70adbc5360de44",
 "value": {
  "rev": "1-17222c286c3b1936c98cb6d908369a9e"
 },
 "doc": {
  "_id": "fc54584461f1b4f81b70adbc5360de44",
  "_rev": "1-17222c286c3b1936c98cb6d908369a9e",
  "periodo": "09ME12023",
  "dias_laborables": 30,
  "fecha_inicio": "2023-09-01",
  "fecha_fin": "2023-09-30",
  "fecha_calculo": "2023-09-30",
  "monto_emitido": 49054.27,
  "periodicidad": "Mensual",
  "fecha_creacion": "2023-09-01",
  "hora_creacion": "07:29:43"
 }
}
```
Los atributos de la tabla *planilla* del modelo original se mantienen iguales, gracias a los requerimientos 
identificados en el proyecto esta parte del modelo fue particularmente fácil de adaptar.
- Se propone la base de datos documental "contratos" con la siguiente estructura principal:
```
{
 "id": "fc54584461f1b4f81b70adbc53708f8a",
 "key": "fc54584461f1b4f81b70adbc53708f8a",
 "value": {
  "rev": "1-86a7cdca4d823d227702a431ca5eeff1"
 },
 "doc": {
  "_id": "fc54584461f1b4f81b70adbc53708f8a",
  "_rev": "1-86a7cdca4d823d227702a431ca5eeff1",
  "id": 11,
  "fecha_firma_contrato": "2022-12-22",
  "fecha_inicio_laboral": "2023-02-01",
  "fecha_termino_contrato": "2023-09-09",
  "sueldo_base": 1753,
  "area": {
   "id": 7,
   "nombre_area": "Desarrollo"
  },
  "cargo": {
   "id": 1,
   "nombre_cargo": "Gerente de Ventas"
  },
  "empleado": {
   "id": 11,
   "nombre": "Finn",
   "apellido": "Morfey"
  },
  "frecuencia_pago": {
   "id": 2,
   "fp": "Quincenal"
  }
 }
}
```
Para agilizar el proceso de poblamiento de datos se optó por mantener solo los datos relevantes para el módulo de la tabla
*contrato* del modelo original. Los atributos *fecha_firma_contrato*, *fecha_inicio_laboral*, *fecha_termino contrato* y *sueldo_base* del modelo original se mantuvieron. Ahora *area*, *cargo*, *empleado*, *frecuencia_pago* son objetos que almacenan algunos datos relevantes para los requerimientos del proyecto original.

## Preparación de la base de datos NoSQL CouchDB
Previamente ya se explicó el proceso de instalación y configuración inicial del entorno de trabajo CouchDB, ahora se explicará los pasos a seguir refrentes al módulo de planillas
### Creación de bases de datos
El proceso de creación se puede hacer desde consola o a través de la interfaz Fauxton, a continuación el proceso en consola:
- Para crear bases de datos aplicamos el comando:
```
curl -X PUT http://admin:admin@127.0.0.1:5984/boletas
--considerando usuario, contraseña, dirección, puerto y el nombre de la nueva base de datos
```
![imagen](https://github.com/nnthony/bookish-doodle/blob/0a610d41488655c9fa85819f2f23447f12dfbe81/pnt/MONO/CAP1.png)
Realizamos lo mismo para las otras 2 bases de datos restantes
```
curl -X PUT http://admin:admin@127.0.0.1:5984/planillas
```
```
curl -X PUT http://admin:admin@127.0.0.1:5984/contratos
```
### Poblamiento de datos
Para el poblamiento de datos, se recurrió al poblamiento masivo con archivos .json, el proceso se realiza desde consola:
- Primero ubicamos la carpeta en donde están alojados los archivos
  ![imagen](https://github.com/nnthony/bookish-doodle/blob/012f61d97ca64d6d0cd347446b0e664efc62153e/pnt/MONO/cap2.png)
- En este caso se tienen 4 archivos para poblar datos

&nbsp; &nbsp; &nbsp; [contrato3.json](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/8f6386f8c3b916864df7ed745b629ff565a43865/MONOGRAF%C3%8DA/Recursos/contrato3.json)
![imagen](https://github.com/nnthony/bookish-doodle/blob/b69c72108ef44e4b900a4acf1914ac59819decae/pnt/MONO/cap3.png)
&nbsp; &nbsp; &nbsp; [boletas2.json](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/8f6386f8c3b916864df7ed745b629ff565a43865/MONOGRAF%C3%8DA/Recursos/boletas2.json) y [boletas3.json](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/8f6386f8c3b916864df7ed745b629ff565a43865/MONOGRAF%C3%8DA/Recursos/boletas3.json)
![imagen](https://github.com/nnthony/bookish-doodle/blob/b69c72108ef44e4b900a4acf1914ac59819decae/pnt/MONO/cap4.png)
&nbsp; &nbsp; &nbsp; [planillas.json](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/8f6386f8c3b916864df7ed745b629ff565a43865/MONOGRAF%C3%8DA/Recursos/planillas.json)
![imagen](https://github.com/nnthony/bookish-doodle/blob/b69c72108ef44e4b900a4acf1914ac59819decae/pnt/MONO/cap5.png)
El comando tiene esta forma:
```
curl -d @contrato3.json -H "Content-type: application/json" -X POST http://admin:admin@127.0.0.1:5984/contratos/_bulk_docs
-- considerando el nombre del archivo y el nombre de la bd, además de los datos de acceso
```
En la interfaz de Fauxton ya se pueden visualizar las BD y los datos
![Imagen](https://github.com/nnthony/bookish-doodle/blob/b70a5650e72482cf1c01f8c3d0b4a3068e644228/pnt/MONO/cap6.png)
### Preparación de vistas
- Se creará una vista, desde Fauxton que entregue los datos de la interfaz de planillas:
![Imagen](https://github.com/nnthony/bookish-doodle/blob/b70a5650e72482cf1c01f8c3d0b4a3068e644228/pnt/MONO/cap7.png)
- Se usará el siguiente código para la creación de la vista:
```
function (doc) {
  if (doc.periodo && doc.fecha_inicio && doc.periodicidad) 
  { emit(doc._id, 
  {periodo: doc.periodo,
  fecha_inicio: doc.fecha_inicio,
  periodicidad: doc.periodicidad});}
}
```
- Para visualizarla, se ejecutará desde consola, con el siguiente comando:
```
curl http://admin:admin@127.0.0.1:5984/planillas/_design/planilla/_view/pantalla_planilla
```
![Imagen](https://github.com/nnthony/bookish-doodle/blob/b70a5650e72482cf1c01f8c3d0b4a3068e644228/pnt/MONO/cap8.png)
- Vista propuesta en el proyecto original
- ![](https://github.com/nnthony/bookish-doodle/raw/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/planilla.png)
