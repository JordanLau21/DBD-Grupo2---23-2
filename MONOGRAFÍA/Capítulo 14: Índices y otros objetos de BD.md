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
Script de Creación:
```
CREATE INDEX idx_solicitud_estado_empleado_tipo ON Solicitud (id_estado_solicitud, id_empleado, id_tipo_solicitud);
```
2. Nombre del Índice: idx_solicitud_empleado
Campos Involucrados: id_empleado
Script de Creación:
```
CREATE INDEX idx_solicitud_empleado ON Solicitud (id_empleado);
```
3. Nombre del Índice: idx_solicitud_empresa
Campos Involucrados: id_empresa
Script de Creación:
```
CREATE INDEX idx_solicitud_empresa ON Solicitud (id_empresa);
```
#### 14.1.2 MÓDULO: EMPLEADOS
Esta es una función PL/pgSQL que crea boletas para los empleados que serán pagados en una planilla específica. Aquí, la creación de un índice en las columnas involucradas en la filtración de contratos podría tener un impacto significativo en el rendimiento.
#### 14.1.3 MÓDULO : REGISTRO DE MOVIMIENTOS PLANILLA Y LICENCIAS, INASISTENCIAS,ETC
#### 14.1.4 MÓDULO : PLANILLA
## 14.2 SECUENCIAS
Text

## 14.3 VIEW
Text
