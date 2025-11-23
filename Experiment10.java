class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Experiment10 {

    private double balance;

    public Experiment10(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Experiment10 acc = new Experiment10(5000);

        try {
            acc.withdraw(7000);
        } 
        catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
