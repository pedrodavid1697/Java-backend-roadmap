class Employee3 {
    String name;
    int age;
    double salary;

    Employee3(String name, int age, double salary) {
        System.out.println("3-parm Constructor");
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    Employee3(String name, int age) {
        this(name, age, 10000);
        System.out.println("2-parm Constructor");
    }
    Employee3(){
        this("unknown", 0, 0);
        System.out.println("0-parm Constructor");
    }
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
}


public class ConstructorChaining {
    public static void main(String[] args) {
        Employee3 employee1 = new Employee3("Alex", 25, 55000);
        Employee3 employee2= new Employee3("David", 29);
        Employee3 employee3= new Employee3();

        employee1.displayDetails();
        employee2.displayDetails();
        employee3.displayDetails();

    }
}
