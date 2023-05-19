import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // değişkenler
        double weight, height;

        // kullanıcıdan girdi al
        Scanner inp = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        height = inp.nextDouble();

        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        weight = inp.nextDouble();

        double BMI = weight / (height * height);
        System.out.println("Vücut Kitle İndeksiniz : " + BMI);
    }
}
