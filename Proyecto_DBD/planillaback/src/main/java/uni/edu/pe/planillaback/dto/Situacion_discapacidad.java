package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Situacion_discapacidad {
    private int id_situacion_discapacidad;
    private String tipo_discapacidad;
}
