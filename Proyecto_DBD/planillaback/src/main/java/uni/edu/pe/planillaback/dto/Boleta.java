package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Boleta {
    private int id_boleto;
    private float total_descuentos;
    private float total_neto;
    private float total_ingresos;
    private float total_aportes;
    private int id_contrato;
    private int id_planilla;
}
