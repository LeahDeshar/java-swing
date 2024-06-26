package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DriverManagerExample {

    public static void main(String[] args) {
        // Register the MySQL JDBC driver
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

        // Set the login timeout to 30 seconds
        DriverManager.setLoginTimeout(30);

        // Connection URL

        String url = "jdbc:mysql://localhost:3306/javalesson";
        // Username and password
        String user = "root";
        String password = "password";

        // Establish a connection
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("Connected to the database successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }



        // Deregister the driver
        try {
            DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
