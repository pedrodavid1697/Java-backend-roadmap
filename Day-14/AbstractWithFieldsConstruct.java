abstract class Employee16 {
    String name;
    double salary;
    Employee16(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    abstract void calculateBonus();
}
class Developer3 extends Employee16 {
    Developer3(String name, double salary) {
        super(name, salary);
    }
    @Override
    void calculateBonus(){
        System.out.println("Bonus: "+salary*0.10);
    }
    void display() {
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}

public class AbstractWithFieldsConstruct {
    public static void main(String[] args) {
        Developer3 developer = new Developer3("David", 50000);
        developer.display();
        developer.calculateBonus();

    }
}
