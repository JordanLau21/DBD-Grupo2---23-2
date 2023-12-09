package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movimiento {
    private int id_movimiento_planilla;
    private String fecha;
    private float monto;
    private int id_nomina;
}
