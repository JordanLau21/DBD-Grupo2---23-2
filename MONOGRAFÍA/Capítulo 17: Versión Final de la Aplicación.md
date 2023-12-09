# CAPÍTULO 17: DOCUMENTACION DE LA APLICACIÓN

# CASO 1 : Iniciar Sesion 
## FLUJO DE LAS VISTAS
| PASOS | ACCION  |
|----------|----------|
| 1 | En la **VISTA 1** el usuario ingresara su cuenta (usuario y contraseña)   |
| 2 | Apretara en el boton **Confirmar datos**, para validar los datos|
| 3.1 | Si la cuenta es validada y le pertenece a un **administrador** entonces le saldra un boton llamado **"INGRESAR EMPRESA"** |
| 3.2 | Si la cuenta es validada y le pertenece a un **empleado** entonces le saldra un boton llamado **"INGRESAR EMPLEADO"** |
| 4.1 | Si apreta en el boton **"INGRESAR EMPRESA"** le redigira a la **VISTA 2** de inicio para el administrador |
| 4.1 | Si apreta en el boton **"INGRESAR EMPLEADO"** le redigira a la **VISTA 3** de inicio para el empleado |
| 5 | En la barra derecha podra apretar los botones que le redirigiran a las vistas correspondientes de la opcion  |
## Vista 1: Logearse
### Descripcion 
Esta es la vista donde podra ingresar los datos de su cuenta y podra validarlos para poder acceder al sistema.
### Captura de pantalla 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/588ae310-dc80-469a-9003-53e8740ad5e6)
### Funcionalidad 
El usuario ingresara su cuenta, tanto usuario como contraseña. Si el sistema valida la cuenta. Entonces le permitira el acceso a la pestaña de **InicioEmpresa** 
si la cuenta le pertenece a un administrador o le dirigira a la pestaña de **InicioEmpleado** si la cuenta le pertenece a un empleado.


## Vista 2: Pantalla de inicio de administrador  
### Descripcion 
Esta es la vista que tendra el administrador despues de haberse registrado en el inicio de sesion.
### Captura de pantalla 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/4a6c9c44-05e2-496f-ae26-aeb756194aed)
### Funcionalidad 
El administrador podra acceder a todas las opciones que se encuentren en la barra de la izquierda.


## Vista 3: Pantalla de inicio de empleado 
### Descripcion 
Esta es la vista que tendra el empleado despues de haberse registrado en el inicio de sesion
### Captura de pantalla 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/d9433449-3d27-4070-af77-a0a5597d5914)
### Funcionalidad 
El empleado podra acceder a todas las opciones que estan en la barra de la izquierda.


# CASO 2: Registrar empleado y contrato 
## FLUJO DE LAS VISTAS
| PASOS | ACCION  |
|----------|----------|
| 1 | El administrador al apretar en el boton **"Crear empleado"** de la barra izquierda podra acceder a la **VISTA 3** donde podra registrar los datos de un nuevo empleado|
| 2 | Despues de registrar los datos del empleado, aprentando en el boton **"Siguiente"**, podra acceder a la **VISTA 4** dondre podra registrar los datos del contrato de dicho empleado |
| 3 | Despues de registrar los datos del contrato de dicho empleado podra volver a la pantalla de inicio | 

## Vista 4: Registrar empleado
### Descripcion 
El administrador al apretar en el boton de **"Crear empleado"**, podra acceder a esta vista donde puede registrar a un empleado en la empresa.
### Capturas de pantallas
Esta es la vista donde se puede ingresar los datos del empleado, para posteriormente registrarlo.
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/fb9cf909-97dd-48e5-89e0-42a8447dea34) <br>
### Opciones
#### Estas son las opciones disponibles de **Regimen pensionario**<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/e8743629-300c-43fd-ae63-48187aaedd82) <br>
#### Estas son las opciones disponibles de **Seguro medico**<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/6ad247f7-1250-44bb-b521-71fbe2334df7)  <br>
#### Estas son las opciones disponibles de **Situacion discapacidad**<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/3b942859-99e1-4515-9aec-141a00544c10)  <br>
### Funcionalidad 
El administrador despues de haber registrado todos los datos del empleado. Apretara en el boton **"Registrar empleado"** y se registraran los datos ingresados del empleado.


## Vista 5: Registrar contrato
### Descripcion 
El administrador al apretar en el boton de **"Siguiente"**, podra registrar un contrato de dicho contrato antes registrado.
### Capturas de pantallas
Esta es la vista donde se puede ingresar los datos del contrato del empleado.
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/cc13c17c-3084-4381-afd1-896a09e5c502) <br>
### Opciones
#### Estas son las opciones disponibles de **Area**<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/dd4c2f23-e137-4706-adf1-88c0a3828e8e) <br>
#### Estas son las opciones disponibles de **Cargo**<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/b3a6b927-b6f9-406f-8785-9ab0e098dd9d) <br>
#### Estas son las opciones disponibles de **Estado de contrato**<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/2dd1a002-bb1a-4e43-83eb-b648147a312d) <br>
#### Estas son las opciones disponibles de **Tipo de contrato**<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/7af9d029-3356-4869-aab2-0180c0d8b535) <br>
#### Estas son las opciones disponibles de **Tipo de jornada**<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/47efd74d-baf4-4938-acb4-fc1e6b48cf87) <br>
#### Estas son las opciones disponibles de **Frecuencia de pago**<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/bec7f0b7-a002-4230-8889-2021f3163fff) <br>
#### Estas son las opciones disponibles de **Medio de pago**<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/04e0d0a1-87c2-47b3-8c4d-210f2e0f2a41) <br>
### Funcionalidad 
El administrador despues de haber registrado todos los datos del contrato. Apretara en el boton **"Registrar Contrato"** y se guardara los datos del contrato en el sistema.
Luego podra regresar a la pantalla de inicio apretanto el boton **"Regresar inicio"**


# CASO 3: Vigentes
## Vista 5: Ver empleados vigentes
### Descripcion 
El administrador al apretar en el boton de **"Vigentes"**, podra visualizar a todos los empleado vigentes de la empresa
### Capturas de pantallas
Esta es la vista donde podra visualizar todas los empleados vigentes de la empresa
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/aa93dc50-d8fa-4274-8c08-baade987f607)
### Funcionalidad 


# CASO 4: Desvinculados
## Vista 6: Ver empleados desviculados o inactivos
### Descripcion 
El administrador al apretar en el boton de **"Desvinculados"**, podra visualizar a todos los empleado desvinculados o inactivos de la empresa
### Capturas de pantallas
Esta es la vista donde podra visualizar todas los empleados vigentes de la empresa
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/2d034a10-cafa-425d-8794-fffd956bc041)
### Funcionalidad 



# CASO 5: Solicitudes de la empresa
## FLUJO DE LAS VISTAS
| PASOS | ACCION  |
|----------|----------|
| 1 | El administrador al apretar en el boton **"Solicitudes"** de la barra izquierda podra acceder a la **VISTA 7** donde se le mostraran todas las solicitudes que tenga dicha empresa |
|  | Si apreta en los botones **"Regresar"** regresara a la pantalla de anterior|
| 2 | Si apreta en el boton **"Ver detalles"** de una solicitud podra acceder a los detalles particulares de dicha solicitud. Tal como en la **VISTA 8** |
|  | Si apreta en el boton **"Regresar solicitudes "** regresara a la VISTA X |
|  | Si apreta en el boton **"Regresar solicitudes "** regresara a la VISTA X |
## Vista 7: Ver solicitudes
### Descripcion 
Esta es la vista que tendra el administrador, despues de apretar en el boton Solicitudes. Aqui podra apreciar todas las solicitudes que pertenecen a la empresa en un lista vertical 
### Captura de pantalla 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/3d940819-544c-4968-9491-d23741ddcd51)
### Opciones
#### Lista de solicitudes: Las solicitudes asociadas a dicha emoresa se mostrara en una lista con datos oportunos mostrados
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/a4125b01-e0f0-4578-859c-42d73c8b3484)
#### Ver detalles: Al apretar en el botorn ver detalles le redigira a otra vista donde podra ver detalles de la solicitud.
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/11a208aa-dfac-4aeb-bd1c-02f8f4499004)
#### Funcionalidad 
Se le mostraran todas las solicitudes que tenga asociada dicha empresa. Donde podra apretar en el boton "Ver detalles" que podra brindar mas informacion sobre la solicitud seleccionada.


## Vista 8: Ver detalles de solicitud
### Descripcion 
Esta es la vista donde el administrador podra acceder a informacion mas detallada sobre la solicitud seleccionada.
### Captura de pantalla 
Estos son los detalles de solicitud de la solicitud de id_solicitud = 1;
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/bc52cbc3-a48a-4342-8f36-9ab0c89f0db0)
### Opciones
#### Datos de la solicitud: Se mostraran mas datos de la solicitud seleccionada
### Funcionalidad 
Se podra apreciar los datos de la solicitud, como tambien la descripcion de dicha solicitud.

## CASO 6: Solicitudes del empleado
## FLUJO DE LAS VISTAS
| PASOS | ACCION  |
|----------|----------|
| 1 | El empleado al apretar en el boton **"Mis solicitudes"** de la barra izquierda podra acceder a la **VISTA 9** donde se le mostraran todas las solicitudes que haya realizado |
| 2 | Si apreta en el boton **"Nueva solicitud"** podra acceder a la **VISTA 10** donde podra registrar una nueva solicitud|

## Vista 9: Ver mis solicitudes
### Descripcion 
Esta es la vista que tendra el empleado, despues de apretar en el boton Mis solicitudes. Aqui podra apreciar todas las solicitudes que ha realizado en la empresa que pertenece.
### Captura de pantalla 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/6b783b57-d071-49b7-a133-f149150bed7e)
### Funcionalidad 
Visualizar las solicitudes registradas por el empleado

## Vista 10: Nueva solicitud
### Descripcion 
Despues de apretar en **"Nueva Solicitud"** el empleado podra registrar una nueva solicitud hacia la empresa.
### Captura de pantalla 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/c8084642-53d2-4ac1-ad50-63810bdd5933)
### Opciones
#### **Tipo de solicitud:** El empleado podra seleccionar el tipo de solicitud mostrada en la barra desplegable
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/c8c3a5ba-506e-42f3-8f0a-94b2e73ed1e8) <br>
#### Descripcion: Podra ingresar una descripcion detallada de la solicitud que se quiere realizar
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/02a78248-dbe3-4282-a91d-bc1f4397eb00)
#### **Boton Enviar:** El empleado al apretar en el boton **ENVIAR**. Registrara los datos seleccionados e ingresados en la seccion tipo solicitud y descripcion. 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/f438ee6d-f21d-4ea3-87b7-c64bc6aaf9e8)

### Funcionalidad 
Poder registrar una nueva solicitud hacia la empresa


# CASO 7: Movimientos de planilla
## FLUJO DE LAS OPCIONES
| PASOS | ACCION  |
|----------|----------|
| 1 | El empleado al apretar en el boton **"Movimientos de planilla"** de la barra izquierda podra acceder a la **VISTA 1** |
| 2.1 | Si apreta en el boton **"Agregar"** de un contrato podra agregar movimientos de planilla a dicho contrato |
| 2 | Si apreta en el boton **"Nueva solicitud"** podra acceder a la **VISTA 12** donde podra registrar una nueva solicitud|

## Vista 11: Ver lista de contratos 
### Descripcion 
El administrador al apretar en el boton de **"Movimientos de planilla"**, podra visualizar una lista de contratos
### Capturas de pantallas
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/d3f25bd7-194d-455d-a8e8-1dd0ef2990c1)
### Opciones
#### Filtrar: El usuario podra colocar dos fechas limites, para poder filtrar la lista de contratos
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/d05d75f2-4d82-403b-bf2b-9c6e1786be06)
#### Agregar: El usuario al apretar el boton, podrá acceder a una vista donde se podra agregar movimientos a dicho contrato
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/99f4a5a3-1d5d-479d-b048-da7fa97334f6)
### Funcionalidad 
El usuario podra visualizar todos los contratos en rango de fecha, de manera que pueda identificar aquellos contratos donde quiere agregar o registrar nuevos movimientos de planilla.

## Vista 12: Movimientos de un contrato
### Descripcion 
El administrador al apretar en el boton de **"Agregar"**, podra visualizar todos los ingresos y descuentos registrados en dicho contrato.
### Capturas de pantallas
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/c2038eef-0e36-4c42-952a-33a5b5aeb1f8)
### Opciones
#### Agregar: Al apretar en el boton Agregar podra agregar un nuevo ingreso o descuento
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/ee885ef0-ddd9-432e-9aa2-033cc00afc9a)
### Funcionalidad 
El administrador podra registrar todo los movimientos de planilla segun sea un ingreso o un descuento.

## Vista 13: Agregar ingreso o descuento
### Descripcion 
Al apretar en el boton **Agregar** de un ingreso o descuento podra registrarlo
### Capturas de pantallas
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/3b861847-fd44-42e0-bc59-8ecbad33ab10)
### Funcionalidad 
Aqui podra agregar los ingresos o descuentos



## CASO 8: Areas
## FLUJO DE LAS OPCIONES
| PASOS | ACCION  |
|----------|----------|
| 1 | El empleado al apretar en el boton **"Areas"** de la barra izquierda podra acceder a la **VISTA 14** |
| 2 | Si apreta en el boton **"Nueva Area"** podra acceder a la **VISTA 15** donde podra registrar un nuevo area |
## Vista 14: Areas de la empresa
### Descripcion 
El administrador podra visualizar todas las areas de la empresa
### Capturas de pantallas
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/e89d4f1c-b93b-4775-91a4-7aeae19a744f)
### Opciones
#### Nueva area: Al apretar en el boton Nueva area, podra acceder a una nueva vista donde registrara a la area
#### Funcionalidad 
Visualizar las areas que componen a la empresa y tambien ser capaz de registrar una nueva area

## Vista 15: Nueva area
### Descripcion 
El administrar accedera a un formulario para registrar nuevas areas
### Capturas de pantallas
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/903224a5-18ca-4cb5-a02d-b86ffd2cff05)
### Opciones
#### Nombre: Ingresara el nombre del nuevo area
#### Descripcion: Ingresara una descripcion de la area
#### Guardar: Al apretarlo se guardara los datos ingresados
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/2812daaa-785e-4034-a4f6-eb30f4908ff3)
#### Funcionalidad 
Registrar los datos de un nuevo area



## CASO 9: Cargos
## FLUJO DE LAS OPCIONES
| PASOS | ACCION  |
|----------|----------|
| 1 | El empleado al apretar en el boton **"Cargos"** de la barra izquierda podra acceder a la **VISTA 16** |
| 2 | Si apreta en el boton **"Nueva cargo"** podra acceder a la **VISTA 17** donde podra registrar un nuevo area |
## Vista 16: Cargos de la empresa
### Descripcion 
El administrador podra visualizar todas las cargos de la empresa
### Capturas de pantallas
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/503799e5-9929-4ecc-a916-018d585d4908)
### Opciones
#### Nuevo cargo: Al apretar en el boton Nuevo cargo, podra acceder a una nueva vista donde registrara al cargo
#### Funcionalidad 
Visualizar los cargos que componen a la empresa y tambien ser capaz de registrar un nuevo cargo

## Vista 17: Nueva cargo
### Descripcion 
El administrar accedera a un formulario para registrar nuevos cargos
### Capturas de pantallas
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/2d115100-7706-4222-a841-1c7da7d2687a)
### Opciones
#### Nombre: Ingresara el nombre del nuevo area
#### Descripcion: Ingresara una descripcion de la area
#### Requerimientos:  Ingresara los requerimientos del cargo
#### Guardar: Al apretarlo se guardara los datos ingresados
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/efc02356-5b32-49ae-9357-ae096e7bb49a)
#### Funcionalidad 
Registrar los datos de un nuevo cargo



## CASO 10: Planillas
## FLUJO DE LAS OPCIONES
| PASOS | ACCION  |
|----------|----------|
| 1 | El empleado al apretar en el boton **"Ver planillas"** de la barra izquierda podra acceder a la **VISTA 18** |
| 2.1 | Si apreta en el boton **"Detalles"** podra acceder a la **VISTA 19** donde podra visualizar los detatlles de la planilla |
| 2.2 | Si apreta en el boton **"Generar planilla"** podra acceder a la **VISTA 20** donde podra registrar una nueva planilla|

## Vista 18: Ver planillas
### Descripcion 
El administrador podra visualizar todas las planillas que posee la empresa
### Capturas de pantallas
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/e6d016ea-7932-4e91-a0ed-dbc3d5f6c14e)
### Opciones
#### Generar planilla: Al apretar en el boton Generar planilla el usuario se dirigira a otra vista donde podra registrar.
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/11ace2a7-be51-4065-889f-75be581213e6)
#### DETALLES: Al apretar en el boton debajo de Detalles, podra acceder a ver los detalles de la planilla seleccionada
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/4c4cf3c1-aa9c-49da-bb6b-267ff3895253)

#### Lista de planillas: En la parte inferior se mostraran las planillas que pertenecen a la empresa
#### Funcionalidad 
Visualizar todas las planillas de la empresa y poder acceder a detalles o generar una nueva planilla.

## Vista 19: Ver detalle de planilla
### Descripcion 
El administrador podra visualizar los detalles de la planilla seleccionada
### Capturas de pantallas
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/352d22f5-732b-452a-b6e5-ba7bc40b2efc)
### Opciones
#### Datos de la planilla: El usuario visualizara los datos de la planilla seleccionada
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/ab4734d9-893a-4ffc-aaf7-fa3361062e18)
#### Lista de colaboradores: El usuario visualizara la lisa de colaboradores asociados a dicha planilla
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/27a2e21f-ae11-4ead-9e51-136b3fcd8124)
### Funcionalidad 
Visualizar datos detallados de la planilla

## Vista 20: Generar planilla
### Descripcion 
El administrador podra registrar una nueva planilla
### Capturas de pantallas
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/207d2ae4-9bb6-43b5-9e4c-b854cedf79bc)
### Opciones
#### Datos de la nueva planilla: Se registrara los datos de una nueva planilla.
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/2f2e5aa6-6b8e-43ae-8291-012e3e496c21)
#### Generar: Al apretar en el boton Generar se registrara dicha planilla en la base de datos
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/d615d402-0b96-4110-a73f-d0dd340173c3)
### Funcionalidad 
Registrar una nueva planilla


## CASO : Boletas de Pago
## FLUJO DE LAS OPCIONES
| PASOS | ACCION  |
|----------|----------|
| 1 | El empleado al apretar en el boton **"Boletas de pago"** de la barra izquierda podra acceder a la **VISTA 21** |
| 2.1 | Si apreta en el boton **"Detalles"** podra acceder a la **VISTA 22** donde podra visualizar los detatlles de la planilla |
| 2.2 | Si apreta en el boton **"Generar pago"** podra acceder a la **VISTA X** donde podra registrar una nueva planilla|

## Vista 21: Ver planillas pagadas
### Descripcion 
El administrador podra visualizar todas las planillas que hayan sido procesadas para su pago
### Capturas de pantallas
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/6f993061-b5e2-458c-8dcb-b6344700e8ef)
### Opciones
#### Generar pago: Al apretar en el boton Generar pago el usuario se dirigira a otra vista donde podra registrar.
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/4871ae24-327f-4fcd-8ca5-a2af065057d3)
#### DETALLES: Al apretar en el boton debajo de Detalles, podra acceder a ver las boletas de los empleados segun la planilla
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/12c5ba79-b098-41a9-b7cc-c9e4b432bcaa)
#### Lista de planillas: Se mostraran la lista de planillas que ya hayan sido procesadas
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/c6731b4b-bcfb-42eb-99b4-687d33a74c2b)
### Funcionalidad 
Visualizar las planillas ya procesadas como tambien acceder a opciones como detalles o poder generar un pago

## Vista 22: Ver boletas de pago de las planillas
### Descripcion 
El administrador podra visualizar todas las boletas que hayan sido generadas en la planilla
### Capturas de pantallas
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/305ec0a7-21e5-4db8-ae59-203b5c9704a1)
### Opciones
#### Datos de la planilla: Se podra visualizar los datos de la planilla antes seleccionada
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/63121826-0ebc-425f-9cc6-d92b2b569af5)
#### Lista de boletas de pago: Se mostrara la lista de boletas de pago asociadas a dicha planilla seleccionada, ademas que se mostraran datos oportunos
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/9a938c20-920e-43e1-828d-f8ad0cf12384)
#### Ver detalles: Podras acceder a ver detalles de la boleta de pago
### Funcionalidad 
Visualizar todas las boletas de pago asociadas a una planilla

## Vista 22: Ver detalles de una boleta
### Descripcion 
El administrador podra visualizar los detalles de una boleta de pago 
### Capturas de pantallas
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/ff0a792a-8362-4f5d-ad95-abbc1861b492)

### Opciones
#### Calculos: Se mostraran los ingresos y descuentos asociados a dicha boleta de pago, y se mostrara el resultado de calcular para obtener el suelto neto
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/d44545cf-ed19-462d-bb7b-7fe476f4e804)
### Funcionalidad 
Visualizar detalles de una boleta de pago






