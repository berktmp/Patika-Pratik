import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read birth year from the user
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Validate the input
        if (birthYear < 1900 || birthYear > 2099) {
            System.out.println("Invalid input. Please enter a valid year between 1900 and 2099.");
            return;
        }

        // Determine the Chinese zodiac sign
        String[] zodiacSigns = {
            "Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox",
            "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"
        };
        int zodiacIndex = (birthYear - 1900) % 12;
        String zodiacSign = zodiacSigns[zodiacIndex];

        // Display the Chinese zodiac sign
        System.out.println("Your Chinese zodiac sign is: " + zodiacSign);
    }
}
