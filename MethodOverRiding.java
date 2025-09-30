class Animal{
    void sound(){
        System.out.println("animal class method called");
    }
}
class Dog extends Animal {
    void sound(){
        System.out.println("Dog calss method called");
    }
}
class Lion {

    void sound(){
        System.out.println("Lion class method called ");
    }
}
public class MethodOverRiding {
    public static void main(String[] args) {
        Animal a1=new Animal();
        Dog d1=new Dog();
        Lion l1=new Lion();
        Animal c1=new Dog();
        a1.sound();
        d1.sound();
        c1.sound();
        l1.sound();
        
    }
}
