package pilisaru.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@Data
@AllArgsConstructor
public class Sales {
    private String id;
    private Date date;
    private Double quantity;
    private Double profit;

}
