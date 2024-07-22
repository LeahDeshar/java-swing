//package Database;
//
//import javax.sql.rowset.WebRowSet;
//import java.io.FileOutputStream;
//import java.io.FileInputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class WebRowSetExample {
//    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost:3306/mydatabase";
//        String username = "myusername";
//        String password = "mypassword";
//        String xmlFile = "webrowset.xml";
//
//        try (Connection conn = DriverManager.getConnection(url, username, password)) {
//            // Create a Statement
//            Statement stmt = conn.createStatement();
//            // Execute a query to get a ResultSet
//            ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");
//
//            // Create a WebRowSet
//            WebRowSet webRowSet = new WebRowSetImpl();
//            // Populate WebRowSet with data from ResultSet
//            webRowSet.populate(rs);
//
//            // Close the ResultSet and Statement
//            rs.close();
//            stmt.close();
//
//            // Now the WebRowSet is disconnected from the database
//            // Write the WebRowSet to an XML file
//            try (FileOutputStream fos = new FileOutputStream(xmlFile)) {
//                webRowSet.writeXml(fos);
//            }
//
//            // Read the WebRowSet from the XML file
//            WebRowSet newWebRowSet = new WebRowSetImpl();
//            try (FileInputStream fis = new FileInputStream(xmlFile)) {
//                newWebRowSet.readXml(fis);
//            }
//
//            // Iterate through the WebRowSet
//            while (newWebRowSet.next()) {
//                int id = newWebRowSet.getInt("id");
//                String name = newWebRowSet.getString("name");
//                double value = newWebRowSet.getDouble("value");
//                System.out.println("ID: " + id + ", Name: " + name + ", Value: " + value);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
