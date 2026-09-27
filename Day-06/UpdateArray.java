public class UpdateArray {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        numbers[2] = 100; //Arrays are mutable hence existing element can be updated.

        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
