package uni.edu.pe.planillaback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.planillaback.dao.PlanillaDao;
import uni.edu.pe.planillaback.dto.*;
import uni.edu.pe.planillaback.dto.rest.*;

import java.util.List;

@Service
public class PlanillaServiceImplement implements  PlanillaService{
    @Autowired
    private PlanillaDao dao;

    @Override
    public Empleado registrarEmpleado(Empleado empleado) {
        return dao.registrarEmpleado(empleado);
    }

    @Override
    public List<CuentaEmpresa> obtenerCuentasEmpresa() {
        return dao.obtenerCuentasEmpresa();
    }

    @Override
    public DetalleSolicitud obtenerDetalleSolicitud(SolicitudEmpresa solicitudEmpresa) {
        return dao.obtenerDetalleSolicitud(solicitudEmpresa);
    }

    @Override
    public RespuestaSolicitudesEmpleado obtenerSolicitudesEmpleado(Empleado empleado) {
        return dao.obtenerSolicitudesEmpleado(empleado);
    }

    @Override
    public Solicitud registrarSolicitud(Solicitud solicitud) {
        return dao.registrarSolicitud(solicitud);
    }

    @Override
    public RespuestaContratos obtenerContratos(String fecha_inicio, String fecha_fin) {
        return dao.obtenerContratos(fecha_inicio,fecha_fin);
    }


    @Override
    public List<EmpleadoValuado> obtenerEmpleadosDesvinculados(int id_empresa) {
        return dao.obtenerEmpleadosDesvinculados(id_empresa);
    }
    @Override
    public List<EmpleadoValuado> obtenerEmpleadosVigentes(int id_empresa) {
        return dao.obtenerEmpleadosVigentes(id_empresa);
    }

    @Override
    public List<SolicitudEmpresa> obtenerSolicitudesEmpresa() {
        return dao.obtenerSolicitudesEmpresa();
    }


}
