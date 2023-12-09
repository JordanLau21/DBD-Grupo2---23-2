package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Colaborador {
    private int id_empleado;
    private String nombres;
    private String apellidos;
    private String fecha;
    private String cargo;
}
