import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read birth month and day from the user
        System.out.print("Enter your birth month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter your birth day (1-31): ");
        int day = scanner.nextInt();

        // Validate the input
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid input. Please enter a valid month (1-12) and day (1-31).");
            return;
        }

        // Determine the horoscope
        String horoscope = "";
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            horoscope = "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            horoscope = "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            horoscope = "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            horoscope = "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            horoscope = "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            horoscope = "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            horoscope = "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            horoscope = "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            horoscope = "Sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            horoscope = "Capricorn";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            horoscope = "Aquarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            horoscope = "Pisces";
        }

        // Display the horoscope
        System.out.println("Your horoscope is: " + horoscope);
    }
}
