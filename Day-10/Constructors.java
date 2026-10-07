
class Employee1{
    String name;
    int age;
    double salary;

    //Constructor
    Employee1(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("Name: "+name +"\n"+ "Age: "+age+"\n"+"Salary: "+salary);
    }
}

public class Constructors{
    public static void main(String[] args) {

        Employee1 employee1 = new Employee1("David", 29, 45000);

        employee1.displayDetails();
    }
}
