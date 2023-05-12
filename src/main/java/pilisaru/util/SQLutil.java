package pilisaru.util;

import pilisaru.db.DBConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLutil {
    public static <T>T execute(String sql, Object... args) throws SQLException {
        PreparedStatement pstm = DBConnection.getInstance().getConnection()
                .parepareStatement(sql);

        for (int i = 0; i < args.length; i++) {
            pstm.setObject((i+1), args[i]);
        }

        if(sql.startsWith("SELECT") || sql.startsWith("select")) {
            return (T) pstm.executeQuery();  //get values
        }

        return (T) (Boolean)(pstm.executeUpdate() > 0); // update values

    }
}
