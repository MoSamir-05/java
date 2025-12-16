import java.util.*;

public class Q13 {
    public static void main(String[] args) {

        // Set interface reference
        Set<String> set = new HashSet<String>();

        // Add elements
        set.add("Java");
        set.add("Python");
        set.add("C");
        set.add("Java");   // duplicate not allowed

        // Display set
        System.out.println("Set elements:");
        for (String item : set) {
            System.out.println(item);
        }

        // Remove element
        set.remove("C");

        // Check element
        System.out.println("Contains Java? " + set.contains("Java"));

        System.out.println("Set after removal: " + set);
    }
}
