// Program to calculate the power of a number

import java.util.Scanner;

class PowerCalculator {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input for number
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        // Take input for power
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Variable to store result
        int result = 1;

        // Check for positive power
        if (power >= 0) {

            // Loop to multiply number power times
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            // Print result
            System.out.println(number + " raised to power " + power + " = " + result);

        } else {
            System.out.println("Power should be a positive integer.");
        }

        // Close scanner
        input.close();
    }
}