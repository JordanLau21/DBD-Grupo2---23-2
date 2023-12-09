# Capítulo 07: Validación del esquema
## Lookup Tables
### Entidad: Empleado
- Régimen Pensionario
Columnas: id_regimen_pensionario, tipo_regimen

|id_regimen_pensionario|tipo_regimen|
|----------------------|------------|
|1|ONP|
|2|AFP|

- Seguro Médico
Columnas: id_seguro_medico, tipo_seguro

|id_seguro_medico|tipo_seguro|
|----------------|-----------|
|1|EPS|
|2|SIS|
|3|EsSalud|
|4|Privado|

- Situación de Discapacidad
Columnas: id_situacion_discapacidad, tipo_discapacidad

|id_situacion_discapacidad|tipo_discapacidad|
|-------------------------|-----------------|
|1|Ninguna|
|2|Parcial|
|3|Total|

### Entidad: Contrato
- Estado de Contrato
Columnas: id_estado_contrato, estado_contrato

|id_estado_contrato|estado_contrato|
|------------------|---------------|
|1|Vigente|
|2|Finalizado|
|3|Rescindido|


- Tipo de Contrato
Columnas: id_tipo_contrato, tipo_contrato

|id_tipo_contrato|tipo_contrato|
|----------------|-------------|
|1|Indefinido|
|2|Plazo Definido|
|3|Obra o Proyecto|


- Tipo de Jornada
Columnas: id_tipo_jornada, tipo_jornada

|id_tipo_jornada|tipo_jornada|
|---------------|------------|
|1|Ordinaria|
|2|Parcial|
|3|Excenta|

- Frecuencia de Pago
Columnas: id_frecuencia_pago, frecuencia_pago

|id_frecuencia_pago|frecuencia_pago|
|------------------|---------------|
|1|Mensual|
|2|Quincenal|
|3|Por obra o proyecto|

- Medio de Pago
Columnas: id_medio_pago, medio_pago, entidad_financiera, cuenta

|id_medio_pago|medio_pago|
|-------------|----------|
|1|Efectivo|
|2|Cheque|
|3|Transferencia Bancaria|


### Entidad: Solicitud
- Tipo de Solicitud
Columnas: id_tipo_solicitud, descripcion

|id_tipo_solicitud|descripcion|
|-----------------|-----------|
|1|Licencia|
|2|Reclamo|
|3|Aumento|
|4|Vacaciones|
|5|Configuración de Información|
|6|Adelanto|

- Estado de Solicitud
Columnas: id_estado_solicitud, descripcion

|id_estado_solicitud|descripcion|
|-------------------|-----------|
|1|Aceptado|
|2|En Espera|
|3|Rechazado|

### Entidad: Concepto de Nómina
- Tipo de Operación
Columnas: id_tipo_operacion, descripcion_operacion

|id_tipo_operacion|descripcion_operacion|
|-----------------|---------------------|
|1|Ingreso|
|2|Descuento|
|3|Aportes|
|4|Neutro|


### Entidades: Cuenta de Empleado y Cuenta de Empresa
- Estado de Cuenta
Columnas: id_estado_cuenta, estado_cuenta

|id_estado_cuenta|estado_cuenta|
|-----------------|---------------------|
|1|Vigente|
|2|Desvinculado|



