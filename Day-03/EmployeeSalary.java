public class EmployeeSalary {
    public static void main(String[] args) {

        double salary = 45000;
        int experience = 4;

        if (experience >=5 && salary >= 50000) {
            System.out.println("Eligible for Senior Bonus");
        }
        else if (experience >=3) {
            System.out.println("Eligible for Standard Bonus");
        }
        else {
            System.out.println("Not Eligible for Bonus");
        }
    }
}
