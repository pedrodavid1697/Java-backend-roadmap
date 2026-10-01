public class CountVowels {

    public static int countVowels(String text) {
        int count =0;
        String lowerText= text.toLowerCase();
        for(int i=0; i<lowerText.length(); i++) {
            if (lowerText.charAt(i) == 'a' ||
                lowerText.charAt(i) == 'e' ||
                lowerText.charAt(i) == 'i' ||
                lowerText.charAt(i) == 'o' ||
                lowerText.charAt(i) == 'u' ) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String text = "Java Backend Development";
        int count = countVowels(text);
        System.out.println("Vowels: "+count);
    }
}
