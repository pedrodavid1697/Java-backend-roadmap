class Calculator2 {
    int add(int a, int b) {
        return a+b;
    }
    int add(int a, int b, int c) {
        return a+b+c;
    }
    double add(double a, double b) {
        return a+b;
    }
}

public class BasicMethodOverloading {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
        System.out.println("Sum: "+calc.add(8,7));
        System.out.println("Sum: "+calc.add(8,7, 10));
        System.out.println("Sum: "+calc.add(4, 3.5));
    }
}
