import java.util.HashMap;

public class EmployeeDirectory {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "Rahul");
        employees.put(102, "Priya");
        employees.put(103, "Amit");
        System.out.println("Employee 102: "+employees.get(102));
        System.out.println("Employee 104 exists: "+employees.containsKey(104));
        employees.put(103, "Amit Kumar");
        employees.put(104, "Neha");
        employees.remove(101);
        System.out.println("Final directory: "+employees);
        System.out.println("Employee count: "+employees.size());
    }
}
