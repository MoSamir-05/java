class Circle{
    Circle(){
        int r=15;
        calcArea(r);
    }
    Circle(double d){
        double temp=d;
        calcArea(temp);
    }
    public void calcArea(double e){
        double cal=3.14*e*e;
        System.out.println("area of the Circle "+cal);
       
    }
}
public class Q3 {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle(20);
    }
}
