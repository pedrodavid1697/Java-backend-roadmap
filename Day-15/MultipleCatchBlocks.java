public class MultipleCatchBlocks {
    public static void main(String [] args) {
        int[] arr = {10, 20, 30};
        try {
            int array = arr[5];
            int result = arr[5]/0;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index");
        }
        catch (ArithmeticException e) {
            System.out.println("cannot divide by zero");
        }
    }
}
