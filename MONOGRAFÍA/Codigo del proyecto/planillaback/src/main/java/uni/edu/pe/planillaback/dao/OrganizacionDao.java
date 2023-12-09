package uni.edu.pe.planillaback.dao;

import uni.edu.pe.planillaback.dto.Area;
import uni.edu.pe.planillaback.dto.Cargo;
import uni.edu.pe.planillaback.dto.rest.RespuestaAreas;
import uni.edu.pe.planillaback.dto.rest.RespuestaCargos;

public interface OrganizacionDao {
    RespuestaAreas obtenerAreasEmpresa(int id_empresa);

    RespuestaCargos obtenerCargosEmpresa(int id_empresa);

    Area registrarArea(Area area);

    Cargo registrarCargo(Cargo cargo);
}
