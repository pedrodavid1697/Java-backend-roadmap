class AreaCalculator {
    double calculateArea(double s) {
        return s*s;
    }
    double calculateArea(double l, double w) {
        return l*w;
    }
    double calculateArea(int r) {
        return Math.PI*r*r;
    }
}

public class OverloadedAreaCalculator {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        System.out.println("Area of square: "+calc.calculateArea(5.0));
        System.out.println("Area of rectangle: "+calc.calculateArea(5.0,7.0));
        System.out.println("Area of circle: "+calc.calculateArea(4));
    }
}
