
import java.util.Scanner;

class Q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number : ");
        int num1=sc.nextInt();
        System.out.println("Enter Number : ");
        int num2=sc.nextInt();
        System.out.println("Enter Number : ");
        int num3=sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("Big number is : "+num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Big number is : "+num2);
        }

        else{
            System.out.println("Big number is : "+num3);
        }

    }
}