class Employee11{
    private String name;
    private int age;
    private double basicSalary;

    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    double getBasicSalary(){
        return basicSalary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age >= 0 && age <=120 ){
            this.age = age;
        }
        else {
            System.out.println("Invalid Age: "+age);
        }
    }
    public void setBasicSalary(double basicSalary){
        if(basicSalary>=0){
            this.basicSalary = basicSalary;
        }
    }

    double annualSalary(){

        return basicSalary*12;
    }
    double calculateBonus(){
        double bonus;
        if(basicSalary>= 50000){
            bonus = basicSalary*0.10;
        }
        else if(basicSalary>=30000){
            bonus = basicSalary*0.07;
        }
        else{
            bonus = basicSalary*0.05;
        }
        return bonus;
    }

    void displayDetails(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Basic Salary: "+getBasicSalary());
        System.out.println("Annual Salary: "+annualSalary());
        System.out.println("Bonus: "+calculateBonus());
    }
}

public class EmployeeChallenge {
    public static void main(String[] args) {
        Employee11 emp = new Employee11();
        emp.setName("David");
        emp.setAge(29);
        emp.setBasicSalary(41500);
        emp.displayDetails();
    }
}
