import java.util.*;

class Q19 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] num = new int[10]; 
        for (int i = 0; i < 10; i++) {
            num[i] = r.nextInt(100);
        }

        System.out.println("Random Numbers:");
        for (int n : num) {
            System.out.print(n + " ");
        }
    }
}