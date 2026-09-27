public class FindLargest {
    public static void main(String[] args) {

        int[] numbers = {25, 10, 75, 40, 60};
        int largest = numbers[0];

        for (int i =1; i<numbers.length; i++) { // Have already initialized 0 element value on largest variable.
            if (numbers[i] > largest ) {
                largest = numbers[i];
            }
        }
        System.out.println(largest);
    }
}