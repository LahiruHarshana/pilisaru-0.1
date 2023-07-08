package pilisaru.model;

import pilisaru.dto.Vehicle;
import pilisaru.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VehicleModel {
    public static boolean save(Vehicle vehicle) throws SQLException {
        String sql="INSERT INTO vehicle(vehicleNumber,council,waigth)" +
                "VALUES(?, ?, ?)";
        return CrudUtil.execute(sql,vehicle.getNumber(),vehicle.getCouncile(),vehicle.getWaigth());
    }

    public static void update(Vehicle vehicle) throws SQLException {
        String sql="UPDATE vehicle SET council=? ,waigth=?" +
                "WHERE vehiclenumber=?";

        CrudUtil.execute(sql,vehicle.getCouncile(),vehicle.getWaigth(),vehicle.getNumber());
    }

    public static Vehicle getNumWise(String s) throws SQLException {
        String sql ="SELECT * FROM vehicle where vehicle number= ?";
        ResultSet resultSet = CrudUtil.execute(sql,s);

        return new Vehicle(resultSet.getString(1) ,resultSet.getString(2),resultSet.getString(3));
    }
}
