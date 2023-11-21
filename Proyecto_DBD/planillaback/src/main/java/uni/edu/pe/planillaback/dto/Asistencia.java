package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Asistencia {
    private int id_asistencia;
    private String fecha_inicio;
    private String fecha_final;
    private String comentario;
    private int valor;
    private int id_contrato;
    private int id_nomina;
}
