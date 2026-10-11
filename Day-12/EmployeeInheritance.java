class Employee12{
    String name;
    double salary;

    void displayEmployeeDetails(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
class Developer extends Employee12{
    String programmingLanguage;
    void displayDeveloperDetails() {
        System.out.println("Programming Language: "+programmingLanguage);
    }
}

public class EmployeeInheritance {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.name = "Shrikant";
        developer.salary = 32000;
        developer.programmingLanguage = "Java";
        developer.displayEmployeeDetails();
        developer.displayDeveloperDetails();
    }
}
