# Capítulo 14: Índices y otros objetos de BD
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

#### MÓDULO : PLANILLA
La creación de índices relevantes en las columnas de planilla ha mejorado significativamente el rendimiento de 4 consultas, reduciendo el tiempo de ejecución y el costo de consulta en operaciones críticas del sistema.
| Codigo Interfaz    |    I - 028    | 
|:-------------|:---------------|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/planilla.png) |
| Sentencia SQL sin Índice   | ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/f56fa068-c2e1-4e26-a8ef-b5687e3e4317) |
| Sentencia SQL con Índice   | ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/b019dfda-b59a-4e3b-afda-99cb19e4a0b5) |


| Codigo Interfaz    |     I - 033    | 
|:-------------|:---------------|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/6545e6397d88a3a2bbade4d4f3435bd855b81231/pnt/R-detallePlanillaPagada.png) |
| Sentencia SQL sin Índice   | ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/6f834716-8dd9-4238-86fc-32e0c0d5ce74) |
| Sentencia SQL con Índice   | ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/42c2afbf-3cbe-41b9-b9b8-9a0e76416850) |

| Codigo Interfaz    |     I - 034    | 
|:-------------|:---------------|
| Imagen interfaz | ![image](https://github.com/nnthony/bookish-doodle/blob/d2b5a087137a916cfb148ce51a930d75a2aaaf8f/pnt/R-DetallEBoleta1.png) |
| Sentencia SQL sin Índice   | ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/7f3d9b3e-7b62-4371-a06b-2b34cd45ac24)  |
| Sentencia SQL con Índice   | ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/34a92c7b-dcfe-4e0c-b0ef-adfd1bb4e241) |

| Codigo Interfaz    |     I - 035    | 
|:-------------|:---------------|
| Imagen interfaz | ![image](https://github.com/nnthony/bookish-doodle/blob/d2b5a087137a916cfb148ce51a930d75a2aaaf8f/pnt/generarnuevasboletas.png) |
| Sentencia SQL sin Índice   | ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/13e93d3c-901d-46bb-b5c8-d19f6ab96696) |
| Sentencia SQL con Índice   | ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/a1b3854a-5d5f-4bff-9baa-d3e3c3ae9c9d) |


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
Se creó una vista una vista que combine la información de Empleado y Contrato para simplificar las consultas y hacerlas más legibles. 
```
CREATE VIEW DatosEmpleadoContrato AS
SELECT 
    E.id_empleado, E.nombre, E.apellidos, E.fecha_nacimiento, E.edad, E.telefono, 
	E.email, E.dni, E.estado_civil, E.sexo, E.cantidad_menores_cargo,
    C.nombre_cargo, A.nombre_area, EC.estado_contrato, TC.tipo_contrato, TJ.tipo_jornada
FROM Empleado E
INNER JOIN Contrato CO ON E.id_empleado = CO.id_empleado
INNER JOIN Cargo C ON CO.id_cargo = C.id_cargo
INNER JOIN Area A ON CO.id_area = A.id_area
INNER JOIN Estado_contrato EC ON CO.id_estado_contrato = EC.id_estado_contrato
INNER JOIN Tipo_contrato TC ON CO.id_tipo_contrato = TC.id_tipo_contrato
INNER JOIN Tipo_jornada TJ ON CO.id_tipo_jornada = TJ.id_tipo_jornada;

SELECT * FROM DatosEmpleadoContrato;
```
Esta vista combina la información relevante de las tablas Empleado y Contrato en una sola vista para facilitar las consultas, como resultado de la query:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/ae3781f4-cce9-4993-9991-9426d211f2c3)
