package uni.edu.pe.planillaback.dto.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetalleSolicitud {
    private int id_solicitud;
    private String nombres;
    private String apellidos;
    private long dni;
    private Date fec_solicitud;
    private Time hora_solicitud;
    private String descripcion;
    private String tipo_solicitud;
    private String detalles;

}
