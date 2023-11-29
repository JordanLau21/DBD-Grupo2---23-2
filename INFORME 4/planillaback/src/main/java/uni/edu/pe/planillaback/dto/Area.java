package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Area {
    private int id_area;
    private String descripcion_area;
    private String estado;
    private String nombre_area;
    private int id_empresa;
}
