public class CountGreaterThan {

    public static int countGreaterThan(int[] numbers, int target) {
        int count =0;
        for(int i=0; i<numbers.length; i++) {
            if (numbers[i]>target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 25, 30, 45, 50, 15, 60};
        int target = 30;
        int countNumber = countGreaterThan(numbers, target);
        System.out.println("Numbers Greater than "+ target+ ": "+countNumber);
    }
}
