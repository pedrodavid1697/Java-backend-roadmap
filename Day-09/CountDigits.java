public class CountDigits {

    public static int countDigits(String text) {
        int count =0;
        for(int i=0; i<text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String text = "Java123Backend45";
        System.out.println("Digits: "+countDigits(text));
    }
}
