import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the sum of the digits
        int digitSum = calculateDigitSum(number);

        // Print the result
        System.out.println("The sum of the digits of " + number + " is: " + digitSum);
    }

    public static int calculateDigitSum(int number) {
        int sum = 0;

        // Calculate the sum of the digits
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
}
