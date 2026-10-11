class Vehicle {
    void start() {
        System.out.println("Vehicle is Starting");
    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is Driving");
    }
}


public class ParentChildMethods {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();
    }
}
