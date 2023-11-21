package uni.edu.pe.planillaback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.planillaback.dao.PlanillaDao;
import uni.edu.pe.planillaback.dto.Empleado;

@Service
public class PlanillaServiceImplement implements  PlanillaService{
    @Autowired
    private PlanillaDao dao;

    @Override
    public Empleado registrarEmpleado(Empleado empleado) {
        return dao.registrarEmpleado(empleado);
    }
}
