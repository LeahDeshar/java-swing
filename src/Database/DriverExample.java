package Database;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DriverExample {

    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Driver driver = new com.mysql.cj.jdbc.Driver();

            // Register the driver explicitly
            DriverManager.registerDriver(driver);

            // Connection URL
            String url = "jdbc:mysql://localhost:3306/javalesson";

            // Properties for the connection
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "password");

            // Establish a connection using the Driver interface
            Connection conn = driver.connect(url, info);

            if (conn != null) {
                System.out.println("Connected to the database successfully using Driver interface!");
                conn.close();
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
