class Person2{
    String name;
    int age;
    Person2(){
    }
}
class Student5 extends Person2{
    int rollNumber;
    Student5(String name, int age, int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Roll Number: "+rollNumber);
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        Student5 student = new Student5("Hemant", 15, 22);
        student.display();
    }
}
