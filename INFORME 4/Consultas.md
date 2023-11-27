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
SELECT distinct em.id_empleado, em.nombres , em.apellidos, co.fecha_inicio_laboral,
ca.nombre_cargo
FROM Empleado em, planilla pl, estado_contrato est, cargo ca
INNER JOIN contrato co on em.id_empleado =co.id_empleado
INNER JOIN Frecuencia_pago fp on co.id_frecuencia_pago = fp.id_frecuencia_pago 
WHERE pl.periodicidad = fp.frecuencia_pago
AND pl.fecha_inicio>co.fecha_inicio_laboral and co.id_cargo=ca.id_cargo and pl.fecha_fin<=co.fecha_termino_contrato
AND est.estado_contrato='Vigente' and pl.id_planilla = <1>;
-- 1: id de planilla seleccionada
```

Crear nueva planilla:
```
INSERT INTO planilla (periodo, fecha_inicio, fecha_fin, fecha_creacion, hora_creacion)
values (<1> ,<2> ,<3> ,current_date ,current_time);
-- 1: periodicidad de planilla, 2: fecha inicio de planilla, 3: fecha final de planilla
```
Visualizar empleados en nueva planilla:
```
SELECT e.id_empleado, e.nombre, c.fecha_de_contrato, ca.nombre  
FROM empleado e, cargo ca
INNER JOIN contrato co ON em.id_empleado =co.id_empleado
INNER JOIN Frecuencia_pago fp ON co.id_frecuencia_pago = fp.id_frecuencia_pago
INNER JOIN cargo ca ON co.id_cargo = ca.id_cargo
WHERE c.fecha_de_contrato < current_date AND c.fecha_termino_contrato > current_date AND fp.frecuencia_pago= <1>;
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
SELECT * FROM boleta b
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
