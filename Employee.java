import java.util.Scanner;
class Emp {
    Scanner sc = new Scanner(System.in);
    int eno;
    String name;
    int basic;
    double hra;
    double ta;
    double da;
    double pf = 1800;
    double it;
    double total;
    Emp() {
        System.out.println("Enter your Employee no. : ");
        eno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your Name : ");
        name = sc.nextLine();
        System.out.println("Enter basic value");
        basic = sc.nextInt();
        cal();
    }
    void cal() {
        hra = basic * 0.10;
        ta = basic * 0.02;
        da = basic * 0.50;
        it = basic * 0.05;
        total = basic + hra + ta + da - pf - it;
        print();
    }
    void print() {
        System.out.println("===============================");
        System.out.print("NAME : "+name+"\n");
        System.out.print("EMPLOYEE NO : "+eno+"\n");
        System.out.print("HRA : " + hra+"\n");
        System.out.print("TA : " + ta+"\n");
        System.out.print("DA : " + da+"\n");
        System.out.print("PF : " + pf+"\n");
        System.out.print("IT : " + it+"\n");
        System.out.print("TOTAL : " + total+"\n");
        System.out.println("===============================");
    }
}
public class Employee {
    public static void main(String[] args) {
        Emp e1 = new Emp();
    }
}
