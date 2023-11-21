package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Concepto_nomina {
    private int id_nomina;
    private String nombre_nomina;
    private float valor_nomina;
    private int id_tipo_nomina;
    private int id_estado;

}
