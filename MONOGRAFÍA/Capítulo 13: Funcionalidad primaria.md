# CAPÍTULO 13: FUNCIONALIDAD PRIMARIA


## MÓDULO : AUTENTICACIÓN DE USUARIO Y OLVIDO DE CONTRASEÑA
**Funcionalidad primaria elegida:** Gestionar el proceso de inicio de sesión para los trabajadores de la empresa registrada (empleados y administradores) <br>
**Sustentación:** El inicio de sesión y la recuperación de contraseña son funcionalidades fundamentales para el trabajador de la empresa, ya que gracias estas funcionalidades pueden acceder a todos los beneficios que trae nuestro sistema de planillas de manera segura. Por otro lado, tener la posibilidad de recuperar tu contraseña por si en algún momento la olvidas es un salvavidas que ayuda a muchos usuarios. <br>

Esta funcionalidad permitirá cumplir con los requerimientos de Autenticación de Usuario (R001), Olvido de contraseña (R002), Cambio de contraseña e inicio de sesión (R003) los cuales se encuentran relacionados con las interfaces I-001, I-002, e I-003.

| Actividad     | Descripcion        | 
|:-------------:|:---------------:|
| 1       | Se mostrará la pantalla I-001 en la cual el usuario tendrá que ingresar su nombre de usuario para poder acceder a su cuenta, una vez el usuario le dé a la opción de "INICIAR SESIÓN" el sistema verificará los datos ingresados con los registros que se tenga en la base de datos. Una vez verificado los datos mediante una consulta, el sistema le dará acceso al usuario a todos los beneficios que ofrece el sistema de planillas en su cuenta![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/889f54a4-8acb-48b1-9777-fa37007fb49d) | 
| 2    | En el caso de que el sistema verifique que los datos ingresados no coincide con ninguna información registrada en su base de datos, se apreciará una pantalla con el mnesaje "**DATOS ERRONEOS**, por favor vuelve a intentarlo"| 
| 3  | Si el usuario llegara a olvidar su contraseña, este podrá reestablecerla dando click en la opción "¿Olvidó su contraseña? ¡Restaurela aquí!", en donde el usuario tendrá que probar que es quien dice ser ingresando su nombre y su dni, de tal manera que el sistema al encontrar dichos datos, le enviará mediante un mensaje SMS a su celular(registrado previamente en la base de datos) con un codigo de verificación (codigo: 1234) donde despues tendrá que ingresar su nueva contraseña y confirmarla para que así el sistema inicie sesión con su nueva contraseña ya cambiada en la base de datos. <br> ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/8598b432-8471-428f-a02b-9d165fc1e2c4) ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/834818bd-c978-49d3-9e82-e003dc9d9cfe) ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/ead48069-0cd7-4eb2-9a7f-131d2e42bac2) | 

## MÓDULO : SOLICITUDES
**Funcionalidad primaria elegida:** Gestionar todas las solicitudes hechas por los empleados de la empresa <br>
**Sustentación:** La gestión de solicitudes en una empresa es una funcionalidad importante debido a que se requiere de un buen manejo de solicitudes para asi atender las necesidades de los empleados de la empresa. <br>

Esta funcionalidad permitirá cumplir con los requerimientos de Pantalla Solicitudes (Administrador) (R004), Detalle de Solicitud (R005), Respuesta de Solicitud (R006), Pantalla de Solicitudes (Empleado) (R007) y Nueva Solicitud (R008) los cuales se encuentran relacionados con las interfaces I-004, I-005, I-006, I-007, I-008 e I-009.

| Actividad     | Descripcion        | 
|:-------------:|:---------------:|
| 1       | Al ingresar en la opción de solicitudes en el sistema de planillas (desde un correo tipo administrador) se podrá verificar todas las solicitudes pendientes y las solicitudes ya respondidas, en las cuales el administrador tendrá la potestad de responder a dicha solicitud dependiendo de la respuesta del jefe del empleado solicitante. En dicha Pantalla tambien se contará con la opción de ver los detalles de la solicitud hecha por el empleado en donde fundamenta la solicitud que ha hecho. <br> ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/cb040585-2f70-40a9-9d5d-d0e1f30d3ffb) ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/82fe3841-d3b4-4e6f-a789-0440404ebdee) | 
| 2    | En el caso de la cuenta de un empleado, este al darle a la opción de solicitudes, tendrá vista del historial de todas las solcitudes que ha hecho anteriormente con acceso a los detalles y el estado de sus solicitude. Además Tendrá la opción de hacer una nueva solicitud. <br> ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/827564fb-52fd-4bef-97ad-6e3913cd6e3a) | 
| 3  | En el caso de que un empleado desee hacer una solicitud, primero obtendrá la vista del tipo de solicitud que desee hacer, dependiendo de las opciones que elija, le saldrán 2 posibles opciones, una con la opción de ingresar un monto (Adelanto, Aumento y Reclamo) y otra sin mencionada opción (Licencia, Vacaciones, Configuración de Información). Una vez seleccionado el tipo de solciitud, el empleado deberá fundamentar las razones de su solicitud en la parte de detalles y en el caso haya escogido una de los tipos de solicitudes que incluye monto, deberá ingresar o no una cantidad dependiendo de la solicitud. Todos estos datos se aplicaran en un INSERT apenas se de click en el boton "Enviar". <br> ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/cd8350c8-9c33-4a84-8078-f187bfdc14a6) ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/51a0b9e3-706b-475e-9c97-10c301819f0e) ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/033bbdec-0212-4606-be2c-bd42878956a3) | 

## MÓDULO: EMPLEADOS
**Funcionalidad primaria elegida:** Registro de los empleados en el sistema de planillas, considerando sus datos personles y los pactados en el contrato firmado entre este y la empresa.<br>
**Sustentación:** 
* El pago neto se calculará para cada empleado de una empresa, es por esto que se requiere muchos tipos de datos sobre este para el cálculo de lo que percibirá, por ejemplo el tipo de seguro, el régimen pensionario, entre otros.<br>
*Además sirve como registro de empleados y exempleados, con sus datos y detalle de pago de cada uno.<br>
<br>
Esta funcionalidad permitirá cumplir con los requerimientos de Pantalla Ingreso de Datos del Empleado (Administrador) (R009), Visualización de usuarios vigentes o activos (R010), visualización de usuarios desvinculados o desactivados (R012) los cuales se encuentran relacionados con las interfaces I010, I011, I012 e I013.
Dividiremos en 3 actividades:

### Registro de Empleado
| Actividad     | Descripcion        | 
|:-------------:|:---------------:|
| 1 |Dirigirse a la pestaña “Empleados”.|
| 2 |Dar click a la casilla “Crear Empleados”.| 
| 3 |Ingresar los datos del empleado. ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME3/imagenes/Frame%2047.png)| 
| 4 |Dar click en "Siguiente".|
| 5 |Ingresar los datos del contrato del empleado.  ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME3/imagenes/Frame%2048.png)|
| 6 |Dar click en "Finalizar".|


### Visualización de usuarios vigentes o activos
| Actividad     | Descripcion        | 
|:-------------:|:---------------:|
| 1 |Dirigirse a la pestaña “Empleados”.|
| 2 |Dar click a la casilla “Vigentes”.| 
| 3 |Se visualizará la lista de todos los usuarios vigentes en ese momento.  ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME3/imagenes/vigentes.png)| 


### Visualización de usuarios desvinculado o desactivados
| Actividad     | Descripcion        | 
|:-------------:|:---------------:|
| 1 |Dirigirse a la pestaña “Empleados”.|
| 2 |Dar click a la casilla “Desvinculado”.| 
| 3 |Se visualizará la lista de todos los usuarios desvinculados en ese momento.  ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME3/imagenes/desvinculados.png)| 


## MÓDULO : REGISTRO DE MOVIMIENTOS PLANILLA Y LICENCIAS, INASISTENCIAS,ETC
**Funcionalidad primaria elegida:** Registrar todos los movimientos de planilla y conceptos de asistencia de un contrato activo de un empleado en especifico <br>
**Sustentación:** 
* Para poder calcular el pago neto (monto real que recibira el empleado) dentro de una boleta de un pago de cierto contrato, es necesario registrar diferentes conceptos que alteren el valor del pago bruto.
Por ese motivo es que se creo este modulo, donde se puede registrar todos los movimientos de planilla, que van a ser usados al momento de realizar el calculo dentro de una boleta. 
* Si quisiera registrar o saber que empleados, ya tuvieron descanso vacacional, descanso medico, entre otros. Este modulo permite, el registro y reporte de dichos conceptos asociandolo a un contrato activo de un empleado.
<br>

Esta funcionalidad permitirá cumplir con los requerimientos de Pantalla Movimientos de Planilla (Administrador) (R004), Asistencias (Administrador)(R005), con las interfaces I-004, I-005, I-006, I-007, I-008 e I-009.

Dividiremos en dos actividades:

### Registro de Movimiento de Planilla
| Actividad     | Descripcion        | 
|:-------------:|:---------------:|
| 1 | Al darle click en la opción “Registro de Planilla”  y seleccionar "Movimientos de planilla" se le mostrara la pantalla I-003 donde podrá visualizar todos los empleados con contrato activo. Pero si selecciona un periodo en especifico se filtrara la lista de empleados mostrados, por aquellos que su contrato sigue vigente dentro de dicho periodo. Esto se dara por medio de una consulta a las tablas donde se limitara a mostrar a los empleados donde el periodo se encuentre entre la fecha de inicio y fin de dicho contrato. ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/4e801377-7e27-4c34-9a35-3daf7510e4f5)|
| 2 | Si le da click a "Agregar", en cualquiera de los empleados. Se le mostrara la pantalla I-003 donde visualizara los movimientos planilla registrados dentro del contrato de dicho empleado. En la parte inferior se mostraran los ingresos y descuentos registrados en el contrato de dicho empleado. Estos se visualizaran por dos consultas que mostraran los movimientos de planilla de  dicho empleado ya sea si es ingreso o descuento. Se mostrara el nombre y valor de dicho movimiento registrado. Y en la parte inferior se mostrara la suma de estas. ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/0120f1d2-cb7b-4baa-9943-de19613b9874)| 
| 3 | Al dar click en  "Agregar", sea de ingresos o descuentos. Se abrira la pantalla I-001, donde podra elegir concepto a registrar y valor que se le esta otorgando, el cual despues aparecera en la pantalla. Tomar en cuenta que la fecha se asignara de manera automatica. ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/0e38498a-bc0a-4caa-8a21-d60bd80718f1)| 

### Registro de conceptos asistencia
| Actividad     | Descripcion        | 
|:-------------:|:---------------:|
| 1 | Al darle click en la opción “Registro de Planilla”  y seleccionar "Inasistencias, Licencias, etc", se le mostrara la pantalla I-001 donde visualizara todos los empleados con contrato activo. Tambien puede usar la opcion de filtrar por periodo. ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/640cef28-9b81-45f8-bc39-99f080a73be1) | 
| 2 | Si le da click a "Asignar", en cualquiera de los empleados. Se le mostrara la pantalla I-003 donde visualizara los conceptos asistencia registrado en dicho contrato. En la parte inferior se mostraran los conceptos de asistencias registrado en dicho contrato. Estos se visualizaran por una consulta a base de datos las asistencias registradas en dicho contrato.  Se mostrara el nombre y valor de dicho concepto registrado.![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/bceb65c8-d6aa-44c8-9038-2f20348c743c)| 
| 3 | Al dar click en  "Agregar", sea de ingresos o descuentos. Se abrira la pantalla I-001, donde podra elegir el concepto a registrar, las fechas de inicio y final, y si lo requiere un comentario. Despues de clickear en "Agregar" se agregara dicho concepto en dicha lista. ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/b08e9022-a543-4790-8d7f-6758a58742ef)|


## MÓDULO : PLANILLA
**Funcionalidad primaria elegida**: Gestionar y controlar las planillas de los pagos hacia los trabajadores

**Sustentación**: Es imprescindible para poder manejar y llevar un registro históricos de los pagos a los trabajadores, se puede visualizar los empleados que estuvieron incluidos en planillas anteriores, además de visualizar el monto de las boletas de cada empleado en los distintos periodos que se mantuvieron en la empresa

Esta funcionalidad permite satisfacer los requerimientos R018, R019, R020, R021, R022 y R023 relacionadas con las interfaces gráficas I-028, I-029, I-030, I-031, I-032, I-033, I-034, I-035
| Actividad    |    Descripcion    | 
|:-------------:|:---------------:|
| 1    | En el apartado de planillas, se muestra la interfaz I-028, se pueden visualizar las planillas que han sido creadas con anterioridad. Debajo de la columna detalles, hay botones que muestran los detalles de cada planilla que nos llevan a la interfaz gráfica I-029. Otro botón en la parte superior derecha, dirige a la interfaz I- 00C ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/planilla.png)  | 
| 2   | Luego de darle al botón detalles, en la interfaz I-029, se muestran todos los trabajadores incluidos en esa planilla y algunos datos adicionales, si se presionar el botón "aceptar", se redirige a la interfaz I-028, teniendo así una nueva planilla ![image](https://github.com/nnthony/bookish-doodle/blob/6f0a906384f58d77b59138e88a0e7fa806bd3db7/pnt/Detalleplanilla1.png)   |
| 3   | En la interfaz I-028, al presionar en el botón de "Generar planilla", se redirige a la interfaz I-030, aquí se muestran una barras para completar. Una vez rellenadas las barras se puede oprimir el boton de "ver colaboradores", que redirige a la interfaz I-031. Tambien se puede oprimir aceptar directamente ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/generar%20planilla.png)  |
| 4   | En la interfaz I-031, se puede visualizar los colaboradores que estarán incluidos en esta nueva planilla. Al oprimir el botón aceptar se redirige de nuevo a la interfaz I-030 ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/visualizarcolaboradoresnuevaplanilla.png) |
| 5   | En el apartado de boleta, se muestra la interfaz I-032, se muestran todas las planillas que ya han sido pagadas, debajo de la columna "detalles" hay botones que redirigen a la interfaz I-033 de la planilla elegida. En la parte superior derecha, hay un boton "Generar pago" que redirige a la interfaz I-00H    ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/planillaspagadas.png) |
| 6   | En la interfaz I-033, se muestran algunos datos relevantes sobre la planilla ya pagada, además de la lista de empleados a los que se les pagó por esa planilla. Debajo de la columna detalles hay botones que permiten visualizar los detalles de la boleta de un trabajador y se redirige a la interfaz I-034. En la interfas I-034 se puede visualizar cada uno de los conceptos por los que se le pagó en dicha boleta, además de otros datos relevantes del empleado ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/detalleplanillaspagadas.png) ![image](https://github.com/nnthony/bookish-doodle/blob/12ab224f3729055d81bb78c5a342c2ea6f54dd7e/pnt/detalleboleta1.png)|
| 7   | En la interfaz I-035, se muestran algunos datos relevantes para los pagos de planilla, el administrador puede seleccionar una planilla que no ha sido pagada y generar el pago con el botón "aceptar", se redirigirá a la interfaz I-032 con una nueva planilla pagada ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/generarnuevasboletas.png)|




<br><br><br><br>
[índice](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/Cap%C3%ADtulo%2000%3A%20Presentaci%C3%B3n.md)
<br>
[Capítulo Anterior]()
<br>
[Capítulo Siguiente]()
