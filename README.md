# Bank Account Management System (Java)

A simple console-based Bank Account Management System built in Java to demonstrate classes and objects (OOP basics).

## Features

- Create bank accounts with an account number, holder name and opening balance
- Deposit money into an account
- Withdraw money, with a clear message if the balance is insufficient
- Check the current balance
- Display full account details
- Each account keeps its own independent balance

## Project Structure

```
.
├── BankAccount.java   # BankAccount class (data members + methods)
├── Main.java          # Main class that creates and uses two accounts
└── README.md
```

## Class Overview

### `BankAccount`

| Member | Description |
|--------|-------------|
| `accountNumber` | Unique number of the account |
| `accountHolderName` | Name of the account holder |
| `balance` | Current balance |
| `BankAccount(String, String, double)` | Parameterized constructor to initialize the account |
| `deposit(double amount)` | Adds money to the balance (amount must be positive) |
| `withdraw(double amount)` | Deducts money, or shows an "Insufficient balance" message |
| `checkBalance()` | Prints the current balance |
| `displayDetails()` | Prints account number, holder name and balance |

### `Main`

Creates two different `BankAccount` objects, performs deposits and withdrawals on both (including one failed withdrawal), and prints the final details of each account.

## How to Run

**Requirements:** JDK 8 or higher.

```bash
# Clone the repository
git clone <your-repo-url>
cd <your-repo-folder>

# Compile
javac BankAccount.java Main.java

# Run
java Main
```

## Sample Output

```
=== Operations on Account 1 ===
Deposited: 2000.0 | New balance: 7000.0
Withdrawn: 1500.0 | New balance: 5500.0
Insufficient balance! Cannot withdraw 10000.0. Available balance: 5500.0
Current balance: 5500.0

=== Operations on Account 2 ===
Deposited: 500.0 | New balance: 10500.0
Withdrawn: 3000.0 | New balance: 7500.0
Current balance: 7500.0

=== Final Account Details ===
Account Number : 1001
Account Holder : Rahul Sharma
Balance        : 5500.0

Account Number : 1002
Account Holder : Priya Verma
Balance        : 7500.0
```

## Concepts Demonstrated

- Classes and objects
- Encapsulation (private data members accessed through methods)
- Constructors
- Methods and basic input validation
- Object independence (each object has its own state)

## Author

Your Name