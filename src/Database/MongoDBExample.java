package Database;

//import com.mongodb.client.MongoClients;
//
////import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoDatabase;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.FindIterable;
//import com.mongodb.client.model.Filters;
//import com.mongodb.client.result.DeleteResult;
//import com.mongodb.client.result.UpdateResult;
//import org.bson.Document;
//import org.bson.conversions.Bson;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class MongoDBExample {
    public static void main(String[] args) {
        // Connect to MongoDB
//        String uri = "mongodb://localhost:27017";
//
//        // Connect to MongoDB
//        try (MongoClient mongoClient = MongoClients.create(uri)) {
//            // Access the database
//            MongoDatabase database = mongoClient.getDatabase("products");
//
//            // Access the collection
//            MongoCollection<Document> collection = database.getCollection("user");
//
//            // Create a document
//            Document newUser = new Document("name", "John Doe111111")
//                    .append("age", 30)
//                    .append("email", "johndoe@example.com");
//
//            // Insert the document into the collection
//            collection.insertOne(newUser);
//            System.out.println("Inserted document: " + newUser.toJson());
//
//            // Read documents from the collection
//            FindIterable<Document> users = collection.find();
//            System.out.println("All users:");
//            for (Document user : users) {
//                System.out.println(user.toJson());
//            }
//
//            // Update a document
//            Bson filter = Filters.eq("name", "John Doe");
//            Bson updateOperation = new Document("$set", new Document("age", 31));
//            UpdateResult updateResult = collection.updateOne(filter, updateOperation);
//            System.out.println("Updated " + updateResult.getModifiedCount() + " document(s)");
//
//            // Read updated document
//            Document updatedUser = collection.find(filter).first();
//            if (updatedUser != null) {
//                System.out.println("Updated user: " + updatedUser.toJson());
//            }
//
//            // Delete a document
//            DeleteResult deleteResult = collection.deleteOne(filter);
//            System.out.println("Deleted " + deleteResult.getDeletedCount() + " document(s)");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            // Register the MongoDB JDBC driver
            Class.forName("com.dbschema.MongoJdbcDriver");

            // MongoDB connection URL
            String url = "jdbc:mongodb://localhost:27017/products"; // Replace with your MongoDB URI and database name

            // MongoDB credentials (if required)
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

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}