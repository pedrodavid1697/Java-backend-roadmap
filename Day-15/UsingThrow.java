public class UsingThrow {
    static void checkAge(int age) {
        if (age<18){
            throw new IllegalArgumentException ("Age must 18  or above");
        }
        System.out.println("Eligible to vote");
    }
    public static void main(String[] args) {
        try {
            checkAge(16);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        checkAge(25);
    }
}
