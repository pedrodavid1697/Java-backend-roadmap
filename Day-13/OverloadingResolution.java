class MethodTest {
    void show(int value) {
        System.out.println("Value is: "+ value);
    }
    void show(double value){
        System.out.println("Value is: "+ value);
    }
    void show(String value) {
        System.out.println("Value is: "+ value);
    }
}

public class OverloadingResolution {
    public static void main(String[] args) {
        MethodTest mt = new MethodTest();
        mt.show(10);
        mt.show(10.5);
        mt.show("Java");
        mt.show('A');

    }
}
