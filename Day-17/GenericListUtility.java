import java.util.ArrayList;
import java.util.List;

public class GenericListUtility {

    public static <T> void printList(List<T> list) {
        for ( T element : list ) {
            System.out.println(element);
        }
    }
    public static <T> T getFirstElement(List<T> list) {
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    public static void main(String[] args) {

        //String List
        List<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Johnny");
        names.add("Amit");

        //Integer list
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("String List : ");
        printList(names);

        System.out.println("First Names : "+ getFirstElement(names));

        System.out.println("Integer List : ");
        printList(numbers);

        System.out.println("First Number : "+ getFirstElement(numbers));

        //Testing empty list
        List<String> emptyList = new ArrayList<>();
        System.out.println("First Element of Empty List : "+ getFirstElement(emptyList));


    }
}
