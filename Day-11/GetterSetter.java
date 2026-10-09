class Employee9{
    private String name;
    private int age;
    private double salary;

    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary(){
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}


public class GetterSetter {
    public static void main(String[] args) {
        Employee9 emp = new Employee9();
        emp.setName("Rohit");
        emp.setAge(32);
        emp.setSalary(49000);
        System.out.println("Name: "+emp.getName());
        System.out.println("Age: "+emp.getAge());
        System.out.println("Salary: "+emp.getSalary());
    }
}
