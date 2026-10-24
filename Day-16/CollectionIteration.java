import java.util.ArrayList;
import java.util.Iterator;

public class CollectionIteration {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        Iterator<Integer> iterator = numbers.iterator();
        int sum=0;
        int count =0;
        System.out.println("Elements: ");
        //Enhanced for loop
        for(int number:numbers){
            System.out.println(number);
            sum+=number;
            if(number>25){
                count++;
            }
        }
        System.out.println("Sum: "+sum);
        System.out.println("Numbers greater than 25: "+count);
        System.out.println("\nIterator Output: ");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
