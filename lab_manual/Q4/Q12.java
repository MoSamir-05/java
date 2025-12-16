import java.util.*;

public class Q12 {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<Integer>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Queue elements: " + q);

        int removed = q.remove();
        System.out.println("Removed element: " + removed);

        System.out.println("Front element: " + q.peek());

        System.out.println("Queue after removal: " + q);
    }
}
