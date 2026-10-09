class BankAccount2 {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
            if (balance >= 0) {
                this.balance = balance;
            }
            else {
                System.out.println("Invalid Balance");
            }
    }
}

public class SetterValidation {
    public static void main(String[] args) {
        BankAccount2 bank = new BankAccount2();
        bank.setBalance(2000);
        System.out.println("Balance is: "+bank.getBalance());
        bank.setBalance(-10);
        System.out.println("Balance is: "+bank.getBalance());
    }
}