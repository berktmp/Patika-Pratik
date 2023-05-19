import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the harmonic series
        double harmonicSum = calculateHarmonicSeries(number);

        // Print the result
        System.out.println("The harmonic series of " + number + " is: " + harmonicSum);
    }

    public static double calculateHarmonicSeries(int number) {
        double sum = 0;

        // Calculate the harmonic series
        for (int i = 1; i <= number; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
}
