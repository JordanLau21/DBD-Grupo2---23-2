package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contrato {
    private int id_contrato;
    private long dni;
    private String nombres;
    private String apellidos;
    private String nombre_cargo;
    private String fecha_inicio_laboral;
    private String fecha_termino_contrato;



}
