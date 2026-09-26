// Method with if-else(Condition)

public class CheckEvenOdd {

    public static void checkNumber(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {

        checkNumber(25);
    }
}
