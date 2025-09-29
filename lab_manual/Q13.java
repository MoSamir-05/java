
import java.util.Scanner;

class Q13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius value : ");
        double num=sc.nextDouble();
        double ans=3.14*num*num;
        System.out.println("area of the circle is : "+ans);
    }
}