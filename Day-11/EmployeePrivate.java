class Employee8{
    private String name;
    private int age;
    private double salary;

    Employee8(String employeeName, int employeeAge, double employeeSalary) {
        name = employeeName;
        age = employeeAge;
        salary = employeeSalary;
    }
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
}

public class EmployeePrivate {
    public static void main(String[] args) {
        Employee8 emp = new Employee8("David", 30, 49000);
        emp.displayDetails();
    }
}
