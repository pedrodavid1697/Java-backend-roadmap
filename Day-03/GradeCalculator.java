public class GradeCalculator {
    public static void main(String[] args) {


    /*    //          ex:- if - else if - else

        int marks = 85;

        if (marks >=90 ) {
            System.out.println("Grade A+ ");
        }
        else if (marks >=80 ) {
            System.out.println("Grade A ");
        }
        else if (marks >=70 ) {
            System.out.println("Grade B" );
        }
        else if (marks >=40 ) {
            System.out.println("Grade C ");
        }
        else {
            System.out.println("Fail");
        } */


//        3. <------ Grade Calculator ------->

        int marks =76;

        if (marks >= 90) {
            System.out.println("Grade : A+");
        }
        else if (marks >= 80) {
            System.out.println("Grade : A");
        }
        else if (marks >=70) {
            System.out.println("Grade : B");
        }
        else if (marks >=60) {
            System.out.println("Grade : C");
        }
        else if (marks >=40) {
            System.out.println("Grade : D");
        }
        else {
            System.out.println("Fail");
        }
    }
}
