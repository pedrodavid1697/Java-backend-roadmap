public class ReverseString {

    public static String reverseString(String text) {
        String reversed = "";
        for (int i = text.length()-1; i>=0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {

        String text = "Java";
        System.out.println("Original: "+text);
        System.out.println("Reversed: "+reverseString(text));

    }
}
