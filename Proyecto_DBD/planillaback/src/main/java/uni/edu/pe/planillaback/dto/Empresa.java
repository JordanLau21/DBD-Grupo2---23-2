package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empresa {
    private int id_empresa;
    private String ruc;
    private String regimen;
    private String estado;
    private String razon_social;
    private String direccion;
    private String giro;
    private String ciudad;
    private String logo;
    private int id_cuenta;
}
