public class SecondLargest {
    public static void main(String[] args) {

        int[] numbers= {25, 10, 75, 40, 60};
        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i =1; i<numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] < largest && numbers[i] > secondLargest) {
                secondLargest = numbers[i];
            }
        }
        System.out.println("Second largest: "+secondLargest);
    }
}
