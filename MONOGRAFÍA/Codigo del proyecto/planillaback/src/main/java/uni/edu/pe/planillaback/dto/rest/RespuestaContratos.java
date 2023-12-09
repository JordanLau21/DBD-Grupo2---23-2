package uni.edu.pe.planillaback.dto.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uni.edu.pe.planillaback.dto.Contrato;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaContratos {
    private  List<Contrato> contratos;
}
