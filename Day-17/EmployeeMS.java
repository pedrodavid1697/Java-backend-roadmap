class Department {
    private int departmentId;
    private String departmentName;
    private String location;

    public Department(int departmentId, String departmentName, String location ) {
        if (departmentId <= 0 ) {
            throw new IllegalArgumentException("Invalid Department Id");
        }
        if (departmentName == null || departmentName.trim().isEmpty()) {
            throw new IllegalArgumentException("Department name cannot be empty");
        }

        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.location = location;
    }

    public int getDepartmentId() {
        return departmentId;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public String getLocation() {
        return location;
    }

    public void displayDepartment() {
        System.out.println("Department Id : "+departmentId);
        System.out.println("Department Name : "+departmentName);
        System.out.println("Location : "+location);
    }
}

class Employee19 {
    private int employeeId;
    private String employeeName;
    private int age;
    private double salary;
    private Department department;

    public Employee19 (int employeeId, String employeeName, int age, double salary, Department department) {
        if (employeeId <= 0) {
            throw new IllegalArgumentException("Invalid Employee Id");
        }
        if (employeeName == null || employeeName.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee Name cannot be empty");
        }
        if(age <18) {
            throw new IllegalArgumentException("Employee must be 18 years old");
        }
        if (salary <=0) {
            throw new IllegalArgumentException("Salary must be greater than 0");
        }
        if (department == null) {
            throw new IllegalArgumentException("Department cannot be null");
        }
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
    public Department getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        if (salary <=0) {
            throw new IllegalArgumentException("Salary must be greater than 0");
        }
        this.salary = salary;
    }

    public void updateEmployeeName(String newName) {
        if (newName == null || newName.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee cannot be null");
        }
        if(newName.isEmpty() ) {
            throw new IllegalArgumentException("Employee Name cannot be empty");
        }
        this.employeeName = newName;
    }

    public void increaseSalary(double percentage) {
        if (!Double.isFinite(percentage) || percentage <=0 ) {
            throw new IllegalArgumentException("Percentage must be greater than 0");
        }
        double increment = salary * percentage/100;
        setSalary(salary+increment);
    }

    public boolean isEligibleForPromotion() {

        return age>=25 && salary >=40000 ;
    }

    public void displayEmployee() {
        System.out.println("Employee Id : " + employeeId);
        System.out.println("Employee Name : "+employeeName);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);
        System.out.println("Department Name : "+department.getDepartmentName());
    }
}


public class EmployeeMS {
    public static void main(String[] args) {

        Department department = new Department (
                101, "Software Development", "Kolkata"
        );

        Employee19 employee = new Employee19(
                1001, "David", 29, 45000, department
        );

        Department department1 = new Department(
                1, "General", "Kolkata"
        );

        try {

            Employee19 employee1 = new Employee19(
                1002, "", 16, -5000, null
        );

        }catch (IllegalArgumentException e ) {
            System.out.println(e.getMessage());

        }

        Employee19 employee2 = new Employee19(
                1003, "Shrikant", 25, 50000, department1
        );

        System.out.println("=====Employee Details=====");
        employee.displayEmployee();
        System.out.println();
        System.out.println("=====Department Details=====");
        department.displayDepartment();
        System.out.println();
        System.out.println("=====Salary Update=====");
        employee.setSalary(55000);
        System.out.println("updated salary : "+employee.getSalary());
        System.out.println("<-===Updated salary for eligible employee===->");
        employee2.increaseSalary(10);
        employee2.displayEmployee();

    }
}
