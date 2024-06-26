package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {

    public static void main(String[] args) {
        // Connection URL
        String url = "jdbc:mysql://localhost:3306/javalesson";

        // Database credentials
        String user = "root";
        String password = "password";

        Connection conn = null;
        Statement stmt = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully!");

            // Create a statement
            stmt = conn.createStatement();

            // Execute a query
            String selectSQL = "SELECT id, name, age FROM users";
            ResultSet rs = stmt.executeQuery(selectSQL);

            // Process the results
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            // Close the ResultSet
            rs.close();

            // Execute an update
            String updateSQL = "UPDATE users SET age = age + 1 WHERE id = 1";
            int rowsAffected = stmt.executeUpdate(updateSQL);
            System.out.println("Rows affected: " + rowsAffected);

            // Execute an insert
            String insertSQL = "INSERT INTO users (name, age) VALUES ('New User', 25)";
            rowsAffected = stmt.executeUpdate(insertSQL);
            System.out.println("Rows affected: " + rowsAffected);

            // Execute a delete
            String deleteSQL = "DELETE FROM users WHERE name = 'New User'";
            rowsAffected = stmt.executeUpdate(deleteSQL);
            System.out.println("Rows affected: " + rowsAffected);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Close the Statement
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            // Close the Connection
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Connection closed.");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
