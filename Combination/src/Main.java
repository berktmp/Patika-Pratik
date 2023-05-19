import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the values of n and k from the user
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Calculate the combination
        long combination = calculateCombination(n, k);

        // Print the result
        System.out.println("The combination C(" + n + ", " + k + ") = " + combination);
    }

    public static long calculateCombination(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }

        // Calculate n!
        long numerator = 1;
        for (int i = 1; i <= n; i++) {
            numerator *= i;
        }

        // Calculate k!
        long denominator1 = 1;
        for (int i = 1; i <= k; i++) {
            denominator1 *= i;
        }

        // Calculate (n-k)!
        long denominator2 = 1;
        for (int i = 1; i <= n - k; i++) {
            denominator2 *= i;
        }

        // Calculate the combination: n! / (k! * (n-k)!)
        long combination = numerator / (denominator1 * denominator2);

        return combination;
    }
}
