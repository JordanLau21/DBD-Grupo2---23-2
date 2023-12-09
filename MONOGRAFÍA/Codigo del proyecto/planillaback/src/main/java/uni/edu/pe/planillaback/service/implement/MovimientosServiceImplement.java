package uni.edu.pe.planillaback.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.planillaback.dao.LogeoDao;
import uni.edu.pe.planillaback.dao.MovimientosDao;
import uni.edu.pe.planillaback.dto.rest.RespuestaContratos;
import uni.edu.pe.planillaback.dto.rest.RespuestaMovimiento;
import uni.edu.pe.planillaback.service.MovimientosService;
@Service
public class MovimientosServiceImplement implements MovimientosService {
    @Autowired
    private MovimientosDao dao;
    @Override
    public RespuestaMovimiento obtenerMovimientosContratoDes(int id_contrato) {
        return dao.obtenerMovimientosContratoDes(id_contrato);
    }

    @Override
    public RespuestaMovimiento obtenerMovimientosContratoIng(int id_contrato) {
        return dao.obtenerMovimientosContratoIng(id_contrato);
    }

    @Override
    public RespuestaContratos obtenerContratos(String fecha_inicio, String fecha_fin) {
        return dao.obtenerContratos(fecha_inicio);
    }
}
