public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Parameterized constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount. Amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount + " | New balance: " + balance);
    }

    // Withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Cannot withdraw " + amount
                    + ". Available balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New balance: " + balance);
        }
    }

    // Display current balance
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Display full account details
    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : " + balance);
    }
}