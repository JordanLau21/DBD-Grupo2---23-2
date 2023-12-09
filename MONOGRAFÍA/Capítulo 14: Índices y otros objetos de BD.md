## 14.1 ÍNDICES
Consultas Principales:
#### 14.1.1 Identificar Planillas Calculadas
Esta consulta identifica las planillas que ya han sido calculadas y para las cuales se han generado pagos. No parece tener un gran impacto en el cálculo de costos antes y después de la creación de un índice.
#### 14.1.2 Identificar Empleados para Pagar
Esta consulta parece crucial, ya que identifica a los empleados a los que se les pagará en una determinada planilla. Aquí, un índice en las columnas utilizadas en las condiciones de filtro podría mejorar el rendimiento.
#### 14.1.3 Generación de Boletas
Esta es una función PL/pgSQL que crea boletas para los empleados que serán pagados en una planilla específica. Aquí, la creación de un índice en las columnas involucradas en la filtración de contratos podría tener un impacto significativo en el rendimiento.


## 14.2 SECUENCIAS
Text

## 14.3 VIEW
Text
