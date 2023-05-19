import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Print powers of 4
        System.out.println("Powers of 4:");
        int powerOfFour = 1;
        while (powerOfFour <= number) {
            System.out.println(powerOfFour);
            powerOfFour *= 4;
        }

        // Print powers of 5
        System.out.println("Powers of 5:");
        int powerOfFive = 1;
        while (powerOfFive <= number) {
            System.out.println(powerOfFive);
            powerOfFive *= 5;
        }
    }
}
