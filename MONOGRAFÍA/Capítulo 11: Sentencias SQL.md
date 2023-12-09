# CAPÍTULO 11 : SENTENCIAS SQL


| Codigo Requerimiento    |  R - 001    | 
|:-------------|:---------------|
| Codigo Interfaz    |   I - 001   | 
| Imagen interfaz   | ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/e8412cf3-66de-4947-b0c4-d007af60f40f) |


### Sentecias SQL:
### Eventos: 
* **Autenticación de Usuario:** Se verificará la autenticidad de la persona ingresante a su cuenta.
```
SELECT usuario, contraseña from Cuenta
WHERE usuario = <1> AND contraseña = <2>
```
*Donde los valores del 1 al 2 se capturarán de la interfaz de inicio de sesión según se muestran en la imagen.*


| Codigo Requerimiento    |  R - 002 | 
|:-------------|:---------------|
| Codigo Interfaz    | I - 002  | 
| Imagen interfaz   | ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/31d8b522-39de-4136-b0b7-3cddb2861812) |


### Sentecias SQL:
### Eventos: 
* **Olvidar contraseña:** Se insertan datos en la interfaz para asi corroborar dichos datos con los datos registrados en la base de datos.
```
SELECT nombres, apellidos, dni FROM Empleado WHERE nombres = <1> AND apellidos = <2> AND dni = < 3 >
```
Donde los valores del 1 al 3 se capturarán de la interfaz de olvido de contraseña según se muestran en la imagen.


| Codigo Requerimiento    |   R - 003  | 
|:-------------|:---------------|
| Codigo Interfaz    |     I - 001 y I - 003  | 
| Imagen interfaz   |    ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/810c4a06-7a8c-4d2c-b7a1-5d30d1d41951)    |
| Imagen interfaz   |     ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/3458369c-f54b-4d9d-b303-b1efa3316e2b) |


### Sentecias SQL:
### Eventos: 
* **Cambiar contraseña e inicio de sesión:** Una vez verificados los datos, el usuario ingresa una nueva contraseña para que asi esta sea cambiada por la anterior y así iniciar sesión con su nueva contraseña ya actualizada.
```
UPDATE Cuenta SET contraseña= <3> WHERE usuario = <1>;
SELECT usuario, contraseña from Cuenta
WHERE usuario = <1> AND contraseña = <3>
```
*Donde los valores del 1 al 4 se capturarán de las interfaces de inicio de sesión e ingresar nueva contraseña según se muestran en la imagen.*

| Codigo Requerimiento    |  R - 004   | 
|:-------------|:---------------|
| Codigo Interfaz    |   I - 004    | 
| Imagen interfaz   |   ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/8ef6f6c8-3aa2-4e65-9a17-ab0490e4a21f)  |

### Sentecias SQL:
### Eventos: 
* **Ver solicitudes:** Se mostrará en la pantalla todas la solicitudes pendientes y ya respondidas para que asi el administrador pueda responderla.
```
SELECT so.id_solicitud, em.nombres, em.apellidos, so.fec_solicitud, ti.descripcion FROM Empleado em, Solicitud so, Tipo_solicitud ti, Estado_solicitud es
WHERE so.id_estado_solicitud = es.id_estado_solicitud AND em.id_empleado = so.id_empleado
AND ti.id_tipo_solicitud = so.id_tipo_solicitud
```


| Codigo Requerimiento    |   R - 005  | 
|:-------------|:---------------|
| Codigo Interfaz    |     I - 005  | 
| Imagen interfaz   |   ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/1eb1b037-b250-46ea-a22f-efd9f6674668)     |

### Sentecias SQL:
### Eventos: 
* **Boton Detalles:** Se mostrará los detalles de la solicitud hecha por el empleado el cual tendrá acceso tanto administrador como empleado, el atractivo principal de este boton es conocer los fundamentos del empleado acerca de su solicitud.
```
SELECT so.id_solicitud, em.nombres, em.apellidos, em.dni, so.fec_solicitud, so.hora_solicitud, ti.descripcion, so.detalles, es.descripcion
FROM Empleado em, Solicitud so, Tipo_solicitud ti, Estado_solicitud es
WHERE so.id_estado_solicitud = es.id_estado_solicitud AND em.id_empleado = so.id_empleado
AND ti.id_tipo_solicitud = so.id_tipo_solicitud
```


| Codigo Requerimiento    |  R - 006   | 
|:-------------|:---------------|
| Codigo Interfaz    |    I - 004   | 
| Imagen interfaz   |  ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/cb3c7535-2422-40b9-b160-5b1b487cace6)      |

### Sentecias SQL:
### Eventos: 
* **Boton Estado:** El boton sirve para que el administrador pueda cambiar el estado de espera de la solicitud a Aceptado o Rechazado.
```
UPDATE Solicitud SET id_estado_solicitud = <1> WHERE id_estado_solicitud = 2 AND id_solicitud = <2>
```


| Codigo Requerimiento    |  R - 007   | 
|:-------------|:---------------|
| Codigo Interfaz    |   I - 006    | 
| Imagen interfaz   |    ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/e433215f-d373-4566-aa33-7e8741907696)    |


### Sentecias SQL:
### Eventos: 
* **Pantalla Solicitudes (Empleados):** Se mostrará el historial de todo el registro de solicitudes anteriores del empleado junto con los actuales que se encuentran en espera.
```
SELECT so.id_solicitud, so.fec_solicitud, ti.descripcion, es.descripcion
FROM Solicitud so, Tipo_solicitud ti, Estado_solicitud es
WHERE ti.id_tipo_solicitud = so.id_tipo_solicitud AND es.id_estado_solicitud = so.id_estado_solicitud
AND id_empleado = <1>
```
*El id_empleado <1> se obtiene de la base de datos donde esta registrada la cuenta del mismo empleado.*



| Codigo Requerimiento    |  R - 008   | 
|:-------------|:---------------|
| Codigo Interfaz    |   I - 007, I - 008 y I - 009    | 
| Imagen interfaz   |    ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/24662302-75da-4744-a056-6f80b0eb505b)    |
| Imagen interfaz   |    ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/adeec56f-4dc9-49a8-acd4-0d1feebb1d72)    |
| Imagen interfaz   |   ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/5e808ffc-375f-4a5b-84cf-1ed7af990bc1)     |

### Sentecias SQL:
### Eventos: 
* **Nueva Solicitud:** El usuario podrá enviar una nueva solicitud primero seleccionando el tipo de solicitud que desea, dependiendo de la opción del tipo de solicitud que elija, le pueden aparecer 2 tipos de pantallas, las cuales son una con opción de ingresar un monto y la otra sin la mencionada opción.
#### Opción 1
Al elegirse esta opción, se está eligiendo un tipo de solicitud con monto, por ello aparecerá una nueva pantalla con la opción de ingresar monto, donde al enviar la solicitud, la consulta será:
```
CREATE SEQUENCE id_solicitud START WITH 1
INSERT INTO Solicitud VALUES (NEXTVAL(id_solicitud),<3>, CURRENT_DATE, LOCALTIME , <6> , 2 , <1>, <7> ,<8>)
```
#### Opción 2
Al elegirse esta opción, se esta eligiendo un tipo de solicitud el cual no requiere de ingresarse un monto, debido a ello, aparecerá una pantalla el cual no tiene incluida la opción para ingresar un monto, donde al enviar la solicitud, la consulta será:
```
CREATE SEQUENCE id_solicitud START WITH 1
INSERT INTO Solicitud VALUES (NEXTVAL(id_solicitud),<3>, CURRENT_DATE , LOCALTIME , null , 2 , <2>, <7> ,<8>)
```
*id_empleado <7>: Se obtiene de la base de datos en la cual esta registrada la cuenta. <br>*
*id_empresa <8>: Se obtiene de la base de datos en la cual esta registrada la cuenta.*



| Codigo Requerimiento    |  R009   | 
|:-------------|:---------------|
| Codigo Interfaz    |    I010, I011   | 
| Imagen interfaz   |    ![image](https://github.com/luisfhs712/DBD_LUIS__PERS_23-1/blob/main/Frame%2047_1.png)    |
| Imagen interfaz   |    ![image](https://github.com/luisfhs712/DBD_LUIS__PERS_23-1/blob/main/Frame%2048_1.png) |

### Sentecias SQL:
### Eventos:
1. Llenado de Datos del Empleado: Se mostrarán los campos con datos del usuario que se tiene que ingresar manualmente o elegir entre las que cuentan con opciones (Régimen Pensionario, Seguro Médico, Situación de Discapacidad, Empresa)

- Llenado de Campos
```
SELECT tipo_regimen FROM Regimen_pensionario;
SELECT tipo_seguro FROM Seguro_medico;
SELECT tipo_discapacidad FROM Situacion_discapacidad;
SELECT razon_social FROM Empresa;

INSERT INTO Empleado (id_empleado,nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo,cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad,id_empresa,id_cuenta) VALUES (<1>,<2>,<3>,<4>,<5>,<6>,<7>,<8>,<9>,<10>,<11>,<12>,<13>,<14>)
```
Donde los valores del 1 al 14, se capturan de la interfaz de usuario, como se muestra en la imagen.
- Botón Siguiente 
Se pasa a la siguiente pestaña, para ingresar los datos del contrato del empleado.

2. Llenado de Datos del Contrato del Empleado: Se mostrarán los campos con datos del contrato del empleado que se tiene que ingresar manualmente o elegir entre las opciones de los lookup tables (Área,Cargo,Estado de Contrato, Tipo de Contrato,Tipo de Jornada)
- Llenado de Campos
```
SELECT nombre_cargo FROM Cargo;
SELECT nombre_area FROM Area;
SELECT estado_contrato FROM Estado_contrato;
SELECT tipo_contrato FROM Tipo_contrato;
SELECT tipo_jornada FROM Tipo_jornada;

INSERT INTO Contrato(id_contrato,fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico,id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) VALUES
(<1>,<2>,<3>,<4>,<5>,<6>,<7>,1,<8>,<9>,<10>,<11>,<12>,<13>,<14>);
```
El 1 que está entre <7> y <8>, es el id del estado de contrato, este representa un estado de contrato VIGENTE, el cuál será el único estado de contrato que se permitirá a la hora de Registrar empleados en el sistema, ya una vez registrado se podrá cambiar en base a la actualidad del empleado.
Para <13> y <14>:
En caso de elegir como Medio de Pago(<12>) el Efectivo, esos 2 campos tomarán el valor de NULL.


- *Botón Finalizar: Se termina el registro del empleado al sistema.*


| Codigo Requerimiento    |     | 
|:-------------|:---------------|
| Codigo Interfaz    |   I012    | 
| Imagen interfaz   |      ![image](https://github.com/luisfhs712/DBD_LUIS__PERS_23-1/blob/main/vigentes_1.png)  |


### Sentecias SQL:
### Eventos:
1. Carga de Página: Se llenará la lista de empleados vigentes:

```
SELECT Empleado.id_empleado,Empleado.dni,Empleado.nombre,Empleado.apellidos,Empleado.telefono,Empleado.email FROM Empleado INNER JOIN Cuenta 
ON Empleado.id_cuenta=Cuenta.id_cuenta WHERE Cuenta.id_estado_cuenta=1;
```

2. Búsqueda de Empleado
```
SELECT Empleado.id_empleado,Empleado.dni,Empleado.nombre,Empleado.apellidos,Empleado.telefono,Empleado.email FROM Empleado INNER JOIN Cuenta 
ON Empleado.id_cuenta=Cuenta.id_cuenta WHERE Cuenta.id_estado_cuenta=1 AND ((Empleado.nombre=<1>) OR (Empleado.apellidos=<1>));
```
*El <1> será el nombre o apellido del empleado que se quiere buscar.*


| Codigo Requerimiento    | R012    | 
|:-------------|:---------------|
| Codigo Interfaz    |   I013    | 
| Imagen interfaz   |   ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME3/imagenes/desvinculados_1.png)     |


### Sentecias SQL:
### Eventos:
1. Carga de Página: Se llenará la lista de empleados desvinculados:

```
SELECT Empleado.id_empleado,Empleado.dni,Empleado.nombre,Empleado.apellidos,Empleado.telefono,Empleado.email FROM Empleado INNER JOIN Cuenta 
ON Empleado.id_cuenta=Cuenta.id_cuenta WHERE Cuenta.id_estado_cuenta=2;
```

2. Búsqueda de Empleado
```
SELECT Empleado.id_empleado,Empleado.dni,Empleado.nombre,Empleado.apellidos,Empleado.telefono,Empleado.email FROM Empleado INNER JOIN Cuenta 
ON Empleado.id_cuenta=Cuenta.id_cuenta WHERE Cuenta.id_estado_cuenta=2 AND ((Empleado.nombre=<1>) OR (Empleado.apellidos=<1>));
```
El <1> será el nombre o apellido del empleado que se quiere buscar.


| Codigo Requerimiento    |  R - 007   | 
|:-------------|:---------------|
| Codigo Interfaz    |    I - 006   | 
| Imagen interfaz   |   ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/3b239f7e-1f62-428d-b87b-215d7f9ec422)    |


### Sentecias SQL:
### Eventos:
* **Mostrar empleados filtrados:** Se mostrara en pantalla el listado de contratos activos 
```
SELECT so.id_solicitud, em.nombres, em.apellidos, so.fec_solicitud, ti.descripcion FROM Empleado em, Solicitud so, Tipo_solicitud ti, Estado_solicitud es
WHERE so.id_estado_solicitud = es.id_estado_solicitud AND em.id_empleado = so.id_empleado
AND ti.id_tipo_solicitud = so.id_tipo_solicitud
```

| Codigo Requerimiento    |  R - 007   | 
|:-------------|:---------------|
| Codigo Interfaz    |    I - 006   | 
| Imagen interfaz   |   ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/be19dad0-9762-4c6e-b408-1a7d59ecf00b)     |


### Sentecias SQL:
### Eventos:
* **Mostrar empleados filtrados:** Se mostrara en pantalla el listado de contratos dentro de dicho periodo.
```
SELECT em.dni,em.nombres,em.apellidos,car.nombre_cargo,co.fecha_inicio_laboral,co.fecha_termino_contrato 
FROM Contrato co,Empleado em,Cargo car,Planilla pe WHERE em.id_empleado=co.id_empleado AND car.id_cargo=co.id_cargo 
AND pe.periodo=<1> AND co.fecha_inicio_laboral<=pe.fecha_inicio AND pe.fecha_fin<=co.fecha_termino_contrato; 
```


| Codigo Requerimiento    |     | 
|:-------------|:---------------|
| Codigo Interfaz    |    I - 006   | 
| Imagen interfaz   |     ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/16303985-92b0-44c7-88db-628451c05ac0)   |


### Sentecias SQL:
### Eventos: 
* **Mostrar datos de empleado:** Se mostrara en pantalla los datos del empleado 
```
SELECT em.dni,em.nombres, em.apellidos FROM Empleado em, Contrato con WHERE em.id_empleado=con.id_contrato AND con.id_contrato=<1>;
```
* **Mostrar listado de ingresos:** Se mostrara en el lado izquierdo el listado de ingresos
```
SELECT co.nombre_nomina, mo.monto FROM Contrato con,Concepto_nomina co, Movimiento_planilla mo, Tipo_operacion ti 
WHERE con.id_contrato=mo.id_contrato AND co.id_nomina=mo.id_nomina AND co.id_tipo_operacion=ti.id_tipo_operacion 
AND ti.id_tipo_operacion=1 AND con.id_contrato=<1>;
```
* **Mostrar listado de descuentos:** Se mostrara en el lado derecho el listado de descuentos
```
SELECT co.nombre_nomina, mo.monto FROM Contrato con,Concepto_nomina co, Movimiento_planilla mo, Tipo_operacion ti 
WHERE con.id_contrato=mo.id_contrato AND co.id_nomina=mo.id_nomina AND co.id_tipo_operacion=ti.id_tipo_operacion 
AND ti.id_tipo_operacion=2 AND con.id_contrato=<1>;
```
* **Eliminar concepto registrado:** Se eliminara
```
DELETE FROM Movimiento_planilla mov WHERE mov.id_movimiento=<2>;
```



| Codigo Requerimiento    |   R - 007  | 
|:-------------|:---------------|
| Codigo Interfaz    |  I - 006     | 
| Imagen interfaz   |   ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/3b2f83cf-1ce4-435b-8741-b5336fbfbed9)     |

### Sentecias SQL:
### Eventos:
* **Registrar un concepto:** Se mostrara en pantalla los datos del empleado 
```
INSERT INTO Movimiento_planilla VALUES (<1>,CURRENT_DATE,<2>,<3>,<4>,<5>);
```
* **Actualizar concepto registrado:** Se mostrara en pantalla los datos del empleado 
```
UPDATE Movimiento_planilla mov SET mov.valor=<3> WHERE mov.id_movimiento=<2>;
```


| Codigo Requerimiento    |  R007    | 
|:-------------|:---------------|
| Codigo Interfaz    |     I006  | 
| Imagen interfaz   |    ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/2c1e3766-31e9-46ff-be3a-4078c5646f89)    |

### Sentecias SQL:
### Eventos: 
* **Mostrar datos de empleado:** Se mostrara en pantalla los datos del empleado 
```
SELECT em.dni,em.nombres, em.apellidos FROM Empleado em, Contrato con WHERE em.id_empleado=con.id_contrato AND con.id_contrato=<1>;
```
* **Mostrar conceptos de asistencia registrados:** Se mostrara en pantalla los conceptos registrados 
```
SELECT co.nombre_nomina, asi.fecha_inicio,asi.fecha_final,(fecha_final-fecha_inicio) as valor FROM Contrato con,Concepto_nomina co, 
Asistencia asi WHERE con.id_contrato=asi.id_contrato AND co.id_nomina=asi.id_nomina AND con.id_contrato=<1>;
```
* **Eliminar concepto registrado:** Se eliminara el concepto elegido 
```
DELETE FROM Asistencia asi WHERE asi.id_asistencia=<2>;
```



| Codigo Requerimiento    |  R - 007   | 
|:-------------|:---------------|
| Codigo Interfaz    |    I - 006   | 
| Imagen interfaz   |    ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/114813930/201c9c54-68a4-4f35-9a5a-4eedce2783b0)    |

### Sentecias SQL:
### Eventos:
* **Registrar un concepto asistencia:** Se mostrara en pantalla los datos del empleado 
```
INSERT INTO Asistencia VALUES (<1>,<2>,<3>,<4>,<5>,<6>,<7>);
```
* **Actualizar concepto registrado:** M
```
UPDATE Asistencia asi SET asi.valor=<2> WHERE asi.id_asistencia=<1>;
```

| Codigo Requerimiento    |   R - 0014  | 
|:-------------|:---------------|
| Codigo Interfaz    |   I - 021, I - 022    | 
| Imagen interfaz   |    ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/37d2fddd-7e83-492b-9cbb-32038cc8d324)    |
| Imagen interfaz   |    ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/050290fe-cdd4-46a8-9553-6e168a241cd9)    |

### Sentecias SQL:
### Eventos: 
* **Mostrar datos de la empresa:** Se mostrara en pantalla los datos de la empresa
```
SELECT 
    Empresa.ruc AS RUC, 
    Empresa.razon_social AS Razón_Social,
	CONCAT(RepresentanteLegal.nombres, ' ', RepresentanteLegal.apellido_paterno, ' ', RepresentanteLegal.apellido_materno) AS Representante,
    Empresa.direccion AS Dirección,
	Empresa.estado AS Estado    
FROM Empresa
LEFT JOIN RepresentanteLegal ON Empresa.id_empresa = RepresentanteLegal.id_empresa
WHERE Empresa.id_empresa = 1;
```
* **Mostrar pantalla con la información antes de la edición:** Se mostrara en pantalla los conceptos registrados 
```
SELECT 
    Empresa.id_empresa, 
    Empresa.ruc, 
    Empresa.regimen, 
    Empresa.estado, 
    Empresa.razon_social, 
    Empresa.direccion, 
    Empresa.giro, 
    Empresa.ciudad, 
    Empresa.logo,
    RepresentanteLegal.id_representante,
    RepresentanteLegal.nombres,
    RepresentanteLegal.apellido_paterno,
    RepresentanteLegal.apellido_materno,
    RepresentanteLegal.dni
FROM Empresa
LEFT JOIN RepresentanteLegal ON Empresa.id_empresa = RepresentanteLegal.id_empresa
WHERE Empresa.id_empresa = 1;
```
* **Actualizar información de la empresa:** 
```
UPDATE Empresa
SET 
    direccion = 'Jr. Calle los cocos 789',
    estado = 'Activa'
WHERE id_empresa = 1;
```
* **Añadir algún representante:** 
```
INSERT INTO RepresentanteLegal (nombres, apellido_paterno, apellido_materno, dni, estado, id_empresa)
VALUES ('Roberto Carlos', 'Flores', 'Velarde', '76071011', 'Activo', 1);
```
* **Borrar algún representante:** 
```
DELETE FROM RepresentanteLegal WHERE id_representante = 3;
```


| Codigo Requerimiento    |  R - 0016   | 
|:-------------|:---------------|
| Codigo Interfaz    |   I - 024, I - 025    | 
| Imagen interfaz   |   ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/451e2641-3db6-48c6-bd48-702e23be3374)     |
| Imagen interfaz   |    ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/05708f15-9e98-4c52-ba29-2fa10b45d93d)   |

### Sentecias SQL:
### Eventos: 
* **Mostrar lista de cargos:** Se mostrara en pantalla la lista de cargos registradas con anterioridad 
```
SELECT
    ROW_NUMBER() OVER (ORDER BY c.id_cargo) AS "N°",
    c.nombre_cargo AS "Descripción",
    c.estado AS "Estado",
    a.nombre_area AS "Área"
FROM
    Cargo c
JOIN
    Empresa e ON c.id_empresa = e.id_empresa
JOIN
    Area a ON c.id_empresa = a.id_empresa
WHERE
    e.id_empresa = 1;
```
* **Crear un nuevo cargo:** Se mostrara en pantalla para insertar nuevos cargos necesarios 
```
INSERT INTO Cargo (id_cargo, nombre_cargo, codigo_cargo, descripcion_cargo, requerimientos, estado, id_empresa)
VALUES (16, 'Jefe RRHH', 'jefe_rrhh', 'Gestor y controller del área de recursos humanos, considerando remuneraciones, selección y gestión por procesos', 'Técnico o Ingeniería a fin (DO, RRHH), Metódico', 'Activo', 1);
```

| Codigo Requerimiento    |   R017  | 
|:-------------|:---------------|
| Codigo Interfaz    |   I026, I027    | 
| Imagen interfaz   |   ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/015aa01e-dabd-4fac-bf00-7e711b7566a1)     |
| Imagen interfaz   |  ![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/81944281/784ecdcf-e8df-4c70-a22a-99575bb1a739)      |


### Sentecias SQL:
### Eventos: 
* **Mostrar dividsión de la empresa:** Se mostrara en pantalla las areas que tiene la empresa y la cantidad de empleados según el área
```
SELECT e.razon_social AS empresa, a.nombre_area AS area
FROM Empresa e
INNER JOIN Area a ON e.id_empresa = a.id_empresa
LEFT JOIN Cargo c ON a.id_empresa = c.id_empresa
WHERE e.razon_social = 'GRUPO ROMERO SAC'
GROUP BY e.razon_social, a.nombre_area;
```
* **Crear nueva Area:** Se creará una nueva área de IDI 
```
INSERT INTO Area (id_area, nombre_area, descripcion_area, id_empresa)
VALUES 
(16, 'Investigación y Desarrollo', 'Área encargada de la investigación y creación de nuevos productos.', 9);
```
| Codigo Requerimiento    |    R018    | 
|:-------------|:---------------|
| Codigo Interfaz    |    I - 028    | 
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/planilla.png) |

**Sentencia SQL**

Visualizar planillas:
```
select id_planilla, periodo, fecha_inicio, periodicidad from planilla;
```



| Codigo Requerimiento    |    R019    | 
|:-------------|:---------------|
| Codigo Interfaz    |    I - 029    | 
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/6f0a906384f58d77b59138e88a0e7fa806bd3db7/pnt/R-VerPlanilla.png) |

**Sentencia SQL**

Visualizar empleados en una planilla:
```
SELECT distinct em.id_empleado, em.nombres , em.apellidos, co.fecha_inicio_laboral,
ca.nombre_cargo FROM Empleado em, contrato co, detalle_pago de, planilla pl, estado_contrato est, cargo ca
WHERE em.id_empleado =co.id_empleado AND de.id_detalle_pago=co.id_detalle_pago and pl.periodicidad = de.frecuencia_pago
AND pl.fecha_inicio>co.fecha_inicio_laboral and co.id_cargo=ca.id_cargo and pl.fecha_fin<=co.fecha_termino_contrato
AND est.estado_contrato='Vigente' and pl.id_planilla = <1>;
-- 1: id de planilla seleccionada
```

| Codigo Requerimiento    |    R020    | 
|:-------------|:---------------|
| Codigo Interfaz    |    I - 030, I -031     | 
| Imagen interfaz I - 030   | ![image](https://github.com/nnthony/bookish-doodle/blob/2ceb2f790f281e07d397457c91d28831b6284f14/pnt/R-GenerarPLanilla.png) |
| Imagen interfaz I - 031 | ![image](https://github.com/nnthony/bookish-doodle/blob/2ceb2f790f281e07d397457c91d28831b6284f14/pnt/visualizarcolaboradoresnuevaplanilla.png) |

**Sentencia SQL**

Crear nueva planilla:
```
insert into planilla (periodo, fecha_inicio, fecha_fin, fecha_creacion, hora_creacion)
values (<1> ,<2> ,<3> ,current_date ,current_time);
-- 1: periodicidad de planilla, 2: fecha inicio de planilla, 3: fecha final de planilla
```
Visualizar empleados en nueva planilla:
```
select e.id_empleado, e.nombre, c.fecha_de_contrato, ca.nombre  from empleado e, contrato c, detalle_pago d,cargo ca 
where c.fecha_de_contrato < current_date and c.fecha_termino_contrato > current_date and d.frecuencia_pago= <1>
-- 1: periodicidad de planilla
```

| Codigo Requerimiento    |    R021    | 
|:-------------|:---------------|
| Codigo Interfaz    |    I - 032    | 
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/planillaspagadas.png) |

**Sentencia SQL**

Visualizar planillas que ya han generado sus pagos:
```
select id_planilla, fecha_calculo, periodo, monto_emitido from planilla
where fecha_calculo is not null and monto_emitido is not null;
```
| Codigo Requerimiento    |    R022    | 
|:-------------|:---------------|
| Codigo Interfaz    |    I - 033, I - 034    | 
| Imagen interfaz   I-00F  | ![image](https://github.com/nnthony/bookish-doodle/blob/6545e6397d88a3a2bbade4d4f3435bd855b81231/pnt/R-detallePlanillaPagada.png) |
| Imagen interfaz   I-00G  | ![image](https://github.com/nnthony/bookish-doodle/blob/d2b5a087137a916cfb148ce51a930d75a2aaaf8f/pnt/R-DetallEBoleta1.png) |

**Sentencia SQL**

Conteo de boletas en la planilla:
```
select distinct count(*)  from planilla p, empleado e,boleta b, contrato c
where p.id_planilla = <1> and p.id_planilla=b.id_planilla and c.id_contrato=b.id_contrato and c.id_empleado=e.id_empleado;
-- 1: id de la planilla
```
Visualizar datos adicionales de planilla:
```
select id_planilla, fecha_calculo,monto_emitido, periodo, periodicidad  from planilla where id_planilla = <1>;
-- 1: id de la planilla
```
Visualizar empleados a los que se le pagó en el periodo de planilla:
```
select distinct e.nombres, e.apellidos, b.totalneto, b.id_boleta  from planilla p, empleado e,boleta b, contrato c
where p.id_planilla = <1> and p.id_planilla=b.id_planilla and c.id_contrato=b.id_contrato and c.id_empleado=e.id_empleado;
-- 1: id de la planilla
```
Visualizar generales de boleta:
```
select distinct e.nombres, e.apellidos, e.dni, b.total_neto, b.total_ingresos, b.total_descuentos, b.total_aportes, tc.tipo_contrato,c.sueldo_base 
from planilla p, empleado e, contrato c, concepto_nomina cn, boleta b, movimiento_planilla mp,tipo_contrato tc
where b.id_boleta = <2> and c.id_tipo_contrato=tp.id_tipo_contrato and c.id_empleado=e.id_empleado and b.id_planilla=p.id_planilla;
-- 2: id de la boleta
```
Visualizar montos específicos por cada concepto:
```
select * from movimiento_planilla mp, concepto_nomina cn, boleta b, planilla p, contrato c
where b.id_boleta = <2> and p.fecha_inicio<mp.fecha and p.fecha_fin>=mp.fecha and b.id_planilla=p.id_planilla 
and c.id_contrato=b.id_contrato and c.id_contrato=mp.id_contrato and mp.id_nomina=cn.id_nomina and mp.monto>0;
-- 2: id_boleta
```



| Codigo Requerimiento    |    R023    | 
|:-------------|:---------------|
| Codigo Interfaz    |    I - 035    | 
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/d2b5a087137a916cfb148ce51a930d75a2aaaf8f/pnt/generarnuevasboletas.png) |



**Sentencia SQL**

Visualizar planillas que aun no han sido pagadas:
```
select id_planilla where fecha_calculo is null and monto_emitido is null;
```

