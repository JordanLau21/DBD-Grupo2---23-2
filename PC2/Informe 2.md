# 1. MODELADO CONCEPTUAL DE DATOS
## DICCIONARIO DE DATOS
#### Nombre entidad: EMPLEADO
Semantica: 

| Atributo | Naturaleza  |  Formato  |  Valores validos  |Unidad|Derivada de| Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| id_empleado |INT|99|2 dìgitos||
| Nombre | CHAR   ||||
| Apellido Paterno | CHAR  ||||
| Apellido Materno| CHAR  ||||
| Tipo Documento | CHAR   ||||
| Nro Documento | CHAR   ||||
| Sexo | CHAR   ||||
| Fecha de Nacimiento | CHAR   ||||
| Edad | INT  |999999|6 dìgitos||
| Estado Civil | CHAR   ||||
| País de Nacimiento | CHAR   ||||
| Celular | CHAR   ||||
| Teléfono de Oficina | CHAR   ||||
| e-mail personal | CHAR   ||||
| e-mail corporativo | CHAR   ||||
| Dirección | CHAR   ||||
| Grupo Sanguíneo | CHAR   ||||
| Régimen Pensionario | CHAR   ||||
| Situación de Discapacidad | CHAR   ||||
| Seguro de Salud | CHAR   ||||
| Fecha de Ingreso | CHAR   ||||
| Tipo de Pago | CHAR   ||||
| Medio de Pago | CHAR   ||||
| Cuenta Bancaria | CHAR   ||||
| Frecuencia de Pago | CHAR   ||||
| Día de Pago | CHAR   ||||


#### Nombre entidad: CONTRATO
Semantica: 

| Atributo | Naturaleza  |  Formato  |  Valores validos  |Unidad|Derivada de| Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| id_contrato |INT|99|2 dìgitos||
| Tipo de Jornada | CHAR   ||||
| Sueldo Base | CHAR   ||||
| Fecha de Contrato | CHAR   ||||
| Fecha Término de Contrato | CHAR   ||||
| Estado de Contrato | CHAR   ||||
| Tipo de Contrato | CHAR   ||||
| Horario Semanal | CHAR   ||||
| Periodicidad de la Jornada | CHAR   ||||
| Líquido Teórico | CHAR   ||||
| Periodicidad de Pago | CHAR   ||||


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




