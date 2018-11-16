import java.sql.*;

public class MainPreparedStatementGet {

    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    private static final String GET_ALL = "SELECT * FROM dish";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String desc = resultSet.getString("description");
                float rating = resultSet.getFloat("rating");
                boolean published = resultSet.getBoolean("published");
                Date date = resultSet.getDate("created");
                byte[] icon = resultSet.getBytes("icon");

                System.out.println("id: " + id + ", title: " + title + ", desc: " + desc + "," +
                        " rating: " + rating + ", published: " + published + ", date: " + date +
                        ", icon length: " + icon.length);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
