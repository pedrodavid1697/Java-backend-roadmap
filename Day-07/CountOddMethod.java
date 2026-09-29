public class CountOddMethod {

    public static int countOdd(int[] numbers) {

        int countOdd =0;
        for ( int i=0; i<numbers.length; i++ ) {
            if (numbers[i]%2!= 0) {
                countOdd++;
            }
        }
        return countOdd;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 15, 22, 31, 40, 55, 68, 73};

        int count = countOdd(numbers);
        System.out.println("Odd numbers: "+ count);
    }
}
