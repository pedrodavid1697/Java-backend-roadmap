class Animal1 {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog1 extends Animal1 {
    @Override // Same method name + same parameters, but child provides its own implementation using override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        dog.sound();
    }
}
