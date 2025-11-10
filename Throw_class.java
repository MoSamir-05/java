class Test {
    void check(int age){
        if (age < 18){
            throw new ArithmeticException ("Not eligible");
        }else{
            System.out.println("eligible");  
        }
    }    
}
public class Throw_class {
    public static void main(String[] args) {
        Test t=new Test();
        t.check(11);
    }
}
