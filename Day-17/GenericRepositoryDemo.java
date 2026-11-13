import java.util.HashMap;
import java.util.Map;

interface Repository<T, ID> {
    void save(T entity);
    T findById(ID id) ;
}

class Employee18 {
    int id;
    String name;

    public Employee18(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void display() {
        System.out.println("Employee ID : "+ id) ;
        System.out.println("Employee Name : "+ name);
    }

}

class EmployeeRepository implements Repository<Employee18, Integer> {
    private Map<Integer, Employee18> employees = new HashMap<>();

    @Override
    public void save(Employee18 employee) {
        employees.put(employee.id, employee);
        System.out.println("Employee saved successfully");
    }

    @Override
    public Employee18 findById(Integer id) {
        return employees.get(id);
    }
}


public class GenericRepositoryDemo {
    public static void main(String[] args) {

        EmployeeRepository repository = new EmployeeRepository();

        Employee18 emp = new Employee18(101, "Rahul");

        repository.save(emp);

        Employee18 retrievedEmployee = repository.findById(101);

        if(retrievedEmployee != null) {
            System.out.println("\nEmployee retrieved successfully:");
            retrievedEmployee.display();
        }
        else {
            System.out.println("Employee not found!");
        }

    }
}
