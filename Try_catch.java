public class Try_catch {
    public static void main(String[] args) {
        try{
            int a=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("not divid by ZERO");
        }
        finally{
            System.out.println("it's finally block");
        }
    }
}
