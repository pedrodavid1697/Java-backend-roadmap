public class ArrayAnalyzer {

    public static int findLargest(int[] numbers) {
        int largest = numbers[0];
        for(int i=1; i<numbers.length; i++){
            if(numbers[i]>largest) {
                largest=numbers[i];
            }
        }
        return largest;
    }

    public static int findSmallest(int[] numbers) {
        int smallest = numbers[0];
        for(int i=1; i<numbers.length; i++) {
            if (numbers[i]<smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static int countEven(int[] numbers) {
        int count =0;
        for(int i=0; i<numbers.length; i++) {
            if (numbers[i]%2 ==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 25, 30, 15, 40, 55, 20};
        int largestNumber = findLargest(numbers);
        int smallestNumber = findSmallest(numbers);
        int evenNumber = countEven(numbers);

        System.out.println("Largest: "+largestNumber);
        System.out.println("Smallest: "+smallestNumber);
        System.out.println("Even numbers: "+evenNumber);

    }
}
