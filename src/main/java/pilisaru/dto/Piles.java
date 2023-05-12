package pilisaru.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Piles {
    private Integer id;
    private Double temperature;
    private Double waterLevel;
    private String vehiiID;
    private Double weight;
    private String council;
}
