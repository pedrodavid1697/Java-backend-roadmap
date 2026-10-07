public class Employee6{
    String name;
    int age;
    double salary;

    Employee6(String employeeName, int employeeAge, double employeeSalary){
        name = employeeName;
        age = employeeAge;
        salary = employeeSalary;
    }
    void displayDetails() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args) {
        Employee6 employee = new Employee6("David", 29, 45000);
        Employee6 employee1 = new Employee6("Alex", 32, 60000);

        employee.displayDetails();
        employee1.displayDetails();
    }
}
