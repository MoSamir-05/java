class InnerQ2 {
    void fun(){
        System.out.println("Without parameter method");
    }
    void fun(int a){
        System.out.println("2nd method called "+a);
    }
    void fun(int a,int b){
        System.out.println("You enter 2 integer values");
        System.out.println("First one is"+a);
        System.out.println("2nd is"+b);
    }
    void fun(double d){
        System.out.println("You enter Double type value : "+d);
    }
    
}
public class Q2 extends InnerQ2{
    public static void main(String[] args) {
        InnerQ2 a=new InnerQ2();
        a.fun();
        a.fun(20);
        a.fun(10, 20);
        a.fun(20.55);
    }
}
