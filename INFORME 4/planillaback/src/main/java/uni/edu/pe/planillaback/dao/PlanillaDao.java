package uni.edu.pe.planillaback.dao;

import uni.edu.pe.planillaback.dto.*;
import uni.edu.pe.planillaback.dto.rest.*;

import java.util.List;

public interface PlanillaDao {


    Empleado registrarEmpleado(Empleado empleado);

    List<CuentaEmpresa> obtenerCuentasEmpresa();
    
    DetalleSolicitud obtenerDetalleSolicitud(SolicitudEmpresa solicitudEmpresa);

    RespuestaSolicitudesEmpleado obtenerSolicitudesEmpleado(Empleado empleado);

    Solicitud registrarSolicitud(Solicitud solicitud);

    RespuestaContratos obtenerContratos(String fecha_inicio, String fecha_fin);
    
    List<EmpleadoValuado> obtenerEmpleadosDesvinculados(int id_empresa);

    List<EmpleadoValuado> obtenerEmpleadosVigentes(int id_empresa);

    List<SolicitudEmpresa> obtenerSolicitudesEmpresa(int id_empresa);
}
