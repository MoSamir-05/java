abstract class Animal {
    abstract void sound();
    void eat(){
        System.out.println("Animal eat food");
    }
}
class Dog extends Animal {
    void sound(){
        System.out.println("Dog barks");
    }
}
public class Abstract_class {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.sound();
        d.eat();
    }
}
