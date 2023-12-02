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


### POSTMAN


# PROXIMOS PASOS
