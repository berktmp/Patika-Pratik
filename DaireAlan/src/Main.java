import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // 𝜋 sayısını 3.14 olarak alıyoruz
        double pi = 3.14;

        System.out.print("Yarıçapı (r) girin: ");
        double yaricap = inp.nextDouble();

        System.out.print("Merkez açısının ölçüsü (𝛼) girin: ");
        double merkezAcisi = inp.nextDouble();

        // Radyan cinsinden merkez açısını hesaplıyoruz
        double merkezAcisiRadyan = Math.toRadians(merkezAcisi);

        // Daire diliminin alanını hesaplıyoruz
        double alan = (pi * yaricap * yaricap * merkezAcisi) / 360;

        System.out.println("Daire diliminin alanı: " + alan);
    }
}
