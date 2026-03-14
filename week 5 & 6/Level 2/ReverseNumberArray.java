import java.util.Scanner;

class ReverseNumberArray {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Variable to store number
        int number;

        // Take input from user
        System.out.print("Enter a positive number: ");
        number = input.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Invalid number. Program terminated.");
            System.exit(0);
        }

        // Find count of digits
        int count = 0;
        int temp = number;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Array to store digits
        int[] digits = new int[count];

        // Store digits in array
        for (int i = 0; i < digits.length; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Display digits in reverse order
        System.out.println("Reversed Number:");

        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }

        // Close scanner
        input.close();
    }
}