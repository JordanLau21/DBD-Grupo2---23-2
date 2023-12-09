package uni.edu.pe.planillaback.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.planillaback.dao.BoletasDao;
import uni.edu.pe.planillaback.dao.EmpleadosDao;
import uni.edu.pe.planillaback.dto.Planillaregistro;
import uni.edu.pe.planillaback.dto.rest.RespuestaBoletasPago;
import uni.edu.pe.planillaback.dto.rest.RespuestaColaboradores;
import uni.edu.pe.planillaback.dto.rest.RespuestaPlanillas;
import uni.edu.pe.planillaback.service.BoletasService;
@Service
public class BoletasServiceImplement implements BoletasService {
    @Autowired
    private BoletasDao dao;
    @Override
    public RespuestaPlanillas obtenerPlanillas(int id_empresa) {
        return dao.obtenerPlanillas(id_empresa);
    }

    @Override
    public RespuestaBoletasPago obtenerBoletasPago(int id_planilla) {
        return dao.obtenerBoletasPago(id_planilla);
    }

    @Override
    public RespuestaColaboradores obtenerColaboradores(int id_planilla) {
        return dao.obtenerColaboradores(id_planilla);
    }

    @Override
    public Planillaregistro registrarPlanilla(Planillaregistro planilla) {

        return dao.registrarPlanilla(planilla);
    }



}
