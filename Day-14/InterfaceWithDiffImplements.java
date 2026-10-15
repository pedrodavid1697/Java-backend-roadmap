interface PaymentMethod {
    void pay(double amount);
}
class CreditCardPayment1 implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("paid "+amount+ " using Credit Card");
    }
}
class UpiPayment1 implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("paid "+amount+ " using UPI");
    }
}

public class InterfaceWithDiffImplements {
    public static void main(String[] args) {
        PaymentMethod pm = new CreditCardPayment1();
        PaymentMethod pm1 = new UpiPayment1();
        pm.pay(1500);
        pm1.pay(800);

    }
}
