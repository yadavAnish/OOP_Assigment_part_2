package Q2;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("12345", 1000, 2.5, 500);
        checkingAccount.withdraw(1500); // Should display "Withdrawal amount exceeds overdraft limit."
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount("67890", 2000, 3.0);
        savingsAccount.withdraw(1500); // Should withdraw successfully
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
    }
}