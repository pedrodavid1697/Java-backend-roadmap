class Employee15 {
    String name;
    double salary;
    Employee15(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    double calculateBonus(){
        return salary*0.05;
    }
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
class Developer2 extends Employee15 {
    Developer2(String name, double salary){
        super(name, salary);
    }
    @Override
    double calculateBonus(){
        return salary*0.10;
    }
}
class Manager2 extends Employee15 {
    Manager2(String name, double salary) {
        super(name, salary);
    }
    @Override
    double calculateBonus(){
        return salary*0.15;
    }
}

public class EmpBonusPolymorphism {
    public static void main(String[] args) {
        Employee15 emp1 = new Developer2("David", 50000);
        Employee15 emp2 = new Manager2("Alex", 70000);
        emp1.displayDetails();
        System.out.println("Bonus: "+ emp1.calculateBonus());
        emp2.displayDetails();
        System.out.println("Bonus: "+emp2.calculateBonus());
    }
}
