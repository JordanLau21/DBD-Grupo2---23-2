package uni.edu.pe.planillaback.dto.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uni.edu.pe.planillaback.dto.BoletaPago;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaBoletasPago {
    private List<BoletaPago> boletas;
}
