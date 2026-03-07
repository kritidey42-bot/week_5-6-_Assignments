// Program to check whether a number is an Armstrong Number

import java.util.Scanner;

class ArmstrongNumberChecker {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Store original number
        int originalNumber = number;

        // Variable to store sum of cubes
        int sum = 0;

        // Loop to extract digits
        while (number != 0) {

            // Get last digit
            int digit = number % 10;

            // Add cube of digit to sum
            sum = sum + (digit * digit * digit);

            // Remove last digit
            number = number / 10;
        }

        // Check Armstrong condition
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong Number.");
        }

        // Close scanner
        input.close();
    }
}