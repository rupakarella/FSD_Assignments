package map;

import java.util.Hashtable;
import java.util.Enumeration;

public class HashTable {

    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding key-value pairs to the Hashtable
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);
        hashtable.put("Four", 4);

        // Accessing values using keys
        System.out.println("Value of Two: " + hashtable.get("Two"));

        // Iterating through the Hashtable using Enumeration
        System.out.println("Iterating through the Hashtable:");
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            int value = hashtable.get(key);
            System.out.println(key + ": " + value);
        }

        // Check if a key exists
        System.out.println("Does key 'Five' exist? " + hashtable.containsKey("Five"));

        // Remove a key-value pair
        hashtable.remove("Three");

        // Size of the Hashtable
        System.out.println("Size of the Hashtable: " + hashtable.size());
    }
}
