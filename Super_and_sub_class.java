
import java.util.Scanner;

class Emp {

    String name, city;
    int eno, mon;
    Scanner sc = new Scanner(System.in);

    Emp() {
        System.out.print("Enter your Emp NO : ");
        eno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your Name : ");
        name = sc.nextLine();
        System.out.print("Enter your City : ");
        city = sc.nextLine();
        System.out.print("Enter your Salary : ");
        mon = sc.nextInt();
    }

    void printData() {
        System.out.print("========Employ Details=========\n\n");
        System.out.print("Your Emp No : " + eno + "\n");
        System.out.print("Your Name   : " + name + "\n");
        System.out.print("Your City   : " + city + "\n\n");
        System.out.print("========     END      =========");
    }
}

class Salary extends Emp {

    double hra;
    double ta;
    double da;
    double pf = 1800;
    double it;
    double total;

    Salary() {
        super();
        hra = mon * 0.10;
        ta = mon * 0.02;
        da = mon * 0.50;
        it = mon * 0.05;
        total = mon + hra + ta + da - pf - it;
        print();
    }

    void print() {
        printData();
        System.out.print("\n\n\n========Employ Salary Details=========\n\n");
        System.out.print("Your Salary : " + mon + "\n");
        System.out.print("Your HRA    : " + hra + "\n");
        System.out.print("TA          : " + ta + "\n");
        System.out.print("DA          : " + da + "\n");
        System.out.print("PF          : " + pf + "\n");
        System.out.print("IT          : " + it + "\n");
        System.out.print("TOTAL       : " + total + "\n\n");
        System.out.print("========     END      =========");
    }
}

class Super_and_sub_class {

    public static void main(String[] args) {
        Salary s1 = new Salary();
    }
}
