
import java.util.Scanner;

class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int num=sc.nextInt();
        int a=0,b=1;
        int ans=0;
        for(int i = 0; i < num; i++){
            System.out.print(a + " ");  
            ans = a + b;   
            a = b;         
            b = ans;   
        }
    }
}