import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        String[] words = {"java", "spring", "java", "sql", "spring", "java"};
        HashMap<String, Integer> frequency = new HashMap<>();

        for(String word : words){
            frequency.put(word, frequency.getOrDefault(word,0) +1);
        }

        for(String word : frequency.keySet()) {
            System.out.println(word + ": "+frequency.get(word));
        }
        System.out.println("Frequency of java: "+ frequency.get("java"));
    }
}
