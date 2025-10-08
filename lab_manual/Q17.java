import java.util.*;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Student Name : ");
        String name=sc.nextLine();
        System.out.println("Enter Student Roll Number : ");
        int rnum=sc.nextInt();sc.nextLine();


        System.out.println("Enter java Marks : ");
        float java=sc.nextFloat();
        System.out.println("Enter WD Marks : ");
        float wd=sc.nextFloat();
        System.out.println("Enter Python Marks : ");
        float python=sc.nextFloat();

        float total = java+wd+python;
        float par=(total/300)*100;

        System.out.println("==================================");
        System.out.print("Student Name : "+name);
        System.out.print("Student Roll Number : "+rnum);
        System.out.print("Java marks : "+java);
        System.out.print("WD marks : "+wd);
        System.out.print("Python marks : "+python);
        System.out.print("Percentage : "+par);
    }
}
