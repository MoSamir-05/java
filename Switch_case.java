import java.util.Scanner;
class Switch_case {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number between 1 to 12 : ");
        int m=sc.nextInt();

        switch (m){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("Ape");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Plz enter Between 1 to 12");

        }



    }
}