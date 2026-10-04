public class AnagramCheck {

    public static boolean areAnagrams(String first, String second) {
        String firstLowerCase = first.toLowerCase();
        String secondLowerCase = second.toLowerCase();

        if (firstLowerCase.length() != secondLowerCase.length()) {
            return false;
        }

//        Outer loop = choose a character.
//        Inner loop = count that character.
//        Compare counts = decide whether it matches.
        for (int i = 0; i < firstLowerCase.length(); i++) {
            char firstAnagram = firstLowerCase.charAt(i);
            int countFirst = 0;
            int countSecond = 0;
            for (int j = 0; j < firstLowerCase.length(); j++) {
                if (firstAnagram == firstLowerCase.charAt(j)) {
                    countFirst++;
                }
            }
                for (int j = 0; j < secondLowerCase.length(); j++) {
                    if (firstAnagram == secondLowerCase.charAt(j)) {
                        countSecond++;
                    }
                }
                if(countFirst !=countSecond) {
                    return false;
                }
        }

        return true;
}

    public static void main(String[] args) {

        String first = "listen";
        String second = "silent";

        System.out.println("Are anagrams: "+areAnagrams(first, second));
    }
}
