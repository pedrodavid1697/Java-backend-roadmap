public class SearchArray {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 30, 45, 50};
        int target = 30;
        boolean found = false;

        for (int i=0; i<numbers.length; i++ ) {
            if (target == numbers[i]){
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Number found");
        }
        else {
            System.out.println("Number not found");
        }
    }
}
