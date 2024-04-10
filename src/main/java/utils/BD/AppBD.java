package utils.BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppBD {
    static Logger logger = Logger.getLogger(AppBD.class.getName());
    private static ResultSet resultSet = null;
    private static Statement statement;

    public AppBD() {
        // Write document why this constructor is empty
    }
    public static ResultSet executeSelect(String strQuery, Connection conexion) throws SQLException {
        try {
            statement = conexion.createStatement();
            resultSet = statement.executeQuery(strQuery);
        } catch (SQLException e) {
            logger.log(Level.SEVERE, () -> "CONNECTION_FAILURE " + e.getMessage());
        } catch (Exception ex) {
            logger.log(Level.SEVERE, () -> "DRIVER_NOT_FOUND " + ex.getMessage());
        }
        return resultSet;
    }

    public static Map<String, String> fillHashWithResultSetRecord(ResultSet resultSet) throws SQLException {

        HashMap<String, String> hashMap = new HashMap<>();

        if (resultSet != null) {
            while (resultSet.next()) {
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                    String nombreCampo = resultSet.getMetaData().getColumnName(i);
                    String valorCampo = resultSet.getObject(i) == null ? "" : resultSet.getObject(i).toString();
                    hashMap.put(nombreCampo, valorCampo);
                }
            }
        }
        return hashMap;
    }
}
