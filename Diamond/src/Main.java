import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of rows from the user
        System.out.print("Enter the number of rows (odd number): ");
        int numRows = scanner.nextInt();

        // Check if the number of rows is odd
        if (numRows % 2 == 0) {
            System.out.println("Number of rows must be odd.");
            return;
        }

        // Calculate the number of spaces and stars for the top half of the diamond
        int numSpaces = numRows / 2;
        int numStars = 1;

        // Print the top half of the diamond
        for (int i = 1; i <= numRows; i++) {
            // Print spaces
            for (int j = 1; j <= numSpaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= numStars; j++) {
                System.out.print("*");
            }

            System.out.println();

            if (i <= numRows / 2) {
                numSpaces--;
                numStars += 2;
            } else {
                numSpaces++;
                numStars -= 2;
            }
        }
    }
}
