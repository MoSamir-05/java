interface A {
    void showA();
}
interface B {
    void showB();
}


class Multiple implements A, B {

    public void showA() {
        System.out.println("This is method of Interface A");
    }

    public void showB() {
        System.out.println("This is method of Interface B");
    }
}

public class Q8 {
    public static void main(String[] args) {

        Multiple obj = new Multiple();

        obj.showA();  
        obj.showB();   
    }
}
