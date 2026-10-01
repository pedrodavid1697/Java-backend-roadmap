public class CountWords {

    public static int countWords(String text) {
        int count =0;
        for ( int i=0; i<text.length(); i++) {
            if (text.charAt(i)==' ') {
                count++;
            }
        }
        return count +1;
    }

    public static void main(String[] args) {

        String text = "Java Backend development";
        int wordCount = countWords(text);
        System.out.println("Number of words: "+ wordCount);
    }
}
