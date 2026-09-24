public class DrivingEligibility {
    public static void main(String[] args) {


//        <------ Using Multiple Conditions ------>
        int age = 25;
        boolean hasLicense = true;

        if (age >=18 && hasLicense) {
            System.out.println("Eligible to drive. ");
        }
        else {
            System.out.println("Not eligible to drive. ");
        }
    }
}
