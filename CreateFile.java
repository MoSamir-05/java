
import java.io.*;
public class CreateFile {
    public static void main(String[] args) {
        try{
            FileWriter f1=new FileWriter("demo.txt");
            f1.write("Hello.\n");
            f1.write("lolu lalit");
            f1.close();
            System.out.println("data insert ho gya");
            FileReader r1=new FileReader("demo.txt");
            BufferedReader r2=new BufferedReader(r1);
            System.out.println("data mene read kr liye");

            String r3;
            while ((r3=r2.readLine())!=null) {
                System.out.println(r3);
            }
            r2.close();
            r1.close();
        }
        catch(Exception e){
            System.out.println("error"+e.getMessage());
        }
    }
}
