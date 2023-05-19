import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the GCD using the Euclidean algorithm
        int gcd = calculateGCD(num1, num2);

        // Calculate the LCM using the formula: LCM = (num1 * num2) / GCD
        int lcm = (num1 * num2) / gcd;

        // Print the GCD and LCM
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    public static int calculateGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
