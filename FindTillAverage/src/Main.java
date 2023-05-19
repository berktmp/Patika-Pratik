import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the sum and count of numbers divisible by 3 and 4
        int sum = 0;
        int count = 0;

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        // Calculate the average
        double average = 0;
        if (count > 0) {
            average = (double) sum / count;
        }

        // Display the result
        System.out.println("The average of numbers divisible by 3 and 4 is: " + average);
    }
}
