class Employee2{
    String name;
    int age;
    double salary;

    // No-arg Constructor
    Employee2(){
        name = "unknown";
        age = 0;
        salary =0;
    }
    // 2-Parm constructor
    Employee2(String name, int age) {
        this.name = name;
        this.age= age;
        this.salary = 10000;
    }

    //3-Parm Constructor
    Employee2(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Employee2 employee2 = new Employee2();
        Employee2 employee3 = new Employee2("Alex", 25);
        Employee2 employee4 = new Employee2("David", 29, 45000);

        employee2.displayDetails();
        employee3.displayDetails();
        employee4.displayDetails();
    }
}
