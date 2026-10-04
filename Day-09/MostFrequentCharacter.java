public class MostFrequentCharacter {

    public static char findMostFrequentCharacter(String text) {
        if(text.isEmpty() ){
            return '\0';
        }
        char mostFrequent = text.charAt(0);
        int maxCount =0;

        for(int i=0; i<text.length(); i++) {
            char current = text.charAt(i);
            int currentCount=0;
            for(int j=0; j<text.length(); j++) {
                if(current==text.charAt(j)){
                    currentCount++;
                }
            }
            if(currentCount>maxCount) {
                maxCount = currentCount;
                mostFrequent = current;
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {

        String text = "Programming";
//        String text = "banana";
//        String text = "hello";
//        String text = "abc";
        System.out.println("Most frequent character: "+findMostFrequentCharacter(text));
    }
}
