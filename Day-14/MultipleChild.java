abstract class Animal6 {
    abstract void sound();
}
class Dog6 extends Animal6 {
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat4 extends Animal6 {
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}
class Cow extends Animal6 {
    @Override
    void sound(){
        System.out.println("Cow moos");
    }
}

public class MultipleChild {
    public static void main(String[] args) {
        Dog6 dog = new Dog6();
        Cat4 cat = new Cat4();
        Cow cow = new Cow();
        dog.sound();
        cat.sound();
        cow.sound();

    }
}
