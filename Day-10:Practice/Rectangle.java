public class Rectangle {
    double width;
    double length;

    Rectangle(double width, double length){
        this.width = width;
        this.length= length;
    }
    double calculateArea() {
        return width*length;
    }
    double calculatePerimeter() {
        return 2*(width+length);
    }
    void displayArea() {
        System.out.println("Area: "+calculateArea());
        System.out.println("Perimeter: "+calculatePerimeter());
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);

        rectangle.displayArea();
    }
}
