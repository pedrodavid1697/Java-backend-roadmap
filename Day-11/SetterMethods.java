class Student3 {
    private String name;
    private int rollNumber;
    private double marks;

    public void setName(String name) {
        this.name = name;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Name: "+name);
        System.out.println("RollNumber: "+rollNumber);
        System.out.println("Marks: "+marks);
    }
}


public class SetterMethods {
    public static void main(String[] args) {
        Student3 student = new Student3();
        student.setName("Alex");
        student.setRollNumber(10);
        student.setMarks(432);
        student.displayDetails();
    }
}
