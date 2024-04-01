import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  SimpleBankingApp {
    private static double balance = 0;  
    private static String accountHolderName;
    private static List<String> transactionHistory = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        accountHolderName = scanner.nextLine();

        int choice;
        do {
            System.out.println("\nWelcome, " + accountHolderName + "!");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deposit(scanner);
                    break;
                case 2:
                    withdraw(scanner);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    displayTransactionHistory();
                    break;
                case 5:
                    System.out.println("Thank you for using InnovateEd Solutions Banking App!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 5);

        scanner.close();
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        balance += amount;
        transactionHistory.add("Deposited $" + amount);
        System.out.println("Amount deposited successfully.");
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            transactionHistory.add("Withdrawn $" + amount);
            System.out.println("Amount withdrawn successfully.");
        }
    }

    private static void checkBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Your balance is: $" + balance);
    }

    private static void displayTransactionHistory() {
        System.out.println("\nTransaction History:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}
