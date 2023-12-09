# CAPÍTULO : VALIDACIÓN DEL ESQUEMA
## Lookup Tables
### Entidad: Empleado
- Régimen Pensionario

|id_regimen_pensionario|tipo_regimen|
|----------------------|------------|
|a|b|

  
- Seguro Médico
- Situación de Discapacidad




- Entidad: EMPLEADO

|id_empleado|Apellido Paterno|Apellido Materno|Nombre|Tipo Documento|Nro Documento|Sexo|Fecha de Nacimiento|Edad|Estado Civil|País de Nacimiento|Celular|Teléfono de Oficina|e-mail personal|e-mail corporativo|Dirección|Grupo Sanguíneo|Régimen Pensionario|Situación de Discapacidad|Seguro de Salud|Fecha de Ingreso|Tipo de Pago|Medio de Pago|Cuenta Bancaria|Frecuencia de Pago|Día de Pago|
|-----------|----------------|------|----------------|--------------|-------------|----|-------------------|----|------------|------------------|-------|-------------------|---------------|------------------|---------|---------------|-------------------|-------------------------|---------------|----------------|------------|-------------|---------------|------------------|-----------|
|136459|Pérez|Silva|José|DNI|74895915|Masculino|11/12/2002|20|Soltero|Perú|984561234|2456687|joseps1@hotmail.com|juan.perez@gmail.com|Jr. Ana Paula Véliz # 4177 Piso 5|ABO|AFP|No Posee|Público|11/08/2023|Transferencia Bancaria|BCP|101548962341|Mensual|03|
|154261|Paredes|Álvarez|Raúl|DNI|71485926|Masculino|15/01/1990|33|Casado|Perú|977546324|2478869|raulpaal04@hotmail.com|raul.paredes@gmail.com|Av. Camilo QuINTEGERero # 532|ABO|ONP|No Posee|Privado|01/04/2018|Transferencia Bancaria|BBVA|1459152614|Mensual|02|

1) PRIMERA FORMA NORMAL (1FN)
- Todos los dominios subyacentes contienen solo valores escalares.
- No presenta atributos multivaluados

Satisface la Primera Forma Normal  

2) SEGUNDA FORMA NORMAL (2FN)
- Satisface la Primera Forma Normal
- No hay dependencias parciales

Satisface la Segundo Forma Normal

3) TERCERA FORMA NORMAL (3FN)
- Hay dependencia transitiva: Medio de Pago y Cuenta Bancaria dependen directamente de Tipo de Pago




