import java.util.HashMap;
import java.util.Map;

public class StudentMarksManager {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Rahul", 85);
        marks.put("Priya", 92);
        marks.put("Amit", 67);
        marks.put("Neha", 78);

        System.out.println("Student Marks: ");
        int total =0;

        String highestScorer = "";
        int highestMarks = Integer.MIN_VALUE;

        for(Map.Entry<String, Integer> entry : marks.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();

            System.out.println(name+ ": "+score);
            total+= score;

            if(score > highestMarks) {
                highestMarks = score;
                highestScorer = name;
            }
        }

        double avg = total/(double)marks.size();
        System.out.println("Average marks: "+avg);
        System.out.println("Highest scorer: "+highestScorer);

        marks.put("Amit", 72);
        System.out.println("David exists: "+marks.containsKey("David"));
        System.out.println("Amit's updated marks: "+marks.get("Amit"));
    }
}
