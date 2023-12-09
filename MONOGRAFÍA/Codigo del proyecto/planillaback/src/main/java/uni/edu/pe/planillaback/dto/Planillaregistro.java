package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Planillaregistro {
    private String periodo;
    private String periodicidad;
    private String fecha_inicio;
    private String fecha_fin;
}
