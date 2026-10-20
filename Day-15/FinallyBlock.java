public class FinallyBlock {
    public static void main(String[] args) {
        int a = 20;
        try {
            int result = a/0;
        }
        catch(ArithmeticException e) {
            System.out.println("cannot divide by zero");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }

}
