class BankAccount3{
    private double balance;

    public void deposit(double amount) {
        if(amount > 0){
            balance+=amount;
        }
        else{
            System.out.println("Invalid deposit");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance) {
            balance-=amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    double getBalance(){
        return balance;
    }

}


public class ControlledUpdate {
    public static void main(String[] args) {
        BankAccount3 acc = new BankAccount3();
        acc.deposit(500);
        System.out.println("Deposited: "+acc.getBalance());
        acc.withdraw(150);
        System.out.println("Withdrawn: "+acc.getBalance());

    }
}
