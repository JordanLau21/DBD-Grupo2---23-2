package uni.edu.pe.planillaback.dto.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uni.edu.pe.planillaback.dto.SolicitudEmpresa;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaSolicitudesEmpresa {
    private List<SolicitudEmpresa> solicitudes;
}
