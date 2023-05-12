package pilisaru.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private String nic;
    private String name;
    private String address;
}
