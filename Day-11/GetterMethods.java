class Student2 {
    private String name;
    private int rollNumber;
    private double marks;

    public Student2(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public double getMarks() {
        return marks;
    }

}

public class GetterMethods {
    public static void main(String[] args) {

        Student2 student = new Student2("Rahul", 2, 492);
        System.out.println("Name: "+student.getName());
        System.out.println("RollNumber: "+student.getRollNumber());
        System.out.println("Marks: "+student.getMarks());

    }
}
