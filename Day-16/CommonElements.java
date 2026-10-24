import java.util.ArrayList;

public class CommonElements {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.add(70);

        ArrayList<Integer> common = new ArrayList<>();

        for(int first:list1){
            if(list2.contains(first)){
                common.add(first);
            }
        }

        System.out.println("Common Elements: "+common);
    }
}
