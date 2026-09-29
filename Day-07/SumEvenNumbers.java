public class SumEvenNumbers {

    public static int sumEvenNumbers(int[] numbers) {
        int sum =0;
        for(int i=0; i<numbers.length; i++) {
            if (numbers[i] %2 ==0) {
                sum+=numbers[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 15, 22, 31, 40, 55, 68, 73};

        int sumEven = sumEvenNumbers(numbers);
        System.out.println(sumEven);
    }
}
