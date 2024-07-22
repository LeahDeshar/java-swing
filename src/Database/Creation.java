package Database;
import java.sql.*;
public class Creation {
    public static void main(String[] args) {
        // JDBC URL for MySQL database
        String url = "jdbc:mysql://localhost:3306/javalesson";
        String username = "root";
        String password = "password";
//        register the driver
//        try {
//            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return;
//        }
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // Create table
            createTable(connection);
            readOneData(connection);

            // Insert data
            insertData(connection, "John", 25);

            // Read data
            readData(connection);

            // Update data
            updateData(connection, 1, "John Doe", 30);

            // Read data after update
            readData(connection);

            // Delete data
            deleteData(connection, 1);

            // Read data after delete
            readData(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private static void createTable(Connection connection) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS users ("
                +"id INT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(255)," +  "age INT" +  ")";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
            System.out.println("Table created successfully");
        }
    }

    private static void insertData(Connection connection, String name, int age) throws SQLException {
        String sql = "INSERT INTO users (name, age) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted");
        }
    }

    private static void readData(Connection connection) throws SQLException {
        String sql = "SELECT * FROM users";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
        }
    }
    private static void readOneData(Connection connection) throws SQLException {

       /* String sql = "SELECT * FROM users";*/
        String sql = "SELECT * FROM users WHERE id = 8";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println("ID of one: " + id + ", Name: " + name + ", Age: " + age);
            }
        }
    }

    private static void updateData(Connection connection, int id, String name, int age) throws SQLException {
        String sql = "UPDATE users SET name = ?, age = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setInt(3, id);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) updated");
        }
    }

    private static void deleteData(Connection connection, int id) throws SQLException {
        String sql = "DELETE FROM users WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) deleted");
        }
    }
}
