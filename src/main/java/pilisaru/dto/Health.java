package pilisaru.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Blob;
import java.sql.Date;

@Data
@AllArgsConstructor
public class Health {
    private String nic;
    private Double cost;
    private Date date;
    private Blob checkups;
}
