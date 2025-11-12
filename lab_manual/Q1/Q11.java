import java.util.Scanner;

class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second value: ");
        int num2 = sc.nextInt();

        System.out.println("\n========== Arithmetic Operators ==========");
        System.out.printf("Addition       : %d + %d = %d%n", num1, num2, num1 + num2);
        System.out.printf("Subtraction    : %d - %d = %d%n", num1, num2, num1 - num2);
        System.out.printf("Multiplication : %d * %d = %d%n", num1, num2, num1 * num2);
        System.out.printf("Division       : %d / %d = %d%n", num1, num2, num1 / num2);
        System.out.printf("Modulus        : %d %% %d = %d%n", num1, num2, num1 % num2);

        num1++;
        num2--;
        System.out.printf("After Increment num1: %d%n", num1);
        System.out.printf("After Decrement num2: %d%n", num2);

        System.out.println("\n========== Relational Operators ==========");
        System.out.printf("num1 > num2   : %b%n", num1 > num2);
        System.out.printf("num1 == num2  : %b%n", num1 == num2);

        System.out.println("\n========== Logical Operators ==========");
        System.out.printf("Logical AND (num1>0 && num2>0) : %b%n", num1 > 0 && num2 > 0);
        System.out.printf("Logical OR  (num1>0 || num2>0) : %b%n", num1 > 0 || num2 > 0);
        System.out.printf("Logical NOT (!(num1>num2))      : %b%n", !(num1 > num2));

        System.out.println("\n========== Bitwise Operators ==========");
        System.out.printf("Bitwise AND (num1 & num2) : %d%n", num1 & num2);
        System.out.printf("Bitwise OR  (num1 | num2) : %d%n", num1 | num2);
        System.out.printf("Bitwise XOR (num1 ^ num2) : %d%n", num1 ^ num2);
        System.out.printf("Left shift  (num1 << 1)   : %d%n", num1 << 1);
        System.out.printf("Right shift (num1 >> 1)   : %d%n", num1 >> 1);

        System.out.println("\n========== Assignment Operators ==========");
        int temp = num1;
        temp += num2;
        System.out.printf("temp += num2 : %d%n", temp);
        temp -= num2;
        System.out.printf("temp -= num2 : %d%n", temp);
        temp *= num2;
        System.out.printf("temp *= num2 : %d%n", temp);

        System.out.println("\n========== Ternary Operator ==========");
        int greatest = (num1 > num2) ? num1 : num2;
        System.out.printf("Greatest between num1 and num2: %d%n", greatest);

    }
}
