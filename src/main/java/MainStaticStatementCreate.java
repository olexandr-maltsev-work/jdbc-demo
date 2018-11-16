import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainStaticStatementCreate {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD); Statement statement = connection.createStatement()) {

            statement.execute("INSERT INTO animal(anim_name, anim_desc) VALUES('name', 'desc');");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
