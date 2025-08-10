
import java.util.HashSet;
import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeheni
 */
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> fruits = new HashSet<>();
        
        // Add elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple"); // Duplicate element - will be ignored
        
        // Display the HashSet
        System.out.println("HashSet contents: " + fruits);
        
        // Check if an element exists
        System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));
        
        // Remove an element
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);
        
        // Iterate through the HashSet using iterator
        System.out.println("\nIterating using iterator:");
        Iterator<String> iterator = fruits.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Iterate using enhanced for loop
        System.out.println("\nIterating using for-each:");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // Get size of HashSet
        System.out.println("\nSize of HashSet: " + fruits.size());
        
        // Clear all elements
        fruits.clear();
        System.out.println("After clear(): " + fruits);
        System.out.println("Is empty? " + fruits.isEmpty());
    }
}