package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SolicitudEmpleado {
    private int id_solicitud;
    private Date fec_solicitud;
    private String descripcion;
    private String estado;
}
