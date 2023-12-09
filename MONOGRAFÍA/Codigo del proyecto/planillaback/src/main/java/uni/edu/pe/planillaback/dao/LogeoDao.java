package uni.edu.pe.planillaback.dao;


import uni.edu.pe.planillaback.dto.CuentaEmpresa;

import java.util.List;

public interface LogeoDao {
    List<CuentaEmpresa> obtenerCuentasEmpresa();

    List<CuentaEmpresa> obtenerCuentasEmpleado();
}
