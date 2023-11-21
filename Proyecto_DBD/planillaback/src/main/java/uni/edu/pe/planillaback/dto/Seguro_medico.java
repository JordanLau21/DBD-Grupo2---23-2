package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seguro_medico {
    private int id_seguro_medico;
    private String tipo_seguro;
}
