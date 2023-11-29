package uni.edu.pe.planillaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.planillaback.dto.*;
import uni.edu.pe.planillaback.dto.rest.*;
import uni.edu.pe.planillaback.service.PlanillaService;

@RestController
@CrossOrigin(origins = {"*"})
public class PlanillaController {
    @Autowired
    private PlanillaService service;

    @RequestMapping(
            value = "/registrarEmpleado",
            method = RequestMethod.POST
    )
    public @ResponseBody Empleado registrarEmpleado(@RequestBody Empleado empleado){
        return service.registrarEmpleado(empleado);
    }
    // 1

    @RequestMapping(
            value = "/obtenerCuentasEmpresa",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody RespuestaCuentasEmpresa obtenerCuentasEmpresa(){
        RespuestaCuentasEmpresa rpta = new RespuestaCuentasEmpresa();
        rpta.setCuentas(service.obtenerCuentasEmpresa());
        return rpta;
    }

    // 2

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
    // SOLICITUD
    // Ver solicitudes


    //Ver detalle de solicitud de empleado
    @RequestMapping(
            value = "/obtenerDetalleSolicitud",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8",
            consumes = "application/json;charset=utf-8"
    )
    public @ResponseBody DetalleSolicitud obtenerDetalleSolicitud(@RequestBody SolicitudEmpresa solicitudEmpresa){
        return service.obtenerDetalleSolicitud(solicitudEmpresa);
    }
    // Ver solicitudes del empleado
    @RequestMapping(
            value = "/obtenerSolicitudesEmpleado",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8",
            consumes = "application/json;charset=utf-8"
    )
    public @ResponseBody RespuestaSolicitudesEmpleado obtenerSolicitudesEmpleado(@RequestBody Empleado empleado){
        return service.obtenerSolicitudesEmpleado(empleado);
    }
    //Registrar una nueva solicitud
    @RequestMapping(
            value = "/registrarSolicitud",
            method = RequestMethod.POST
    )
    public @ResponseBody Solicitud registrarSolicitud(@RequestBody Solicitud solicitud){
        return service.registrarSolicitud(solicitud);
    }
    //Mostrar los contratos de una empresa
    @RequestMapping(
            value = "/obtenerContratos",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8",
            consumes = "application/json;charset=utf-8"
    )
    public @ResponseBody RespuestaContratos obtenerContratos(@RequestBody String fecha_inicio,@RequestBody String fecha_fin){
        return service.obtenerContratos(fecha_inicio, fecha_fin);
    }

    //Ver detalle de solicitud de empleado
    @RequestMapping(
            value = "/obtenerEmpleadosVigentes",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8",
            consumes = "application/json;charset=utf-8"
    )
    public @ResponseBody RespuestaEmpleadoValuado obtenerEmpleadosVigentes(@RequestBody int id_empresa){
        RespuestaEmpleadoValuado rpta = new RespuestaEmpleadoValuado();
        rpta.setEmpleados(service.obtenerEmpleadosVigentes(id_empresa));
        return rpta;
    }

    //Ver detalle de solicitud de empleado
    @RequestMapping(
            value = "/obtenerEmpleadosDesvinculados",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8",
            consumes = "application/json;charset=utf-8"
    )
    public @ResponseBody RespuestaEmpleadoValuado obtenerEmpleadosDesvinculados(@RequestBody int id_empresa){
        RespuestaEmpleadoValuado rpta = new RespuestaEmpleadoValuado();
        rpta.setEmpleados(service.obtenerEmpleadosDesvinculados(id_empresa));
        return rpta;
    }



}
