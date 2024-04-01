import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set the range for the random number
        int min = 1;
        int max = 100;
        int randomNumber = (int) (Math.random() * (max - min + 1) + min);

        int attempts = 5; // Number of attempts allowed
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between " + min + " and " + max + ".");
        System.out.println("You have " + attempts + " attempts to guess it.");

        // Loop for the guessing attempts
        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == randomNumber) {
                guessedCorrectly = true;
                break; // Exit the loop if the guess is correct
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            attempts--; // Decrement attempts after each guess
            System.out.println("Attempts left: " + attempts);
        }

        // Display result
        if (guessedCorrectly) {
            System.out.println("Congratulations! You guessed the number correctly: " + randomNumber);
        } else {
            System.out.println("Sorry, you've run out of attempts. The number was: " + randomNumber);
        }

        scanner.close();
    }
}
