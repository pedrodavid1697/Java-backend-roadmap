public class GenericMaximum {

    public static <T extends Comparable<T>> T findMaximum(T a, T b) {
        if (a.compareTo(b) > 0) {
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {
        // Testing with Integer
        System.out.println("Maximum Integer: "+ findMaximum(25, 98));

        // Testing with String
        System.out.println("Maximum String: "+ findMaximum("Java", "Python"));
    }
}
