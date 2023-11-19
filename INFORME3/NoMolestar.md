## Codificacion de Requerimientos

| Código | R00A  |
|----------|----------|
|Nombre  | Planillas|
|Objetivo  |Visualizar todas las planillas que están registradas en la base de datos|
| Descripción   | El administrador puede visualizar todas las planillas de los distintos periodos de trabajo  |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | -  |

| Código | R00B  |
|----------|----------|
|Nombre  | Empleados en una planilla|
|Objetivo  |Visualizar todos los empleados en una planilla en específica|
| Descripción   | El administrador puede visualizar todos los trabajadores en una planilla, además se brindan datos adicionales sobre la planilla |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | -  |

| Código | R00C  |
|----------|----------|
|Nombre  |Crear una planilla|
|Objetivo  |Generar una nueva planilla |
| Descripción   | Se creará una nueva planilla que servirá para realizar a los trabajadores, esta planilla está delimitada por algunos parametros como el periodo y la periodicidad, además se pueden visualizar los empleados que estarán incluidos en esta nueva planilla |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | -  |


| Código | R00D  |
|----------|----------|
|Nombre  | Planillas pagadas|
|Objetivo  |Visualizar las planillas que ya fueron pagadas |
| Descripción   | El administrador puede visualizar las planillas que ya fueron pagadas, visualizando otros datos como el monto resultante que se le pago a todos los trabajadores en esa planilla |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | -  |

| Código | R00E  |
|----------|----------|
|Nombre  | Boletas |
|Objetivo | Visualizar los pagos a empleados y detalles de boleta |
| Descripción   | El administrador puede visualizar los montos de pago a cada empleado por planilla, además puede visualizar cada una de las boletas generadas a partir de una planilla. Se muuestra tambien los detalles de cada boleta |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | -  |

| Código | R00F  |
|----------|----------|
|Nombre  | Generar pago |
|Objetivo | Generar el pago para trabajdores en planilla |
| Descripción   | El administrador puede generar las boletas de pago por una planilla, visualizando previamente algunas variables en pantalla |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | -  |


## Codificación de prototipos de interfaz

| Codigo Interfaz    |    I - 00A    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/planilla.png) |

| Codigo Interfaz    |    I - 00B    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/6f0a906384f58d77b59138e88a0e7fa806bd3db7/pnt/Detalleplanilla1.png) |

| Codigo Interfaz    |    I - 00C    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/generar%20planilla.png) |

| Codigo Interfaz    |    I - 00D    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/visualizarcolaboradoresnuevaplanilla.png) |

| Codigo Interfaz    |    I - 00E    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/planillaspagadas.png) |

| Codigo Interfaz    |    I - 00F    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/detalleplanillaspagadas.png) |

| Codigo Interfaz    |    I - 00G    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/detalleboleta.png) |

| Codigo Interfaz    |    I - 00H    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/generarnuevasboletas.png) |

### Sentencias SQL por cada prototipo

| Codigo Requerimiento    |    R00A    | 
|:-------------|:---------------|
| Codigo Interfaz    |    I - 00A    | 
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/planilla.png) |

**Sentencia SQL**

Visualizar planillas:
```
select id_planilla, periodo, fecha_inicio, periodicidad from planilla;
```



| Codigo Requerimiento    |    R00B    | 
|:-------------|:---------------|
| Codigo Interfaz    |    I - 00B    | 
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

| Codigo Requerimiento    |    R00C    | 
|:-------------|:---------------|
| Codigo Interfaz    |    I - 00C, I -00D     | 
| Imagen interfaz I - 00C   | ![image](https://github.com/nnthony/bookish-doodle/blob/2ceb2f790f281e07d397457c91d28831b6284f14/pnt/R-GenerarPLanilla.png) |
| Imagen interfaz I - 00D | ![image](https://github.com/nnthony/bookish-doodle/blob/2ceb2f790f281e07d397457c91d28831b6284f14/pnt/visualizarcolaboradoresnuevaplanilla.png) |

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

| Codigo Requerimiento    |    R00D    | 
|:-------------|:---------------|
| Codigo Interfaz    |    I - 00E    | 
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/planillaspagadas.png) |

**Sentencia SQL**

Visualizar planillas que ya han generado sus pagos:
```
select id_planilla, fecha_calculo, periodo, monto_emitido from planilla
where fecha_calculo is not null and monto_emitido is not null;
```
| Codigo Requerimiento    |    R00E    | 
|:-------------|:---------------|
| Codigo Interfaz    |    I - 00F, I - 00G    | 
| Imagen interfaz   | ![image]() |

**Sentencia SQL**

-:
```

```




| Codigo Requerimiento    |    R00    | 
|:-------------|:---------------|
| Codigo Interfaz    |    I - 00    | 
| Imagen interfaz   | ![image]() |

**Sentencia SQL**

-:
```

```


### FUNCIONALIDAD PRIMARIA ELEGIDA (POR MODULO)
### MODULO : PLANILLA
