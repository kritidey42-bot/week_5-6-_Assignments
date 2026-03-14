import java.util.Scanner;

// Class to count even and odd digits of a number using an array
class EvenOddDigits {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Variable to store the number
        int number;

        // Take input from the user
        System.out.print("Enter a positive number: ");
        number = input.nextInt();

        // Validate the input
        if (number < 0) {
            System.out.println("Invalid Number.");
            System.exit(0);
        }

        // Find the count of digits in the number
        int count = 0;
        int temp = number;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Create array to store digits
        int[] digits = new int[count];

        // Extract digits and store them in array
        for (int i = 0; i < digits.length; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Variables to count even and odd digits
        int evenCount = 0;
        int oddCount = 0;

        // Check each digit in the array
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Display results
        System.out.println("Even Digits: " + evenCount);
        System.out.println("Odd Digits: " + oddCount);

        // Close scanner
        input.close();
    }
}