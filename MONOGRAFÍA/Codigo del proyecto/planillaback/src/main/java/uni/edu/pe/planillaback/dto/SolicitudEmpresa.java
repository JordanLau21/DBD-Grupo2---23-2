package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SolicitudEmpresa {
    private int id_solicitud;
    private String nombres;
    private String apellidos;
    private Date fec_solicitud;
    private String descripcion;

}
