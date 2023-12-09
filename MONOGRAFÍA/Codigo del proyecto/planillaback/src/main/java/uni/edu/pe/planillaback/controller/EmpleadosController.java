package uni.edu.pe.planillaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.planillaback.dto.Contrato;
import uni.edu.pe.planillaback.dto.Contratoregistrado;
import uni.edu.pe.planillaback.dto.Empleado;
import uni.edu.pe.planillaback.dto.rest.RespuestaEmpleadoValuado;
import uni.edu.pe.planillaback.service.EmpleadosService;
import uni.edu.pe.planillaback.service.LogeoService;

@RestController
@CrossOrigin(origins = {"*"})
public class EmpleadosController {
    @Autowired
    private EmpleadosService service;

    @RequestMapping(
            value = "/registrarEmpleado",
            method = RequestMethod.POST
    )
    public @ResponseBody Empleado registrarEmpleado(@RequestBody Empleado empleado){
        return service.registrarEmpleado(empleado);
    }

    @RequestMapping(
            value = "/registrarContrato",
            method = RequestMethod.POST
    )
    public @ResponseBody Contratoregistrado registrarContrato(@RequestBody Contratoregistrado contrato){
        return service.registrarContrato(contrato);
    }

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


    @RequestMapping(
            value = "/obtenerEmpleadosDesvinculados",
            method = RequestMethod.POST
    )
    public @ResponseBody RespuestaEmpleadoValuado obtenerEmpleadosDesvinculados(@RequestBody int id_empresa){
        RespuestaEmpleadoValuado rpta = new RespuestaEmpleadoValuado();
        rpta.setEmpleados(service.obtenerEmpleadosDesvinculados(id_empresa));
        return rpta;
    }


}
