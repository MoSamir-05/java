import java.util.*;

public class Q11 {
    public static void main(String[] args) {

        // List interface reference
        List<String> list = new ArrayList<String>();

        // Add elements
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("Java");   // duplicate allowed

        // Display list
        System.out.println("List Elements:");
        for (String item : list) {
            System.out.println(item);
        }

        // Access element using index
        System.out.println("Element at index 1: " + list.get(1));

        // Remove element
        list.remove("C");

        System.out.println("List after removal:");
        System.out.println(list);
    }
}
