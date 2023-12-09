package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoletaPago {
    private int id_boleto;
    private String fecha;
    private String periodo;
    private float monto_emitido;
}
