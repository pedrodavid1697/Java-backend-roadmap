class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message){
        super(message);
    }
}

public class CustomException {
    public static void validateSalary(double salary) throws InvalidSalaryException  {
        if (salary <= 0 ){
            throw new InvalidSalaryException("Salary must be greater than 0");
        }
        System.out.println("Salary is valid");
    }


    public static void main(String[] args) {
        double salary = -50000;
        try {
            validateSalary(salary);
        }
        catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }

        salary = 35000;
        try {
            validateSalary(salary);
        }
        catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}
