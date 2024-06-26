package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionExample {

    public static void main(String[] args) {
        // Connection URL
        String url = "jdbc:mysql://localhost:3306/javalesson";

        // Database credentials
        String user = "root";
        String password = "password";

        Connection conn = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully!");

            // Create a statement
            Statement stmt = conn.createStatement();

            // Execute a query
            String sql = "SELECT id, name, age FROM users";
            ResultSet rs = stmt.executeQuery(sql);

            // Process the results
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            // Close the ResultSet and Statement
            rs.close();
            stmt.close();

            // Manage transactions (optional)
            conn.setAutoCommit(false); // Disable auto-commit

            // Perform some updates
            stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE users SET age = age + 1 WHERE id = 1");
            stmt.executeUpdate("INSERT INTO users (name, age) VALUES ('New User', 25)");

            // Commit the transaction
            conn.commit();
            System.out.println("Transaction committed successfully!");

            // Rollback the transaction (optional)
            // conn.rollback();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            if (conn != null) {
                try {
                    conn.rollback();
                    System.out.println("Transaction rolled back!");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } finally {
            // Close the connection
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

