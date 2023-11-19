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
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/12ab224f3729055d81bb78c5a342c2ea6f54dd7e/pnt/detalleboleta1.png) |

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
select cn.nombre_nomina,mp.monto from movimiento_planilla mp, concepto_nomina cn, boleta b, planilla p, contrato c
where b.id_boleta = <2> and p.fecha_inicio<mp.fecha and p.fecha_fin>=mp.fecha and b.id_planilla=p.id_planilla 
and c.id_contrato=b.id_contrato and c.id_contrato=mp.id_contrato and mp.monto>0;
-- 2: id de la boleta
```



| Codigo Requerimiento    |    R00F    | 
|:-------------|:---------------|
| Codigo Interfaz    |    I - 00H    | 
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/d2b5a087137a916cfb148ce51a930d75a2aaaf8f/pnt/generarnuevasboletas.png) |

**Sentencia SQL**

Visualizar planillas que aun no han sido pagadas:
```
select id_planilla where fecha_calculo is null and monto_emitido is null;
```


### FUNCIONALIDAD PRIMARIA ELEGIDA (POR MODULO)
### MODULO : PLANILLA
Funcionalidad primaria elegida: Gestionar y controlar las planillas de los pagos hacia los trabajadores

Sustentación: Es imprescindible para poder manejar y llevar un registro históricos de los pagos a los trabajadores, se puede visualizar los empleados que estuvieron incluidos en planillas anteriores, además de visualizar el monto de las boletas de cada empleado en los distintos periodos que se mantuvieron en la empresa

Esta funcionalidad permite satisfacer los requerimientos R00A, R00B, R00C, R00D, R00E y R00F relacionadas con las interfaces gráficas I-00A, I-00B, I-00C, I-00D, I-00E, I-00F, I-00G, I-00H
| Actividad    |    Descripcion    | 
|:-------------:|:---------------:|
| 1    | En el apartado de planillas, se muestra la interfaz I-00A, se pueden visualizar las planillas que han sido creadas con anterioridad. Debajo de la columna detalles, hay botones que muestran los detalles de cada planilla que nos llevan a la interfaz gráfica I-00B. Otro botón en la parte superior derecha, dirige a la interfaz I- 00C ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/planilla.png)  | 
| 2   | Luego de darle al botón detalles, en la interfaz I-00B, se muestran todos los trabajadores incluidos en esa planilla y algunos datos adicionales, si se presionar el botón "aceptar", se redirige a la interfaz I-00A, teniendo así una nueva planilla ![image](https://github.com/nnthony/bookish-doodle/blob/6f0a906384f58d77b59138e88a0e7fa806bd3db7/pnt/Detalleplanilla1.png)   |
| 3   | En la interfaz I-00A, al presionar en el botón de "Generar planilla", se redirige a la interfaz I-00C, aquí se muestran una barras para completar. Una vez rellenadas las barras se puede oprimir el boton de "ver colaboradores", que redirige a la interfaz I-00D. Tambien se puede oprimir aceptar directamente ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/generar%20planilla.png)  |
| 4   | En la interfaz I-00D, se puede visualizar los colaboradores que estarán incluidos en esta nueva planilla. Al oprimir el botón aceptar se redirige de nuevo a la interfaz I-00C ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/visualizarcolaboradoresnuevaplanilla.png) |
| 5   | En el apartado de boleta, se muestra la interfaz I-00E, se muestran todas las planillas que ya han sido pagadas, debajo de la columna "detalles" hay botones que redirigen a la interfaz I-00F de la planilla elegida. En la parte superior derecha, hay un boton "Generar pago" que redirige a la interfaz I-00H    ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/planillaspagadas.png) |
| 6   | En la interfaz I-00F, se muestran algunos datos relevantes sobre la planilla ya pagada, además de la lista de empleados a los que se les pagó por esa planilla. Debajo de la columna detalles hay botones que permiten visualizar los detalles de la boleta de un trabajador y se redirige a la interfaz I-00G. En la interfas I-00G se puede visualizar cada uno de los conceptos por los que se le pagó en dicha boleta, además de otros datos relevantes del empleado ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/detalleplanillaspagadas.png) ![image](https://github.com/nnthony/bookish-doodle/blob/12ab224f3729055d81bb78c5a342c2ea6f54dd7e/pnt/detalleboleta1.png)|
| 7   | En la interfaz I-00H, se muestran algunos datos relevantes para los pagos de planilla, el administrador puede seleccionar una planilla que no ha sido pagada y generar el pago con el botón "aceptar", se redirigirá a la interfaz I-00E con una nueva planilla pagada ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/generarnuevasboletas.png)|
