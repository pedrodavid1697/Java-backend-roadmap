import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CollectionSorting {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(23);
        numbers.add(12);
        numbers.add(5);
        Collections.sort(numbers);
        System.out.println("Ascending: "+numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending: "+numbers);

        List<String> names = new ArrayList<>();
        names.add("Amit");
        names.add("David");
        names.add("Priya");
        names.add("Rahul");
        Collections.sort(names);
        System.out.println("Names: "+names);

    }
}
