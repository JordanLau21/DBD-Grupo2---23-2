package uni.edu.pe.planillaback.dao;

import uni.edu.pe.planillaback.dto.Planillaregistro;
import uni.edu.pe.planillaback.dto.rest.RespuestaBoletasPago;
import uni.edu.pe.planillaback.dto.rest.RespuestaColaboradores;
import uni.edu.pe.planillaback.dto.rest.RespuestaPlanillas;

public interface BoletasDao {
    RespuestaColaboradores obtenerColaboradores(int id_planilla);

    RespuestaPlanillas obtenerPlanillas(int id_empresa);

    RespuestaBoletasPago obtenerBoletasPago(int id_planilla);

    Planillaregistro registrarPlanilla(Planillaregistro planilla);
}
