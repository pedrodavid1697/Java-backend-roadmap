class Person3{
    String name;
    int age;
    Person3(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Student6 extends Person3 {
    int rollNumber;
    Student6(String name, int age, int rollNumber){
        super(name, age);
        this.rollNumber = rollNumber;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Roll Number: "+rollNumber);
    }
}

public class Super {
    public static void main(String[] args) {
        Student6 student = new Student6("Shyam", 15, 10);
        student.display();
    }
}
