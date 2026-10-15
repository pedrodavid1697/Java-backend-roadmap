interface PaymentMethod1 {
    void pay(double amount);
}
class CreditCardPayment2 implements PaymentMethod1 {
    @Override
    public void pay(double amount) {
        System.out.println("paid "+amount+ " using Credit Card");
    }
}
class UpiPayment2 implements PaymentMethod1 {
    @Override
    public void pay(double amount) {
        System.out.println("paid "+amount+ " using UPI");
    }
}

public class InterfaceArray {
    public static void main(String[] args) {
        PaymentMethod1[] pm = {new CreditCardPayment2(), new UpiPayment2()};
        double[] amount = {1500.0, 800.0};
        for (int i=0; i<pm.length; i++) {
            pm[i].pay(amount[i]);
        }
    }
}
