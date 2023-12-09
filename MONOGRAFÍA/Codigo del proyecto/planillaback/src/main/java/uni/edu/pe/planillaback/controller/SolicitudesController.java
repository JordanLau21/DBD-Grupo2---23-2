package uni.edu.pe.planillaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.planillaback.dto.Empleado;
import uni.edu.pe.planillaback.dto.Solicitud;
import uni.edu.pe.planillaback.dto.SolicitudEmpleado;
import uni.edu.pe.planillaback.dto.SolicitudEmpresa;
import uni.edu.pe.planillaback.dto.rest.DetalleSolicitud;
import uni.edu.pe.planillaback.dto.rest.RespuestaSolicitudesEmpleado;
import uni.edu.pe.planillaback.dto.rest.RespuestaSolicitudesEmpresa;
import uni.edu.pe.planillaback.service.LogeoService;
import uni.edu.pe.planillaback.service.SolicitudesService;

@RestController
@CrossOrigin(origins = {"*"})
public class SolicitudesController {
    @Autowired
    private SolicitudesService service;


    @RequestMapping(
            value = "/obtenerSolicitudesEmpresa",
            method = RequestMethod.POST,
            consumes = "application/json;charset=utf-8"
    )
    public @ResponseBody RespuestaSolicitudesEmpresa obtenerSolicitudesEmpresa(@RequestBody int id_empresa){
        RespuestaSolicitudesEmpresa rpta = new RespuestaSolicitudesEmpresa();
        rpta.setSolicitudes(service.obtenerSolicitudesEmpresa(id_empresa));
        return rpta;
    }


    @RequestMapping(
            value = "/obtenerDetalleSolicitud",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8",
            consumes = "application/json;charset=utf-8"
    )
    public @ResponseBody DetalleSolicitud obtenerDetalleSolicitud(@RequestBody int id_solicitud ){
        return service.obtenerDetalleSolicitud(id_solicitud);
    }


    @RequestMapping(
            value = "/obtenerSolicitudesEmpleado",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8",
            consumes = "application/json;charset=utf-8"
    )
    public @ResponseBody RespuestaSolicitudesEmpleado obtenerSolicitudesEmpleado(@RequestBody int id_empleado ){
        return service.obtenerSolicitudesEmpleado(id_empleado);
    }

    @RequestMapping(
            value = "/registrarSolicitud",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8",
            consumes = "application/json;charset=utf-8"
    )
    public @ResponseBody Solicitud registrarSolicitud(@RequestBody Solicitud solicitud ){
        return service.registrarSolicitud(solicitud);
    }



}
