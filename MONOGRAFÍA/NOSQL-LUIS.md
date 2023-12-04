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

### Motores de Bases de Datos no Relacionales
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

### Comparación de Rendimiento de Motores de Bases de Datos SQL y NoSQL




## Descripción de escenario de uso

## Configuración
 

## Instalación del Software CouchDB
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




## Configuración como servicio en la nube

## Implementación



# Referencias
