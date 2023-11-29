package uni.edu.pe.planillaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Planilla {
    private int id_planilla;
    private String fecha;
    private String periodo;
    private String periodicidad;
}
