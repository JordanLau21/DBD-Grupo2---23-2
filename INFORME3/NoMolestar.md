## Codificacion de Requerimientos

| Código | R00X  |
|----------|----------|
|Nombre  | Planillas|
|Objetivo  |Visualizar todas las planillas que están registradas en la base de datos|
| Descripción   | El administrador puede visualizar todas las planillas de los distintos periodos de trabajo  |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | -  |

| Código | R00X  |
|----------|----------|
|Nombre  | Empleados en una planilla|
|Objetivo  |Visualizar todos los empleados en una planilla en específica|
| Descripción   | El administrador puede visualizar todos los trabajadores en una planilla, además se brindan datos adicionales sobre la planilla |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | -  |

| Código | R00X  |
|----------|----------|
|Nombre  |Crear una planilla|
|Objetivo  |Generar una nueva planilla |
| Descripción   | Se creará una nueva planilla que servirá para realizar a los trabajadores, esta planilla está delimitada por algunos parametros como el periodo y la periodicidad, además se pueden visualizar los empleados que estarán incluidos en esta nueva planilla |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | -  |


| Código | R00X  |
|----------|----------|
|Nombre  | Planillas pagadas|
|Objetivo  |Visualizar las planillas que ya fueron pagadas |
| Descripción   | El administrador puede visualizar las planillas que ya fueron pagadas, visualizando otros datos como el monto resultante que se le pago a todos los trabajadores en esa planilla |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | -  |

| Código | R00X  |
|----------|----------|
|Nombre  | Boletas |
|Objetivo | Visualizar los pagos a empleados y detalles de boleta |
| Descripción   | El administrador puede visualizar los montos de pago a cada empleado por planilla, además puede visualizar cada una de las boletas generadas a partir de una planilla. Se muuestra tambien los detalles de cada boleta |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | -  |

| Código | R00X  |
|----------|----------|
|Nombre  | Generar pago |
|Objetivo | Generar el pago para trabajdores en planilla |
| Descripción   | El administrador puede generar las boletas de pago por una planilla, visualizando previamente algunas variables en pantalla |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | -  |


## Codificación de prototipos de interfaz

| Codigo Interfaz    |    I - 00X    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/planilla.png) |

| Codigo Interfaz    |    I - 00X    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/Detalleplanilla.png) |

| Codigo Interfaz    |    I - 00X    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/generar%20planilla.png) |

| Codigo Interfaz    |    I - 00X    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/visualizarcolaboradoresnuevaplanilla.png) |

| Codigo Interfaz    |    I - 00X    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/planillaspagadas.png) |

| Codigo Interfaz    |    I - 00X    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/detalleplanillaspagadas.png) |

| Codigo Interfaz    |    I - 00X    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/detalleboleta.png) |

| Codigo Interfaz    |    I - 00X    | 
|:-------------:|:---------------:|
| Imagen interfaz   | ![image](https://github.com/nnthony/bookish-doodle/blob/4e05c459ab523a14aa7aafdeb509a13028487e06/pnt/generar%20planilla.png) |



# Sentencias SQL por cada prototipo

# FUNCIONALIDAD PRIMARIA ELEGIDA (POR MODULO)
## MODULO : REGISTRO DE MOVIMIENTOS DE PLANILLA Y CONCEPTOS ASISTENCIA
