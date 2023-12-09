# CAPÍTULO 15: APLICACIÓN DE UNA BASE DE DATOS NOSQL
## Estado del Arte
### Bases de Datos
Las bases de datos son sistemas de almacenamiento y organización de información que permiten la gestión y manipulación de datos de manera eficiente. Su historia se remonta a la década de 1960, cuando se desarrollaron los primeros Sistemas de Gestión de Bases de Datos (DBMS). Estos sistemas permitían la creación, modificación y eliminación de datos de manera estructurada y organizada. Con el tiempo, los DBMS evolucionaron y se desarrollaron diferentes modelos de bases de datos, como el modelo relacional, el modelo jerárquico o el modelo de red, los cuales son ampliamenta utilizados en la actualiadad en diferentes ámbitos, como la industria, investigación, educación y salud, etc.
### Motores de Bases de Datos Relacionales
Los motores de bases de datos relacionales están basados en el modelo relacional que planteó Edgar Frank Codd en su obra "A relational model of data for large shared data banks", publicada en 1970.<br> 
Este modelo usa tablas para organizar y almacenar datos y los motores utilizan un Lenguaje de Consulta Estructurado o Structured Query Language (SQL) para manipular y consultar esos datos.<br>
Algunos aspectos clave en estos motores son los siguientes:<br>
- Tablas: Los datos se almacenan en estas, las cuales están compuestas por filas y columnas. Cada fila representa un registro individual y cada columna representa un atributo de la entidad almacenada en la tabla.
- Claves o llaves primarias: Es un campo o una combinación de campos en una tabla que identifica de manera única cada fila de la tabla, sirviendo como identificador único.
- Relaciones entre Tablas: Los motores de bases de datos relacionales permiten establecer relaciones entre tablas, lo que facilita la consulta y la manipulación de datos en múltiples tablas al mismo tiempo utilizando operaciones como JOIN, INNER JOIN, LEFT JOIN, etc.
- Claves o llaves foráneas: Son campos en una tabla que hacen referencia a la clave primaria de otra tabla, estableciendo relaciones entre diferentes tablas de la base de datos.
- Transacciones: Los motores de bases de datos relacionales ofrecen soporte para transacciones, que permiten realizar operaciones atómicas y consistentes con los datos, para asegurar la integridad de los datos incluso en situación de fallo.
- ACID: Los sistemas de bases de datos relacionales tienen las propiedades ACID, definidos: Atomicidad (todos los cambios se realizan como si fueran una sola operación), Consistencia (los datos permanecen en un estado consistente de un estado a otro), Aislamiento (el estado intermedio de una transacción no es visible para otras transacciones) y Durabilidad (después de completada una transacción, los cambios en los datos persisten).
- Normalización: Es el proceso de división de datos para minimizar la redundancia  y mantener la coherencia e integridad de los datos.
- Seguridad y Control de Acceso: Los motores de bases de datos relacionales ofrecen mecanismos para controlar quién tiene acceso a qué datos y en qué medida. 

Algunos ejemplos de motores de bases de datos relacionales son:<br>
- PostgreSQL
- MySQL
- Oracle Database
- Microsoft SQL Server
- MariaDB
- SQLite
- IBM Db2
- Amazon RDS, etc.

### Motores de Bases de Datos no Relacionales o NoSQL
Los motores de bases de datos no relacionales, también llamados bases de datos NoSQL (Not Only SQL), son una categoría diversa de sistemas de almacenamiento que difieren en estructura y enfoque en comparación con los motores relacionales. Inicialmente fue diseñado para ser ejecutado en UNIX y bajo el paradigma del flujo del procesador, sin embargo, con el paso del tiempo se ha vuelto un sistema confiable y eficaz para el manejo de grandes volúmenes de datos no estructurados o semi-estructurados, ofreciendo flexibilidad, escalabilidad y rendimiento en entornos donde las bases de datos relacionales podrían tener limitaciones.
Algunos aspectos clave en estos motores son los siguientes:<br>
- Modelos de datos flexibles: Los motores NoSQL permiten la flexibilidad en el modelo de datos, lo que significa que los datos no están obligatoriamente estructurados en tablas y filas. Esta propiedad facilita el almacenamiento de datos no estructurados como documentos, grafos o pares clave de valor.
- Escalabilidad horizontal: La gran mayoría de motores de bases de datos NoSQL están diseñados para escalar horizontalmente, esto les permite manejar grandes volúmenes de información y altas cargas de trabajo al distribuir los datos y operaciones en múltiples nodos o servidores.
- Alta disponibilidad y tolerancia a fallos: Los motores NoSQL están diseñados para que puedan continuar operando incluso si ocurren fallos en los nodos o si se pierde conexión de red.
- Consultas y acceso eficiente: Los motores NoSQL ofrecen mecanismos de consulta y acceso adaptados a los modelos de datos específicos que utilizan, cada tipo de motor tiene su propio conjunto de operaciones y consultas optimizadas para el modelo en cuestión.<br>

Algunos ejemplos de motores de bases de datos relacionales son:<br>
- CouchDB
- MongoDB
- Cassandra
- Couchbase
- Redis
- Neo4j
- RavenDB
- CockroachDB
- Cosmos DB, etc.


### Tipos de Motores de Bases de Datos no Relacionales o NoSQL

#### Motores de Base de Datos Clave Valor
Este tipo de motores almacena datos en pares clave valor, donde cada valor está asociado con una clave única, lo que permite una recuperación rápida de datos. Algunos de los motores más populares de este tipo son: Riak, Redis y Amazon DynamoDB.

![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/clave%20valor.PNG)

#### Motores de Base de Datos orientados a Documentos
Este tipo de motores almacenan datos en documentos, que pueden ser XML,JSON, BSON e incluso en formatos binarios como documentos de Microsoft Office o PDF. Estos documentos son estructuras flexibles que tienen campos y valores anidados, lo que facilita la representación de datos complejos y cambiantes. Algunos de los motores más populares de este tipo son: CocuhDB, RavenDB y MongoDB.

![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/documentos.webp)

#### Motores de Base de Datos orientados a Grafos
Estos motores están diseñados para almacenar y consultar datos altamente relacionados, utilizando estructuras de grafo para representar entidades y las relaciones de estas, debido a su diseño permiten consultas complejas que siguen los patrones y conexiones en el grafo de datos. Algunos de los motores más populares de este tipo son: ArangoDB, Neo4j y Amazon Neptune.

![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/grafos.png)

#### Motores de Base de Datos Columnares
Este tipo de motores almacenan datos en columnas en lugar de filas, permitiendo alta compresión y acceso eficiente a subconjuntos de columnas. Son especialmente adecuados para casos de uso analíticos y consultas que involucran el análisis de grandes conjuntos de datos. Algunos de los motores más populares de este tipo son: Apache Cassandra, ClickHouse y Apacha Hbase.

![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/columnares1.jpg)

#### Motores de Base de Datos de Series Temporales
Las bases de datos de series temporales son sistemas diseñados específicamente para almacenar y gestionar datos organizados en función del tiempo. Estas bases de datos son especialmente útiles cuando se trata de datos que cambian con el tiempo y están marcados por marcas temporales, como datos financieros, registros de sensores, registros de servidores, datos meteorológicos, etc. Algunos de los motores más populares de este tipo son: OpenTSDB, InfluxDB, TimescaleDB, KairosDB y Prometheus.

![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/series%20temporales.webp)

## Elección de Herramientas NoSQL
### Escenario de Uso - Tipo de Motor de Base de Datos NoSQL
Para el sistema de planillas que estamos desarrollando en este trabajo, hay mucho módulos, todos relacionados ya sea en mayor o menor medida, pero para la selección de un motor de base de datos NoSQL en específico se ha realizado un análisis en conjunto de manera que se pueda elegir la mejor opción para aplicar este motor, antes de hacer la elección del motor se ha enfocado en elegir el tipo de base de datos no relacional que mejor se adapta a los módulos a los que los aplicaremos, siendo estos módulos los de solicitudes y planillas.
Se utilizará un motor de base de datos no relacional orientado a documentos, esto debido a que este tipo de motor permite almacenar diferentes tipos de datos y formatos en un mismo documento, esto permitiría que las solicitudes y planillas no se limiten únicamente a los campos predefinidos, sino que también pueda considerarse información adicional relevante del empleado en cuestión.

### Ventajas respecto a un motor de Base de Datos Relacional
- Flexibilidad en el esquema de datos<br>
Un motor de base de datos no relacional nos permitiría que las solicitudes tengan campos variables o persanalizados, ya que no se tendría un esquema predefinido y rígido, y además del hecho de permitir almacenar datos de diferente estructura en un mismo lugar facilitaría la adaptación de los cambios de dato dependiendo del tipo de solicitud que desea el empleado.
- Rendimiento con grandes volúmenes de datos - Escalabilidad horizontal<br>
Si se da un aumento significativa en la cantidad de datos en el módulo de solicitudes y planillas, ya sea por un alto flujo de solicitudes y/o planillas generados, un motor de base de datos NoSQL, al escalar horizontalmente, haría más sencillo trabajar con esta gran cantidad de datos, ya que permitiría distribuir la carga en múltiples servidores.
- Menor necesidad de JOINs y consultas complejas<br>
Un motor de base de datos no relacional evitaría la necesidad de realizar JOINS complejos entre múltiples tables, lo que simplificaría el proceso de consulta y reduciría considerablemente el tiempo de desarrollo.

### Elección de Motor de Base de Datos NoSQL
Entre todos los motores de base de datos no relacional orientado a documentos se ha elegido a CouchDB debido estas características:
- Modelo de datos flexible: CouchDB utiliza un modelo de datos basado en documentos JSON que permite almacenar datos de manera flexible y estructurada, punto clave para nuestro caso en particular. Además los documentos en CouchDB pueden tener diferentes estrucutras sin definir un esquema fijo.  
- Escalabilidad: CouchDB presenta una gran escalabilidad horizontal, esto a través de múltiples nodos, la que la hace capaz de manejar grandes volúmenes de datos, incluso en entornos distribuidos (usan distintos nodos para un objetivo compartido común).
- Replicación y sincronización: CouchDB admite la replicación de datos entre múltiples instancias de bases de datos, lo que facilita la sincronización y la creación de copias de seguridad, esto es útil para nuestro trabajo, ya que trabajamos con datos replicados en algunos casos (Ejm: Tipo de seguro médico, tipo de régimen pensionario, etc.)
- Actualizaciones incrementales: CouchDB permite actualizaciones incrementales en los documentos, lo que significa que solo se actualiza la parte modificada del documento en lugar del documento completo.
- Tolerancia a fallos: CouchDB está diseñada para ser tolerante a fallos, debido a que los datos se distribuyen en nodos, esto hace que si en caso de fallo de un nodo, la base de datos puede continuar funcionando sin interrupciones significativas.

## Configuración de Motor de Base de Datos NoSQL CouchDB

### Instalación de CouchDB
1. Ingresar a la página oficial de CouchDB: https://couchdb.apache.org/<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/1.jpg)
2. Dar click en la opción "Download".<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/1.1.jpg)
3. Elegir la opción a instalar en base al sistema operativo que se posea, en nuestro caso Windows.<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/2.jpg)
4. Nos redigirá a otra página en donde daremos click a la opción "Downlado CouchDB".<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/3.1.jpg)
5. Se empezará a ejecutar la descarga, una vez completada abriremos el archivo descargado.<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/5.jpg)
6. Se ejecutará el instalador de CouchDB, damos click en "Next".<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/7.jpg)
7. Aceptamos los términos de licencia y damos click en "Next".<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/8.jpg)
8. Elegimos el directorio de instalación para CouchDB, aceptamos la instalación de Apache CouchDB Windows Service dando check a la opción y damos click en "Next".<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/9.jpg)
9. Ingresamos el nombre de usuario y contraseña que deseemos, damos click en "Validate Credentials", en caso de que no se valide, tendrá que ingresar otro nombre de usuario y/o contraseña, en caso de no presentar problemas con la validación, dar click en "Next".<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/10.jpg)
10. Ingresamos el valor del cookie, en caso de poseer ya uno se deberá validar de la misma manera que se hizo en el paso anterior dando click en "Validate Credentials", en caso de no poseerlo, se dará click en "Random Cookie" para que se le asigne una.<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/11.jpg)
11. Dar click en "Install" para iniciar con la instalación.<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/12.jpg)

12. Esperar hasta que la instalación finalice.<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/14.jpg)
13. Una vez finalizada la instalación, dar click en "Finish". Se recomienda reiniciar su máquina para actualizar archivos y/o servicios que no se pueden actualizar mientras el sistema está en ejecución.<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/16.jpg)

### Trabajar con CouchDB

CouchDB posee una interfaz web llamada Futon, la cual proporciona una manera sencilla de administrar la base de datos. Accedemos a Futon entrando al siguiente link: http://localhost:5984/_utils/
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/Screenshot_1.jpg)

Para ingresar, debemos colocar el usuario y contraseña que elegimos durante la instalación:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/Screenshot_2.jpg)

Pantalla de inicio tras el ingreso de usuario y contraseña:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/Screenshot_3.jpg)

Vamos al apartado de verificación dando click en "Verify", ya ahí damos click en "Verify Installation", esto verificará que la instalación haya sido correcta.
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/IM%C3%81GENES/Luis/Captura.PNG)

Una vez verificado, se podrá trabajar con CouchDB sin ningún tipo de problema.

## Implementación

### MODULO SOLICITUDES
Para poder trabajar con las solicitudes de cada empleado, se tuvo que mudar todas las insercciones de datos que estaban en SQL en Postgres a un formato JSON debido a que couchDB utiliza este formato para trabajar. he aqui la pantalla con los datos subidos:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/434fb38f-cd70-4a83-9726-0dd6462d77b4)
En cada documento de la base de datos que llamamos "solicitudes", se establecieron los siguientes campos: nombres, apellidos, detalles, fecha de solicitud, hora de solicitud, estado de solicitud y monto.
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/33059cf2-f467-4d33-84a8-8a0f6f155a21)
Una vez subido los datos con dichos campos, ya se podía empezar a trabajar.
Para hacer la prueba de todas las pantallas se utilizó la consola de la computadora.
A continuación se mostrará las vistas que se pudieron trabajar con esta base de datos NoSQL llamada CouchDB.
#### PANTALLA SOLICITUDES ADMINISTRADOR
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/02165a52-460f-4a3d-a895-46ecc8eb6341) <br>
Para lograr obtener los datos para esta pantalla, primero se debe crear una view en couchDB donde puedas ingresar todos los datos que dicha pantalla necesita, por ello se creó la view llamada vista_administrador:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/67444cbd-9618-475e-a726-01f9bd3130be)
En la cual se generó el siguiente código para hacer aparecer todos los datos que requerimos para esta pantalla:
```
function (doc) {
  if (doc.nombres && doc.apellidos && doc["fecha de solicitud"] && doc["tipo de solicitud"] && doc["estado de solicitud"]) {
    emit(doc._id, {
      nombres: doc.nombres,
      apellidos: doc.apellidos,
      fecha_solicitud: doc["fecha de solicitud"],
      tipo_solicitud: doc["tipo de solicitud"],
      estado_solicitud: doc["estado de solicitud"]
    });
  }
```
Para probar que funciona, se requerirá de usar cierto comando en la consola, el cual es:
```
curl "http://localhost:5984/solicitudes/_design/Solicitudes/_view/vista_administrador"
```
El cual nos dá como resultado:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/68e6ca20-94f2-43a7-9b01-3c33af2cd7af)
#### PANTALLA DETALLES
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/b8412487-906a-480e-85e6-3b2832e689f0) <br>
Para esta pantalla, como podemos notar por la imagen, tendremos que requerir de los campos nombres, apellidos, fecha de solicitud, hora de solicitud, tipo de solicitud, estado de solicitud y la id de la solicitud.
Para lograr ello, se creó otra view en el couchDB llamado vista_empleados:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/ea4401cd-be3f-42b0-b427-fa1dd65eb9a9)
En la cual se generó el siguiente código para atraer a todos los campos recorridos:
```
function (doc) {
  if (doc.nombres && doc.apellidos && doc["fecha de solicitud"] && doc["hora de solicitud"] && doc["tipo de solicitud"] && doc["estado de solicitud"] && doc.detalles) {
    emit(doc._id, {
      nombres: doc.nombres,
      apellidos: doc.apellidos,
      fecha_solicitud: doc["fecha de solicitud"],
      hora_solicitud: doc["hora de solicitud"],
      tipo_solicitud: doc["tipo de solicitud"],
      estado_solicitud: doc["estado de solicitud"],
      detalles: doc.detalles
    });
  }
}
```
Para poder probar que funcione, se requerira usar el siguiente comando en la consola:
```
curl "http://localhost:5984/solicitudes/_design/Solicitudes/_view/vista_empleados"
```
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/c77457ac-768c-4c3c-a01b-501b6769ba01)
Sin embargo, como podran notar, este comando no da una vista de todos los detalles de los empleados, para lograr una vista específica de algun empleado, se utilizará su id del documento, como en el siguiente ejemplo:
Se usa el código
```
curl "http://Jordan:75930253@127.0.0.1:5984/solicitudes/_design/Solicitudes/_view/vista_empleados?key=\"d87ef0b908a14df64b77e5f7e003f6ce\""
```
El cual nos dá el siguiente resultado
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/96ae7722-a4ca-4a13-a42b-56d632eebd76) <br>
Dandose así su funcionalidad correcta

#### PANTALLA SOLICITUDES VISTA EMPLEADO
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/d4d1f06f-f6bb-478a-812a-e9485f2900e0)
Para lograr esta pantalla, se tendrá que hacer un proceso similar que con la pantalla de detalles, la diferencia es que aquí necesitaremos guiarnos por el nombre debido a que todos los documentos tienen una id que representa a la solicitud mas no al empleado.
Primero creamos la view empleado_especifico.
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/a43dc880-4ffa-41e3-b7e0-78725a9a2214)
En el cual, tal como se muestra en la primera imagene de la pantalla que queremos lograr, se necesitará el siguiente código para lograrlo:
```
function (doc) {
  if (doc["fecha de solicitud"] && doc["tipo de solicitud"] && doc["estado de solicitud"]) {
    emit(doc._id, {
      fecha_solicitud: doc["fecha de solicitud"],
      tipo_solicitud: doc["tipo de solicitud"],
      estado_solicitud: doc["estado de solicitud"],
    });
  }
}
```
Para probar este código, tal y como se mencionó anteriormente, ya no se puede usar la id por que esta esta referida a las solicitudes y no al empleado, por ello se usará el nombre del empleado para atraer a sus solicitudes hechas usando el siguiente comando:
```
curl "http://Jordan:75930253@127.0.0.1:5984/solicitudes/_design/Solicitudes/_view/empleado_especifico?key=\"DANIEL\""
```

### MÓDULO DE PLANILLAS
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
   "periodicidad": "Mensual",
   "fecha_inicio": "2023-10-01",
   "fecha_fin": "2023-10-31"
  },
  "concepto": [
   {
    "nombre": "Essalud",
    "valor": 684,
    "tipo_operación": "Aporte"
   },
   {
    "nombre": "Sueldo Básico a pagar",
    "valor": 2971,
    "tipo_operación": "Ingreso"
   },
   {
    "nombre": "DSCTOS. INASISTENCIA",
    "valor": 349,
    "tipo_operación": "Descuento"
   },
   {
    "nombre": "Essalud",
    "valor": 2325,
    "tipo_operación": "Aporte"
   },
   {
    "nombre": "Renta 5ta",
    "valor": 2700,
    "tipo_operación": "Descuento"
   },
   {
    "nombre": "AFP Seguro",
    "valor": 602,
    "tipo_operación": "Aporte"
   },
   {
    "nombre": "Vacaciones",
    "valor": 2262,
    "tipo_operación": "Ingreso"
   },
   {
    "nombre": "Bono Extraord",
    "valor": 1011,
    "tipo_operación": "Ingreso"
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
#### I-028
- Se creará una vista en la BD *planillas* desde Fauxton que entregue los datos de la interfaz de planillas:
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
![](https://github.com/nnthony/bookish-doodle/raw/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/planilla.png)
#### I-029
- Se creará una vista en la BD *boletas* que entreguen los datos de la interfaz de detalle de planilla
  ![](https://github.com/nnthony/bookish-doodle/blob/e10c33fe5a7362b1372047f187ef6c07551991f8/pnt/MONO/cap9.png)
- Se usará el siguiente código para la creación de la vista
```
function (doc) {
  if (
    doc.empleado && doc.empleado.id && doc.empleado.nombre && doc.empleado.apellidos &&
    doc.contrato && doc.contrato.fecha_inicio_laboral && doc.planilla && doc.planilla.id &&
    doc.planilla.id === <1>
  ) {
    emit(doc._id, {
      empleado_id: doc.empleado.id,
      empleado_nombre: doc.empleado.nombre,
      empleado_apellidos: doc.empleado.apellidos,
      fecha_inicio_laboral: doc.contrato.fecha_inicio_laboral
    });
  }
}
-- 1: El id de la planilla seleccionada
```
- Se ejecutará desde consola, con el siguiente comando:
```
curl http://admin:admin@127.0.0.1:5984/boletas/_design/boleta/_view/pantalla_de_planilla
```
![](https://github.com/nnthony/bookish-doodle/blob/e10c33fe5a7362b1372047f187ef6c07551991f8/pnt/MONO/cap10.png)
- Vista propuesta en el proyecto original
![](https://github.com/nnthony/bookish-doodle/blob/6f0a906384f58d77b59138e88a0e7fa806bd3db7/pnt/Detalleplanilla1.png)
#### I-034
- Se creará una vista en la BD *boletas* que entreguen los datos de la interfaz de detalle de planilla
  ![](https://github.com/nnthony/bookish-doodle/blob/e9d3885df31b281d99b39d556da31e61c4191e8e/pnt/MONO/cap11.png)
- Se usará el siguiente código para la creación de la vista
```
function (doc) {
  if (doc.id === <1> && doc.concepto && Array.isArray(doc.concepto)) {
    for (var i = 0; i < doc.concepto.length; i++) {
      emit(doc._id, {
        concepto_nombre: doc.concepto[i].nombre,
        concepto_valor: doc.concepto[i].valor,
        concepto_tipo_operacion: doc.concepto[i].tipo_operacion
      });
    }
  }
}
-- 1: es el id de la boleta seleccionada
```
- Se ejecutará desde consola, con el siguiente comando:
```
curl http://admin:admin@127.0.0.1:5984/boletas/_design/boleta/_view/pantalla_de_boleta
```
![](https://github.com/nnthony/bookish-doodle/blob/e9d3885df31b281d99b39d556da31e61c4191e8e/pnt/MONO/cap12.png)
- Vista propuesta en el proyecto original
![](https://github.com/nnthony/bookish-doodle/raw/12ab224f3729055d81bb78c5a342c2ea6f54dd7e/pnt/detalleboleta1.png)








