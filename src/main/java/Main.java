import java.sql.*;

import static sun.plugin.javascript.navig.JSType.URL;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD); Statement statement = connection.createStatement()) {
//            statement.execute("INSERT INTO animal(anim_name, anim_desc) VALUES('name', 'desc');");

//            int res = statement.executeUpdate("UPDATE animal SET anim_name='New Name!' WHERE id = 1;");
//            System.out.println(res);

//            ResultSet resultSet = statement.executeQuery("SELECT * FROM animal");

//            statement.addBatch("INSERT INTO animal(anim_name, anim_desc) VALUES('batch1', 'desc');");
//            statement.addBatch("INSERT INTO animal(anim_name, anim_desc) VALUES('batch2', 'desc');");
//            statement.addBatch("INSERT INTO animal(anim_name, anim_desc) VALUES('batch3', 'desc');");
//            statement.executeBatch();
//            statement.clearBatch();
//            System.out.println(statement.isClosed());

        } catch (SQLException e) {
            e.printStackTrace();
        }

        DBWorker worker = new DBWorker();

        String query = "select * from users";
        try {
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt(1));
                user.setUsername(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
                System.out.println(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
