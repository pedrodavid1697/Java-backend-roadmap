public class CountSpecialCharacters {

    public static int countSpecialCharacters(String text) {
        int count =0;
        for(int i=0; i<text.length(); i++) {
            if (!Character.isLetter(text.charAt(i))
                    && ! Character.isDigit(text.charAt(i))
                    && text.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String text = "Java@123#Backend!";
        System.out.println("Special Characters: "+countSpecialCharacters(text));
    }
}
