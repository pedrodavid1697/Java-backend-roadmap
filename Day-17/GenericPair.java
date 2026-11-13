class Pair<K, V> {
    private K key;
    private V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

}
public class GenericPair {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(101, "Rahul");
        Pair<String, Double> p2 = new Pair<>("Johnny", 102.1);

        System.out.println("Employee ID : "+p1.getKey());
        System.out.println("Employee Name : "+p1.getValue());

        System.out.println("Employee ID : "+p2.getKey());
        System.out.println("Employee Name : "+p2.getValue());
    }
}
