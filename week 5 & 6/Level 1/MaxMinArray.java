import java.util.Scanner;

class MaxMinArray {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare array to store 8 numbers
        int[] numbers = new int[8];

        // Take user input
        System.out.println("Enter 8 positive numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

            // Validate input
            if (numbers[i] < 0) {
                System.out.println("Invalid number. Program terminated.");
                System.exit(0);
            }
        }

        // Initialize max and min with first element
        int max = numbers[0];
        int min = numbers[0];

        // Find maximum and minimum
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Display results
        System.out.println("Maximum Number: " + max);
        System.out.println("Minimum Number: " + min);

        input.close();
    }
}