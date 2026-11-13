class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericBox {
    public static void main(String[] args) {

        Box<String> box = new Box<>();
        Box<Integer> box1 = new Box<>();
        Box<Double> box2 = new Box<>();

        box.setValue("Java");
        box1.setValue(100);
        box2.setValue(25.5);

        System.out.println(box.getValue());
        System.out.println(box1.getValue());
        System.out.println(box2.getValue());
    }
}
