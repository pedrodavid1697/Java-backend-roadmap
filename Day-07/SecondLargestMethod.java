public class SecondLargestMethod {

    public static int findSecondLargest(int[] numbers) {
        int largest = numbers[0];
        int secondLargest = numbers[0];
        for(int i=1; i<numbers.length; i++) {
            if (numbers[i]>largest) {
                largest = numbers[i];
            }
        }
        for(int i=1; i<numbers.length; i++) {
            if (numbers[i]<largest && numbers[i]>secondLargest) {
                secondLargest = numbers[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {

        int[] numbers = {25, 10, 75, 40, 60};
        System.out.println("Second Largest Number: "+findSecondLargest(numbers));
    }
}
