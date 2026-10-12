class Shape {
        double calculateArea(){
        return 0;
    }
}
class RectangleShape extends Shape {
    double length;
    double width;
    RectangleShape(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double calculateArea(){
        return length*width;
    }
}
class CircleShape extends Shape {
    double r;
    CircleShape(double r) {
        this.r = r;
    }
    @Override
    double calculateArea() {
        return Math.PI*r*r;
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Shape[] shapes = {new RectangleShape(5,4), new CircleShape(3)};
        for (int i =0; i <shapes.length; i++) {
            System.out.println(shapes[i].calculateArea());
        }
    }
}
