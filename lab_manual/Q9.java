
class Q9 {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
        System.err.println("Before Swaping: ");
        System.out.println("value of num1 :" + num1);
        System.out.println("value of num2 :" + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.err.println("After Swaping :");
        System.out.println("Print num1 :" + num1);
        System.out.println("Print num2 :" + num2);

    }
}
