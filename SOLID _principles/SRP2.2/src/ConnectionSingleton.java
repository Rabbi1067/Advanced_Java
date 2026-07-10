import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingleton {
    private static final String DB_URL="jdbc:sql://localhost:3306/SRP";
    private static final String DB_USER="root";
    private static final String DB_PASSWORD="rabbi1067";

    private static Connection connection;
    public static Connection getConnection(){
        try{
            if(connection == null || connection.isClosed()){
                connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            }
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
