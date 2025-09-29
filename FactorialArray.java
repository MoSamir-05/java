
import java.util.Scanner;

class FactorialArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Number : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            int fact = 1;
            for (int j = 1; j <= arr[i]; j++) {
                fact *= j;
            }
            System.out.println("Factorial of " + arr[i] + " = " + fact);
        }

    }
}
