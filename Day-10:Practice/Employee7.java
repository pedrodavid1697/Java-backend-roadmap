public class Employee7 {
    String name;
    double basicSalary;


    Employee7(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateAnnualSalary(){
        return 12 *(basicSalary);
    }

    public double calculateBonus(){
        if(basicSalary >=50000) {
            return basicSalary * 0.10;
        }
        else if(basicSalary >= 30000){
            return basicSalary * 0.07;
        }
        else {
            return basicSalary * 0.05;
        }
    }

    void displaySalary(){
        System.out.println("Name: "+name);
        System.out.println("Monthly Salary: "+basicSalary);
        System.out.println("Annual Salary: "+calculateAnnualSalary());
        System.out.println("Bonus: "+calculateBonus());
    }


    public static void main(String[] args) {
        Employee7 employee = new Employee7("David", 45000);
        employee.displaySalary();
    }
}
