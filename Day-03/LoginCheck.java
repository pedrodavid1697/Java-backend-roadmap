public class LoginCheck {
    public static void main(String[] args) {

/* //        ex:- Nested if

        int age = 25;
        boolean hasLicense = true;

        if (age >= 18) {

            if (hasLicense) {
                System.out.println("You can drive.");
            }
            else {
                System.out.println("You need License.");
            }
        }

        else {
            System.out.println("You are underage.");
        } */

//        <------ Mini Challenge ------>


        String username = "admin";
        String password = "java123";

        if (username.equals("admin") && password.equals("java123")) {
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Login Failed");
        }

    }
}
