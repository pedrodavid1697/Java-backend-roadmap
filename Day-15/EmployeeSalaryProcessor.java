class Employee17 {
    String name;
    double salary;

    public Employee17(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class InvalidSalaryException1 extends Exception {
    public InvalidSalaryException1(String message){
        super(message);
    }
}

public class EmployeeSalaryProcessor {
    static void processSalary(Employee17 employee)
            throws InvalidSalaryException1 {
        if (employee.salary <=0) {
            throw new InvalidSalaryException1(
                    "Invalid salary for "+employee.name
            );
        }
        else {
            double bonus = employee.salary*0.10;

            System.out.println("Employee: "+employee.name);
            System.out.println("Salary: "+employee.salary);
            System.out.println("Bonus: "+bonus);
        }
    }

    public static void main(String[] args) {
        Employee17 e1 = new Employee17("Rahul", 40000);
        Employee17 e2 = new Employee17("Priya", 55000);
        Employee17 e3 = new Employee17("Amit", -1000);

        Employee17[] employees = {e1, e2, e3};
        for (int i =0; i <employees.length; i++) {
            try {
                processSalary(employees[i]);
            }
            catch (InvalidSalaryException1 e){
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println(
                        "Salary processing attempt completed"
                );
            }
            System.out.println();
        }

    }
}
