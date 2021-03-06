import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("Connection established");
            }

            connection.close();

            if (connection.isClosed()) {
                System.out.println("Connection closed");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
