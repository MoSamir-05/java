
import java.util.Scanner;

class Q8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("How many number You enter : ");
        int limit=sc.nextInt();
        int add=0;
        int temp=0;
        for(int i=1;i<=limit;i++){
            System.out.print("Enter values: ");
            add=sc.nextInt();
            temp+=add;
        }
        System.out.print("Answer is: "+temp);
    }
}