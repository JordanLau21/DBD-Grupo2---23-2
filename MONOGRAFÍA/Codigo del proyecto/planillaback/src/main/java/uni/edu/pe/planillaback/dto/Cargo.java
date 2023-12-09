package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cargo {
    private int id_cargo;
    private String nombre;
    private String descripcion;
    private String requerimientos;
    private String estado;
    private int id_empresa;
}
