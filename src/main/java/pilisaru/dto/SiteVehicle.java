package pilisaru.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SiteVehicle {
    private String id;
    private String name;
    private Integer repair;
}
