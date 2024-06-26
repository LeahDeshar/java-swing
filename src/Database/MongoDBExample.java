package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MongoDBExample {
    public static void main(String[] args) {
        // Connect to MongoDB
        try {

            // Register the MongoDB JDBC driver
            Class.forName("com.dbschema.MongoJdbcDriver");

            // MongoDB connection URL
            String url = "jdbc:mongodb://localhost:27017/products"; // Replace with your MongoDB URI and database name

//            // MongoDB credentials (if required)
//            String username = "yourUsername";
//            String password = "yourPassword";

            // Establish the connection
            Connection conn = DriverManager.getConnection(url);

            // Perform a query
            String query = "SELECT * FROM user"; // Replace with your collection name

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Process the results
            while (rs.next()) {
                // Example: Retrieve data from each row
                String fieldValue = rs.getString("name"); // Replace with your field name
                System.out.println("Field Value: " + fieldValue);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            System.err.println("MongoDB JDBC driver not found in classpath: " + e.getMessage());
            e.printStackTrace();
            // Handle the exception (e.g., log it, exit gracefully)
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}