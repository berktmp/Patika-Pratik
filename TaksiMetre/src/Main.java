import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double distance, perDistance = 2.20, total, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen mesafeyi KM cinsinden giriniz: ");
        distance = input.nextDouble();

        total = startPrice + (distance * perDistance);
        total = (total < 20) ? 20 : total;

        System.out.println("Taksimetre Tutarı : " + total + " TL'dir.");

    }
}
