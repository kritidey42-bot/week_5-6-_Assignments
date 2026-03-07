// Program to check whether a number is Prime or Not

import java.util.Scanner;

class PrimeNumberChecker {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take number input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Boolean variable to check prime status
        boolean isPrime = true;

        // Prime numbers are greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {

            // Loop to check divisibility
            for (int i = 2; i < number; i++) {

                // If number is divisible by i, it is not prime
                if (number % i == 0) {
                    isPrime = false;
                    break; // Exit loop if divisor found
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        // Close scanner
        input.close();
    }
}