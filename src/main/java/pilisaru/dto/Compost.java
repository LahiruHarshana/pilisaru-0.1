package pilisaru.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Compost {
   private String id;
   private Double tea;
   private Double coconut;
   private Double rubber;
   private Double quantity;
}
