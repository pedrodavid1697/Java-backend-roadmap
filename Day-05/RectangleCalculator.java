// Method with return double value

public class RectangleCalculator {
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {

        double result = calculateArea(10.5, 5.0);
        System.out.println(result);

    }
}
