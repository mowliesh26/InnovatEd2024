import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the reverseString method to reverse the input string
        String reversedString = reverseString(input);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Initialize variables for swapping characters
        int left = 0;
        int right = charArray.length - 1;

        // Perform swapping until left index is less than right index
        while (left < right) {
            // Swap characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move to next pair of characters
            left++;
            right--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}
