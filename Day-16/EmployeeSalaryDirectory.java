import java.util.HashMap;
import java.util.Map;

public class EmployeeSalaryDirectory {
    public static void main(String[] args) {
        HashMap<Integer, Double> salary = new HashMap<>();
        salary.put(101, 35000.0);
        salary.put(102, 45000.0);
        salary.put(103, 55000.0);
        salary.put(104, 30000.0);

        double total =0;
        System.out.println("Employees earning above 40000:");
        for(Map.Entry<Integer, Double> entry : salary.entrySet()){
            Integer key = entry.getKey();
            Double value = entry.getValue();
            total+=value;
            if (value>40000) {
                System.out.println(key+": "+value);
            }
        }

        System.out.println("Total salary expense: "+ total);
        System.out.println("Average salary : "+total/salary.size());
        salary.put(104, 32000.0);
        salary.remove(101);
        System.out.println("Final employee count: "+salary.size());
    }
}
