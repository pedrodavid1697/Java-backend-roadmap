public class FindSmallestMethod {

    public static int findSmallest(int[] numbers) {
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {

        int[] numbers = {25, 10, 75, 40, 60};

        int smallestNumber = findSmallest(numbers);
        System.out.println("Smallest: " + smallestNumber);
    }
}
