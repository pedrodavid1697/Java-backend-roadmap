public class AverageMethod {

    public static double calculateAverage(int[] numbers) {
        double sum =0;
        for (int i=0; i<numbers.length; i++ ){
            sum += numbers[i];
        }
        double average = sum/numbers.length;
        return average;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        double averageNumber = calculateAverage(numbers);
        System.out.println("Average: "+averageNumber);
    }
}
