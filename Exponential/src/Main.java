import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the base and exponent from the user
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // Calculate the exponential number
        double result = calculateExponential(base, exponent);

        // Print the result
        System.out.println(base + " raised to the power of " + exponent + " = " + result);
    }

    public static double calculateExponential(double base, int exponent) {
        double result = 1;

        // Calculate the exponential using a for loop
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }
}
