class Employee14 {
    private String name;
    private double salary;
    Employee14(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    double calculateBonus(){
        return salary*0.05;
    }
    void displayDetails(){
        System.out.println("Name: "+getName());
        System.out.println("Salary: "+getSalary());
        System.out.println("Bonus: "+calculateBonus());
    }
}
class Developer1 extends Employee14 {
    private String programmingLanguage;
    Developer1(String name, double salary,
               String programmingLanguage){
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    double calculateBonus(){
        return getSalary()*0.10;
    }
    void displayDetails(){
        System.out.println("Name: "+getName());
        System.out.println("Salary: "+getSalary());
        System.out.println("Language: "+programmingLanguage);
        System.out.println("Bonus: "+calculateBonus());
    }
}
class Manager1 extends Employee14 {
    private int teamSize;
    Manager1(String name, double salary,int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }
    @Override
    double calculateBonus(){
        return getSalary()*0.15;
    }
    void displayDetails(){
        System.out.println("Name: "+getName());
        System.out.println("Salary: "+getSalary());
        System.out.println("Team Size: "+teamSize);
        System.out.println("Bonus: "+calculateBonus());
    }
}

public class InheritanceFinal {
    public static void main(String[] args){
        Developer1 developer = new Developer1("David", 50000, "Java");
        Manager1 manager = new Manager1("Alex", 70000, 8);
        developer.displayDetails();
        System.out.println();
        manager.displayDetails();
    }
}
