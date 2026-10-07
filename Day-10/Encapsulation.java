class Employee4{
    private String name;
    private int age;
    private double salary;

    Employee4(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
//        setName(name);
//        setAge(age);
//        setSalary(salary);
    }
    //Getters
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getSalary(){
        return this.salary;
    }
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if(age >=18 && age <=65) {
            this.age =age;
        }
        else{
            System.out.println("Age must be between 18 and 65");
        }
    }
    public void setSalary(double salary) {
        if(salary<0 ){
            System.out.println("Salary can't be negative");
        }
        else {
            this.salary = salary;
        }
    }
    public void displayDetails() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee4 employee1 = new Employee4("David", 29, 45000);
//        Employee4 employee1 = new Employee4("Eve", 500, -10);

        employee1.setSalary(-100);
        employee1.setAge(70);
        employee1.setSalary(50000);

        System.out.println(employee1.getSalary());
        System.out.println(employee1.getAge());
    }
}
