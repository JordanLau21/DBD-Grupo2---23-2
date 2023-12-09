package uni.edu.pe.planillaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.planillaback.dto.rest.RespuestaContratos;
import uni.edu.pe.planillaback.dto.rest.RespuestaMovimiento;
import uni.edu.pe.planillaback.service.LogeoService;
import uni.edu.pe.planillaback.service.MovimientosService;

@RestController
@CrossOrigin(origins = {"*"})
public class MovimientosController {

    @Autowired
    private MovimientosService service;

    @RequestMapping(
            value = "/obtenerContratos",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8",
            consumes = "application/json;charset=utf-8"
    )
    public @ResponseBody RespuestaContratos obtenerContratos(@RequestBody String fecha_inicio, @RequestBody String fecha_fin){
        return service.obtenerContratos(fecha_inicio, fecha_fin);
    }

    @RequestMapping(
            value = "/obtenerMovimientosContratoDes",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8",
            consumes = "application/json;charset=utf-8"
    )
    public @ResponseBody RespuestaMovimiento obtenerMovimientosContratoDes(@RequestBody int id_contrato){
        return service.obtenerMovimientosContratoDes(id_contrato);
    }

    @RequestMapping(
            value = "/obtenerMovimientosContratoIng",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8",
            consumes = "application/json;charset=utf-8"
    )
    public @ResponseBody RespuestaMovimiento obtenerMovimientosContratoIng(@RequestBody int id_contrato){
        return service.obtenerMovimientosContratoIng(id_contrato);
    }




}
