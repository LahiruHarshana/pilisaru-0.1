package pilisaru.model;

import pilisaru.dto.Machine;
import pilisaru.util.CrudUtil;

import java.sql.SQLException;

public class MachineModel {
    public static boolean add(Machine machine) throws SQLException {
        String sql="INSERT INTO Machine (ID,name) VALUES(?, ?)";
        return CrudUtil.execute(
                sql,
                machine.getId(),
                machine.getName()
        );
        //test 1
    }
}
