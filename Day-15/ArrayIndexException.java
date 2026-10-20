public class ArrayIndexException {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        try {
            int index = arr[7];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index");
        }
    }
}
