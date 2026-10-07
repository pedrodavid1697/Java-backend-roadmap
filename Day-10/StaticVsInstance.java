class Employee5{
    private String name;
    private int age;
    private double salary;

    // static field: One copy shared by all objects
    static int employeeCount =0;

    Employee5(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        employeeCount++; //every new object adds 1 to the shared counter
    }
    //static method belongs to the class
     static void showCount() {
         System.out.println("Total employees: "+employeeCount);
    }

    void displayDetails() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }

}

public class StaticVsInstance {
    public static void main(String[] args) {

        Employee5.showCount();

        Employee5 employee1 = new Employee5("David", 29, 45000);
        Employee5 employee2 = new Employee5("Alex", 25, 30000);
        Employee5 employee3 = new Employee5("Sara", 31, 52000);
        Employee5 employee4 = new Employee5("Ravi", 28, 40000);

        Employee5.showCount();
    }
}
