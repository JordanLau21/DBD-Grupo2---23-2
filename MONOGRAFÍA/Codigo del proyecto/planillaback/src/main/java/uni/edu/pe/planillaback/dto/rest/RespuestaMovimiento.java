package uni.edu.pe.planillaback.dto.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uni.edu.pe.planillaback.dto.Movimiento;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaMovimiento {
    private List<Movimiento> movimientos;
}
