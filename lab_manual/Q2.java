
import java.util.Scanner;

class Q2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Any number : ");
        int num1=sc.nextInt();

        if (num1%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}