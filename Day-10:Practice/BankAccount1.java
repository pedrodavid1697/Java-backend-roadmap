public class BankAccount1 {
    String accountHolder;
    double balance;

    public BankAccount1(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount > 0){
            balance+=amount;
        }
        else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <=0){
            System.out.println("invalid withdrawal amount");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance");
        }
        else {
            balance-=amount;
        }

    }

    void displayBalance() {
        System.out.println("Account holder: "+accountHolder);
        System.out.println("Balance: "+balance);
    }
    public static void main(String[] args) {

        BankAccount1 bank = new BankAccount1("David", 10000);

        bank.deposit(2000);
        bank.withdraw(3000);

        bank.displayBalance();
    }
}
