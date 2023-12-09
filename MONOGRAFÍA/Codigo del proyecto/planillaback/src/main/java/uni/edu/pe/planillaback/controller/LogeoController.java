package uni.edu.pe.planillaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.planillaback.dto.rest.RespuestaCuentasEmpresa;
import uni.edu.pe.planillaback.service.LogeoService;

@RestController
@CrossOrigin(origins = {"*"})
public class LogeoController {

    @Autowired
    private LogeoService service;

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

    @RequestMapping(
            value = "/obtenerCuentasEmpleado",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody RespuestaCuentasEmpresa obtenerCuentasEmpleado(){
        RespuestaCuentasEmpresa rpta = new RespuestaCuentasEmpresa();
        rpta.setCuentas(service.obtenerCuentasEmpleado());
        return rpta;
    }


}
