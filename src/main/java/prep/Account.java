package prep;

public class Account {
    private double balance;
    private double overdraftLimit;

    public Account(double overDraftLimit) {
        this.balance = 0;
        this.overdraftLimit = overDraftLimit > 0 ? overDraftLimit : 0;
    }

    public boolean deposit(double amount) {
        if (amount >= 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (this.balance - amount >= -this.overdraftLimit && amount >= 0) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
