//package Database;
//
//import javax.sql.rowset.CachedRowSet;
//import com.sun.rowset.CachedRowSetImpl;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class CachedRowSetExample {
//    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost:3306/mydatabase";
//        String username = "myusername";
//        String password = "mypassword";
//
//        try (Connection conn = DriverManager.getConnection(url, username, password)) {
//            // Create a Statement
//            Statement stmt = conn.createStatement();
//            // Execute a query to get a ResultSet
//            ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");
//
//            // Create a CachedRowSet
//            CachedRowSet cachedRowSet = new CachedRowSetImpl();
//            // Populate CachedRowSet with data from ResultSet
//            cachedRowSet.populate(rs);
//
//            // Close the ResultSet and Statement
//            rs.close();
//            stmt.close();
//
//            // Now the CachedRowSet is disconnected from the database
//            // Iterate through the CachedRowSet
//            while (cachedRowSet.next()) {
//                int id = cachedRowSet.getInt("id");
//                String name = cachedRowSet.getString("name");
//                double value = cachedRowSet.getDouble("value");
//                System.out.println("ID: " + id + ", Name: " + name + ", Value: " + value);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
