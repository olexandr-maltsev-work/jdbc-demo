import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Calendar;

public class MainPreparedStatementInsert {

    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    private static final String INSERT_NEW = "INSERT INTO dish VALUES(?, ?, ?, ?, ?, ?, ?)";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NEW)) {
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Inserted title");
            preparedStatement.setString(3, "Inserted desc");
            preparedStatement.setFloat(4, 0.2f);
            preparedStatement.setBoolean(5, true);
            preparedStatement.setDate(6, new Date(Calendar.getInstance().getTimeInMillis()));
            preparedStatement.setBlob(7, new FileInputStream("smile.png"));

            preparedStatement.execute();

        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}