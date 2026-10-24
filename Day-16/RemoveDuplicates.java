import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(10);
        System.out.println("Original list: "+list);
        HashSet<Integer> set = new HashSet<>(list);
        System.out.println("Unique values: "+set);
        System.out.println("Unique count: "+set.size());
        System.out.println("Contains 30: "+set.contains(30));
    }
}
