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
```
select crear_boletas(34);
```

```
CREATE OR REPLACE FUNCTION modificar_boletas_consecutivas() RETURNS VOID AS $$
DECLARE
    id_inicio INT := 1853;
    id_fin INT := 1877;
    curr_id INT;
BEGIN
    FOR curr_id IN id_inicio..id_fin LOOP
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
END;
$$ LANGUAGE PLPGSQL;
```
```
select modificar_boletas_consecutivas();
```
