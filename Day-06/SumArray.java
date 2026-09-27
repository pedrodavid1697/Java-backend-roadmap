public class SumArray {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int total =0; //Accumulator pattern

        for (int i=0; i<numbers.length; i++) {
            total += numbers[i]; //part of accumulator pattern
        }
        System.out.println(total);
    }
}
