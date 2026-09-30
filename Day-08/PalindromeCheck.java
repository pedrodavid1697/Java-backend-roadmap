public class PalindromeCheck {

    public static boolean isPalindrome(String text) {
        String reversed = "";
        for (int i=text.length()-1; i>=0; i--) {
            reversed+= text.charAt(i);
        }
        return reversed.equals(text);
    }

    public static void main(String[] args) {

        String text = "madam";
        System.out.println("Original: "+text);
        System.out.println("Palindrome: "+ isPalindrome(text));
    }
}
