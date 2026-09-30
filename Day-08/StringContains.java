public class StringContains {
    public static void main(String[] args) {

        String email = "david@gmail.com";
        boolean valid = email.contains("@");

        if (valid) {
            System.out.println("Email is valid");
        }
        else {
            System.out.println("Email is invalid");
        }
    }
}
