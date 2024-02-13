package Q2;

public class SavingsAccount extends Account{
    public SavingsAccount(String accountNumber, double balance, double annualInterestRate) {
        super(accountNumber, balance, annualInterestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
