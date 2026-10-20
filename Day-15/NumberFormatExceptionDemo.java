public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        String str = "123abc";

        try {
            Integer.parseInt(str);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}

