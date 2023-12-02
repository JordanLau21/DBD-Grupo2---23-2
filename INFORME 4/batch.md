```
SELECT e.id_empleado, e.nombre, co.fecha_inicio_laboral,co.fecha_termino_contrato, ca.nombre_cargo  
FROM contrato co, cargo ca, empleado e, Frecuencia_pago fp
WHERE co.fecha_inicio_laboral < current_date AND co.fecha_termino_contrato > current_date AND fp.frecuencia_pago= 'Mensual'
AND e.id_empleado =co.id_empleado AND co.id_frecuencia_pago = fp.id_frecuencia_pago AND co.id_cargo = ca.id_cargo ;
```
```
SELECT * FROM planilla;
insert into planilla values (nextval('planilla_id_planilla_seq'::regclass),'12ME12023',30,'2023-12-01','2023-12-31',NULL,NULL,'Mensual',current_date,current_time);
select * from movimiento_planilla;
```


```
CREATE OR REPLACE FUNCTION crear_boletas(id_planilla integer)
RETURNS VOID AS 
$$
DECLARE
    fila_contrato RECORD;
BEGIN
    FOR fila_contrato IN 
        SELECT e.id_empleado,co.id_contrato,e.nombre, co.fecha_inicio_laboral, co.fecha_termino_contrato, ca.nombre_cargo  
        FROM contrato co, cargo ca, empleado e, Frecuencia_pago fp
        WHERE co.fecha_inicio_laboral < current_date 
            AND co.fecha_termino_contrato > current_date 
            AND fp.frecuencia_pago= 'Mensual'
            AND e.id_empleado = co.id_empleado 
            AND co.id_frecuencia_pago = fp.id_frecuencia_pago 
            AND co.id_cargo = ca.id_cargo
    LOOP
        INSERT INTO Boleta (id_boleta, TotalDescuentos, TotalNeto, TotalIngresos, TotalAportes, id_contrato, id_planilla)
        VALUES (nextval('boleta_nuevo_id_seq1'::regclass),0, 0, 0, 0, fila_contrato.id_contrato, id_planilla);
        
    END LOOP;
	
END;
$$
LANGUAGE plpgsql;
```
select crear_boletas(34);
