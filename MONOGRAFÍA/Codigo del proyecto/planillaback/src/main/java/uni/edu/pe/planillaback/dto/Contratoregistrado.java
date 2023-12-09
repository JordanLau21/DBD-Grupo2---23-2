package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contratoregistrado {
    private String fecha_firma_contrato;
    private String fecha_inicio_laboral;
    private String fecha_termino_contrato;
    private float sueldo_base;
    private int liquido_teorico;
    private int id_area;
    private int id_cargo;
    private int id_empleado;
    private int id_estado_contrato;
    private int id_tipo_contrato;
    private int id_tipo_jornada;
    private int id_frecuencia_pago;
    private int id_medio_pago;

}
