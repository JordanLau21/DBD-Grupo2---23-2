package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Representante_Legal {
    private int id_representante;
    private String nombres;
    private String apellido_paterno;
    private String apellido_materno;
    private long dni;
    private int id_empresa;
}
