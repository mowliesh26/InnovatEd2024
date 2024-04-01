import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000; // Initial balance is 10,000
        int choice, withdraw, deposit;
        
        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome, " + name + ", to the AUTOMATED TELLER MACHINE!");

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please collect your cash.");
                        System.out.println("Remaining balance: " + balance); // Display remaining balance
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Your money has been deposited successfully.");
                    break;
                case 3:
                    System.out.println("Your current balance: " + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM, " + name + "!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
