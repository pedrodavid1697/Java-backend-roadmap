public class Student1 {
    String name;
    int rollNumber;
    double marks;

    Student1(String name, int rollNumber, double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks= marks;
    }
    void displayDetails() {
        System.out.println("Name: "+name);
        System.out.println("Rollnumber: "+rollNumber);
        System.out.println("Marks: "+marks);
    }

    public static void main(String[] args) {
        Student1 student = new Student1("Rahul", 1, 487);
        Student1 student1 = new Student1("Priya", 2, 452);
        Student1 student2 = new Student1("Amit", 3, 421);

        student.displayDetails();
        System.out.println("\n");
        student1.displayDetails();
        System.out.println("\n");
        student2.displayDetails();
    }
}
