// Program to find all factors of a number entered by the user

import java.util.Scanner;

class FindFactors {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        // Check if number is positive
        if (number > 0) {

            System.out.println("Factors of " + number + " are:");

            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {

                // Check if number is divisible by i
                if (number % i == 0) {
                    System.out.println(i);
                }
            }

        } else {
            // If number is not positive
            System.out.println("Please enter a positive integer.");
        }

        // Close scanner
        input.close();
    }
}