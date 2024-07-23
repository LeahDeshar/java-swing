package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMethodsExample {

    public static void main(String[] args) {
        // Connection URL
        String url = "jdbc:mysql://localhost:3306/javalesson";

        // Database credentials
        String user = "root";
        String password = "password";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully!");

            // Create a statement
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            // Execute a query
            String sql = "SELECT id, name, age FROM users";
            rs = stmt.executeQuery(sql);

            // Navigate and process the results
            if (rs.next()) {
                System.out.println("First row:");
                printRow(rs);
            }


            if (rs.first()) {
                System.out.println("First row again:");
                printRow(rs);
            }

            if (rs.last()) {
                System.out.println("Last row:");
                printRow(rs);
            }


            if (rs.previous()) {
                System.out.println("Previous row:");
                printRow(rs);
            }

            if (rs.absolute(1)) {
                System.out.println("Second row:");
                printRow(rs);
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Close the ResultSet

        }
    }

    private static void printRow(ResultSet rs) throws SQLException {
        int id = rs.getInt(1); // getInt by column index
        String name = rs.getString("name"); // getString by column name
        int age = rs.getInt("age"); // getInt by column name

        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}
