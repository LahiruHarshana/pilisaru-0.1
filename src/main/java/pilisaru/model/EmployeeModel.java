package pilisaru.model;

import pilisaru.dto.Employee;
import pilisaru.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeModel  {
    public static boolean save(Employee employee) throws SQLException {
        String sql="INSERT INTO employee(NIC,Name,Address)" +
                "VALUES(?, ?, ?)";
        return CrudUtil.execute(sql,employee.getNic(),employee.getName(),employee.getAddress());
    }

    public static boolean update(Employee employee) throws SQLException {
        String sql="UPDATE employee SET Name=? ,Address=?" +
                "WHERE NIC=?";
        return CrudUtil.execute(sql,employee.getName(),employee.getAddress(),employee.getNic());
    }

    public static List<String> getNicNumbers() throws SQLException {
        List<String> nic=new ArrayList<>();
        String sql="SELECT NIC FROM employee";
        ResultSet resultSet=CrudUtil.execute(sql);
        while (resultSet.next()) {
            nic.add(resultSet.getString(1));
        }
        return nic;
    }

    public static Employee getAll(String nic) throws SQLException {
        String sql="SELECT Name,Address FROM employee WHERE NIC=?";

        ResultSet resultSet=CrudUtil.execute(sql,nic);

        if (resultSet.next()){
            return new Employee(nic,resultSet.getString(1),resultSet.getString(2));
        }
        return null;
    }

    public static boolean delete(String nic) throws SQLException {
        String sql="DELETE FROM employee WHERE NIC=?";
        return CrudUtil.execute(sql,nic);
    }
}
