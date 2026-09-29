public class CountEvenMethod {

    public static int countEven(int[] numbers) {

        int evenCount =0;
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] % 2 ==0) {
                evenCount++;
            }
        }
        return evenCount;
    }
    public static void main(String[] args) {

        int[] numbers = {10, 15, 22, 31, 40, 55, 68, 73};

        int count = countEven(numbers);
        System.out.println("Even numbers: "+ count);
    }
}
