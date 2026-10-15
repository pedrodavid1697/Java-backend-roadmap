abstract class Animal5 {
    abstract void sound();
}
class Dog5 extends Animal5 {
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

public class AbstractAnimal {
    public static void main(String[] args) {
        Dog5 dog = new Dog5();
        dog.sound();
    }
}
