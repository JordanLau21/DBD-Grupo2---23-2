package uni.edu.pe.planillaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.planillaback.dto.Area;
import uni.edu.pe.planillaback.dto.Cargo;
import uni.edu.pe.planillaback.dto.rest.RespuestaAreas;
import uni.edu.pe.planillaback.dto.rest.RespuestaCargos;
import uni.edu.pe.planillaback.service.OrganizacionService;

@RestController
@CrossOrigin(origins = {"*"})
public class OrganizacionController {
    @Autowired
    private OrganizacionService service;

    @RequestMapping(
            value = "/obtenerAreasEmpresa",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody RespuestaAreas obtenerAreasEmpresa(@RequestBody int id_empresa ){
        return service.obtenerAreasEmpresa(id_empresa);
    }

    @RequestMapping(
            value = "/obtenerCargosEmpresa",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody RespuestaCargos obtenerCargosEmpresa(@RequestBody int id_empresa ){
        return service.obtenerCargosEmpresa(id_empresa);
    }

    @RequestMapping(
            value = "/registrarArea",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody Area registrarArea(@RequestBody Area area ){
        return service.registrarArea(area);
    }

    @RequestMapping(
            value = "/registrarCargo",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody Cargo registrarCargo(@RequestBody Cargo cargo ){
        return service.registrarCargo(cargo);
    }


}
