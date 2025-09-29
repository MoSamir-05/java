// constructor Example
import java.util.Scanner;
class fruits {
    String name;
    String col;
    void setData(String n, String a) {
        name = n;
        col = a;
    }
    void getData() {
        System.out.println("fruit name : " + name);
        System.out.println("Colour: " + col);
    }
}
public class Function_calling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fruits s1 = new fruits();
        System.out.print("Enter fruit Name: ");
        String n = sc.nextLine();
        System.out.print("Enter Colour: ");
        String a = sc.nextLine();

        s1.setData(n, a);
        s1.getData();
    }
}
