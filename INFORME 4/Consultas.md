### MODULO EMPLEADOS
```
--Registrar Empleado

1. Datos del Empleado
SELECT tipo_regimen FROM Regimen_pensionario;
SELECT tipo_seguro FROM Seguro_medico;
SELECT tipo_discapacidad FROM Situacion_discapacidad;
SELECT razon_social FROM Empresa;

INSERT INTO Empleado (id_empleado,nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo,cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad,id_empresa,id_cuenta) VALUES (<1>,<2>,<3>,<4>,<5>,<6>,<7>,<8>,<9>,<10>,<11>,<12>,<13>,<14>)

2. Datos del Contrato y Pago
SELECT nombre_cargo FROM Cargo;
SELECT nombre_area FROM Area;
SELECT estado_contrato FROM Estado_contrato;
SELECT tipo_contrato FROM Tipo_contrato;
SELECT tipo_jornada FROM Tipo_jornada;

INSERT INTO Contrato(id_contrato,fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico,id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) VALUES
(<1>,<2>,<3>,<4>,<5>,<6>,<7>,1,<8>,<9>,<10>,<11>,<12>,<13>,<14>);

--Mostrar usuarios vigentes o activos
1. Visualizar usuarios vigentes
SELECT Empleado.id_empleado,Empleado.dni,Empleado.nombre,Empleado.apellidos,Empleado.telefono,Empleado.email FROM Empleado INNER JOIN Cuenta 
ON Empleado.id_cuenta=Cuenta.id_cuenta WHERE Cuenta.id_estado_cuenta=1;

2. Búsqueda de un ususario en específico por nombre o apellido
SELECT Empleado.id_empleado,Empleado.dni,Empleado.nombre,Empleado.apellidos,Empleado.telefono,Empleado.email FROM Empleado INNER JOIN Cuenta ON Empleado.id_cuenta=Cuenta.id_cuenta WHERE Cuenta.id_estado_cuenta=1 AND ((Empleado.nombre=<1>) OR (Empleado.apellidos=<1>));

--Mostrar usuarios desvinculados o desactivados
1. Visualizar usuarios desvinculados
SELECT Empleado.id_empleado,Empleado.dni,Empleado.nombre,Empleado.apellidos,Empleado.telefono,Empleado.email FROM Empleado INNER JOIN Cuenta 
ON Empleado.id_cuenta=Cuenta.id_cuenta WHERE Cuenta.id_estado_cuenta=2;

2. Búsqueda de un ususario en específico por nombre o apellido
SELECT Empleado.id_empleado,Empleado.dni,Empleado.nombre,Empleado.apellidos,Empleado.telefono,Empleado.email FROM Empleado INNER JOIN Cuenta 
ON Empleado.id_cuenta=Cuenta.id_cuenta WHERE Cuenta.id_estado_cuenta=2 AND ((Empleado.nombre=<1>) OR (Empleado.apellidos=<1>));
```

### MODULO ADMINISTRACIÓN DE LA EMPRESA
```
-- Mostrar datos de la empresa
SELECT 
    Empresa.ruc AS RUC, 
    Empresa.razon_social AS Razón_Social,
	CONCAT(RepresentanteLegal.nombres, ' ', RepresentanteLegal.apellido_paterno, ' ', RepresentanteLegal.apellido_materno) AS Representante,
    Empresa.direccion AS Dirección,
	Empresa.estado AS Estado    
FROM Empresa
LEFT JOIN RepresentanteLegal ON Empresa.id_empresa = RepresentanteLegal.id_empresa
WHERE Empresa.id_empresa = 1;

-- Mostrar pantalla con la información antes de la edición
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

-- Actualizar información de la empresa
UPDATE Empresa
SET 
    direccion = 'Jr. Calle los cocos 789',
    estado = 'Activa'
WHERE id_empresa = 1;

-- Añadir algún representante
INSERT INTO RepresentanteLegal (nombres, apellido_paterno, apellido_materno, dni, estado, id_empresa)
VALUES ('Roberto Carlos', 'Flores', 'Velarde', '76071011', 'Activo', 1);

--Borrar algún representante
DELETE FROM RepresentanteLegal WHERE id_representante = 3;

```
### MODULO ORGANIZACIÓN
```
-- Mostrar lista de cargos
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

-- Crear un nuevo cargo
INSERT INTO Cargo (id_cargo, nombre_cargo, codigo_cargo, descripcion_cargo, requerimientos, estado, id_empresa)
VALUES (16, 'Jefe RRHH', 'jefe_rrhh', 'Gestor y controller del área de recursos humanos, considerando remuneraciones, selección y gestión por procesos', 'Técnico o Ingeniería a fin (DO, RRHH), Metódico', 'Activo', 1);

-- Mostrar dividsión de la empresa
SELECT e.razon_social AS empresa, a.nombre_area AS area
FROM Empresa e
INNER JOIN Area a ON e.id_empresa = a.id_empresa
LEFT JOIN Cargo c ON a.id_empresa = c.id_empresa
WHERE e.razon_social = 'GRUPO ROMERO SAC'
GROUP BY e.razon_social, a.nombre_area;

-- Crear nueva Area
INSERT INTO Area (id_area, nombre_area, descripcion_area, id_empresa)
VALUES 
(16, 'Investigación y Desarrollo', 'Área encargada de la investigación y creación de nuevos productos.', 9);
```


### MODULO PLANILLA
**Sentencia SQL**

Visualizar planillas:
```
SELECT id_planilla, periodo, fecha_inicio, periodicidad FROM planilla;
```


Visualizar empleados en una planilla:
```
SELECT distinct em.id_empleado, em.nombre , em.apellidos, co.fecha_inicio_laboral,
ca.nombre_cargo
FROM empleado em, planilla pl, estado_contrato est, cargo ca, contrato co,Frecuencia_pago fp
where pl.id_planilla = <1> and em.id_empleado =co.id_empleado and co.id_frecuencia_pago=fp.id_frecuencia_pago
and fp.frecuencia_pago=pl.periodicidad and pl.fecha_fin<=co.fecha_termino_contrato and pl.fecha_inicio>=co.fecha_inicio_laboral
and ca.id_cargo=co.id_cargo;
-- 1: id de planilla seleccionada
```

Crear nueva planilla:
```
INSERT INTO planilla (fecha_inicio, fecha_fin, periodicidad, fecha_creacion, hora_creacion)
values (<2> ,<3>, <1> ,current_date ,current_time);
-- 1: periodicidad de planilla, 2: fecha inicio de planilla, 3: fecha final de planilla
-- hay que generar el id, el codigo de periodo y poner los dias laborables dependiendo si es mensual o quincenal
```
Visualizar empleados en nueva planilla:
```
SELECT e.id_empleado, e.nombre, c.fecha_de_contrato, ca.nombre  
FROM contrato c, cargo ca
INNER JOIN empleado e ON e.id_empleado =c.id_empleado
INNER JOIN Frecuencia_pago fp ON c.id_frecuencia_pago = fp.id_frecuencia_pago
INNER JOIN cargo ca ON c.id_cargo = ca.id_cargo
WHERE c.fecha_inicio_laboral < current_date AND c.fecha_termino_contrato > current_date AND fp.frecuencia_pago= <1>;
-- 1: periodicidad de planilla
```
Visualizar planillas que ya han generado sus pagos:
```
SELECT id_planilla, fecha_calculo, periodo, monto_emitido FROM planilla
WHERE fecha_calculo IS NOT NULL AND monto_emitido IS NOT NULL;
```

Conteo de boletas en la planilla:
```
SELECT DISTINCT count(*)  FROM planilla p
INNER JOIN boleta b ON b.id_planilla = p.id_planilla
INNER JOIN contrato co ON b.id_contrato = co.id_contrato
INNER JOIN empleado e ON e.id_empleado = co.id_empleado
WHERE p.id_planilla = <1> ;
-- 1: id de la planilla
```
Visualizar datos adicionales de planilla:
```
SELECT id_planilla, fecha_calculo,monto_emitido, periodo, periodicidad  FROM planilla WHERE id_planilla = <1>;
-- 1: id de la planilla
```
Visualizar empleados a los que se le pagó en el periodo de planilla:
```
SELECT DISTINCT e.nombres, e.apellidos, b.totalneto, b.id_boleta from planilla p
INNER JOIN boleta b ON b.id_planilla = p.id_planilla
INNER JOIN contrato co ON b.id_contrato = co.id_contrato
INNER JOIN empleado e ON e.id_empleado = co.id_empleado
WHERE p.id_planilla = <1>;
-- 1: id de la planilla
```
Visualizar generales de boleta:
```
SELECT DISTINCT e.nombres, e.apellidos, e.dni, b.total_neto, b.total_ingresos, b.total_descuentos, b.total_aportes, tc.tipo_contrato,co.sueldo_base 
FROM boleta b
INNER JOIN planilla p ON b.id_planilla = p.id_planilla
INNER JOIN contrato co ON b.id_contrato = co.id_contrato
INNER JOIN tipo_contrato tc ON c.id_tipo_contrato=tp.id_tipo_contrato
INNER JOIN empleado e ON co.id_empleado=e.id_empleado
WHERE b.id_boleta = <2>
-- 2: id de la boleta
```
Visualizar montos específicos por cada concepto:
```
SELECT cn.nombre_nomina, mp.monto FROM boleta b
INNER JOIN planilla p ON b.id_planilla = p.id_planilla
INNER JOIN contrato co ON b.id_contrato = co.id_contrato
INNER JOIN movimiento_planilla mp ON mp.id_contrato = co.id_contrato
INNER JOIN concepto_nomina cn ON mp.id_nomina = cn.id_nomina
WHERE b.id_boleta = <2> AND p.fecha_inicio < mp.fecha AND p.fecha_fin >= mp.fecha AND mp.monto>0;
-- 2: id_boleta
```

Visualizar planillas que aun no han sido pagadas:
```
SELECT id_planilla WHERE fecha_calculo IS NULL AND monto_emitido IS NULL;
```

### MODULO CUENTA
**Sentencia SQL**<br>
Auntenticación de Usuario:
```
SELECT usuario, contraseña from Cuenta
WHERE usuario = <1> AND contraseña = <2>
```

Olvidar contraseña:
```
SELECT nombres, apellidos, dni FROM Empleado WHERE nombres = <1> AND apellidos = <2> AND dni = < 3 >
```

Cambiar contraseña e inicio de sesión:
```
UPDATE Cuenta SET contraseña= <3> WHERE usuario = <1>;
SELECT usuario, contraseña from Cuenta
WHERE usuario = <1> AND contraseña = <3>
```
### MODULO SOLICITUDES
**Sentencia SQL**<br>
Ver solicitudes (Administrador):
```
SELECT so.id_solicitud, em.nombres, em.apellidos, so.fec_solicitud, ti.descripcion FROM Empleado em, Solicitud so, Tipo_solicitud ti, Estado_solicitud es
WHERE so.id_estado_solicitud = es.id_estado_solicitud AND em.id_empleado = so.id_empleado
AND ti.id_tipo_solicitud = so.id_tipo_solicitud
```

Boton detalles:
```
SELECT so.id_solicitud, em.nombres, em.apellidos, em.dni, so.fec_solicitud, so.hora_solicitud, ti.descripcion, so.detalles, es.descripcion
FROM Empleado em, Solicitud so, Tipo_solicitud ti, Estado_solicitud es
WHERE so.id_estado_solicitud = es.id_estado_solicitud AND em.id_empleado = so.id_empleado
AND ti.id_tipo_solicitud = so.id_tipo_solicitud
```

Boton cambio de estado:
```
UPDATE Solicitud SET id_estado_solicitud = <1> WHERE id_estado_solicitud = 2 AND id_solicitud = <2>
```

Ver Solicitudes (Empleado):
```
SELECT so.id_solicitud, so.fec_solicitud, ti.descripcion, es.descripcion
FROM Solicitud so, Tipo_solicitud ti, Estado_solicitud es
WHERE ti.id_tipo_solicitud = so.id_tipo_solicitud AND es.id_estado_solicitud = so.id_estado_solicitud
AND id_empleado = <1>
```

Nueva solicitud: <br>
Con opción aumento
```
CREATE SEQUENCE id_solicitud START WITH 1
INSERT INTO Solicitud VALUES (NEXTVAL(id_solicitud),<3>, CURRENT_DATE, LOCALTIME , <6> , 2 , <1>, <7> ,<8>)
```
Sin opción aumento
```
CREATE SEQUENCE id_solicitud START WITH 1
INSERT INTO Solicitud VALUES (NEXTVAL(id_solicitud),<3>, CURRENT_DATE , LOCALTIME , null , 2 , <2>, <7> ,<8>)
```

