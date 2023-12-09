package uni.edu.pe.planillaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.planillaback.dto.Empleado;
import uni.edu.pe.planillaback.dto.Planillaregistro;
import uni.edu.pe.planillaback.dto.rest.RespuestaBoletasPago;
import uni.edu.pe.planillaback.dto.rest.RespuestaColaboradores;
import uni.edu.pe.planillaback.dto.rest.RespuestaPlanillas;
import uni.edu.pe.planillaback.service.BoletasService;
import uni.edu.pe.planillaback.service.EmpleadosService;

@RestController
@CrossOrigin(origins = {"*"})
public class BoletasController {
    @Autowired
    private BoletasService service;

    @RequestMapping(
            value = "/obtenerPlanillas",
            method = RequestMethod.POST
    )
    public @ResponseBody RespuestaPlanillas obtenerPlanillas(@RequestBody int id_empresa){
        return service.obtenerPlanillas(id_empresa);
    }

    @RequestMapping(
            value = "/obtenerBoletasPago",
            method = RequestMethod.POST
    )
    public @ResponseBody RespuestaBoletasPago obtenerBoletasPago(@RequestBody int  id_planilla){
        return service.obtenerBoletasPago(id_planilla);
    }

    @RequestMapping(
            value = "/obtenerColaboradores",
            method = RequestMethod.POST
    )
    public @ResponseBody RespuestaColaboradores obtenerColaboradores(@RequestBody int  id_planilla){
        return service.obtenerColaboradores(id_planilla);
    }

    @RequestMapping(
            value = "/registrarPlanilla",
            method = RequestMethod.POST
    )
    public @ResponseBody Planillaregistro registrarPlanilla(@RequestBody Planillaregistro  planilla){
        return service.registrarPlanilla(planilla);
    }

    @RequestMapping(
            value = "/obtenerdatosBoleta",
            method = RequestMethod.POST
    )
    public @ResponseBody RespuestaColaboradores obtenerdatosBoleta(@RequestBody int  id_planilla){
        return service.obtenerdatosBoleta(id_planilla);
    }



}
