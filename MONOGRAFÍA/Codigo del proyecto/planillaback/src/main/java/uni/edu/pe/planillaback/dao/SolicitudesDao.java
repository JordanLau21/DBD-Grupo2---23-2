package uni.edu.pe.planillaback.dao;

import org.springframework.stereotype.Repository;
import uni.edu.pe.planillaback.dto.Solicitud;
import uni.edu.pe.planillaback.dto.SolicitudEmpresa;
import uni.edu.pe.planillaback.dto.rest.DetalleSolicitud;
import uni.edu.pe.planillaback.dto.rest.RespuestaSolicitudesEmpleado;

import java.util.List;

@Repository
public interface SolicitudesDao {
    List<SolicitudEmpresa> obtenerSolicitudesEmpresa(int id_empresa);

    DetalleSolicitud obtenerDetalleSolicitud(int id_solicitud);

    RespuestaSolicitudesEmpleado obtenerSolicitudesEmpleado(int id_empleado);

    Solicitud registrarSolicitud(Solicitud solicitud);
}
