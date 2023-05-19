import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int multiplesOfFourSum = 0;

        // Accept inputs from the user until an odd number is entered
        int number;
        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number % 4 == 0) {
                multiplesOfFourSum += number;
            }

            if (number % 2 != 0) {
                break;
            }
        }

        // Print the sum of multiples of 4
        System.out.println("Sum of multiples of 4 entered: " + multiplesOfFourSum);
    }
}
