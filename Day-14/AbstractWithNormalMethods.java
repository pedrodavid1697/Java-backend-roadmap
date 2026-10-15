abstract class Vehicle1 {
    abstract void start();
    void stop(){
        System.out.println("Vehicle stopped");
    }
}
class Car1 extends Vehicle1 {
    @Override
    void start(){
        System.out.println("Car starts with a key");
    }
}
class Bike extends Vehicle1 {
    @Override
    void start() {
        System.out.println("Bike start with a button");
    }
}

public class AbstractWithNormalMethods {
    public static void main(String[] args) {
        Car1 car = new Car1();
        Bike bike = new Bike();
        car.start();
        car.stop();
        bike.start();
        bike.stop();

    }
}
