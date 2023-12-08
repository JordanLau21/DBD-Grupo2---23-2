# DOCUMENTACION DE LA APLICACION
## MODULO LOGEO 

## CASO 1 : Iniciar Sesion 
### FLUJO DE LAS OPCION
### Vista 1: Logearse
#### Descripcion 
Esta es la opcion que permite al usuario iniciar sesion y poder acceder al sistema
#### Captura de pantalla 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/588ae310-dc80-469a-9003-53e8740ad5e6)
#### Funcionalidad 
El usuario ingresara su cuenta, tanto usuario como contraseña. Si el sistema valida la cuenta. Entonces se le dirigira a la pestaña de **InicioEmpresa**
la cuenta le pertenece a un administrador o le dirigira a la pestaña de **InicioEmpleado** si la cuenta le pertenece a un empleado.
### Vista 2: Pantalla de inicio de administrador  
#### Descripcion 
Esta es la vista que tendra el administrador despues de haberse registrado en el inicio de sesion.
#### Captura de pantalla 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/4a6c9c44-05e2-496f-ae26-aeb756194aed)
#### Funcionalidad 
El administrador podra acceder a todas las opciones que se encuentren en la barra de la izquierda.
### Vista 3: Pantalla de inicio de empleado 
#### Descripcion 
Esta es la vista que tendra el empleado despues de haberse registrado en el inicio de sesion
#### Captura de pantalla 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/d9433449-3d27-4070-af77-a0a5597d5914)
#### Funcionalidad 
El empleado podra acceder a todas las opciones que estan en la barra de la izquierda

## CASO X: Solicitudes de la empresa
### FLUJO DE LAS OPCIONES
### Vista : Ver solicitudes
#### Descripcion 
El administrador al apretar en el boton de **"Solicitudes"**, podra ver las solicitudes de empleados que tiene dicha empresa
#### Captura de pantalla 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/3d940819-544c-4968-9491-d23741ddcd51)
Estas son las solicitudes de la empresa con id = 3, como se aprecia en el URL de la pagina.
#### Funcionalidad 
Se le mostraran todas las solicitudes que tenga asociada dicha empresa. Donde se detallaran diferentes datos de las solicitudes.

### Vista : Ver detalles de solicitudes
#### Descripcion 
El administrador al apretar en el boton **"Ver detalles"**, podra ver los detalles de cada solicitud
#### Captura de pantalla 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/bc52cbc3-a48a-4342-8f36-9ab0c89f0db0)
Estos son los detalles de solicitud de la solicitud de id = 1;
#### Funcionalidad 
Se podra apreciar los datos de la solicitud, como tambien la descripcion de dicha solicitud.

## CASO X: Registrar empleado y contrato 
## FLUJO DE LAS OPCIONES
### Vista : Registrar empleado
#### Descripcion 
El administrador al apretar en el boton de **"Crear empleado"**, podra registrar a un empleado en la empresa.
#### Capturas de pantallas
Esta es la vista donde se puede ingresar los datos del empleado, para posteriormente registrarlo.
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/fb9cf909-97dd-48e5-89e0-42a8447dea34) <br>
Estas son las opciones disponibles de **Regimen pensionario**<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/e8743629-300c-43fd-ae63-48187aaedd82) <br>
Estas son las opciones disponibles de **Seguro medico**<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/6ad247f7-1250-44bb-b521-71fbe2334df7)  <br>
Estas son las opciones disponibles de **Situacion discapacidad**<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/3b942859-99e1-4515-9aec-141a00544c10)  <br>
#### Funcionalidad 
El administrador despues de haber registrado todos los datos del empleado. Apretara en el boton **"Registrar empleado"** y se registraran los datos ingresados del empleado.
### Vista : Registrar contrato
#### Descripcion 
El administrador al apretar en el boton de **"Siguiente"**, podra registrar un contrato de dicho contrato antes registrado.
#### Capturas de pantallas
Esta es la vista donde se puede ingresar los datos del contrato del empleado.
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/cc13c17c-3084-4381-afd1-896a09e5c502) <br>
Estas son las opciones disponibles de **Area**<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/dd4c2f23-e137-4706-adf1-88c0a3828e8e) <br>
Estas son las opciones disponibles de **Cargo**<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/b3a6b927-b6f9-406f-8785-9ab0e098dd9d) <br>
Estas son las opciones disponibles de **Estado de contrato**<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/2dd1a002-bb1a-4e43-83eb-b648147a312d) <br>
Estas son las opciones disponibles de **Tipo de contrato**<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/7af9d029-3356-4869-aab2-0180c0d8b535) <br>
Estas son las opciones disponibles de **Tipo de jornada**<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/47efd74d-baf4-4938-acb4-fc1e6b48cf87) <br>
Estas son las opciones disponibles de **Frecuencia de pago**<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/bec7f0b7-a002-4230-8889-2021f3163fff) <br>
Estas son las opciones disponibles de **Medio de pago**<br>
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/04e0d0a1-87c2-47b3-8c4d-210f2e0f2a41) <br>
#### Funcionalidad 
El administrador despues de haber registrado todos los datos del contrato. Apretara en el boton **"Registrar Contrato"** y se guardara los datos del contrato en el sistema.
Luego podra regresar a la pantalla de inicio apretanto el boton **"Regresar inicio"**

## CASO X: Vigentes
### Vista : Ver empleados vigentes
#### Descripcion 
El administrador al apretar en el boton de **"Vigentes"**, podra visualizar a todos los empleado vigentes de la empresa
#### Capturas de pantallas
Esta es la vista donde podra visualizar todas los empleados vigentes de la empresa
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/aa93dc50-d8fa-4274-8c08-baade987f607)
#### Funcionalidad 


## CASO X: Desvinculados
### Vista : Ver empleados desviculados o inactivos
#### Descripcion 
El administrador al apretar en el boton de **"Vigentes"**, podra visualizar a todos los empleado vigentes de la empresa
#### Capturas de pantallas
Esta es la vista donde podra visualizar todas los empleados vigentes de la empresa
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/2d034a10-cafa-425d-8794-fffd956bc041)
#### Funcionalidad 

## CASO X: Movimientos de planilla
## FLUJO DE LAS OPCIONES
### Vista : Ver lista de contratos 
#### Descripcion 
El administrador al apretar en el boton de **"Vigentes"**, podra visualizar a todos los empleado vigentes de la empresa
#### Capturas de pantallas
Esta es la vista donde podra visualizar todas los empleados vigentes de la empresa
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/d3f25bd7-194d-455d-a8e8-1dd0ef2990c1)
#### Funcionalidad 

## CASO X: Movimientos de un contrato
### Vista : Ver empleados desviculados o inactivos
#### Descripcion 
El administrador al apretar en el boton de **"Vigentes"**, podra visualizar a todos los empleado vigentes de la empresa
#### Capturas de pantallas
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/c2038eef-0e36-4c42-952a-33a5b5aeb1f8)
Esta es la vista donde podra visualizar todas los empleados vigentes de la empresa

#### Funcionalidad 

## CASO X: Movimientos de un contrato
### Vista : Ver empleados desviculados o inactivos
#### Descripcion 
El administrador al apretar en el boton de **"Vigentes"**, podra visualizar a todos los empleado vigentes de la empresa
#### Capturas de pantallas
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/c2038eef-0e36-4c42-952a-33a5b5aeb1f8)
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/3b861847-fd44-42e0-bc59-8ecbad33ab10)

Esta es la vista donde podra visualizar todas los empleados vigentes de la empresa

#### Funcionalidad 

## CASO X: areas
### Vista : Ver empleados desviculados o inactivos
#### Descripcion 
El administrador al apretar en el boton de **"Vigentes"**, podra visualizar a todos los empleado vigentes de la empresa
#### Capturas de pantallas
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/e89d4f1c-b93b-4775-91a4-7aeae19a744f)

Esta es la vista donde podra visualizar todas los empleados vigentes de la empresa

#### Funcionalidad 

## CASO X: cargos
### Vista : Ver empleados desviculados o inactivos
#### Descripcion 
El administrador al apretar en el boton de **"Vigentes"**, podra visualizar a todos los empleado vigentes de la empresa
#### Capturas de pantallas
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/946335f9-3996-43bf-9083-2aa3d6c5995a)


Esta es la vista donde podra visualizar todas los empleados vigentes de la empresa

#### Funcionalidad 

## CASO X: Organigrama
### Vista : Ver empleados desviculados o inactivos
#### Descripcion 
El administrador al apretar en el boton de **"Vigentes"**, podra visualizar a todos los empleado vigentes de la empresa
#### Capturas de pantallas
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/946335f9-3996-43bf-9083-2aa3d6c5995a)


Esta es la vista donde podra visualizar todas los empleados vigentes de la empresa

#### Funcionalidad 




