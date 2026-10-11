class Animal2 {
    void sound(){
    }
}
class Dog2 extends Animal2 {
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal2 {
    void sound(){
        System.out.println("Cat meows");
    }
}

public class DifferentChildBehave {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();
    }
}
