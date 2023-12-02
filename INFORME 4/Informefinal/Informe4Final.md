# ÍNDICES Y OTROS OBJETOS DE BD
# PL/pgSQL - PROCESO BATCH
# ACTUALIZACIONES A LA ARQUITECTURA DE LA APLICACIÓN
## ESTRUCTURA DE LA APLICACIÓN

## TECNOLOGIA UTILIZADA

## HERRAMIENTAS

## BASES DE DATOS

## SERVER

## CLIENTE

# VERSIÓN FINAL DE LA APLICACIÓN
## VISTA 1
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME3/imagenes/Frame%2047.png)
### QUERY 1
```
SELECT tipo_regimen FROM Regimen_pensionario;
SELECT tipo_seguro FROM Seguro_medico;
SELECT tipo_discapacidad FROM Situacion_discapacidad;
SELECT razon_social FROM Empresa;

INSERT INTO Empleado (id_empleado,nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo,cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad,id_empresa) VALUES (<1>,<2>,<3>,<4>,<5>,<6>,<7>,<8>,<9>,<10>,<11>,<12>,<13>)
```
### RESULTADOS
- Antes de una inserción:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME%204/Im%C3%A1genes/v1_1.jpg)

- Luego de la inserción:<br>
Se probó, para el ejemplo:
```
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('DANIEL','SIFUENTES GRADOS','1993/05/11',30,964701287,'daniel.sifuentes@harlamsyo.pe',47756342,'Soltero','Masculino',0,2,1,1,1);

```
La base de datos registra esta inserción:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME%204/Im%C3%A1genes/v1_2.jpg)


### POSTMAN




## VISTA 2
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME3/imagenes/Frame%2048.png)
### QUERY 1
```
SELECT nombre_cargo FROM Cargo;
SELECT nombre_area FROM Area;
SELECT estado_contrato FROM Estado_contrato;
SELECT tipo_contrato FROM Tipo_contrato;
SELECT tipo_jornada FROM Tipo_jornada;

INSERT INTO Contrato(id_contrato,fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico,id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) VALUES
(<1>,<2>,<3>,<4>,<5>,<6>,<7>,1,<8>,<9>,<10>,<11>,<12>,<13>,<14>);
```
### RESULTADOS
- Antes de una inserción:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME%204/Im%C3%A1genes/v2_1.jpg)

- Luego de la inserción:<br>
Se probó, para el ejemplo:
```
INSERT INTO Contrato (fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico, id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) VALUES ('15-01-2020','01-02-2020','31-12-2023',991.9614,991.96130080387,1,2,1,1,1,1,1,3);
```
La base de datos registra esta inserción:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME%204/Im%C3%A1genes/v2_2.jpg)

### POSTMAN




## VISTA 3
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME3/imagenes/vigentes.png)
### QUERY 1
```
SELECT Empleado.id_empleado,Empleado.dni,Empleado.nombre,Empleado.apellidos,Empleado.telefono,Empleado.email 
FROM Empleado 
INNER JOIN Cuenta_empleado
ON Cuenta_empleado.id_empleado=Empleado.id_empleado 
WHERE Cuenta_empleado.id_estado_cuenta=1;
```
### RESULTADOS
Se probó para los datos:
```
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('DANIEL','SIFUENTES GRADOS','1993/05/11',30,964701287,'daniel.sifuentes@harlamsyo.pe',47756342,'Soltero','Masculino',0,2,1,1,1);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('EDUARDO SAUL','ESCOBEDO VILLANUEVA','1979/04/18',44,991961400,'',40157917,'Casado','Masculino',1,2,2,1,1);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('JAPHET CHARLIE JESUS','TORRES HUARINGA','1985/05/29',38,926270930,'',43044175,'Casado','Masculino',1,2,3,1,2);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('JHON ERIK','CAMPO VELÁSQUEZ','1991/04/13',32,931854954,'campovelas@gmail.com',47231764,'Soltero','Masculino',0,2,3,1,4);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('KEVYN ANTHONY','PLASENCIA BLANCO','1991/04/13',28,998400448,'kevpb95@gmail.com',75363683,'Soltero','Masculino',0,1,3,1,4);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('FRANCISCO ROBERTO','GRADOS PAREDES','1987/10/04',36,918099146,'gradosparadesfrank@gmail.com',44569138,'Casado','Masculino',2,1,3,1,4);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('JORGE LUIS','HOLGUIN ALARCON','2001/06/04',22,938197568,'jorholguinalarcon@gmail.com',72756436,'Soltero','Masculino',0,2,3,2,2);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('RONALD HERBERT','PRUDENCIO ALIAGA','1994/12/12',29,920852657,'ronaldhpa12@hotmail.com',72079266,'Casado','Masculino',1,2,3,1,2);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('YESSICA ISABEL','FLORES VELARDE','1990/11/17',33,989686976,'yessicflores@gmail.com',46698999,'Casado','Femenino',0,2,3,1,2);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('OMAR ADRIAN','ANAYA AYALA','1992/01/05',31,992423368,'anayaayala@gmail.com',46850431,'Casado','Masculino',1,2,3,1,2);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('CLAUDIA JOSELIN','CAMONES ALEGRIA','1983/06/22',40,993904334,'',42201690,'Viudo','Femenino',2,2,4,2,3);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('GAYMO LUIS','PEREZ MUÑOZ','1992-05-30',31,970897522,'',71902155,'Casado','Masculino',1,2,4,1,3);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('JORGE OSWALDO','ARGUEDAS PUCUTAY','1991/08/10',31,981378149,'larguedas1010@gmail.com',71395354,'Casado','Masculino',1,1,3,1,3);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('JORGE LUIS','DIAZ LEYTON','1982/09/17',41,997935493,'leyton17_14@hotmail.com',41473747,'Divorciado','Masculino',1,2,4,1,3);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('KAREN EDITH','POMA CAMACHO DE SALAZAR','1983/07/22',40,936131832,'karenpomakp30@gmail.com',42685693,'Divorciado','Femenino',1,1,3,1,3);
```
```
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('DANIEL','47756342',1,'empleado',1);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('EDUARDO SAUL','40157917',1,'empresa',2);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('JAPHET CHARLIE JESUS','43044175',1,'empleado',3);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('JHON ERIK','47231764',1,'empleado',4);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('KEVYN ANTHONY','75363683',1,'empleado',5);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('FRANCISCO ROBERTO','44569138',1,'empleado',6);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('JORGE LUIS','72756436',1,'empleado',7);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('RONALD HERBERT','72079266',1,'empleado',8);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('YESSICA ISABEL','46698999',1,'empleado',9);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('OMAR ADRIAN','46850431',1,'empleado',10);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('CLAUDIA JOSELIN','42201690',2,'empleado',11);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('GAYMO LUIS','71902155',2,'empleado',12);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('JORGE OSWALDO','71395354',2,'empleado',13);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('JORGE LUIS','41473747',2,'empleado',14);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('KAREN EDITH','42685693',2,'empleado',15);
```
El resultado tras introducir y ejecutar el query 1 es:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME%204/Im%C3%A1genes/v3_1.jpg)
### POSTMAN



## VISTA 4
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME3/imagenes/desvinculados.png)
### QUERY 1
```
SELECT Empleado.id_empleado,Empleado.dni,Empleado.nombre,Empleado.apellidos,Empleado.telefono,Empleado.email 
FROM Empleado 
INNER JOIN Cuenta_empleado
ON Cuenta_empleado.id_empleado=Empleado.id_empleado 
WHERE Cuenta_empleado.id_estado_cuenta=2;
```
### RESULTADOS
Se probó para los datos:
```
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('DANIEL','SIFUENTES GRADOS','1993/05/11',30,964701287,'daniel.sifuentes@harlamsyo.pe',47756342,'Soltero','Masculino',0,2,1,1,1);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('EDUARDO SAUL','ESCOBEDO VILLANUEVA','1979/04/18',44,991961400,'',40157917,'Casado','Masculino',1,2,2,1,1);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('JAPHET CHARLIE JESUS','TORRES HUARINGA','1985/05/29',38,926270930,'',43044175,'Casado','Masculino',1,2,3,1,2);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('JHON ERIK','CAMPO VELÁSQUEZ','1991/04/13',32,931854954,'campovelas@gmail.com',47231764,'Soltero','Masculino',0,2,3,1,4);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('KEVYN ANTHONY','PLASENCIA BLANCO','1991/04/13',28,998400448,'kevpb95@gmail.com',75363683,'Soltero','Masculino',0,1,3,1,4);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('FRANCISCO ROBERTO','GRADOS PAREDES','1987/10/04',36,918099146,'gradosparadesfrank@gmail.com',44569138,'Casado','Masculino',2,1,3,1,4);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('JORGE LUIS','HOLGUIN ALARCON','2001/06/04',22,938197568,'jorholguinalarcon@gmail.com',72756436,'Soltero','Masculino',0,2,3,2,2);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('RONALD HERBERT','PRUDENCIO ALIAGA','1994/12/12',29,920852657,'ronaldhpa12@hotmail.com',72079266,'Casado','Masculino',1,2,3,1,2);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('YESSICA ISABEL','FLORES VELARDE','1990/11/17',33,989686976,'yessicflores@gmail.com',46698999,'Casado','Femenino',0,2,3,1,2);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('OMAR ADRIAN','ANAYA AYALA','1992/01/05',31,992423368,'anayaayala@gmail.com',46850431,'Casado','Masculino',1,2,3,1,2);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('CLAUDIA JOSELIN','CAMONES ALEGRIA','1983/06/22',40,993904334,'',42201690,'Viudo','Femenino',2,2,4,2,3);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('GAYMO LUIS','PEREZ MUÑOZ','1992-05-30',31,970897522,'',71902155,'Casado','Masculino',1,2,4,1,3);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('JORGE OSWALDO','ARGUEDAS PUCUTAY','1991/08/10',31,981378149,'larguedas1010@gmail.com',71395354,'Casado','Masculino',1,1,3,1,3);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('JORGE LUIS','DIAZ LEYTON','1982/09/17',41,997935493,'leyton17_14@hotmail.com',41473747,'Divorciado','Masculino',1,2,4,1,3);
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('KAREN EDITH','POMA CAMACHO DE SALAZAR','1983/07/22',40,936131832,'karenpomakp30@gmail.com',42685693,'Divorciado','Femenino',1,1,3,1,3);
```
```
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('DANIEL','47756342',1,'empleado',1);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('EDUARDO SAUL','40157917',1,'empresa',2);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('JAPHET CHARLIE JESUS','43044175',1,'empleado',3);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('JHON ERIK','47231764',1,'empleado',4);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('KEVYN ANTHONY','75363683',1,'empleado',5);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('FRANCISCO ROBERTO','44569138',1,'empleado',6);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('JORGE LUIS','72756436',1,'empleado',7);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('RONALD HERBERT','72079266',1,'empleado',8);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('YESSICA ISABEL','46698999',1,'empleado',9);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('OMAR ADRIAN','46850431',1,'empleado',10);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('CLAUDIA JOSELIN','42201690',2,'empleado',11);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('GAYMO LUIS','71902155',2,'empleado',12);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('JORGE OSWALDO','71395354',2,'empleado',13);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('JORGE LUIS','41473747',2,'empleado',14);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('KAREN EDITH','42685693',2,'empleado',15);
```
El resultado tras introducir y ejecutar el query 1 es:
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME%204/Im%C3%A1genes/v4_1.jpg)


### POSTMAN




# PROXIMOS PASOS
## REQUERIMIENTOS NO ATENDIDOS
Si bien el flujo de actividades que se ha presentado en la demo de la apliación de este trabajo comprende gran parte de las funcionalidades principales de un sistema de planillas completo, aún no se ha cumplido el 100% de los requerimientos necesarios para este. Estos requerimientos pertenecen a los siguientes módulos:
### ASISTENCIA
El sistema de plantillas deberá, en un futuro, poder permitir gestionar permisos, licencias y vacaciones de los empleados a través de un módulo independiente, además de poder registrar la asistencia, horas extras, horas no trabajadas, feriados laborados y ausencias de los empleados.
En este módulo también se podrá contar con un calendario, que permita visualizar las fechas de vacaciones, licencias, ausencias y permisos de los empleados, de manera que facilite la coordinación en la empresa.
### DOCUMENTOS
El sistema de planillas deberá, en un futuro, permitir la subida de plantillas de documentos como por ejemplo, el Contrato tipo, Anexo tipo,  Certificado de Antigüedad, Certificado de Vacaciones, Finiquito, Carta de Aviso o Certificado de Renta Anual, entre muchos otros, pero además también se podrá hacer gestión documental, de manera que se tenga un repositorio de documentos de cada empleado de la empresa.
Otro agregado será el de firma electrónica del empleado, a los cuales se les notificará a través de la plataforma y su correo que tienen documentos pendientes de firma, para firmar digitalmente deberán ingresar a la plataforma con su usuario respectivo, ir al módulo documentos, revisar el documento, ingresar la contraseña de usuario, luego se le enviará un correo su código de confirmación, el cual luego de ser ingresado en la plataforma hará que el documento figure como firmado por el empleado.
### AMONESTACIONES
A través de este módulo se buscará que se pueda registrar amonestaciones al personal de la empresa sin muchas dificultades.
Se creará dentro de este módulo una opción "Crear amonestación", en donde se deberá elegir al empleado vigente a amonestar, luego de esto se podrá crear un reporte sobre la amonestación indicando los detalles de este.

## CAMBIOS NECESARIOS
Con el fin de salvaguardar la seguridad de la empresa y de los empleados de esta, podría considerarse aplicar una capa adicional de seguridad, como una autenticación multifactor por ejemplo, a través de códigos de verificación, además del cifrado de datos, el cual ayudará a proteger los datos sensibles de la plataforma, como los datos financieros por ejemplo, esto podría hacerse usando la extensión pgcrypto.
Además también se necesitará organizar los componentes de acuerdo a los módulos que se han establecido en este documento, de manera que se simplifique el diseño y se reduzca la complejidad para facilitar la detección de errores, lo que a su vez facilitaría su corrección.
## ROADMAP
Luego de los cambios necesarios mencionados se procederá con la fase de pruebas, la cual en caso de pasar exitosamente, se pasará a desplegar la apliación web en un servicio cloud, como pueden ser Amazon Web Services (AWS), Microsoft Azure, Google Cloud Platform (GCP) o Oracle Cloud Infrastructure (OCI). Finalmente, luego de todo esto, la aplicación web entrará en uso y se le dará un mantenimiento periódico, y actualizaciones cada que sea necesario.
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME%204/Im%C3%A1genes/roadmap.PNG)



