package uni.edu.pe.planillaback.service;

import uni.edu.pe.planillaback.dto.CuentaEmpresa;

import java.util.List;

public interface LogeoService {
    List<CuentaEmpresa> obtenerCuentasEmpresa();

    List<CuentaEmpresa> obtenerCuentasEmpleado();
}
