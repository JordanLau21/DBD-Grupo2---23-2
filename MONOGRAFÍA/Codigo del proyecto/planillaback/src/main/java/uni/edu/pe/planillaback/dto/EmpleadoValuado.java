package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoValuado {
    private int id_empleado;
    private long dni;
    private String nombres;
    private String apellidos;
    private long telefono;
    private String email;
}
