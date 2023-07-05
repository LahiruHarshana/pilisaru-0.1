package pilisaru.model;

import pilisaru.dto.Vehicle;
import pilisaru.util.CrudUtil;

import java.sql.SQLException;

public class VehicleModel {
    public static boolean save(Vehicle vehicle) throws SQLException {
        String sql="INSERT INTO vehicle(vehicleNumber,council,waigth)" +
                "VALUES(?, ?, ?)";
        return CrudUtil.execute(sql,vehicle.getNumber(),vehicle.getCouncile(),vehicle.getWaigth());
    }
}
