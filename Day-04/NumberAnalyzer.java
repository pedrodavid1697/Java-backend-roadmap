public class NumberAnalyzer {
    public static void main(String[] args) {

//        <------- Mini Challenge ----->

        int total =0;

        for (int i = 1; i <= 20; i++ ) {
            if ( i % 2 ==0) {
                System.out.println("Even : "+ i );
            }
            else {
                System.out.println("Odd : "+ i);
            }
            total += i;
        }
        System.out.println("Total : " + total);


    }
}
