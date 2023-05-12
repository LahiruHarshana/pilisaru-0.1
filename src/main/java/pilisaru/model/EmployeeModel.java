package pilisaru.model;

import pilisaru.dto.Employee;
import pilisaru.util.CrudUtil;

import java.sql.SQLException;

public class EmployeeModel  {
    public static boolean save(Employee employee) throws SQLException {
        String sql="INSERT INTO employee(NIC,Name,Address)" +
                "VALUES(?, ?, ?)";
        return CrudUtil.execute(sql,employee.getNic(),employee.getName(),employee.getAddress());
    }
}
