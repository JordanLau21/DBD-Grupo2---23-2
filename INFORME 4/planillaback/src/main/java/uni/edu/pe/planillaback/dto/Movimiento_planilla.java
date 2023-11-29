package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movimiento_planilla {
    private int id_movimiento_planilla;
    private Date fecha;
    private float monto;
    private int id_contrato;
    private int id_nomina;
}
