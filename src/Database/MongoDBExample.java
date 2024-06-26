package Database;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.Arrays;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;

public class MongoDBExample {
    public static void main(String[] args) {
        // Connect to MongoDB
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

        // Create a database
        MongoDatabase database = mongoClient.getDatabase("mydb");

        // Create a collection
        MongoCollection<Document> collection = database.getCollection("test");

        // Insert a document
        Document doc = new Document("name", "MongoDB")
                .append("type", "database")
                .append("count", 1)
                .append("versions", Arrays.asList("v3.2", "v3.0", "v2.6"))
                .append("info", new Document("x", 203).append("y", 102));
        collection.insertOne(doc);

        // Find documents
        Document myDoc = collection.find(eq("name", "MongoDB")).first();
        System.out.println(myDoc.toJson());

        // Update a document
        collection.updateOne(eq("name", "MongoDB"), combine(set("count", 101), set("info.x", 999)));

        // Delete a document
        collection.deleteOne(eq("name", "MongoDB"));

        mongoClient.close();
    }
}