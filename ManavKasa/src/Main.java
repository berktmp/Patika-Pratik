import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double elma = 3.67, armut = 2.14, domates = 1.11, muz = 0.95, patlican = 5.00;
        double toplam, elmaKg, armutKg, domatesKg, muzKg, patlicanKg;

       // armut girdisi
        System.out.print("Kaç kg armut aldınız : ");
        armutKg = inp.nextDouble();
      // elma girdisi
        System.out.print("Kaç kg elma aldınız : ");
        elmaKg = inp.nextDouble();
           // domates girdisi
        System.out.print("Kaç kg domates aldınız : ");
        domatesKg = inp.nextDouble();
       // muz girdisi
        System.out.print("Kaç kg muz aldınız : ");
        muzKg = inp.nextDouble();
         // patlıcan girdisi
        System.out.print("Kaç kg patlıcan aldınız : ");
        patlicanKg = inp.nextDouble();

        toplam = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg);

        System.out.println("Toplam Tutar : " + toplam + " TL");
    }
}
