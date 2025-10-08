import java.util.*;
class Q15 {
    
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter valu : ");
        float valu=sc.nextFloat();
        System.out.print("Intrest rate : ");
        float intrest=sc.nextFloat();
        System.out.print("Duration : ");
        float dua=sc.nextFloat();

        float ans=(valu*intrest*dua)/100;
        
        System.out.println("total intrest is : "+ ans);
    }
}