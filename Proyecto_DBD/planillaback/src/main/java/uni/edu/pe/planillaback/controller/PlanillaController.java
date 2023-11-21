package uni.edu.pe.planillaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.planillaback.dto.Empleado;
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

}
