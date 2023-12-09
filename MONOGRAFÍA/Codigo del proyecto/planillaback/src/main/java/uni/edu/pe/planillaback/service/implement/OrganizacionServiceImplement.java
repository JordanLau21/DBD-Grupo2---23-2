package uni.edu.pe.planillaback.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.planillaback.dao.MovimientosDao;
import uni.edu.pe.planillaback.dao.OrganizacionDao;
import uni.edu.pe.planillaback.dto.Area;
import uni.edu.pe.planillaback.dto.Cargo;
import uni.edu.pe.planillaback.dto.rest.RespuestaAreas;
import uni.edu.pe.planillaback.dto.rest.RespuestaCargos;
import uni.edu.pe.planillaback.service.OrganizacionService;
@Service
public class OrganizacionServiceImplement implements OrganizacionService {
    @Autowired
    private OrganizacionDao dao;

    @Override
    public RespuestaAreas obtenerAreasEmpresa(int id_empresa) {
        return dao.obtenerAreasEmpresa(id_empresa);
    }

    @Override
    public RespuestaCargos obtenerCargosEmpresa(int id_empresa) {
        return dao.obtenerCargosEmpresa(id_empresa);
    }

    @Override
    public Area registrarArea(Area area) {
        return dao.registrarArea(area);
    }

    @Override
    public Cargo registrarCargo(Cargo cargo) {
        return dao.registrarCargo(cargo);
    }
}
