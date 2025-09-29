import java.util.Scanner;

class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter your gender (M/F/O): ");
        String gender = sc.nextLine();

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = sc.nextLine();

        System.out.println("\n========== Personal Data ==========");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Gender     : " + gender);
        System.out.println("Email      : " + email);
        System.out.println("Phone No.  : " + phone);

        sc.close();
    }
}
