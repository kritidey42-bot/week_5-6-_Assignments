import java.util.Scanner;

class EvenOddCount {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare array of 10 elements
        int[] numbers = new int[10];

        int evenCount = 0;
        int oddCount = 0;

        // Take input from user
        System.out.println("Enter 10 positive numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

            // Validate input
            if (numbers[i] < 0) {
                System.out.println("Invalid number. Program terminated.");
                System.exit(0);
            }

            // Check even or odd
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Display result
        System.out.println("Even Numbers Count: " + evenCount);
        System.out.println("Odd Numbers Count: " + oddCount);

        input.close();
    }
}