class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    // Overriding the parent method
    @Override
    void sound() {
        System.out.println("child class Dog barks");
    }
}
public class Q5 {
     public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();   // parent class method

        Dog d = new Dog();
        d.sound();   // overridden method

        Animal ref = new Dog();
        ref.sound(); // runtime polymorphism
    }
}
