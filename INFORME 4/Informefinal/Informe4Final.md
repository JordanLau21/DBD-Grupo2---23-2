# ALUMNOS PARTICIPANTES
- Flores Velarde, Roberto Carlos
- Huamán Silva, Luis Fernando
- Mamani Olgado, Alex Wilson
- Calderon Perez, Anthony Alexis
- Laureano Hidalgo, Jordan Cesar
- Yucra Serpa, Jean Herberth

# ÍNDICES Y OTROS OBJETOS DE BD
# PL/pgSQL - PROCESO BATCH
### Proceso: Calculo de planilla

1. Se realizará el calculo de una planilla que aun no haya generado sus pagos, el sistema puede identificar cuales son con este query:
```
SELECT id_planilla, fecha_calculo, periodo, monto_emitido FROM planilla
WHERE fecha_calculo IS NOT NULL AND monto_emitido IS NOT NULL;
```
2. Los empleados a los que se le pagará se pueden identificar con este query:
```
SELECT e.id_empleado,co.id_contrato,e.nombre, co.fecha_inicio_laboral, co.fecha_termino_contrato, ca.nombre_cargo  
FROM contrato co, cargo ca, empleado e, Frecuencia_pago fp
WHERE co.fecha_inicio_laboral <= (SELECT fecha_inicio FROM planilla WHERE id_planilla=<1>) 
  AND co.fecha_termino_contrato+30 >= (SELECT fecha_fin FROM planilla WHERE id_planilla=<1>) 
  AND fp.frecuencia_pago= (SELECT periodicidad FROM planilla WHERE id_planilla=<1>)
  AND e.id_empleado = co.id_empleado 
  AND co.id_frecuencia_pago = fp.id_frecuencia_pago 
  AND co.id_cargo = ca.id_cargo
-- 1: id de planilla
```
3. Para empezar con el cálculo de planilla, el sistema generará boletas con valores en blanco, es decir, los valores en total neto, total ingresos, etc, serán en 0. En esencia, se necesita realizar *inserts* en la tabla boleta considerando algunos parametros, esto se llevará a cabo con el siguiente código en lenguaje plpsql:
```
CREATE OR REPLACE FUNCTION crear_boletas(planilla_id integer)
RETURNS VOID AS 
$$
DECLARE
    fila_contrato RECORD;
    primer_id_boleta INT;
    ultimo_id_boleta INT;
BEGIN
    FOR fila_contrato IN 
        SELECT e.id_empleado,co.id_contrato,e.nombre  
        FROM contrato co, empleado e, Frecuencia_pago fp
        WHERE co.fecha_inicio_laboral < (SELECT fecha_inicio FROM planilla WHERE id_planilla=planilla_id) 
            AND co.fecha_termino_contrato+30 >= (SELECT fecha_fin FROM planilla WHERE id_planilla=planilla_id) 
            AND fp.frecuencia_pago= (SELECT periodicidad FROM planilla WHERE id_planilla=planilla_id)
            AND e.id_empleado = co.id_empleado 
            AND co.id_frecuencia_pago = fp.id_frecuencia_pago
    LOOP
        INSERT INTO Boleta (id_boleta, TotalDescuentos, TotalNeto, TotalIngresos, TotalAportes, id_contrato, id_planilla)
        VALUES (nextval('boleta_nuevo_id_seq1'::regclass),0, 0, 0, 0, fila_contrato.id_contrato, planilla_id)
        RETURNING id_boleta INTO ultimo_id_boleta;
        IF NOT FOUND THEN
            CONTINUE;
        END IF;

        IF primer_id_boleta IS NULL THEN
            primer_id_boleta := ultimo_id_boleta;
        END IF;
        
    END LOOP;

    IF primer_id_boleta IS NOT NULL AND ultimo_id_boleta IS NOT NULL THEN
        PERFORM modificar_boletas_consecutivas(primer_id_boleta, ultimo_id_boleta);
    END IF;
END;
$$
LANGUAGE plpgsql;
```
&nbsp; &nbsp; &nbsp; &nbsp; Este código crea una función que tiene como variable de entrada el *id_planilla* de la planilla que se quiere pagar. Con esta función se crea las boletas, en base a la *frecuencia_pago*, *fecha_inicio_laboral* y *fecha_termino_contrato* del contrato y la *periodicidad*, *fecha_inicio* y *fecha_fin* de la planilla. Se crea una fila a partir de un query, en esta fila se obtiene todos los contratos de los empleados a los que se les debe pagar por esta planilla, por eso este query es similar al anterior. Una vez ejecutada esta función se tendran todas las nuevas boletas.

&nbsp; &nbsp; &nbsp; &nbsp; **IMPORTANTE**: Se debe verificar cual es el nombre de la secuencia que está usando el *id_boleta*.

&nbsp; &nbsp; &nbsp; &nbsp; El código tambien almacena el primer y último *id_boleta* que se insertó, los guarda en *primer_id_boleta* y *ultimo_id_boleta* respectivamente. Lo que hace es que en cada iteración el valor *ultimo_id_boleta* se actualiza al valor del *id_boleta* de la iteración actual y *primer_id_boleta* se actualiza solo en la primera iteración, ya que tiene un condicional que verifica si es no nulo. Despues se invoca a la siguiente funcion que permitirá actualizar los valores de la boletas. Esta invocación 
con *PERFOMR* tiene un condicional que verifica si los valores de entrada son no nulos.

4. Ahora se comenzará con los calculos en sí, se usará el siguiente código en lenguaje plpgsql para sumar todos los movimientos de planilla y trasladarlos a los atributos de la fila boleta correspondiente:
```
CREATE OR REPLACE FUNCTION modificar_boletas_consecutivas(primer_id_boleta integer, ultimo_id_boleta integer) RETURNS VOID AS $$
DECLARE
    curr_id INT;
BEGIN
    FOR curr_id IN primer_id_boleta..ultimo_id_boleta LOOP
        UPDATE Boleta
        SET TotalDescuentos = (SELECT COALESCE(SUM(mp.monto), 0)
                               FROM Movimiento_planilla mp
                               INNER JOIN Concepto_nomina cn ON mp.id_nomina = cn.id_nomina
                               WHERE mp.id_contrato = Boleta.id_contrato
                                 AND cn.id_tipo_operacion = 2
                                 AND mp.fecha > (SELECT fecha_inicio FROM Planilla WHERE id_planilla = Boleta.id_planilla)
                                 AND mp.fecha < (SELECT fecha_fin FROM Planilla WHERE id_planilla = Boleta.id_planilla)),
            TotalIngresos = (SELECT COALESCE(SUM(mp.monto), 0)
                             FROM Movimiento_planilla mp
                             INNER JOIN Concepto_nomina cn ON mp.id_nomina = cn.id_nomina
                             WHERE mp.id_contrato = Boleta.id_contrato
                               AND cn.id_tipo_operacion = 1
                               AND mp.fecha > (SELECT fecha_inicio FROM Planilla WHERE id_planilla = Boleta.id_planilla)
                               AND mp.fecha < (SELECT fecha_fin FROM Planilla WHERE id_planilla = Boleta.id_planilla)),
            TotalAportes = (SELECT COALESCE(SUM(mp.monto), 0)
                            FROM Movimiento_planilla mp
                            INNER JOIN Concepto_nomina cn ON mp.id_nomina = cn.id_nomina
                            WHERE mp.id_contrato = Boleta.id_contrato
                              AND cn.id_tipo_operacion = 3
                              AND mp.fecha > (SELECT fecha_inicio FROM Planilla WHERE id_planilla = Boleta.id_planilla)
                              AND mp.fecha < (SELECT fecha_fin FROM Planilla WHERE id_planilla = Boleta.id_planilla)),
            TotalNeto = ((SELECT COALESCE(SUM(mp1.monto), 0)
                          FROM Movimiento_planilla mp1
                          INNER JOIN Concepto_nomina cn1 ON mp1.id_nomina = cn1.id_nomina
                          WHERE mp1.id_contrato = Boleta.id_contrato
                            AND cn1.id_tipo_operacion = 1
                            AND mp1.fecha > (SELECT fecha_inicio FROM Planilla WHERE id_planilla = Boleta.id_planilla)
                            AND mp1.fecha < (SELECT fecha_fin FROM Planilla WHERE id_planilla = Boleta.id_planilla)) -
                         (SELECT COALESCE(SUM(mp2.monto), 0)
                          FROM Movimiento_planilla mp2
                          INNER JOIN Concepto_nomina cn2 ON mp2.id_nomina = cn2.id_nomina
                          WHERE mp2.id_contrato = Boleta.id_contrato
                            AND cn2.id_tipo_operacion = 2
                            AND mp2.fecha > (SELECT fecha_inicio FROM Planilla WHERE id_planilla = Boleta.id_planilla)
                            AND mp2.fecha < (SELECT fecha_fin FROM Planilla WHERE id_planilla = Boleta.id_planilla)))
        WHERE id_boleta = curr_id;
    END LOOP;
	UPDATE planilla
	SET fecha_calculo=current_date, monto_emitido=(select sum(totalneto) from boleta where id_planilla=Boleta.id_planilla )
	where id_planilla=Boleta.id_planilla;
END;
$$ LANGUAGE PLPGSQL;
```
&nbsp; &nbsp; &nbsp; &nbsp; Este código crea una función que tiene como variables de entrada el primer y último *id_boleta* generado en el código anterior, y crea un for que va a recorrer todas esas boletas para hacerles un *UPDATE*. Este consisten en sumar todos los movimientos de planilla considerando su atributo *id_tipo_operacion*, dependiendo su valor se va a sumar en un total diferente, estos son:
- id_tipo_operacion = 1, se suma en *totalingresos*
- id_tipo_operacion = 2, se suma en *totaldescuentos*
- id_tipo_operacion = 3, se suma en *totalaportes*

&nbsp; &nbsp; &nbsp; &nbsp; Luego se resta *totalingresos* menos *totaldescuentos* y se almacena en *totalneto*

&nbsp; &nbsp; &nbsp; &nbsp; Finalmente fuera del bucle se actualiza los atributos *fecha_calculo* y *monto_emitido* de la planilla, *fecha_calculo* con un *current_date* y *monto_emitido* con un *SELECT SUM()* de los totales netos de las nuevas boletas de la planilla

# ACTUALIZACIONES A LA ARQUITECTURA DE LA APLICACIÓN
## ESTRUCTURA DE LA APLICACIÓN
La estructura de la aplicación se basa en el uso de una API REST (Application Programming Interface Representational State Transfer), la cual emplea el formato de intercambio de datos JSON (JavaScript Object Notation).
## TECNOLOGIA UTILIZADA

### HERRAMIENTAS
Para el desarrollo, se empleará IntelliJ IDEA como IDE principal debido a su versatilidad, compatibilidad con diversas tecnologías de desarrollo y su eficiencia en el desarrollo de software. 
Para probar la interacción con la API (Interfaz de Programación de Aplicaciones), se utilizará Postman, una herramienta de acceso libre y ampliamente reconocida en la comunidad de desarrollo por su facilidad de uso y eficacia.
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME%204/Im%C3%A1genes/1.jpg)
### BASES DE DATOS
Para la base de datos, implementaremos el sistema de gestión de base de datos relacional orientado a objetos PostgreSQL. Además, la herramienta que emplearemos para desarrollar y administrar la base de datos será PgAdmin 4, reconocida por su interfaz gráfica intuitiva y completa para la gestión efectiva de bases de datos PostgreSQL, además de ser la que estamos estudiando en nuestro curso de Diseño de Base de Datos.
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME%204/Im%C3%A1genes/2.jpg)
### SERVER
En la capa del Backend, se empleará el framework de aplicación Spring en conjunto con la API JDBC para establecer la conexión con la base de datos. Esta elección de Spring se debe a la capacidad para gestionar dependencias de manera eficiente a través de Spring Boot, especialmente en el desarrollo de aplicaciones Java con el patrón MVC utilizado en nuestro trabajo. Además, las anotaciones de Spring se complementarán con Lombok para configurar de manera precisa las clases y paquetes según la capa a la que pertenecen, además el uso de la API JDBC se focalizó en facilitar el uso de las funciones hechas en PostgreSQL en el desarrollo de la aplicación.
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME%204/Im%C3%A1genes/3.JPG)
### CLIENTE
En el Frontend, se utilizará el framework Angular de JavaScript, el cual ofrece un sólido manejo gracias a TypeScript, proporcionando tipado estático para una estructura más robusta, facilitando la implementación de paradigmas orientados a objetos y funcionales. Angular permite estructurar la página mediante componentes, directivas y pipes, ofreciendo componentes reutilizables y transformación de datos antes de su presentación. Además, facilita la gestión de rutas y control de acceso a estas, así como el uso del patrón de diseño de Inyección de Dependencias, especialmente útil en la implementación de servicios.
En cuanto a los estilos, se empleará el CSS Framework Tailwind, reconocido por no generar clases predefinidas en los elementos, a diferencia de otros frameworks, lo que ofrece mayor flexibilidad y control sobre los estilos. Tailwind es ideal para el desarrollo de proyectos ligeros al permitir una personalización detallada de los estilos y una optimización del tamaño de los archivos.
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME%204/Im%C3%A1genes/4.JPG)

# VERSIÓN FINAL DE LA APLICACIÓN
## VISTA 1
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/544012e2-8669-4a95-b491-dac39d533107)
### QUERY 1
```
SELECT usuario, contraseña from Cuenta
WHERE usuario = <1> AND contraseña = <2>
```
## VISTA 2
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/c68370f8-c355-4c7d-ade4-02fe23ce997b)
## VISTA 3
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/48b103b5-d539-4c82-8359-4d98225f4ff6)
### QUERY 3
```
SELECT so.id_solicitud, em.nombres, em.apellidos, so.fec_solicitud, ti.descripcion FROM Empleado em, Solicitud so, Tipo_solicitud ti, Estado_solicitud es
WHERE so.id_estado_solicitud = es.id_estado_solicitud AND em.id_empleado = so.id_empleado
AND ti.id_tipo_solicitud = so.id_tipo_solicitud
```
### QUERY 4
```
UPDATE Solicitud SET id_estado_solicitud = <1> WHERE id_estado_solicitud = 2 AND id_solicitud = <2>
```
## VISTA 4
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/8dc630f7-3a83-43ee-9490-489d656ce892)
### QUERY 5
```
SELECT so.id_solicitud, em.nombres, em.apellidos, em.dni, so.fec_solicitud, so.hora_solicitud, ti.descripcion, so.detalles, es.descripcion
FROM Empleado em, Solicitud so, Tipo_solicitud ti, Estado_solicitud es
WHERE so.id_estado_solicitud = es.id_estado_solicitud AND em.id_empleado = so.id_empleado
AND ti.id_tipo_solicitud = so.id_tipo_solicitud
```
## VISTA 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME3/imagenes/Frame%2047.png)
### QUERY 
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




## VISTA 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME3/imagenes/Frame%2048.png)
### QUERY
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
### QUERY
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
El resultado tras introducir y ejecutar el query es:
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



## VISTA 
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/02f1c160-8ed7-465a-970a-60190e6eed7c)
### QUERY
```
SELECT usuario, contraseña from Cuenta
WHERE usuario = <1> AND contraseña = <2>
```
## VISTA
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/beb0390a-f7a4-4dd5-9c31-32df2159ebc2)
### QUERY
```
SELECT so.id_solicitud, so.fec_solicitud, ti.descripcion, es.descripcion
FROM Solicitud so, Tipo_solicitud ti, Estado_solicitud es
WHERE ti.id_tipo_solicitud = so.id_tipo_solicitud AND es.id_estado_solicitud = so.id_estado_solicitud
AND id_empleado = <1>
```
## VISTA
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/a1ba1f00-531e-4563-810d-8a8475434548)
## VISTA
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/06f2968e-087a-4c25-9a86-aa7c5ba60510)
### QUERY
```
CREATE SEQUENCE id_solicitud START WITH 1
INSERT INTO Solicitud VALUES (NEXTVAL(id_solicitud),<3>, CURRENT_DATE , LOCALTIME , null , 2 , <2>, <7> ,<8>)
```
## VISTA
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/assets/144966702/a70e5292-9aa3-4901-9e20-10e7ef6ae906)

### QUERY
```
CREATE SEQUENCE id_solicitud START WITH 1
INSERT INTO Solicitud VALUES (NEXTVAL(id_solicitud),<3>, CURRENT_DATE, LOCALTIME , <6> , 2 , <1>, <7> ,<8>)
```


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



