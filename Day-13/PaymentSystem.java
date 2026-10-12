class Payment {
    double amount;
    Payment(double amount) {
        this.amount = amount;
    }
    void processPayment() {
        System.out.println("Processing Payment");
    }
}
class CreditCardPayment extends Payment {
    CreditCardPayment(double amount) {
        super(amount);
    }
    @Override
    void processPayment(){
        System.out.println("Processing credit card payment: "+ amount);
    }
}
class UpiPayment extends Payment {
    UpiPayment(double amount) {
        super(amount);
    }
    @Override
    void processPayment() {
        System.out.println("Processing UPI payment: "+ amount);
    }
}


public class PaymentSystem {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment(1500);
        Payment payment1 = new UpiPayment(800);
        payment.processPayment();
        payment1.processPayment();
//        Payment[] payment = {new CreditCardPayment(1500), new UpiPayment(800)};
//        for (int i =0; i<payment.length; i++){
//            System.out.println(payment[i].amount);
//        }

    }
}
