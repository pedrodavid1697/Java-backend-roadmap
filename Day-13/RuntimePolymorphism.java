class Animal3 {
    void sound(){
        System.out.println("Makes sound");
    }
}
class Dog3 extends Animal3 {
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat2 extends Animal3 {
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal3 animal1 = new Dog3();
        Animal3 animal2 = new Cat2();
        animal1.sound();
        animal2.sound();
    }
}
