public class EmployeeDemo {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "David";
        employee1.age = 29;
        employee1.salary = 45000;

        Employee employee2 = new Employee();
        employee2.name = "Alex";
        employee2.age = 32;
        employee2.salary = 60000;

        employee1.displayDetails();
        employee2.displayDetails();
    }
}
