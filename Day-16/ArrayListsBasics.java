import java.util.ArrayList;

public class ArrayListsBasics {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C#");
        languages.add("JavaScript");
        System.out.println(languages);
        System.out.println(languages.get(1));
        languages.set(1,"Spring Boot");
        languages.remove("C#");
        System.out.println(languages);
        System.out.println("Java exists: "+languages.contains("Java"));
        System.out.println("Total languages: "+languages.size());

    }
}
