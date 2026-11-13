public class GenericPrint {

    public static <T> void printValue(T value ) {
        System.out.println(value);
    }

    public static <T> void printArray(T[] array) {
        for (T value : array) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {

        printValue("Java");
        printValue(12);
        printValue(25.5);
        printValue(true);
        System.out.println("Array print starting:");
        printArray(new Integer[]{12,43,54,13,123});
        printArray(new String[]{"java", "Python", "C++"});
        printArray(new Double[]{12.3, 25.5, 67.2, 31.2, 19.1});

    }
}
