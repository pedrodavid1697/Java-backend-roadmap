public class CountCharacter {

    public static int countCharacter(String text, char target) {
        int count =0;
        for(int i=0; i<text.length(); i++) {
            if (text.charAt(i)==target) { //checks for all index available in text using charAt(i)
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String text = "Java Backend";
        char target = 'a';

        int countTarget = countCharacter(text, target);
        System.out.println(target+" appears "+countTarget+" times");
    }
}
