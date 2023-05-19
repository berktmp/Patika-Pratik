import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. Sayiyi Giriniz: ");
        n1 = inp.nextInt();

        System.out.print("2. Sayiyi Giriniz: ");
        n2 = inp.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bölme");
        System.out.println("Yapmak istediğiniz islemi giriniz: ");
        type = inp.nextInt();

        switch (type) {
            case 1:
                System.out.println("Sonuc: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonuc: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Sonuc: " + (n1 * n2));
                break;
            case 4:
                System.out.println("Sonuc: " + (n1 / n2));
                break;
            default:
                System.out.println("Yanlis seçim yaptiniz!");
        }
    }
}
