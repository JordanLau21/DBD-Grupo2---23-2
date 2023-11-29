package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Solicitud {
    private int id_solicitud;
    private String detalles ;
    private Date fec_solicitud ;
    private Time hora_solicitud ;
    private float monto ;
    private int id_estado_solicitud ;
    private int id_tipo_solicitud ;
    private int id_empleado ;
    private int id_empresa;
}
