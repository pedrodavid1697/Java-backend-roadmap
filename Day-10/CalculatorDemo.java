class Calculator1 {
    public int add(int a, int b){
        return a+b;
    }
    public int subtraction(int a, int b) {
        return a-b;
    }
    public int multiply(int a, int b) {
        return a*b;
    }
}

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator1 calculator = new Calculator1();
        System.out.println("Addition: " + calculator.add(20,5));
        System.out.println("Subtraction: " + calculator.subtraction(20,5));
        System.out.println("Multiplication: " + calculator.multiply(20,5));
    }
}
