package uni.edu.pe.planillaback.dao;

import uni.edu.pe.planillaback.dto.rest.RespuestaContratos;
import uni.edu.pe.planillaback.dto.rest.RespuestaMovimiento;

public interface MovimientosDao {
    RespuestaMovimiento obtenerMovimientosContratoDes(int id_contrato);

    RespuestaMovimiento obtenerMovimientosContratoIng(int id_contrato);

    RespuestaContratos obtenerContratos(String fecha_inicio);
}
