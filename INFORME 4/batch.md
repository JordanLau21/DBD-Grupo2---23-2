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


```
CREATE OR REPLACE FUNCTION modificar_boletas_consecutivas() 
RETURNS VOID AS 
$$
DECLARE
    id_actual INTEGER := 1853; -- Primer ID de la secuencia
    id_final INTEGER := 1877; -- Último ID de la secuencia
    mov_descuentos NUMERIC(9,2);
    mov_ingresos NUMERIC(9,2);
    mov_aportes NUMERIC(9,2);
    mov_neto NUMERIC(9,2);
BEGIN
    WHILE id_actual <= id_final LOOP
        -- Obtener el id_planilla correspondiente a la boleta actual
        -- Suponiendo que id_planilla y id_contrato coinciden entre tablas Boleta y Planilla
        SELECT b.id_planilla INTO id_planilla_actual
        FROM Boleta b
        WHERE b.id_boleta = id_actual;
		
        SELECT SUM(mp.monto)
        INTO mov_descuentos
        FROM Movimiento_planilla mp
        WHERE mp.id_nomina = 2
        AND mp.id_contrato = id_planilla_actual -- Suponiendo que id_contrato es equivalente a id_planilla
        AND mp.fecha >= (SELECT fecha_inicio FROM Planilla WHERE id_planilla = id_planilla_actual)
        AND mp.fecha <= (SELECT fecha_fin FROM Planilla WHERE id_planilla = id_planilla_actual);

        SELECT SUM(mp.monto)
        INTO mov_ingresos
        FROM Movimiento_planilla mp
        WHERE mp.id_nomina = 1
        AND mp.id_contrato = id_planilla_actual
        AND mp.fecha >= (SELECT fecha_inicio FROM Planilla WHERE id_planilla = id_planilla_actual)
        AND mp.fecha <= (SELECT fecha_fin FROM Planilla WHERE id_planilla = id_planilla_actual);

        SELECT SUM(mp.monto)
        INTO mov_aportes
        FROM Movimiento_planilla mp
        WHERE mp.id_nomina = 3
        AND mp.id_contrato = id_planilla_actual
        AND mp.fecha >= (SELECT fecha_inicio FROM Planilla WHERE id_planilla = id_planilla_actual)
        AND mp.fecha <= (SELECT fecha_fin FROM Planilla WHERE id_planilla = id_planilla_actual);

        mov_neto := mov_ingresos - mov_descuentos;

        UPDATE Boleta
        SET TotalDescuentos = mov_descuentos,
            TotalNeto = mov_neto,
            TotalIngresos = mov_ingresos,
            TotalAportes = mov_aportes
        WHERE id_boleta = id_actual;

        id_actual := id_actual + 1;
    END LOOP;
END;
$$
LANGUAGE plpgsql;
```
