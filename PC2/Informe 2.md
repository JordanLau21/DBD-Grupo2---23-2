# 1. MODELADO CONCEPTUAL DE DATOS
## DICCIONARIO DE DATOS
#### Entidad: EMPLEADO
Semantica: Persona que trabaja en la empresa a cambio de una remuneración

| Atributo | Naturaleza  |  Formato  |  Valores validos  |Unidad|Derivada de| Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| id_empleado |INT|999999|6 dígitos|||Identificar al empleado a nivel de la empresa|
| Nombre | CHAR   |X(60)|NOT NULL|||Nombre del empleado de la empresa|
| Apellido Paterno | CHAR  |X(60)|NOT NULL|||Apellido paterno del empleado de la empresa|
| Apellido Materno| CHAR  |X(60)|NOT NULL|||Apellido materno del empleado de la empresa|
| Tipo Documento | INT   |XXXXXXX|TAB|||Tipo de documento con el que se identifica el empleado de la empresa|
| Nro Documento | CHAR   |99999999|8 dígitos|||Número de documento del empleado de la empresa|
| Sexo | CHAR   |XXX|TAB|||Sexo del empleado de la empresa|
| Fecha de Nacimiento | DATE   |AAAAMMDD|Válida en Calendario|||Fecha de nacimiento del empleado de la empresa|
| Edad | INT   |99|>18|Años|Fecha de Nacimiento|Edad del empleado de la empresa|
| Estado Civil | CHAR   |X|TAB|||Estado Civil del empleado de la empresa|
| País de Nacimiento | CHAR   |X(30)|NOT NULL|||País de Nacimiento del empleado de la empresa|
| Celular | INT   |999999999|9 Dígitos|||Celular del empleado de la empresa|
| Teléfono de Oficina | INT   |9999999|7 Dígitos|||Teléfono de oficino del empleado de la empresa|
| e-mail personal | CHAR   |X*@X*.X*|Dirección correcta según RFC8398|||Correo personal del empleado de la empresa|
| e-mail corporativo | CHAR   |X*@X*.X*|Dirección correcta según RFC8398|||Correo corporativo del empleado de la empresa|
| Dirección | CHAR   |X(150)|NOT NULL|||Domicilio vigente del empleado de la empresa|
| Grupo Sanguíneo | CHAR   |XX|TAB|||Grupo Sanguíneo del empleado de la empresa|
| Régimen Pensionario | CHAR   |XXX|TAB|||Régimen pensionario del empleado de la empresa|
| Situación de Discapacidad | CHAR   |XX|TAB|||Indica si el empleado de la empresa sufre o no una discapacidad|
| Seguro de Salud | CHAR   |XXX|TAB|||Seguro de salud del empleado de la empresa|
| Fecha de Ingreso | CHAR   |DATE|AAAAMMDD|Válida en Calendario||Fecha de ingreso a la empresa del empleado|
| Tipo de Pago | CHAR   |XXX|TAB|||Tipo de pago al empleado de la empresa|
| Medio de Pago | CHAR   |XXXX|TAB|||Medio de pago al empleado de la empresa|
| Cuenta Bancaria | INT   |XXXXXXXXXX|10 Dígitos|||Cuenta bancario del empleado de la empresa, en caso posea|
| Frecuencia de Pago | CHAR   |XXXX|TAB|||Frecuencia de pago al empleado de la empresa|
| Día de Pago | DAY   |XX|Válido en días calendario|||Día de cada mes en el que se efectuará el pago al empleado de la empresa|


#### Nombre entidad: CONTRATO
Semantica: 

| Atributo | Naturaleza  |  Formato  |  Valores validos  |Unidad|Derivada de| Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| id_contrato |INT|99|2 dígitos|||Identificador del contrato firmado por el empleado y la empresa|
| Tipo de Jornada | CHAR   |||||Tipo de jornada que realiza el empleado en la empresa|
| Sueldo Base | CHAR   |||||Sueldo base percibido por el empleado en la empresa|
| Fecha de Contrato | CHAR   |||||Fecha de firma del contrato entre el empleado y la empresa|
| Fecha Término de Contrato | CHAR   |||||Fecha de finalización del contrato firmado entre el empleado y la empresa|
| Estado de Contrato | CHAR   |||||Estado del contrato firmado entre el empleado y la empresa|
| Tipo de Contrato | CHAR   |||||Tipo de contrato firmado entre el empleado y la empresa|
| Horario Semanal | CHAR   |||||Horario semanal realizado por el empleado en la empresa|
| Periodicidad de la Jornada | CHAR   |||||Periodicidad de la jornada semanal por parte del empleado en la empresa|
| Líquido Teórico | CHAR   |||||Líquito teórico que percibe el empleado por parte de la empresa|
| Periodicidad de Pago | CHAR   |||||Periodicidad de pago realizado por la empresa al empleado|


#### Nombre entidad: SOLICITUD
Semantica: Entidad que representa las solicitudes hechas por los empleados

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Descripcion  |  
|----------|----------|----------|----------|----------|
||Verificar la identidad del usuario mediante un correo y una contraseña ingresada de manera correcta||||
| Descripción   | El usuario ingresará su correo y contraseña respectiva para poder acceder al sistema de planillas; dicho sistema se encargará de verificar si los datos ingresados son correctos   ||||
| Actor primario    | Un administrador de RRHH o otro empleado de la empresa  ||||
| Actor secundario    | -  ||||
| Precondiciones    | Los datos que ingrese el usuario deben estar en la base de datos del sistema  ||||

TAB1:
| Codigo | Semantica |
|----------|----------|
| 11 | VALOR 1|
| 22 | VALOR 2|

2. Nombre entidad:
Semantica: 

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Descripcion  |  
|----------|----------|----------|----------|----------|
||Verificar la identidad del usuario mediante un correo y una contraseña ingresada de manera correcta||||
| Descripción   | El usuario ingresará su correo y contraseña respectiva para poder acceder al sistema de planillas; dicho sistema se encargará de verificar si los datos ingresados son correctos   ||||
| Actor primario    | Un administrador de RRHH o otro empleado de la empresa  ||||
| Actor secundario    | -  ||||
| Precondiciones    | Los datos que ingrese el usuario deben estar en la base de datos del sistema  ||||

TAB1:
| Codigo | Semantica |
|----------|----------|
| 11 | VALOR 1|
| 22 | VALOR 2|

## DIAGRAMA ENTIDAD-RELACION
imagen
## REGLAS DE NEGOCIO

# 2. MODELAMIENTO LÓGICO
## DICCIONARIO DE DATOS
#### Nombre entidad: CARGO
Semantica: Función de la cual una persona tiene la responsabilidad en la organización

| Atributo | Naturaleza  |  Formato  |  Valores validos  |Unidad|Derivada de| Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| IdCargo |INT|99|2 dìgitos||
| NombreDeCargo | CHAR   ||||
| Descripcion | CHAR  ||||
| Requerimientos| CHAR  ||||
| IdEmpresa | INT  |999999|6 dìgitos||

## RELACIONES
tabla 
## DICCIONARIO DE DATOS DE RELACIONES N-N (MUCHOS A MUCHOS)
1. Nombre entidad: .
   Semantica:

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Descripcion  |  
|----------|----------|----------|----------|----------|
||Verificar la identidad del usuario mediante un correo y una contraseña ingresada de manera correcta||||
| Descripción   | El usuario ingresará su correo y contraseña respectiva para poder acceder al sistema de planillas; dicho sistema se encargará de verificar si los datos ingresados son correctos   ||||
| Actor primario    | Un administrador de RRHH o otro empleado de la empresa  ||||
| Actor secundario    | -  ||||
| Precondiciones    | Los datos que ingrese el usuario deben estar en la base de datos del sistema  ||||

TAB1:
| Codigo | Semantica |
|----------|----------|
| 11 | VALOR 1|
| 22 | VALOR 2|

##LOOOKUPTABLES




