public class BankWithdrawal {
    static double balance = 5000;

    static void withdraw(double amount){
        if (amount <=0){
            throw new IllegalArgumentException("Invalid withdrawal amount");
        }
        else if (balance < amount){
            throw new IllegalArgumentException("Insufficient balance");
        }
        else {
            System.out.println("Withdrawal successful; remaining balance is "+(balance-amount));
        }
    }

    public static void main(String[] args) {
        double amount = -500;
        try {
            withdraw(amount);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        amount = 7000;
        try {
            withdraw(amount);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        amount = 2000;
        try {
            withdraw(amount);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
