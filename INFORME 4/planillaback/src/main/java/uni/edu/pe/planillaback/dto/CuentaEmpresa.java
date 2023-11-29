package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CuentaEmpresa {
    private int id_cuenta;
    private String usuario;
    private String contrasenia;
    private String rol;
    private int id_estado;
}
