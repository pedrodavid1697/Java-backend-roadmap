public class CountOccurrences {

    public static int countOccurrences(int[] numbers, int target) {
        int count =0;
        for (int i=0; i<numbers.length; i++) {
            if (target == numbers[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 10, 40, 20};
        int target = 10;

        int countTarget = countOccurrences(numbers, target);
        System.out.println("10 appears "+countTarget+" times");

    }
}
