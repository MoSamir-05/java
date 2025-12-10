
interface Animal {
    void sound();

    void sleep();
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
        obj.sleep();
    }
}
