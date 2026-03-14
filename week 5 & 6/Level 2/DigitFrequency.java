import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Variable to store the number
        int number;

        // Take user input
        System.out.print("Enter a positive number: ");
        number = input.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Invalid number. Program terminated.");
            System.exit(0);
        }

        // Frequency array for digits 0–9
        int[] frequency = new int[10];

        // Temporary variable to process digits
        int temp = number;

        // Find frequency of each digit
        while (temp > 0) {
            int digit = temp % 10;
            frequency[digit]++;
            temp = temp / 10;
        }

        // Display frequency
        System.out.println("Digit Frequencies:");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        // Close scanner
        input.close();
    }
}