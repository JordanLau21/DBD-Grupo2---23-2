package uni.edu.pe.planillaback.dao;

import uni.edu.pe.planillaback.dto.Contratoregistrado;
import uni.edu.pe.planillaback.dto.Empleado;
import uni.edu.pe.planillaback.dto.EmpleadoValuado;

import java.util.List;

public interface EmpleadosDao {
    Empleado registrarEmpleado(Empleado empleado);

    Contratoregistrado registrarContrato(Contratoregistrado contrato);

    List<EmpleadoValuado> obtenerEmpleadosVigentes(int id_empresa);

    List<EmpleadoValuado> obtenerEmpleadosDesvinculados(int id_empresa);
}
