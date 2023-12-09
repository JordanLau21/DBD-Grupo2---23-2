package uni.edu.pe.planillaback.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.planillaback.dao.SolicitudesDao;
import uni.edu.pe.planillaback.dto.Solicitud;
import uni.edu.pe.planillaback.dto.SolicitudEmpresa;
import uni.edu.pe.planillaback.dto.rest.DetalleSolicitud;
import uni.edu.pe.planillaback.dto.rest.RespuestaSolicitudesEmpleado;
import uni.edu.pe.planillaback.service.SolicitudesService;

import java.util.List;
@Service
public class SolicitudesServiceImplement implements SolicitudesService {
    @Autowired
    private SolicitudesDao dao;
    @Override
    public List<SolicitudEmpresa> obtenerSolicitudesEmpresa(int id_empresa) {
        return dao.obtenerSolicitudesEmpresa(id_empresa);
    }

    @Override
    public DetalleSolicitud obtenerDetalleSolicitud(int id_solicitud) {
        return dao.obtenerDetalleSolicitud(id_solicitud);
    }

    @Override
    public RespuestaSolicitudesEmpleado obtenerSolicitudesEmpleado(int id_empleado) {
        return dao.obtenerSolicitudesEmpleado(id_empleado);
    }

    @Override
    public Solicitud registrarSolicitud(Solicitud solicitud) {
        return dao.registrarSolicitud(solicitud);
    }


}
