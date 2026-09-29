public class FindLargestMethod {

    public static int findLargest(int[] numbers) {
        int largest = numbers[0];
        for (int i=1; i<numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        int[] numbers = {25, 10, 75, 40 , 60};
        int largestNumber = findLargest(numbers);
        System.out.println("Largest: "+largestNumber);

    }
}
