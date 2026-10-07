class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    private static int totalAccounts =0;
//    static String totalAccounts="";

    public BankAccount(String holderName, double initialBalance) {
        totalAccounts++;
        this.accountNumber = "ACC" + (1000 + totalAccounts); // 1000 +1 gives "ACC1001"
        this.holderName= holderName;
        this.balance = initialBalance;
    }

    public BankAccount(String holderName) {
//        this.holderName = holderName;
//        balance = 0;
        this(holderName, 0); //reuse the main constructor
    }
    public void deposite(double amount){
        if(amount<=0){
            System.out.println("Invalid deposit amount");
            return;
        }
        balance += amount;
    }

    public boolean withdraw(double amount){
        if (amount<=0 ) {
            System.out.println("Invalid withdrawl amount");
            return false;
        }
        if(amount>balance){
            System.out.println("Insufficient balance");
            return false;
        }
        balance-=amount;
        return true;
    }

    public void transfer(BankAccount target, double amount) {
        if(withdraw(amount)) { //withdraw method will check with amount parameter
            target.deposite(amount);
        }
    }

    public String getaccountNumber(){
        return accountNumber;
    }
    public String getholderName(){
        return holderName;
    }
    public double getbalance(){
        return balance;
    }
    //Setter
    public void setholderName(String holderName) {
        this.holderName = holderName;
    }
    public void displayDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Holder Name: "+holderName);
        System.out.println("Balance: "+balance);
    }

    public static void showTotalAccounts(){
        System.out.println("Total Accounts: "+totalAccounts);
    }

}


public class BankDemo {
    public static void main(String[] args) {
//        BankAccount.showTotalAccounts();
        BankAccount a1 = new BankAccount("David", 5000);
        BankAccount a2 = new BankAccount("Alex");
        BankAccount a3 = new BankAccount("Sara", 2000);

        a1.deposite(1000);
        a2.deposite(500);
        a3.withdraw(300);
        a3.withdraw(99999); //Invalid: should print an error

        a1.transfer(a2, 2000);
        a2.transfer(a1, 50000); //Invalid: nothing should move

        a1.displayDetails();
        a2.displayDetails();
        a3.displayDetails();

        BankAccount.showTotalAccounts();
    }
}
