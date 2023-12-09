package uni.edu.pe.planillaback.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.planillaback.dao.LogeoDao;
import uni.edu.pe.planillaback.dto.CuentaEmpresa;
import uni.edu.pe.planillaback.service.LogeoService;

import java.util.List;

@Service
public class LogeoServiceImplement implements LogeoService {
    @Autowired
    private LogeoDao dao;
    @Override
    public List<CuentaEmpresa> obtenerCuentasEmpresa() {
        return dao.obtenerCuentasEmpresa();
    }

    @Override
    public List<CuentaEmpresa> obtenerCuentasEmpleado() {
        return dao.obtenerCuentasEmpleado();
    }
}
