public class RemoveSpaces {

    public static String removeSpaces(String text) {
        String result ="";
        for(int i=0; i<text.length(); i++) {
            if(text.charAt(i) != ' ') {
                result = result + text.charAt(i);
            }
        }
        return result;

    }

    public static void main(String[] args) {

        String text = "Java Backend Development";

        String result = removeSpaces(text);
        System.out.println("Original: "+ text);
        System.out.println("Without spaces: "+ result);

    }
}
