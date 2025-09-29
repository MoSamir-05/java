
import java.util.Scanner;

class Q10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st value : ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd value : ");
        int num2=sc.nextInt();
        System.out.print("Enter 3rd value : ");
        int num3=sc.nextInt();

        int greatest = (num1 > num2) ? ((num1 > num3) ? num1 : num3)  : ((num2 > num3) ? num2 : num3);

        System.out.print("Big Number is : "+greatest);
    }
}