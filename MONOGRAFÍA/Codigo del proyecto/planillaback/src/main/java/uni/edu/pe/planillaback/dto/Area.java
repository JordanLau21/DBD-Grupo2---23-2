package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Area {
    private int id_area;
    private String nombre;
    private String descripcion;
    private String estado;
    private int id_empresa;
}
