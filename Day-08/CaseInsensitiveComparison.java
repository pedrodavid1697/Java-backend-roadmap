public class CaseInsensitiveComparison {
    public static void main(String[] args) {

        String username = "david";

        if (username.equalsIgnoreCase("David")) {
            System.out.println("Username matched");
        }
        else {
            System.out.println("Username not matched");
        }
    }
}
