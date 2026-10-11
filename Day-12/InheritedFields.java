class Person1 {
    String name;
    int age;

    void displayPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Student4 extends Person1 {
    int rollNumber;

    void displayStudent(){
        System.out.println("Roll Number: "+rollNumber);
    }
}

public class InheritedFields {
    public static void main(String[] args) {
        Student4 student = new Student4();
        student.name = "Pritam";
        student.age = 25;
        student.rollNumber = 2;
        student.displayPerson();
        student.displayStudent();
    }
}
