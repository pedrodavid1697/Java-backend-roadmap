public class SearchMethod {

    public static boolean searchNumber(int[] numbers, int target) {
        boolean found = false;
        for (int i=0; i<numbers.length; i++) {
            if (target == numbers[i]) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 25, 30, 45, 50};
        int target = 30;
        boolean foundTarget = searchNumber(numbers, target);
        if (foundTarget){
            System.out.println("Number found");
        }
        else {
            System.out.println("Number not found");
        }

    }
}
