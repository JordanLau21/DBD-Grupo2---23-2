package uni.edu.pe.planillaback.dto.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uni.edu.pe.planillaback.dto.Cargo;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaCargos {
    private List<Cargo> cargos;
}
