public class Main {
    public static void main(String[] args) {
        // Two independent accounts
        BankAccount acc1 = new BankAccount("1001", "Rahul Sharma", 5000.0);
        BankAccount acc2 = new BankAccount("1002", "Priya Verma", 10000.0);

        System.out.println("=== Operations on Account 1 ===");
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.withdraw(10000); // insufficient balance
        acc1.checkBalance();

        System.out.println("\n=== Operations on Account 2 ===");
        acc2.deposit(500);
        acc2.withdraw(3000);
        acc2.checkBalance();

        System.out.println("\n=== Final Account Details ===");
        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();
    }
}