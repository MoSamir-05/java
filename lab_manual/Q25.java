import java.util.Scanner;

public class Q25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        System.out.println("\n--- String Operations ---");
        System.out.println("1. Length of s1: " + s1.length());
        System.out.println("2. Length of s2: " + s2.length());
        System.out.println("3. Concatenation: " + s1 + s2);
        System.out.println("4. Uppercase of s1: " + s1.toUpperCase());
        System.out.println("5. Lowercase of s2: " + s2.toLowerCase());
        System.out.println("6. Compare: " + s1.equals(s2));

        // Reverse string s1
        String rev = "";
        for (int i = s1.length() - 1; i >= 0; i--)
            rev += s1.charAt(i);
        System.out.println("7. Reverse of s1: " + rev);
    }
}
