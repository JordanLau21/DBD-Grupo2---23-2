# APLICACIÓN DE UNA BASE DE DATOS NOSQL
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


## Selección de Motor de Base de Datos NoSQL



### Ventajas respecto a un motor de Base de Datos Relacional
- Flexibilidad en el esquema de datos
Un motor de base de datos no relacional nos permitiría que las solicitudes tengan campos variables o persanalizados, ya que no se tendría un esquema predefinido y rígido, y además del hecho de permitir almacenar datos de diferente estructura en un mismo lugar facilitaría la adaptación de los cambios de dato dependiendo del tipo de solicitud que desea el empleado.
- Rendimiento con grandes volúmenes de datos - Escalabilidad horizontal
Si se da un aumento significativa en la cantidad de datos en el módulo de solicitudes y planillas, ya sea por un alto flujo de solicitudes y/o planillas generados, un motor de base de datos NoSQL, al escalar horizontalmente, haría más sencillo trabajar con esta gran cantidad de datos, ya que permitiría distribuir la carga en múltiples servidores.
- Menor necesidad de JOINs y consultas complejas
Un motor de base de datos no relacional evitaría la necesidad de realizar JOINS complejos entre múltiples tables, lo que simplificaría el proceso de consulta y reduciría considerablemente el tiempo de desarrollo.


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



