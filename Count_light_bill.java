import java.util.Scanner;
class Count_light_bill{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // float sc = sc.nextFloat();

        System.out.println("Enter How many Unit You Used : ");
        float unit = sc.nextFloat();
        float u;
        if (unit <= 100){
            u=unit*8;
            System.out.println("Amount you pay :"+u);
        }
        else if (unit > 100 && unit <=200){
            u=unit*10;
            System.out.println("Amount you pay :"+u);
        }
        else if (unit >200 && unit <=300)
        {
            u=unit*11;
            System.out.println("Amount you pay :"+u);
        }
        else if (unit > 300)
        {
            u=unit*12;
            System.out.println("Amount you pay :"+u);
        }
        else {
            System.out.println("Enter valid Value :");
        }
    }
}