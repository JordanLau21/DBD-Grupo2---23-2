package uni.edu.pe.planillaback.service;

import uni.edu.pe.planillaback.dto.rest.RespuestaContratos;
import uni.edu.pe.planillaback.dto.rest.RespuestaMovimiento;

public interface MovimientosService {
    RespuestaMovimiento obtenerMovimientosContratoDes(int id_contrato);

    RespuestaMovimiento obtenerMovimientosContratoIng(int id_contrato);

    RespuestaContratos obtenerContratos(String fecha_inicio, String fecha_fin);
}
