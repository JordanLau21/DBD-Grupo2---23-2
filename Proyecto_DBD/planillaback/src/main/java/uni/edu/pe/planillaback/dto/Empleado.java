package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {
    private int id_empleado;
    private String nombres;
    private String apellidos;
    private String fecha_nacimiento;
    private int edad;
    private long telefono;
    private String email;
    private String direccion;
    private long dni;
    private String estado_civil;
    private String sexo;
    private int id_regimen_pensionario;
    private int id_seguro_medico;
    private int id_situacion_discapacidad;
    private int id_empresa;
    private int id_cuenta;
}


