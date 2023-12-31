# 0. GRABACIONES INDIVIDUALES

#### Link del repositorio OneDrive: [REPO](https://unipe-my.sharepoint.com/:f:/g/personal/jean_yucra_s_uni_pe/EsvbOPh8oYBFoIiMJ6urTQMBgd3mRbZN3uTgxpePPa_d6A?e=feTYoL)

# 1. MODELADO CONCEPTUAL DE DATOS

![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/b66ff0a7-e467-4384-8e46-474ab7a93587)

# 2. MODELAMIENTO LÓGICO
## DIAGRAMA DE MODELADO RELACIONAL

![image (1)](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/e903d1b6-2d7b-4124-917b-1f9c186e474f)

## DICCIONARIO DE DATOS
#### Nombre entidad: SOLICITUD
Semantica: Entidad que representa las solicitudes hechas por los empleados

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
|id_solicitud| INTEGER | 9999999| 7 dígitos | - | - | Diferencia las solicitudes hechas por los empleados|
| fec_solicitud | DATE | AAAAMMDD | Válido en calendario | - | - | Fecha de cuando se hizo la solicitud |
| hora_solicitud | TIME | HH:MM:SS | Válido en tiempo | - | - | Hora en la que se hizo la solicitud |
| monto | NUMERIC  | 999999.99 | >= 0| En soles | - | Monto que pide de adelanto el empleado | 
| descripcion | VARCHAR | X(32) | NOT NULL | - | - | Descropción de la solicitud del empleado |
| id_tipo_solicitud | INTEGER | 99999 | 5 dígitos | - | - | Doferencia el tipo de solicitud del empleado |
| id_est_solicitud | INTEGER | 99999 | 5 dígitos | - | - | Diferencia el estado de la solicitud de un empleado |
| id_empleado |INTEGER|999999|6 dígitos|||Identificar al empleado a nivel de la empresa|
| id_empresa | NUMERIC | 9999 | 4 dígitos | - | - | Identificador de la empresa |

#### Nombre entidad: ESTADO SOLICITUD
Semantica: Entidad que representa el estado de las solicitudes hechas por los empleados

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| id_est_solicitud | INTEGER | 99999 | 5 dígitos | - | - | Diferencia el estado de la solicitud de un empleado |
| descripcion_solicitud | CHAR | X(3) | NOT NULL | - | - | Representa el estado de la solicitud de un empleado |


#### Nombre entidad: TIPO SOLICITUD
Semantica: Entidad que representa el tipo de las solicitudes hechas por los empleados

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| id_tipo_solicitud | INTEGER | 99999 | 5 dígitos | - | - | Diferencia el tipo de solicitud del empleado |
| descripcion_tipo_solicitud | CHAR | X(3) | NOT NULL | - | - | Representa el tipo de solicitud del empleado |



#### Nombre entidad: CUENTA
Semantica: Representa el respectivo usuario con el cual dicho empleado iniciará sesión en el sistema de planillas

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  |  
|----------|----------|----------|----------|----------|---------|-------|
| id_cuenta | INTEGER | 999999 | 6 dígitos | - | - | Diferencia al usuario de otros usuarios |
| usuario | VARCHAR | X(32) | NOT NULL | - | - | Nombre creado por el usuario |
| contraseña | VARCHAR | X(32) | NOT NULL | - | - | Permite dar exclusividad al usuario |
| id_estado_cuenta | INTEGER | 99999 | 5 digitos | - | - | Diferencia el estado en el que se encuentra la cuenta del empleado |

#### Nombre entidad: ESTADO CUENTA
Semantica: Representa el estado del respectivo usuario con el cual dicho empleado iniciará sesión en el sistema de planillas

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  |  
|----------|----------|----------|----------|----------|---------|-------|
| id_estado_cuenta | INTEGER | 99999 | 5 digitos | - | - | Diferencia el estado en el que se encuentra la cuenta del empleado |
| descripcion_estado_cuenta | CHAR | X(3) | NOT NULL | - | - | Representa el estado en el que se encuentra la cuenta del empleado |

#### Entidad: EMPLEADO
Semantica: Persona que trabaja en la empresa a cambio de una remuneración

| Atributo | Naturaleza  |  Formato  |  Valores validos  |Unidad|Derivada de| Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| id_empleado |INTEGER|999999|6 dígitos|||Identificar al empleado a nivel de la empresa|
| Nombre | CHAR   |X(60)|NOT NULL|||Nombre del empleado de la empresa|
| Apellido Paterno | CHAR  |X(60)|NOT NULL|||Apellido paterno del empleado de la empresa|
| Apellido Materno| CHAR  |X(60)|NOT NULL|||Apellido materno del empleado de la empresa|
| Tipo Documento | CHAR|XXXXXXX|TAB|||Tipo de documento con el que se identifica el empleado de la empresa|
| Nro Documento | INTEGER|99999999|8 dígitos|||Número de documento del empleado de la empresa|
| Sexo | CHAR   |XXX|TAB|||Sexo del empleado de la empresa|
| Fecha de Nacimiento | DATE   |AAAAMMDD|Válida en Calendario|||Fecha de nacimiento del empleado de la empresa|
| Edad | INTEGER   |99|>18|Años|Fecha de Nacimiento|Edad del empleado de la empresa|
| Estado Civil | CHAR   |X|TAB|||Estado Civil del empleado de la empresa|
| País de Nacimiento | CHAR   |X(30)|NOT NULL|||País de Nacimiento del empleado de la empresa|
| Celular | INTEGER   |999999999|9 Dígitos|||Celular del empleado de la empresa|
| Teléfono de Oficina | INTEGER   |9999999|7 Dígitos|||Teléfono de oficino del empleado de la empresa|
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
| Cuenta Bancaria | INTEGER   |XXXXXXXXXX|10 Dígitos|||Cuenta bancario del empleado de la empresa, en caso posea|
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
|NOP|No Posee|

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
|H|No|

TAB: Frecuencia de Pago
|Código|Semantica|
|------|---------|
|MENS|Mensual|
|QUIN|Quincenal|


#### Entidad: CONTRATO
Semantica: Acuerdo firmado por el empleado y la empresa en que se esécifican los términos acordados entre ambas partes

| Atributo | Naturaleza  |  Formato  |  Valores validos  |Unidad|Derivada de| Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| id_contrato |INTEGER|99|2 dígitos|||Identificador del contrato firmado por el empleado y la empresa|
| Tipo de Jornada | CHAR   |XXXX|TAB|||Tipo de jornada que realiza el empleado en la empresa|
| Sueldo Base | NUMERIC   |99999.99|>0|Soles||Sueldo base percibido por el empleado en la empresa|
| Fecha de Contrato | DATE   |AAAAMMDD|Válido en calendario|||Fecha de firma del contrato entre el empleado y la empresa|
| Fecha Término de Contrato | DATE   |AAAAMMDD|Válido en calendario|||Fecha de finalización del contrato firmado entre el empleado y la empresa|
|id_estado_contrato | INTEGER   |XXX| |||Identificador del estado del contrato firmado entre el empleado y la empresa|
|id_tipo_contrato | INTEGER   |XXX| |||Identificador del tipo de contrato firmado entre el empleado y la empresa|
| Horario Semanal | TIME   |HH:MM:SS-HH:MM:SS|[00:00:00-23:59:59]|||Horario semanal realizado por el empleado en la empresa|
| Periodicidad de la Jornada | CHAR   |XXXX|TAB|||Periodicidad de la jornada semanal por parte del empleado en la empresa|
| Líquido Teórico | NUMERIC   |99999.99|>0|Soles||Líquito teórico que percibe el empleado por parte de la empresa|
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

Lookup Tables
| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
|id_estado_contrato|INTEGER|XXX||||Identificador del estado del actual contrato del empleado|
|descricpion_estado_contrato|CHAR|X(3)|NOT NULL|||Representa el estado del contrato del empleado|

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
|id_tipo_contrato|INTEGER|XXX||||Identificador del tipo de contrato del empleado|
|descricpion_tipo_contrato|CHAR|X(3)|NOT NULL|||Representa el tipo de contrato del empleado|


#### Entidad: CARGO
Semantica: Función de la cual una persona tiene la responsabilidad en la organización

| Atributo | Naturaleza  |  Formato  |  Valores validos  |Unidad|Derivada de| Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| IdCargo |INTEGER|99|2 dìgitos|-|-|Identifica y diferencia  a los diferentes cargos del personal |
| NombreDeCargo | VARCHAR   |X(40)|NOT NULL|-|-|Nombre del cargo de cada elemento del personal|
| Descripcion | VARCHAR  |X(100)|NOT NULL|-|-|Descripción general del cargo|
| Requerimientos| VARCHAR  |X(100)|NOT NULL|-|-|Requerimientos necesarios minimos del cargo|
| IdEmpresa | INTEGER  |999999|6 dìgitos|-|-|Identifica y diferencia a la empresa|

#### Entidad: AREA
Semantica: Son las diversas actividades màs importantes de la empresa

| Atributo | Naturaleza  |  Formato  |  Valores validos  |Unidad|Derivada de| Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| IdArea |INTEGER|99|2 dìgitos|-|-|Identifica y diferencia  a las diferentes áreas|
| NombreArea | VARCHAR   |X(20)|NOT NULL|-|-|Nombre del área funcional de la empresa|
| DescripcionArea | VARCHAR  |X(100)|NOT NULL|-|-|Descripcion general del área funcional de la empresa|
| EstadoDeArea| VARCHAR  |X(10)|NOT NULL|-|-|Estado operativo del area funcional de la empresa|

#### Nombre entidad: ASISTENCIAS
Semantica: Entidad representa el registros de las asistencias, licencias, vacaciones.

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| id_asistencia | NUMERIC | 9999 | 4 dígitos | - | - | Identificador de un registro de asistencia en particular|
| fecha_inicio | DATE | AAAAMMDD | Valiido en fecha | - | - | Fecha del registro de dicha asistencia |
| fecha_final | DATE | AAAAMMDD | Valiido en fecha | - | - | Fecha final del registro de dicha asistencia |
| comentario| VARCHAR | X(100) | Not Null | - | - | Comentario sobre dicha asistencia, licencia, permiso registrado |
| valor | NUMERIC | 99 | Válido en tiempo | - | - | Valor contable relacionado al concepto |
| estado | CHAR  | X(1) | TAB |- | - | Estado de dicho registro | 
| id_concepto | NUMERIC | 99 | 2 digitos | Not Null | - | Identificador del concepto de nomina que esta registrando |
| id_boleta | INTEGER  | 9999 | 4 digitos | Not Null | - | Identificador de la boleta de pago en donde se esta registrando | 

TAB:
| Codigo | estado |
|----------|----------|
| A | Activo |
| I | Inactivo |

#### Nombre entidad: MOVIMIENTO PLANILLA
Semantica:  Representa los movimientos de planilla registrados dentro de la empresa

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| id_mov_plan | NUMERIC | 9999 | 4 dígitos | - | - | Identificador de un registro del movimiento planilla en particular|
| fecha_inicio | DATE | AAAAMMDD | Valiido en fecha | - | - | Fecha del registro de dicho movimiento planilla |
| fecha_final | DATE | AAAAMMDD | Valiido en fecha | - | - | Fecha final del registro de movimiento planilla |
| descripcion | VARCHAR | X(100) | Not Null | - | - | Descripcion sobre el movimiento de planilla registrado |
| monto | DECIMAL(4,2) | 9999.99 | Válido en tiempo | - | - | Monto en soles, que se le asignara a dicho registro |
| estado | CHAR  | X(1) | TAB |- | - | Estado de dicho registro | 
| id_concepto | NUMERIC | 99 | 2 digitos | Not Null | - | Identificador del concepto de nomina que esta registrando |
| id_boleta | NUMERIC  | 9999 | 4 digitos | Not Null | - | Identificador de la boleta de pago en donde se esta registrando | 

TAB:
| Codigo | estado |
|----------|----------|
| A | Activo |
| I | Inactivo |

#### Nombre entidad: PLANILLA
Semantica:  Representa al documento que alberga a todos los trabajadores activos durante un periodo que recibiran pago por su trabajo en dicho periodo

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| id_planilla | INTEGER | 999999 | 6 dígitos | - | - | Identificad or único de planilla|
| periodo | CHAR | XXXXXXXX | NOT NULL | - | - | Fecha final del registro de movimiento planilla |
| dias_laborables | INTEGER | 99 | >0 | - | - | Descripcion sobre el movimiento de planilla registrado |
| fechaIinicio | DATE | AAAAMMDD | Válido en calendario | - | - | Monto en soles, que se le asignara a dicho registro |
| fechaFin | DATE  | AAAAMMDD | Válido en calendario |- | - | Estado de dicho registro | 
| fechaCalculo | DATE | AAAAMMDD | Válido en calendario |- | - | Identificador del concepto de nomina que esta registrando |


#### Nombre entidad: BOLETA
Semantica:  Boleta que registra el pago a uun trabajador de la planilla en determinado periodo
| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| id_boleta | INTEGER | 999999 | 6 dígitos | - | - | Identificador único de boleta|
| id_planilla | INTEGER | 999999 | 6 dígitos | - | - | Identificador unico de planilla a la que pertenece esta boleta |
| id_empleado | INTEGER | 99 | 7 dígitos | - | - | Identificador único de empleado al que le pertenece esta boleta |
| totalIngresos | NUMERIC | >=0 | soles| - | - | Total de ingresos del empleado en el periodo |
| totalDescuentos| NUMERIC  | >=0 |soles |- | - | Total de descuentos del empleado en el periodo | 
| TotalNeto | NUMERIC | 999999.99 | >=0 |soles | totalIngresos - totalDescuentos | Total neto que se le pagará al empleado |
| TotalAporte| NUMERIC | 999999.99 | >=0 | soles | - | Total de aportes que recibe este empleado |

#### Nombre entidad: CONCEPTO NOMINA
Semantica:  Representa un concepto que INTEGERerviene en el calculo de la boleta
| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| Id_concepto | INTEGER | 999999 | 6 dígitos | - | - | Identificador único de boleta|
| nombreConcepto | CHAR | X(30) | NOT NULL | - | - | Identificador unico de planilla a la que pertenece esta boleta |
| Id_TipoOperacion | CHAR | XXX | TAB | - | - | Identificador único de empleado al que le pertenece esta boleta |
| Id_estadoConcepto | CHAR | XXX | TAB| - | - | Total de ingresos del empleado en el periodo |
| valor | NUMERIC | 9.99 | >=0 | - | - | Total neto que se le pagará al empleado |

TAB:
| Codigo | tipoOperacion |
|----------|----------|
| TO1 | Beneficio |
| TO2 | Descuento |
| TO3 | Aporte |

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| Id_TipoOperacion| INTEGER | 999999 | 6 dígitos | - | - | Identificador único de tipo de operacion|
| descripcion_TipoOperacion| CHAR(3) | XXX | NOT NULL | - | - | Descripcion de tipo de operacion |


| Codigo | estadoConcepto |
|----------|----------|
| EC1 | Activo |
| EC2 | Inactivo |

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  | 
|----------|----------|----------|----------|----------|----------|----------|
| Id_estadoConcepto| INTEGER | 999999 | 6 dígitos | - | - | Identificador único de estado del concepto|
| descripcion_estadoConcepto| CHAR(3) | XXX | NOT NULL | - | - | Descripcion del estado de concepto|


#### Nombre entidad: EMPRESA
Semantica:  Representa a la entidad que almacenara informacion de la empresa

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| id_empresa | NUMERIC | 9999 | 4 dígitos | - | - | Identificador de la empresa |
| razon_social | VARCHAR | X(200) | NOT NULL | - | - | Nombre de la empresa registrada en el Registro de Entidades Contratantes |
| ruc | VARCHAR | X(20) | NOT NULL | - | - | Corresponde al Registro Único de Contribuyentes, el número que identifica a la empresa ante la SUNAT |
| rubro | VARCHAR | X(35) | NOT NULL | - | - | Corresponde al sector dentro de la actividad económica |
| estado | CHAR  | X(1) | TAB |- | - | Corresponde al estado de empresa contratante, informado por la misma | 
| id_cuenta_empresa | NUMERIC | 999999 | 6 dígitos | - | - | Diferencia al usuario de otros usuarios |

TAB:
| Codigo | estado |
|----------|----------|
| A | Activo |
| I | Inactivo |

#### Nombre entidad: CUENTA EMPRESA
Semantica: Representa el respectivo usuario con el cual dicho empleado iniciará sesión en el sistema de planillas

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  |  
|----------|----------|----------|----------|----------|---------|-------|
| id_cuenta_empresa | INTEGER | 999999 | 6 dígitos | - | - | Diferencia al usuario de otros usuarios |
| usuario | VARCHAR | X(32) | NOT NULL | - | - | Nombre creado por el usuario |
| contraseña | VARCHAR | X(32) | NOT NULL | - | - | Permite dar exclusividad al usuario |

#### Nombre entidad: REPRESENTANTE LEGAL
Semantica:  Persona que representa a una empresa vinculada a un sector.

| Atributo | Naturaleza  |  Formato  |  Valores validos  |  Unidad  |  Derivada de  |  Descripcion  |  
|----------|----------|----------|----------|----------|----------|----------|
| id_representante | NUMERIC | 9999 | 4 dígitos | - | - | Identificador del representante legal |
| Nombre | CHAR   | X(60) | NOT NULL | - | - | Nombre del representante legal |
| Apellido Paterno | CHAR  | X(60) | NOT NULL | - | - | Apellido paterno del representante legal de la empresa |
| Apellido Materno| CHAR | X(60) | NOT NULL | - | - | Apellido materno del representante legal de la empresa |
| Nro Documento | CHAR | 99999999 | 8 dígitos | - | - | Número de documento del representante legal de la empresa |
| Sexo | CHAR   | XXX | TAB | - | - | Sexo del representante legal de la empresa |
| Fecha de Nacimiento | DATE   | AAAAMMDD | Válida en Calendario | - | - | Fecha de nacimiento del representante legal de la empresa |
| estado | CHAR  | X(1) | TAB | - | - | Corresponde al estado del representante legal de la empresa | 
| id_empresa | NUMERIC | 9999 | 4 dígitos | - | - | Identificador de la empresa |

TAB:

TAB: Sexo
|Código|Semantica|
|------|---------|
|MAS|Masculino|
|FEM|Femenino|
|OTR|Otro|

| Codigo | estado |
|----------|----------|
| A | Activo |
| I | Inactivo |


## RELACIONES
### TABLA DE RELACIONES

| Nombre de la relacion | Entidades participantes  |  Cardinalidad  |  Atributos  |  ¿Entidad Aparte? |  
|----------|----------|----------|----------|----------|
| Envía | EMPLEADO-SOLICITUD | 1-N | - | NO |
| Pertenece | SOLCITUD-EMPRESA | N-1 | - | NO |
| Tiene | EMPRESA-REPRESENTANTE LEGAL | 1-N | - | NO |
| Tiene | EMPRESA-CUENTA EMPRESA | 1-1 | - | NO |
| Tiene | EMPRESA-ÁREA | 1-N | - | NO |
| Tiene | EMPRESA-EMPLEADO | 1-N | - | NO |
| Maneja | EMPRESA-CARGO | 1-N | - | NO |
| Tiene | ÁREA-CONTRATO | 1-N | - | NO |
| Tiene | CONTRATO-EMPLEADO | N-1 | - | NO |
| Tiene | CONTRATO-ASISTENCIAS | 1-N | - | NO |
| Tiene | CONTRATO-BOLETA | 1-N | - | NO |
| Tiene | CONTRATO-CARGO | N-1 | - | NO |
| Tiene | CONTRATO-MOVIMIENTO DE PLANILLA | 1-N | - | NO |
| Compuesta | MOVIMIENTO DE PLANILLA-BOLETA | N-1 | - | NO |
| Tiene | MOVIMIENTO DE PLANILLA-CONCEPTO NOMINA | N-1 | - | NO |
| Tiene | PLANILLA-BOLETA | 1-N | - | NO |
| Compuesta | ASISTENCIAS-BOLETA | N-1 | - | NO |
| Tiene | ASISTENCIAS-CONCEPTO NOMINA | N-1 | - | NO |
| Tiene | EMPLEADO-CUENTA | 1-1 | - | NO |
| Contiene | EMPLEADO-FAMILIAR EMPLEADO | 1-N | - | NO |



# 3. VALIDACIÓN DEL ESQUEMA UTILIZADO LAS FORMAS NORMALES

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
![image1](https://github.com/luisfhs712/DBD_LUIS__PERS_23-1/blob/c5cda6dd4bea271181432fa153197d74a9215fbc/image1.png)

# 4. CREACIÓN DE TABLAS
- Tabla: SOLICITUD
```
CREATE TABLE SOLICITUD(
    id_solicitud INTEGER PRIMARY KEY,
    monto INTEGER,
    fec_solicitud TIME NOT NULL,
    hora_solicitud DATE NOT NULL,
    id_est_solicitud INTEGER NOT NULL,
    id_tipo_solicitud INTEGER NOT NULL,
    id_empresa INTEGER NOT NULL,
    id_empleado INTEGER NOT NULL
);
```
- Tabla: ESTADO_SOLICITUD
```
CREATE TABLE ESTADO_SOLICITUD(
    id_est_solicitud INTEGER PRIMARY KEY,
    descripcion_est_solicitud CHAR(3)
);
```
- Tabla: TIPO_SOLICITUD
```
CREATE TABLE TIPO_SOLICITUD(
    id_tipo_solicitud INTEGER PRIMARY KEY,
    descripcion_tipo_solicitud CHAR(3)
);
```
- Tabla: CUENTA
```
CREATE TABLE CUENTA(
    id_cuenta INTEGER PRIMARY KEY,
    usuario VARCHAR(32) NOT NULL,
    contraseña VARCHAR(32) NOT NULL,
    id_estado_cuenta INTEGER NOT NULL
);
```
- Tabla: ESTADO_CUENTA
```
CREATE TABLE ESTADO_CUENTA(
    id_estado_cuenta INTEGER PRIMARY KEY,
    descripcion_estado_cuenta CHAR(3) NOT NULL
);
```
- Tabla: CUENTA EMPRESA
```
CREATE TABLE CUENTA_EMPRESA (
    id_cuenta_empresa INT GENERATED ALWAYS AS IDENTITY,
    usuario VARCHAR(32) UNIQUE NOT NULL,
    contraseña VARCHAR(32) UNIQUE NOT NULL,
  	PRIMARY KEY(id_cuenta_empresa)
);
```
---
- Tabla: EMPRESA
```
CREATE TABLE EMPRESA(
  id_empresa INT GENERATED ALWAYS AS IDENTITY,
  id_cuenta_empresa INT,
  razon_social VARCHAR(200) NOT NULL,
  ruc VARCHAR(20) NOT NULL,
  rubro VARCHAR(35) NOT NULL,
  PRIMARY KEY(id_empresa),
  CONSTRAINT fk_cuenta_empresa
  	FOREIGN KEY(id_cuenta_empresa)
  	REFERENCES CUENTA_EMPRESA(id_cuenta_empresa)
  	ON DELETE SET NULL
);
```
- Tabla: REPRESENTANTE LEGAL
```
CREATE TABLE REPRESENTANTE_LEGAL (
    id_representante INT GENERATED ALWAYS AS IDENTITY,
  	id_empresa INT,
    Nombre CHAR(60) NOT NULL,
    Apellido_Paterno CHAR(60) NOT NULL,
    Apellido_Materno CHAR(60) NOT NULL,
    Nro_Documento CHAR(8),
    Sexo CHAR(3),
    Fecha_de_Nacimiento DATE,
  	PRIMARY KEY(id_representante),
  	CONSTRAINT fk_empresa
  		FOREIGN KEY(id_empresa)
  		REFERENCES EMPRESA(id_empresa)
  		ON DELETE SET NULL
);
```
-tabla: CARGO
```
CREATE TABLE CARGO (
    id_cargo INT GENERATED ALWAYS AS IDENTITY,
    nombre_cargo VARCHAR(40) NOT NULL,
    descripcion VARCHAR(100) NOT NULL,
    requerimientos VARCHAR(100) NOT NULL,
    PRIMARY KEY(id_cargo),
    CONSTRAINT fk_empresa
  		FOREIGN KEY(id_empresa)
  		REFERENCES EMPRESA(id_empresa)
  		ON DELETE SET NULL
);
```
-tabla: AREA
```
CREATE TABLE AREA (
    id_area INT GENERATED ALWAYS AS IDENTITY,
    nombre_area VARCHAR(20) NOT NULL,
    descripcion VARCHAR(100) NOT NULL,
    PRIMARY KEY(id_area),
    CONSTRAINT fk_empresa
  		FOREIGN KEY(id_empresa)
  		REFERENCES EMPRESA(id_empresa)
  		ON DELETE SET NULL  
);
```

- Tabla: PLANILLA
```
CREATE TABLE Planilla (
    id_planilla NUMERIC(6) PRIMARY KEY,
    periodo CHAR(9) NOT NULL,
    dias_laborables NUMERIC(2),
    fechaInicio DATE NOT NULL,
    fechaFinal DATE NOT NULL,
    fechaCalculo DATE,
);
```

- Tabla: BOLETA
```
CREATE TABLE BOLETA (
    id_boleta NUMERIC(6) PRIMARY KEY
    id_planilla NUMERIC(6) NOT NULL,
    id_empleado NUMERIC(6) NOT NULL,
    totalIngresos NUMERIC(9,2) NOT NULL,
    totalDescuentos NUMERIC(9,2) NOT NULL,
    totalNeto NUMERIC(9,2) NOT NULL, 
    totalAporte NUMERIC(O,2) NOT NULL
)
```

- Tabla: CONCEPTO_NOMINA
```
CREATE TABLE CONCEPTO_NOMINA (
    id_concepto INTEGER(6) PRIMARY KEY,
    nombreConcepto VARCHAR(40) NOT NULL,
    tipoOperacion CHAR(3) CHECK (tipoOperacion IN ('TO1', 'TO2', 'TO3')),
    estadoConcepto CHAR(3) CHECK (estadoConcepto IN ('EC1', 'EC2') ),
    valor NUMERIC(1,2),
);
```



# 5. POBLAMIENTO DE DATOS
- SOLICITUD
```
INSERT INTO SOLICITUD (id_solicitud, fec_solicitud_hora_solicitud, monto, descripcion, id_tipo_solicitud, id_est_solicitud, id_empleado, id_empresa)
VALUES (4257930, 20250110, 10:01:15,100, 'QUIERO ADEALNTO YA QUE ME QUEDE SIN DINERO', 15896, 42579,795645, 6534)
INSERT INTO SOLICITUD (id_solicitud, fec_solicitud_hora_solicitud, monto, descripcion, id_tipo_solicitud, id_est_solicitud, id_empleado, id_empresa)
VALUES (4154573, 46476214, 12:41:45,0, 'LICENCIA POR ASUNTO FAMILIAR', 42566, 41258,755445, 6154)
INSERT INTO SOLICITUD (id_solicitud, fec_solicitud_hora_solicitud, monto, descripcion, id_tipo_solicitud, id_est_solicitud, id_empleado, id_empresa)
VALUES (4220340, 75680110, 08:41:14,0, 'QUIERO VACACIONES POR QUE ME LO MERESCO', 12597, 42546,712545, 7934)
INSERT INTO SOLICITUD (id_solicitud, fec_solicitud_hora_solicitud, monto, descripcion, id_tipo_solicitud, id_est_solicitud, id_empleado, id_empresa)
VALUES (6846475, 20242546, 04:11:15,0, 'LICENCIA DEBIDO A QUE QUIERO RECUPERAR A MI ESPOSA', 42368, 42649,765645, 6128)
```
- ESTADO SOLICITUD
```
INSERT INTO ESTADO_SOLICITUD (id_est_solicitud, descripcion_solicitud)
VALUES (42579, 'EN ESPERA')
INSERT INTO ESTADO_SOLICITUD (id_est_solicitud, descripcion_solicitud)
VALUES (41258, 'ACEPTADO')
INSERT INTO ESTADO_SOLICITUD (id_est_solicitud, descripcion_solicitud)
VALUES (42546, 'DENEGADO')
INSERT INTO ESTADO_SOLICITUD (id_est_solicitud, descripcion_solicitud)
VALUES (42649, 'ACEPTADO')
```
- TIPO SOLICITUD
```
INSERT INTO TIPO_SOLICITUD (id_tipo_solicitud, descripcion_tipo_solicitud)
VALUES (15896, 'ADELANTO')
INSERT INTO TIPO_SOLICITUD (id_tipo_solicitud, descripcion_tipo_solicitud)
VALUES (42566, 'LICENCIA')
INSERT INTO TIPO_SOLICITUD (id_tipo_solicitud, descripcion_tipo_solicitud)
VALUES (12597, 'VACACIONES')
INSERT INTO TIPO_SOLICITUD (id_tipo_solicitud, descripcion_tipo_solicitud)
VALUES (42368, 'LICENCIA')
```
- CUENTA
```
INSERT INTO CUENTA (id_cuenta, usuario, contraseña, id_estado_cuenta)
VALUES (425687, 'Jordex14' , 'vivaeldubstep', 12459)
INSERT INTO TIPO_SOLICITUD (id_cuenta, usuario, contraseña, id_estado_cuenta)
VALUES (475847, 'Lezzarth' , 'odiopuno', 12539)
INSERT INTO TIPO_SOLICITUD (id_cuenta, usuario, contraseña, id_estado_cuenta)
VALUES (425687, 'Kettenkrad' , 'vivaelperu', 42286)
INSERT INTO TIPO_SOLICITUD (id_cuenta, usuario, contraseña, id_estado_cuenta)
VALUES (425687, 'JairoKazuo' , 'megustaelplatano', 45647)
```
- ESTADO CUENTA
```
INSERT INTO ESTADO_CUENTA (id_estado_cuenta, descripcion_estado_cuenta)
VALUES (12459, 'ACTIVO')
INSERT INTO ESTADO_CUENTA (id_estado_cuenta, descripcion_estado_cuenta)
VALUES (12539, 'ACTIVO')
INSERT INTO ESTADO_CUENTA (id_estado_cuenta, descripcion_estado_cuenta)
VALUES (42286, 'INACTIVO')
INSERT INTO ESTADO_CUENTA (id_estado_cuenta, descripcion_estado_cuenta)
VALUES (45647, 'ACTIVO')
```
- CUENTA EMPRESA
```
INSERT INTO CUENTA_EMPRESA (usuario, contraseña)
VALUES ('usuario1', 'clave1');
INSERT INTO CUENTA_EMPRESA (usuario, contraseña)
VALUES ('usuario2', 'clave2');
INSERT INTO CUENTA_EMPRESA (usuario, contraseña)
VALUES ('usuario3', 'clave3');
INSERT INTO CUENTA_EMPRESA (usuario, contraseña)
VALUES ('usuario4', 'clave4');
```
- EMPRESAS
```
INSERT INTO EMPRESA (razon_social, ruc, rubro, id_cuenta_empresa)
VALUES ('Tecnosoluciones Perú S.A.C.', '20123456789', 'Tecnología', 1);
INSERT INTO EMPRESA (razon_social, ruc, rubro, id_cuenta_empresa)
VALUES ('Sabores Peruanos E.I.R.L.', '20456789123', 'Alimentación', 2);
INSERT INTO EMPRESA (razon_social, ruc, rubro, id_cuenta_empresa)
VALUES ('Construcciones Andinas S.A.', '20789012345', 'Construcción', 3);
INSERT INTO EMPRESA (razon_social, ruc, rubro, id_cuenta_empresa)
VALUES ('Jurídicos Legales y Asociados S.C.R.L.', '21012345678', 'Servicios Legales', 4);
```
- REPRESENTANTE LEGAL
```
INSERT INTO REPRESENTANTE_LEGAL (Nombre, Apellido_Paterno, Apellido_Materno, Nro_Documento, Sexo, Fecha_de_Nacimiento, id_empresa)
VALUES ('Juan', 'Perez', 'Gomez', '12345678', 'MAS', '1990-05-15', 1);
INSERT INTO REPRESENTANTE_LEGAL (Nombre, Apellido_Paterno, Apellido_Materno, Nro_Documento, Sexo, Fecha_de_Nacimiento, id_empresa)
VALUES ('María', 'González', 'Lopez', '87654321', 'FEM', '1985-08-20', 2);
INSERT INTO REPRESENTANTE_LEGAL (Nombre, Apellido_Paterno, Apellido_Materno, Nro_Documento, Sexo, Fecha_de_Nacimiento, id_empresa)
VALUES ('Pedro', 'Ramirez', 'Santos', '98765432', 'MAS', '1980-12-10', 3);
INSERT INTO REPRESENTANTE_LEGAL (Nombre, Apellido_Paterno, Apellido_Materno, Nro_Documento, Sexo, Fecha_de_Nacimiento, id_empresa)
VALUES ('Luisa', 'Mendoza', 'Perez', '76543210', 'FEM', '1975-04-05', 4);
```
CARGO
```
INSERT INTO CARGO  (id_cargo, nombre_cargo, descripcion, requerimientos, id_empresa)
VALUES (11, 'Contador', 'manejar informacion financiera', 'Licenciatura en contabilidad', 478221);
INSERT INTO CARGO  (id_cargo, nombre_cargo, descripcion, requerimientos, id_empresa)
VALUES (14, 'Administrador', 'gestion empresarial', 'Licenciatura en administracion', 975541);
```
AREA
```
INSERT INTO AREA  (id_area, nombre_area, descripcion, estado)
VALUES (15, 'Finanzas', 'Gstion de recursos financieros', 'A');
INSERT INTO AREA  (id_area, nombre_area, descripcion, estado)
VALUES (12, 'Contabilidad', 'Resgistro de operaciones financieras', 'I');
```
