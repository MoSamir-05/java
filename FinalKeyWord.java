class Animal {
    final void sound() {
        System.out.println("animal class method called");
    }
}

class Dog extends Animal {
    void sound() { // error for final keyword 
        System.out.println("Dog calss method called");
    }
}

class Lion extends Dog{

    void sound() {
        System.out.println("Lion class method called ");
    }
}

public class FinalKeyWord {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        Lion l1 = new Lion();
        a1.sound();
        d1.sound();
        l1.sound();

    }
}
