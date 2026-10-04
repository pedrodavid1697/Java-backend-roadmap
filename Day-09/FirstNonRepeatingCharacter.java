public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingCharacter(String text) {
        for(int i=0; i<text.length(); i++) {
            char nonRepeat =  text.charAt(i);
            if(text.indexOf(nonRepeat) == text.lastIndexOf(nonRepeat)) {
                return nonRepeat;
            }
        }
        return '\0'; //special -> no character found
    }

    public static void main(String[] args) {

        String text = "aabbcde";
        System.out.println("First non-repeating character: "+findFirstNonRepeatingCharacter(text));
    }
}
