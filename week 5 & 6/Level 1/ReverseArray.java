import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare array of size 6
        int[] numbers = new int[6];

        // Take input from user
        System.out.println("Enter 6 positive numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

            // Validate input
            if (numbers[i] < 0) {
                System.out.println("Invalid number. Program terminated.");
                System.exit(0);
            }
        }

        // Display numbers in reverse order
        System.out.println("Numbers in Reverse Order:");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        input.close();
    }
}