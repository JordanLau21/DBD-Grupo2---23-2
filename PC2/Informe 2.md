# 1. MODELADO CONCEPTUAL DE DATOS
## DICCIONARIO DE DATOS

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
#### Nombre entidad: SOLICITUD
Semantica: Entidad que representa las solicitudes hechas por los empleados

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
|id_solicitud| INT | 9999999| 7 dígitos | - | - | Diferencia las solicitudes hechas por los empleados|
| tipo_solicitud | CHAR | X(32) | TAB | - | - | Representa el tipo de solicitud del empleado |
| est_solicitud | CHAR | X(32) | TAB | - | - | Representa el estado de la solicitud |
| fec_solicitud | DATE | AAAAMMDD | Válido en calendario | - | - | Fecha de cuando se hizo la solicitud |
| hora_solicitud | TIME | HH:MM:SS | Válido en tiempo | - | - | Hora en la que se hizo la solicitud |
| monto | FLOAT  | 999999.99 | >= 0| En soles | - | Monto que pide de adelanto el empleado | 
| descripcion | VARCHAR | X(32) | NOT NULL | - | - | Descropción de la solicitud del empleado |

TAB:
| Codigo | tipo_solicitud |
|----------|----------|
| ts1 | Licencia |
| ts2 | Reclamo |
| ts3 | Vacaciones|
| ts4 | Aumento |
| ts5 | Adelanto |
| ts6 | Configuración de información |

TAB:
| Codigo | estado_solicitud |
|----------|----------|
| es1 | Denegado |
| es2 | En espera |
| es3 | Aceptado |

#### Nombre entidad: CUENTA
Semantica: Representa el respectivo usuario con el cual dicho empleado iniciará sesión en el sistema de planillas

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  |  
|----------|----------|----------|----------|----------|---------|-------|
| id_cuenta | INT | 999999 | 6 dígitos | - | - | Diferencia al usuario de otros usuarios |
| usuario | VARCHAR | X(32) | NOT NULL | - | - | Nombre creado por el usuario |
| contraseña | VARCHAR | X(32) | NOT NULL | - | - | Permite dar exclusividad al usuario |
| estado_cuenta | CHAR | X(16) | TAB | - | - | Representa el estado en el que se encuentra la cuenta del empleado |

TAB1:
| Codigo | estado_cuenta |
|----------|----------|
| ec1 | ACTIVO |
| ec2 | INACTIVO |

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

TAB: Sexo
|Código|Semantica|
|------|---------|
|MAS|Masculino|
|FEM|Femenino|
|OTR|Otro|

TAB: Estado Civil
|Código|Semantica|
|------|---------|
|S|Soltero(a)|
|C|Casado(a)|
|D|Divorciado(a)|
|V|Viudo(a)|

TAB: Grupo Sanguíneo
|Código|Semantica|
|------|---------|
|A|ABO|
|R|RH|

TAB: Régimen Pensionario
|Código|Semantica|
|------|---------|
|AFP|Administradoras de Fondo de Pensiones|
|ONP|Oficina de Normalización Previsional|

TAB: Situación de Discapacidad
|Código|Semantica|
|------|---------|
|PD|Posee discapacidad|
|NP|No posee discapacidad|

TAB: Seguro de Salud
|Código|Semantica|
|------|---------|
|PUB|Seguro de Salud Público|
|PRI|Seguro de Salud Privado|

TAB: Tipo de Pago
|Código|Semantica|
|------|---------|
|EFEC|Efectivo|
|BANC|Transferencia Bancaria|
|CHEQ|Cheque|

TAB: Medio de Pago
|Código|Semantica|
|------|---------|
|A|BBVA|
|B|BCP|
|C|Interbank|
|D|Scotiabank|
|E|Banco Falabella|
|F|Banco Ripley|
|G|Banco Pichincha|

TAB: Frecuencia de Pago
|Código|Semantica|
|------|---------|
|MENS|Mensual|
|QUIN|Quincenal|


#### Entidad: CONTRATO
Semantica: Acuerdo firmado por el empleado y la empresa en que se esécifican los términos acordados entre ambas partes

| Atributo | Naturaleza  |  Formato  |  Valores validos  |Unidad|Derivada de| Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| id_contrato |INT|99|2 dígitos|||Identificador del contrato firmado por el empleado y la empresa|
| Tipo de Jornada | CHAR   |XXXX|TAB|||Tipo de jornada que realiza el empleado en la empresa|
| Sueldo Base | FLOAT   |99999.99|>0|||Sueldo base percibido por el empleado en la empresa|
| Fecha de Contrato | DATE   |AAAAMMDD|Válido en calendario|||Fecha de firma del contrato entre el empleado y la empresa|
| Fecha Término de Contrato | DATE   |AAAAMMDD|Válido en calendario|||Fecha de finalización del contrato firmado entre el empleado y la empresa|
| Estado de Contrato | CHAR   |XXX|TAB|||Estado del contrato firmado entre el empleado y la empresa|
| Tipo de Contrato | CHAR   |XXX|TAB|||Tipo de contrato firmado entre el empleado y la empresa|
| Horario Semanal | TIME   |HH:MM:SS-HH:MM:SS|[00:00:00-23:59:59]|||Horario semanal realizado por el empleado en la empresa|
| Periodicidad de la Jornada | CHAR   |XXXX|TAB|||Periodicidad de la jornada semanal por parte del empleado en la empresa|
| Líquido Teórico | FLOAT   |99999.99|>0|||Líquito teórico que percibe el empleado por parte de la empresa|
| Periodicidad de Pago | CHAR   |XXXX|TAB|||Periodicidad de pago realizado por la empresa al empleado|

TAB: Tipo de Jornada
|Código|Semantica|
|------|---------|
|ORDI|Ordinaria|
|PARC|Parcial|
|EXCE|Excenta|

TAB: Estado de Contrato
|Código|Semantica|
|------|---------|
|VIG|Vigente|
|FIN|Finalizado|
|RES|Rescindido|

TAB: Tipo de Contrato
|Código|Semantica|
|------|---------|
|IND|Indefinido|
|OBR|Obra|
|PLF|Plazo Fijo|

TAB: Periodicidad de la Jornada
|Código|Semantica|
|------|---------|
|MENS|Mensual|
|DIAR|Diaria|

TAB: Periodicidad de Pago
|Código|Semantica|
|------|---------|
|MENS|Mensual|
|QUIN|Quincenal|

#### Entidad: CARGO
Semantica: Función de la cual una persona tiene la responsabilidad en la organización

| Atributo | Naturaleza  |  Formato  |  Valores validos  |Unidad|Derivada de| Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| IdCargo |INT|99|2 dìgitos||
| NombreDeCargo | CHAR   |X(40)|NOT NULL||
| Descripcion | CHAR  |X(100)|NOT NULL||
| Requerimientos| CHAR  |X(100)|NOT NULL||
| IdEmpresa | INT  |999999|6 dìgitos||

#### Entidad: AREA
Semantica: Función de la cual una persona tiene la responsabilidad en la organización

| Atributo | Naturaleza  |  Formato  |  Valores validos  |Unidad|Derivada de| Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| IdArea |INT|99|2 dìgitos||
| NombreArea | CHAR   |X(20)|NOT NULL||
| DescripcionArea | CHAR  |X(100)|NOT NULL||
| EstadoDeArea| CHAR  |X(10)|NOT NULL||

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


## LOOKUP TABLES
- Empleado / Contrato



# 3. VALIDACIÓN DEL ESQUEMA UTILIZADO LAS FORMAS NORMALES




