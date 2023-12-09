## 14.1 ÍNDICES
En este subcapítulo, a partir de nuestro módulo PLANILLA escogido para la funcionalidad primaria, evaluaremos el rendimiento por el uso de índices através de las consultas, para ello seguiremos los siguientes pasos: Planteamiento del uso de índice, Experimentación, Costo de Consulta en ambos casos.
##### Planteamiento del Uso de Índice
1. Identificamos consultas frecuentes para mejorar su rendimiento mediante índices.
2. Seleccionamos consultas clave que podrían beneficiarse de la indexación.
##### Experimentación
1. Ejecutamos las consultas seleccionadas sin la presencia de índices para medir el costo de consulta inicial.
2. Creamos índices relevantes en las columnas utilizadas en esas consultas.
##### Costo de Consulta en Ambos Casos
1. Reejecutamos las mismas consultas después de la creación de índices para comparar y analizar la mejora de rendimiento.
2. Documentamos la reducción en el costo de consulta observada después de la creación de índices.

#### 14.1.4 MÓDULO : PLANILLA
La creación de índices relevantes en las columnas de planilla ha mejorado significativamente el rendimiento de 3 consultas, reduciendo el tiempo de ejecución y el costo de consulta en operaciones críticas del sistema.
| Codigo Interfaz    |    I - 028    | 
|:-------------|:---------------|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/planilla.png) |
| Sentencia SQL sin Índice   | ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/f56fa068-c2e1-4e26-a8ef-b5687e3e4317) |
| Sentencia SQL con Índice   | ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/b019dfda-b59a-4e3b-afda-99cb19e4a0b5) |

**Sentencia SQL**

Visualizar planillas:
```
select id_planilla, periodo, fecha_inicio, periodicidad from planilla;
```
```
-- Consulta sin índices - Visualizar planillas
EXPLAIN ANALYZE select id_planilla, periodo, fecha_inicio, periodicidad from planilla;
-- Creación de índices relevantes
CREATE INDEX idx_periodo ON planilla(periodo);
CREATE INDEX idx_fecha_inicio ON planilla(fecha_inicio);
CREATE INDEX idx_periodicidad ON planilla(periodicidad);
```



## 14.2 SECUENCIAS
Las secuencias en SQL ofrecen una herramienta fundamental para la generación de identificadores únicos, especialmente en el contexto de aplicaciones que requieren la asignación de claves primarias para el seguimiento y la gestión de datos. En este apartado mencionamos el uso de secuencias en la generación de identificadores de solicitudes en una base de datos relacional, destacando su aplicabilidad y utilidad en este escenario.

Las secuencias son empleadas para generar valores enteros secuenciales únicos, proporcionando identificadores distintivos para cada registro en la tabla Solicitud. En este contexto específico, se utilizan secuencias para la asignación de id_solicitud, que actúa como clave primaria para identificar cada solicitud única en el sistema.

##### Ejemplo Práctico:

Se presentan dos escenarios diferentes de solicitud que demuestran el uso de secuencias:

###### Opción 1 - Solicitud con Monto:

Se elige un tipo de solicitud que requiere ingresar un monto.
Se utiliza la secuencia id_solicitud de la siguiente manera:
```
CREATE SEQUENCE id_solicitud START WITH 1;
INSERT INTO Solicitud VALUES (NEXTVAL(id_solicitud), <3>, CURRENT_DATE, LOCALTIME, <6>, 2, <1>, <7>, <8>);
```
El valor generado por NEXTVAL(id_solicitud) se asigna como identificador único de la solicitud.
###### Opción 2 - Solicitud sin Monto:
- Se selecciona un tipo de solicitud que no necesita un monto.
Se emplea la secuencia id_solicitud de la siguiente forma:
```
CREATE SEQUENCE id_solicitud START WITH 1;
INSERT INTO Solicitud VALUES (NEXTVAL(id_solicitud), <3>, CURRENT_DATE, LOCALTIME, null, 2, <2>, <7>, <8>);
```
El valor generado por NEXTVAL(id_solicitud) se usa como identificador único, similar al caso anterior.
##### Consideraciones Finales:
Este método de uso de secuencias provee una manera eficiente y consistente de generar identificadores únicos para las solicitudes en la base de datos. Además, se complementa con la obtención de otros valores, como id_empleado y id_empresa, provenientes de la información almacenada en la base de datos correspondiente.

## 14.3 VIEW
Text
