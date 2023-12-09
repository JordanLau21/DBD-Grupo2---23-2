## 14.1 ÍNDICES
En este subcapítulo, a partir de nuestros módulos escogidos para la funcionalidad primaria, evaluaremos el rendimiento por el uso de índices através de las consultas, para ello seguiremos los siguientes pasos: Planteamiento del uso de índice, Experimentación, Costo de Consulta en ambos casos
#### 14.1.1 SOLICITUDES
##### Planteamiento del Uso de Índices en el Módulo de Solicitudes:
###### Consulta: Ver solicitudes
Razón para el Índice: Esta consulta involucra la unión de varias tablas (Empleado, Solicitud, Tipo_solicitud, Estado_solicitud) basadas en sus identificadores. Indexar los campos utilizados en las cláusulas WHERE (id_estado_solicitud, id_empleado, id_tipo_solicitud) podría mejorar la eficiencia al buscar coincidencias entre estas tablas grandes.
###### Consulta: Pantalla Solicitudes (Empleados)
Razón para el Índice: Similar al caso anterior, aquí la consulta busca filtrar las solicitudes por id_empleado. Indexar el campo id_empleado en la tabla Solicitud podría agilizar la recuperación de las solicitudes asociadas a un empleado específico.
###### Consulta: Nueva Solicitud
Razón para el Índice: Dependiendo de la frecuencia y la importancia de esta operación, la creación de nuevas solicitudes podría beneficiarse de un índice en el campo id_empleado o id_empresa, ya que estos campos se utilizan para insertar datos en la tabla Solicitud.
##### Experimentación y Evaluación del Rendimiento:
1. Experimentación sin Índices: Ejecutar las consultas seleccionadas sin índices y medir el tiempo o recursos consumidos para cada una.
2. Creación de Índices: Crear índices basados en las razones planteadas.
3. Experimentación con Índices: Ejecutar las mismas consultas después de crear los índices y registrar el tiempo o recursos consumidos para compararlos con los resultados anteriores.
##### Posibles Índices Propuestos:
Para la tabla Solicitud:
1. Nombre del Índice: idx_solicitud_estado_empleado_tipo
Campos Involucrados: id_estado_solicitud, id_empleado, id_tipo_solicitud
```
CREATE INDEX idx_solicitud_estado_empleado_tipo ON Solicitud (id_estado_solicitud, id_empleado, id_tipo_solicitud);
```
2. Nombre del Índice: idx_solicitud_empleado
Campos Involucrados: id_empleado
```
CREATE INDEX idx_solicitud_empleado ON Solicitud (id_empleado);
```
3. Nombre del Índice: idx_solicitud_empresa
Campos Involucrados: id_empresa
```
CREATE INDEX idx_solicitud_empresa ON Solicitud (id_empresa);
```
#### 14.1.2 MÓDULO: EMPLEADOS
##### Planteamiento del Uso de Índices en el Módulo de Empleados:
###### Consulta: Llenado de Datos del Empleado
Razón para el Índice: Las consultas a las tablas Regimen_pensionario, Seguro_medico, Situacion_discapacidad, Empresa se utilizan para obtener datos necesarios para la creación de un nuevo empleado. Podrías considerar indexar las columnas que se usan en los JOINs o que son frecuentemente buscadas en estas tablas (por ejemplo, tipo_regimen, tipo_seguro, tipo_discapacidad, razon_social) para agilizar la recuperación de datos al crear nuevos empleados.
###### Consulta:  Llenado de Datos del Contrato del Empleado
Al igual que en el caso anterior, las consultas a las tablas Cargo, Area, Estado_contrato, Tipo_contrato, Tipo_jornada se utilizan para obtener datos necesarios para la creación de un nuevo contrato de empleado. Podrías considerar indexar las columnas que se usan en los JOINs o que son frecuentemente buscadas en estas tablas (por ejemplo, nombre_cargo, nombre_area, estado_contrato, tipo_contrato, tipo_jornada) para agilizar la recuperación de datos al crear nuevos contratos de empleados.
###### Consulta: Carga de Página
Razón para el Índice: Esta consulta busca empleados por nombre o apellidos. Podrías considerar indexar las columnas nombre y apellidos en la tabla Empleado para mejorar el rendimiento de esta búsqueda.
##### Experimentación y Evaluación del Rendimiento:
1. Experimentación sin Índices: Ejecutar las consultas seleccionadas sin índices y medir el tiempo o recursos consumidos para cada una.
2. Creación de Índices: Crear índices basados en las razones planteadas.
3. Experimentación con Índices: Ejecutar las mismas consultas después de crear los índices y registrar el tiempo o recursos consumidos para compararlos con los resultados anteriores.
##### Posibles Índices Propuestos:
Para las tablas involucradas en las consultas:
1. Nombre del Índice: idx_empleado_nombre_apellidos
Campos Involucrados: nombre, apellidos
```
CREATE INDEX idx_solicitud_estado_empleado_tipo ON Solicitud (id_estado_solicitud, id_empleado, id_tipo_solicitud);
```
2. Nombre del Índice: idx_cuenta_estado_cuenta
Campos Involucrados: id_estado_cuenta
```
CREATE INDEX idx_solicitud_empleado ON Solicitud (id_empleado);
```
3. Nombre del Índice: idx_solicitud_empresa
Campos Involucrados: id_empresa
```
CREATE INDEX idx_solicitud_empresa ON Solicitud (id_empresa);
```
#### 14.1.3 MÓDULO : REGISTRO DE MOVIMIENTOS PLANILLA Y LICENCIAS, INASISTENCIAS,ETC
#### 14.1.4 MÓDULO : PLANILLA
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
