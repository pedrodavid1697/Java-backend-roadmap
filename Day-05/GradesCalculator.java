//Method with Condition and Returning String value

public class GradesCalculator {


    public static String calculateGrade(int marks) {
        if (marks >=90){
            return "A+";
        }
        else if (marks >=80) {
            return "A";
        }
        else if (marks >=70) {
            return "B";
        }
        else if (marks >=60) {
            return "C";
        }
        else if (marks >=40) {
            return "D";
        }
        else {
            return "Fail";
        }
    }

    public static void main(String[] args) {

        String grade = calculateGrade(76);
        System.out.println(grade);
    }
}
