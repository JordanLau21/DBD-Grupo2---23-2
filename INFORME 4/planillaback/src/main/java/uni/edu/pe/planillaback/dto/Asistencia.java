package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Asistencia {
    private int id_asistencia;
    private Date fecha_inicio;
    private Date fecha_final;
    private String comentario;
    private int valor;
    private int id_contrato;
    private int id_nomina;

}
