class Animal4 {
    void sound(){
        System.out.println("Makes sound");
    }
}
class Dog4 extends Animal4 {
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat3 extends Animal4 {
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}

public class OneReferenceMultipleObjects {
    public static void main(String[] args) {
        Animal4 animal;
        animal = new Dog4();
        animal.sound();
        animal = new Cat3();
        animal.sound();
    }
}
