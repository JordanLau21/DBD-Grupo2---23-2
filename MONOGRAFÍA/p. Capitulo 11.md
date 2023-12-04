# CAPITULO 11: ASIGNACIÓN DE CÓDIGOS A REQUERIMIENTOS E INTERFACES

## CÓDIGOS DE REQUERIMIENTO

<table>
	<tbody>
		<tr>
			<td>N</td>
			<td>MÓDULO</td>
			<td>N</td>
			<td>REQUERIMIENTO</td>
			<td>CÓDIGO</td>
		</tr>
		<tr>
			<td rowspan="3">1</td>
			<td rowspan="3">Autenticación de usuario</td>
			<td>1</td>
			<td>Autenticación de Usuario</td>
			<td>R001</td>
		</tr>
		<tr>
			<td>2</td>
			<td>Olvido de contraseña</td>
			<td>R002</td>
		</tr>
		<tr>
			<td>3</td>
			<td>Cambiar contraseña e iniciar sesión</td>
			<td>R003</td>
		</tr>
		<tr>
			<td rowspan="5">2</td>
			<td rowspan="5">Solicitudes</td>
			<td>4</td>
			<td>Ver solicitudes (Administrador)</td>
			<td>R004</td>
		</tr>
		<tr>
			<td>5</td>
			<td>Detalle de Solicitud</td>
			<td>R005</td>
		</tr>
		<tr>
			<td>6</td>
			<td>Respuesta Solicitud</td>
			<td>R006</td>
		</tr>
		<tr>
			<td>7</td>
			<td>Pantalla Solicitudes (Empleado)</td>
			<td>R007</td>
		</tr>
		<tr>
			<td>8</td>
			<td>Nueva Solicitud</td>
			<td>R008</td>
		</tr>
		<tr>
			<td rowspan="3">3</td>
			<td rowspan="3">Empleados</td>
			<td>9</td>
			<td>Registrar Empleado en Sistema</td>
			<td>R009</td>
		</tr>
		<tr>
			<td>10</td>
			<td>Ver usuarios vigentes o activos</td>
			<td>R010</td>
		</tr>
		<tr>
			<td>11</td>
			<td>Ver usuarios desvinculados o inactivos</td>
			<td>R011</td>
		</tr>
		<tr>
			<td rowspan="2">4</td>
			<td rowspan="2">Administración de la empresa</td>
			<td>12</td>
			<td>Editar información de la empresa</td>
			<td>R012</td>
		</tr>
		<tr>
			<td>13</td>
			<td>Editar las Variables de la Empresa</td>
			<td>R013</td>
		</tr>
		<tr>
			<td rowspan="2">5</td>
			<td rowspan="2">Organización</td>
			<td>14</td>
			<td>Crear nuevo cargo</td>
			<td>R014</td>
		</tr>
		<tr>
			<td>15</td>
			<td>Crear nueva área</td>
			<td>R015</td>
		</tr>
		<tr>
			<td rowspan="6">6</td>
			<td rowspan="6">Planillas</td>
			<td>16</td>
			<td>Planillas</td>
			<td>R016</td>
		</tr>
		<tr>
			<td>17</td>
			<td>Empleados en una planilla</td>
			<td>R017</td>
		</tr>
		<tr>
			<td>18</td>
			<td>Crear una planilla</td>
			<td>R018</td>
		</tr>
		<tr>
			<td>19</td>
			<td>Planillas pagadas</td>
			<td>R019</td>
		</tr>
		<tr>
			<td>20</td>
			<td>Boletas </td>
			<td>R020</td>
		</tr>
		<tr>
			<td>21</td>
			<td>Generar pago</td>
			<td>R021</td>
		</tr>
		<tr>
			<td rowspan="2">7</td>
			<td rowspan="2">Registro de movimientos y asistencias</td>
			<td>22</td>
			<td>Registrar movimiento de planilla</td>
			<td>R022</td>
		</tr>
		<tr>
			<td>23</td>
			<td>Registrar licencias, inasistencias y vacaciones</td>
			<td>R023</td>
		</tr>
	</tbody>
</table>


## REQUERIMIENTOS
### Módulo: Autenticacion de usuario
| Código | R001  |
|----------|----------|
|Nombre  |Autenticación de Usuario|
|Objetivo  |Verificar la identidad del usuario mediante un correo y una contraseña ingresada de manera correcta|
| Descripción   | El usuario ingresará su correo y contraseña respectiva para poder acceder al sistema de planillas; dicho sistema se encargará de verificar si los datos ingresados son correctos   |
| Actor primario    | Un administrador de RRHH o otro empleado de la empresa  |
| Actor secundario    | -  |
| Precondiciones    | Los datos que ingrese el usuario deben estar en la base de datos del sistema  |

| Código | R002  |
|----------|----------|
|Nombre  |Olvido de contraseña|
|Objetivo  |Validar veracidad de usuario para cambiar la contraseña que el usuario ha olvidado.|
| Descripción   | El usuario ingresará sus datos personales para asi poder validar la veracidad de su persona, para que así tenga la potestad de poder cambiarla.   |
| Actor primario    | Un administrador de RRHH u otro empleado de la empresa  |
| Actor secundario    | -  |
| Precondiciones    | Los datos que ingrese el usuario deben estar en la base de datos del sistema  |

| Código | R003 |
|----------|----------|
|Nombre  |Cambiar contraseña e iniciar sesión|
|Objetivo  |Cambiar la contraseña que el usuario ha olvidado e iniciar sesión.|
| Descripción   | Una vez verificado la veracidad del usuario, se le enviará un mensaje de texto a su celular registrado en la base de datos (el codigo será 1234) para que asi este pueda cambiar la contraseña anterior y poder iniciar sesión en su cuenta.  |
| Actor primario    | Un administrador de RRHH u otro empleado de la empresa  |
| Actor secundario    | -  |
| Precondiciones    | Los datos que ingrese el usuario deben estar en la base de datos del sistema  |
### Módulo: Solicitudes
| Código | R004  |
|----------|----------|
|Nombre  |Ver solicitudes (Administrador)|
|Objetivo  |Verficiar todas las solicitudes que el administrador tiene pendientes de aceptar o rechazar.|
| Descripción   | Una vez que el administrador ingrese a la parte de solicitudes, este podrá visualizar todas las solicitudes que se han hecho hasta el momento, donde tendrá acceso a verfiicar los detalles de la solicitud y tendrá la potestad de aprobar o rechazar la solicitud.   |
| Actor primario    | Un administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | Esta vista solo la puede obtener alguien con un correo de administración  |

| Código | R005  |
|----------|----------|
|Nombre  |Detalle de Solicitud|
|Objetivo  |Verificar la sustentación de la solicitud hecha por los empleados.|
| Descripción   | El administrador y los empleados podrán ver los detalles de las solicitudes hechas para así, en el caso de los administradores, poder evaluarlas y darles una respuesta o, en el caso de los empleados, poder verificar los detalles de la solciitud.   |
| Actor primario    | Un administrador de RRHH u otro empleado |
| Actor secundario    | -  |
| Precondiciones    | Los datos que ingrese el usuario deben estar en la base de datos del sistema  |

| Código | R006  |
|----------|----------|
|Nombre  |Respuesta Solicitud|
|Objetivo  |Modificar el estado de una solciitud en espera a Aceptado o Rechazado.|
| Descripción   | Una vez pasada la solicitud por el jefe del empleado y este habiendo dado su respuesta, el administrador podrá cambiar el estado de la solicitud a Aceptado o Rechazado dependiendo de los criterios que tenga el jefe del empleado y el mismo administrador   |
| Actor primario    | Un administrador de RRHH  |
| Actor secundario    | Jefe del empleado solicitante |
| Precondiciones    | Debe haber una solicitud para poder dar respuesta |

| Código | R007  |
|----------|----------|
|Nombre  |Pantalla Solicitudes (Empleado) |
|Objetivo  |Verificar el registro de solicitudes hechas por el empleado.|
| Descripción   | El usuario podrá verificar el historial de sus solicitudes anteriores hechas con detalles y estado incluidos. |
| Actor primario    | Un empleado de la empresa  |
| Actor secundario    | -  |
| Precondiciones    | Para ver el historial, el empleado debe haber hecho obligatoriamente una solciitud anteriormente |

| Código | R008  |
|----------|----------|
|Nombre  |Nueva Solicitud|
|Objetivo  |Generar una nueva solcitud.|
| Descripción   | El usuario podrá generar una nueva solicitud en la cual dependiendo del tipo de solicitud le apareceran 2 diferentes pantallas, una con opción de ingresar un monto (Reclamo, Aumento, Adelanto) y otra sin esa opción (Licencia, Vacaciones, Configuración de Información).   |
| Actor primario    | Un empleado de la empresa  |
| Actor secundario    | -  |
| Precondiciones    | -  |
### Módulo: Empleados
| Código | R009  |
|----------|----------|
|Nombre  |Registrar Empleado en Sistema|
|Objetivo  |Introducir los datos de un empleado con contrato vigente con la empresa al sistema de planillas.|
| Descripción   |A través de la subida de datos del empleado, este podrá visualizar sus planillas.|
| Actor primario    |Administrador|
| Actor secundario    |Empleado|
| Precondiciones    |El empleado debe tener un contrato firmado y vigente con la empresa.|


| Código | R010  |
|----------|----------|
|Nombre  |Ver usuarios vigentes o activos|
|Objetivo  |Visualizar los usuarios activos en el sistema de planillas.|
| Descripción   |El administrador podrá visualizar los usuarios cuyo estado es activo en el momento, es decir, los empleados que tienen contrato vigente con la empresa.|
| Actor primario    |Administrador|
| Actor secundario    |Empleados|
| Precondiciones    |El usuario tiene contrato vigente con la empresa.|

| Código | R011  |
|----------|----------|
|Nombre  |Ver usuarios desvinculados o inactivos|
|Objetivo  |Desvincular a un empleado activo o visualizar a los empleados desvinculados.|
| Descripción   |El administrador podrá desvincular usuarios activos, por término de contrato, además de poder visualizar los empleados desvinculados anteriormente.|
| Actor primario    |Administrador|
| Actor secundario    |Empleados|
| Precondiciones    |El empleado no tiene contrato vigente con la empresa.|


### Módulo: Administración de la Empresa

| Código | R012 |
|----------|----------|
|Nombre  |Editar información de la empresa|
|Objetivo  |Editar información de la empresa en la plataforma|
| Descripción   | Este caso de uso permite al personal de Recursos Humanos (RRHH) editar y actualizar la información de la empresa en la plataforma. La edición de información incluye datos generales, bancos, Régimen y representantes legales de la empresa   |
| Actor primario    | Administrador de R.R. H.H  |
| Actor secundario    | -  |
| Precondiciones    | Acceso a la plataforma con credenciales de usuario válidas, contar con permisos específicos para acceder y visualizar el organigrama de la empresa  |

| Código | R013 |
|----------|----------|
|Nombre  |Editar las Variables de la Empresa|
|Objetivo  |Modificar las variables de la empresa|
| Descripción   | Este procedimiento permite a los administradores realizar ajustes en las variables de sus razones sociales, como EPS, Vida Ley, SCTR Salud, SCTR Pensión, Porcentaje de vida Ley, Porcentaje SCTR Salud, Porcentaje de SCTR Pensión y otros campos relevantes, de acuerdo con la ley del gobierno peruano |
| Actor primario    | Administrador de R.R. H.H  |
| Actor secundario    | -  |
| Precondiciones    | Tener acceso a una cuenta. haber iniciado sesión en la plataforma, contar con los permisos necesarios y disponer de la información actualizada |

### Módulo: Organización

| Código | R014 |
|----------|----------|
|Nombre  |Crear nuevo cargo|
|Objetivo  |Facilitar el proceso de creación y gestión de cargos en la plataforma|
| Descripción   | Este procedimiento tiene como finalidad explicar de manera detallada cómo crear cargos en la plataforma, los usuarios obtendrán información sobre el proceso de creación, así como la utilización de opciones para gestionar cargos de manera eficiente, se aborda la creación individual |
| Actor primario    | Administrador de R.R. H.H  |
| Actor secundario    | -  |
| Precondiciones    | Tener acceso a una cuenta. haber iniciado sesión en la plataforma, contar con los permisos necesarios y disponer de la información actualizada, conocimiento de la estructura organizativa |

| Código | R015 |
|----------|----------|
|Nombre  |Crear nueva área|
|Objetivo  |Facilitar la creación de áreas en la plataforma, para establecer una estructura organizacional eficiente|
| Descripción   | Este procedimiento proporciona una guía detallada para la creación de áreas en la plataforma, permitiendo a los usuarios configurar una estructura organizacional precisa y efectiva. Se aborda la creación individual, incluyendo la personalización de
los nombres de los niveles de división |
| Actor primario    | Administrador de R.R. H.H  |
| Actor secundario    | -  |
| Precondiciones    | Tener acceso a una cuenta. haber iniciado sesión en la plataforma, contar con los permisos necesarios y disponer de la información actualizada |

### Módulo: Planillas

| Código | R016  |
|----------|----------|
|Nombre  | Planillas|
|Objetivo  |Visualizar todas las planillas que están registradas en la base de datos|
| Descripción   | El administrador puede visualizar todas las planillas de los distintos periodos de trabajo  |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | Registro de planillas |

| Código | R017  |
|----------|----------|
|Nombre  | Empleados en una planilla|
|Objetivo  |Visualizar todos los empleados en una planilla en específica|
| Descripción   | El administrador puede visualizar todos los trabajadores en una planilla, además se brindan datos adicionales sobre la planilla |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | Registro de planillas  |

| Código | R018  |
|----------|----------|
|Nombre  |Crear una planilla|
|Objetivo  |Generar una nueva planilla |
| Descripción   | Se creará una nueva planilla que servirá para realizar a los trabajadores, esta planilla está delimitada por algunos parametros como el periodo y la periodicidad, además se pueden visualizar los empleados que estarán incluidos en esta nueva planilla |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | Contratos de empleados con vigencia activa |


| Código | R019  |
|----------|----------|
|Nombre  | Planillas pagadas|
|Objetivo  |Visualizar las planillas que ya fueron pagadas |
| Descripción   | El administrador puede visualizar las planillas que ya fueron pagadas, visualizando otros datos como el monto resultante que se le pago a todos los trabajadores en esa planilla |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | Existencia de planillas calculadas |

| Código | R020  |
|----------|----------|
|Nombre  | Boletas |
|Objetivo | Visualizar los pagos a empleados y detalles de boleta |
| Descripción   | El administrador puede visualizar los montos de pago a cada empleado por planilla, además puede visualizar cada una de las boletas generadas a partir de una planilla. Se muuestra tambien los detalles de cada boleta |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | -  |

| Código | R021  |
|----------|----------|
|Nombre  | Generar pago |
|Objetivo | Generar el pago para trabajdores en planilla |
| Descripción   | El administrador puede generar las boletas de pago por una planilla, visualizando previamente algunas variables en pantalla |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | Existencia de planillas sin pagar |

### Módulo Registro de Movimientos y Asistencias
| Código | R022  |
|----------|----------|
|Nombre  |Registrar movimiento de planilla|
|Objetivo  |Registrar los movimientos que modifiquen el pago habitual de los empleados|
| Descripción   |El administrador podrá registrar los movimientos que influyan en el pago de los empleados, como por ejemplo: horas extras, descuentos por cafetería, bonificación extraordinaria, minutos de tardanza, etc, por periodo de planilla|
| Actor primario    |Un administrador de RRHH|
| Actor secundario    |-|
| Precondiciones    |Informe de los movimientos de ingresos y descuentos por parte de la empresa|

| Código | R023  |
|----------|----------|
|Nombre  |Registrar licencias, inasistencias y vacaciones|
|Objetivo  |Registrar las licencias, inasistencias y vacaciones a partir del periodo de planilla activo|
| Descripción   |Se podrán registrar inasistencias, licencias y otros conceptos mas de cada empleado dentro de su periodo de planilla activo.|
| Actor primario    |Administrador de RRHH|
| Actor secundario    |-|
| Precondiciones    |Informe de las licencias, inasistencias y vacaciones del empleado|

## CÓDIGOS DE INTERFACES
<table>
	<tbody>
		<tr>
			<td>N</td>
			<td>MÓDULO</td>
			<td>CÓDIGO</td>
		</tr>
		<tr>
			<td rowspan="3">1</td>
			<td rowspan="3">Autenticación de usuario</td>
			<td>I001</td>
		</tr>
		<tr>
			<td>I002</td>
		</tr>
		<tr>
			<td>I003</td>
		</tr>
		<tr>
			<td rowspan="6">2</td>
			<td rowspan="6">Solicitudes</td>
			<td>I004</td>
		</tr>
		<tr>
			<td>I005</td>
		</tr>
		<tr>
			<td>I006</td>
		</tr>
		<tr>
			<td>I007</td>
		</tr>
		<tr>
			<td>I008</td>
		</tr>
		<tr>
			<td>I009</td>
		</tr>
		<tr>
			<td rowspan="4">3</td>
			<td rowspan="4">Empleados</td>
			<td>I010</td>
		</tr>
		<tr>
			<td>I011</td>
		</tr>
		<tr>
			<td>I012</td>
		</tr>
		<tr>
			<td>I013</td>
		</tr>
		<tr>
			<td rowspan="7">4</td>
			<td rowspan="7">Registro movimientos y asistencias</td>
			<td>I014</td>
		</tr>
		<tr>
			<td>I015</td>
		</tr>
		<tr>
			<td>I016</td>
		</tr>
		<tr>
			<td>I017</td>
		</tr>
		<tr>
			<td>I018</td>
		</tr>
		<tr>
			<td>I019</td>
		</tr>
		<tr>
			<td>I020</td>
		</tr>
		<tr>
			<td rowspan="3">5</td>
			<td rowspan="3">Administración de la empresa</td>
			<td>I021</td>
		</tr>
		<tr>
			<td>I022</td>
		</tr>
		<tr>
			<td>I023</td>
		</tr>
		<tr>
			<td rowspan="4">6</td>
			<td rowspan="4">Organización</td>
			<td>I024</td>
		</tr>
		<tr>
			<td>I025</td>
		</tr>
		<tr>
			<td>I026</td>
		</tr>
		<tr>
			<td>I027</td>
		</tr>
		<tr>
			<td rowspan="8">7</td>
			<td rowspan="8">Planilla</td>
			<td>I028</td>
		</tr>
		<tr>
			<td>I029</td>
		</tr>
		<tr>
			<td>I030</td>
		</tr>
		<tr>
			<td>I031</td>
		</tr>
		<tr>
			<td>I032</td>
		</tr>
		<tr>
			<td>I033</td>
		</tr>
		<tr>
			<td>I034</td>
		</tr>
    <tr>
			<td>I035</td>
		</tr>
	</tbody>
</table>


## INTERFACES

### Módulo: Autenticación de usuario
| Código Interfaz | I001  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/d7d6c0aa-c02f-4200-87cc-1d6e70440dea)|

| Código Interfaz | I002  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/4395cef4-7cd5-4763-9eae-496070e14a8b)|

| Código Interfaz | I003  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/55c797cf-4b38-4916-b329-e9324ca90ae9)|

### Módulo: Solicitudes
| Código Interfaz | I004  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/cedbba2c-b6e4-4d28-b269-7b2a81b25f96)|

| Código Interfaz | I005  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/81ef464d-ee97-45ff-b727-ca5feda8a432)|

| Código Interfaz | I006 |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/ff159860-6d4b-40f0-a78c-5097e51c67f3)|

| Código Interfaz | I007  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/7bf03a59-db93-4534-b5fb-f8785dbbf529)|

| Código Interfaz | I008  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/5b79c089-1e91-4107-b80f-e39e4c91b1b3)|

| Código Interfaz | I009  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/fddb795c-32ef-4ba5-8e68-a186cec548b2)|

### Módulo: Empleados
| Código Interfaz | I010  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME3/imagenes/Frame%2047.png)|

| Código Interfaz | I011  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME3/imagenes/Frame%2048.png)|

| Código Interfaz | I012  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME3/imagenes/vigentes.png)|


| Código Interfaz | I013  |
|:----------:|:----------:|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME3/imagenes/desvinculados.png)|

### Módulo: Registro movimientos y asistencias

| Código Interfaz | I014  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/f2922732-04e4-4511-9671-e6ec9c6f7428)|

| Código Interfaz | I015 |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/c5bd74eb-a33b-4336-bc63-74629cc82879)|

| Código Interfaz | I016  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/5f72cdb3-f8ac-4f3a-a7b0-694cb0690038)|

| Código Interfaz | I017  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/940378ab-3cd2-4e36-97fc-4e2398048ef0)|

| Código Interfaz | I018  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/0bfa8910-a4ee-41b5-840d-1b61cfba25cd)|

| Código Interfaz | I019  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/fcc7d905-811f-4b5f-86e5-7e73c010f6ea)|

| Código Interfaz | I020  |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/ee805bb3-fba9-4f43-9159-47c04acfc201)|

### Módulo: Administración de Empresa

| Código Interfaz | I021 |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/d1757202-270e-49ef-bcd4-faa2b7f02263)|

| Código Interfaz | I022 |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/e1d3112f-ff1f-4da1-bba0-7f6a896d76c3)|

| Código Interfaz | I023 |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/90ad6945-27fa-4ba9-ae3b-0834c678f18f)|

### Módulo: Organización

| Código Interfaz | I0024 |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/11706603-daf8-4bf6-a205-64642d575810)|

| Código Interfaz | I025 |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/6f5db071-c391-4555-b269-fd976d83b30e)|


| Código Interfaz | I0026 |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/fd8e50cd-3869-4591-8925-d29dbe954bd3)|

| Código Interfaz | I0027 |
|----------|----------|
|Imagen interfaz|![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/6b60b026-9c40-4f48-9504-939b2ff779a8)|

### Módulo: Planilla
| Codigo Interfaz    |    I - 028    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/planilla.png) |

| Codigo Interfaz    |    I - 029    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/6f0a906384f58d77b59138e88a0e7fa806bd3db7/pnt/Detalleplanilla1.png) |

| Codigo Interfaz    |    I - 030    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/generar%20planilla.png) |

| Codigo Interfaz    |    I - 031    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/visualizarcolaboradoresnuevaplanilla.png) |

| Codigo Interfaz    |    I - 032    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/planillaspagadas.png) |

| Codigo Interfaz    |    I - 033    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/detalleplanillaspagadas.png) |

| Codigo Interfaz    |    I - 034    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/12ab224f3729055d81bb78c5a342c2ea6f54dd7e/pnt/detalleboleta1.png) |

| Codigo Interfaz    |    I - 035    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/generarnuevasboletas.png) |
