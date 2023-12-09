package uni.edu.pe.planillaback.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.planillaback.dao.EmpleadosDao;
import uni.edu.pe.planillaback.dao.LogeoDao;
import uni.edu.pe.planillaback.dto.Contratoregistrado;
import uni.edu.pe.planillaback.dto.Empleado;
import uni.edu.pe.planillaback.dto.EmpleadoValuado;
import uni.edu.pe.planillaback.service.EmpleadosService;

import java.util.List;

@Service
public class EmpleadosServiceImplement implements EmpleadosService {
    @Autowired
    private EmpleadosDao dao;
    @Override
    public Empleado registrarEmpleado(Empleado empleado) {

        return dao.registrarEmpleado(empleado);
    }

    @Override
    public Contratoregistrado registrarContrato(Contratoregistrado contrato) {
        return dao.registrarContrato(contrato);
    }

    @Override
    public List<EmpleadoValuado> obtenerEmpleadosVigentes(int id_empresa) {
        return dao.obtenerEmpleadosVigentes(id_empresa);
    }

    @Override
    public List<EmpleadoValuado> obtenerEmpleadosDesvinculados(int id_empresa) {
        return dao.obtenerEmpleadosDesvinculados(id_empresa);
    }
}
