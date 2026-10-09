class Employee10{
    private double salary;

    double getSalary(){
        return salary;
    }
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
        else {
            System.out.println("Salary is negative: "+salary);
        }
    }

}


public class SalaryValidation {
    public static void main(String[] args) {

        Employee10 emp = new Employee10();
        emp.setSalary(50000);
        System.out.println("Salary: "+emp.getSalary());
        emp.setSalary(-500);
//        System.out.println("Salary: "+emp.getSalary());

    }
}
