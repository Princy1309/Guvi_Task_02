package question_3;

public class Account {
    // Data member
    private double balance;

    // No-argument constructor (default balance = 0)
    public Account() {
        balance = 0;
    }

    // Parameterized constructor
    public Account(double initialBalance) {
        balance = initialBalance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    // Method to display balance
    public void display() {
        System.out.println("Current Balance: " + balance);
    }

    // Main method to test
    public static void main(String[] args) {
        // Using no-argument constructor
        Account acc1 = new Account();
        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.display();

        System.out.println();

        // Using parameterized constructor
        Account acc2 = new Account(1000);
        acc2.deposit(300);
        acc2.withdraw(150);
        acc2.display();
    }
}
