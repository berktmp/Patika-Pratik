import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double distance, age, baseFare, ageDiscount, discountedFare, roundTripDiscount, totalFare;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        distance = scanner.nextDouble();
        System.out.print("Enter your age: ");
        age = scanner.nextDouble();
        System.out.print("Enter the type of journey (1 => One-way, 2 => Round trip): ");
        int journeyType = scanner.nextInt();

        if (age < 0 || distance < 0) {
            System.out.println("Invalid input!");
            System.exit(0);
        }

        switch (journeyType) {
            case 1:
                baseFare = distance * 0.10;

                if (age < 12) {
                    ageDiscount = baseFare * 0.50;
                    discountedFare = baseFare - ageDiscount;
                    System.out.println("Fare: " + discountedFare + " TL");
                } else if (age >= 12 && age < 24) {
                    ageDiscount = baseFare * 0.10;
                    discountedFare = baseFare - ageDiscount;
                    System.out.println("Fare: " + discountedFare + " TL");
                } else if (age >= 24 && age < 65) {
                    System.out.println("Fare: " + baseFare + " TL");
                } else if (age >= 65) {
                    ageDiscount = baseFare * 0.30;
                    discountedFare = baseFare - ageDiscount;
                    System.out.println("Fare: " + discountedFare + " TL");
                }
                break;
            case 2:
                baseFare = distance * 0.10;

                if (age < 12) {
                    ageDiscount = baseFare * 0.50;
                    discountedFare = baseFare - ageDiscount;
                    roundTripDiscount = discountedFare * 0.20;
                    totalFare = (discountedFare - roundTripDiscount) * 2;
                    System.out.println("Fare: " + totalFare + " TL");
                } else if (age >= 12 && age < 24) {
                    ageDiscount = baseFare * 0.10;
                    discountedFare = baseFare - ageDiscount;
                    roundTripDiscount = discountedFare * 0.20;
                    totalFare = (discountedFare - roundTripDiscount) * 2;
                    System.out.println("Fare: " + totalFare + " TL");
                } else if (age >= 24 && age < 65) {
                    roundTripDiscount = baseFare * 0.20;
                    totalFare = (baseFare - roundTripDiscount) * 2;
                    System.out.println("Fare: " + totalFare + " TL");
                } else if (age >= 65) {
                    ageDiscount = baseFare * 0.30;
                    discountedFare = baseFare - ageDiscount;
                    roundTripDiscount = discountedFare * 0.20;
                    totalFare = (discountedFare - roundTripDiscount) * 2;
                    System.out.println("Fare: " + totalFare + " TL");
                }
                break;
            default:
                System.out.println("Invalid input!");
        }
    }
}
