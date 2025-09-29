import java.util.Scanner;

class Count_lightbill2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter How many Units You Used: ");
        int unit = sc.nextInt();
        int remaining = unit;
        float bill = 0;

        if (remaining > 0) {
            int used = Math.min(remaining, 100);
            bill += used * 8;
            remaining -= used;
        }

        if (remaining > 0) {
            int used = Math.min(remaining, 100);
            bill += used * 10;
            remaining -= used;
        }

        if (remaining > 0) {
            int used = Math.min(remaining, 100);
            bill += used * 11;
            remaining -= used;
        }

        if (remaining > 0) {
            bill += remaining * 12;
        }

        System.out.println("Total Bill: " + bill);
    }
}
