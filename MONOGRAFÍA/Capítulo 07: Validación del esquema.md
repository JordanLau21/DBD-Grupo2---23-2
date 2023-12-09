# CAPÍTULO : VALIDACIÓN DEL ESQUEMA
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

|id_medio_pago|medio_pago|entidad_financiera|cuenta|
|-------------|----------|------------------|------|
|1|Efectivo|NULL|NULL|
|2|Cheque|"       "|NULL|
|3|Transferencia Bancaria|"       "|0123456789|



