public class BoundedGenericMethod {

    public static <T extends Number> double convertToDouble(T value) {
        return value.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(convertToDouble(new Integer(3)));
        System.out.println(convertToDouble(new Double(453.2)));
        System.out.println(convertToDouble(new Long(38673L)));

//        System.out.println(convertToDouble("Rohit"));
    }
}
