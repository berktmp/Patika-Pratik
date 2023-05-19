import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;

        Scanner inp = new Scanner(System.in);

        // inputs
        System.out.print("Kullanici Adi: ");
        userName = inp.nextLine();
        System.out.print("Sifre: ");
        password = inp.nextLine();

        if (userName.equals("tryMe") && password.equals("Mypassword123")) {
            System.out.println("Giriş başarili");
        } else {
            System.out.println("Kullanıcı adi veya sifre hatalı!");
            System.out.println("Sifrenizi sifirlamak ister misiniz ? (e/h)");
            String select = inp.nextLine();

            if (select.equals("e")) {
                System.out.print("Yeni şifre: ");
                String newPassword = inp.nextLine();

                if (newPassword.equals(password) || newPassword.equals("Mypassword123")) {
                    System.out.println("Şifre oluşturulamadı Yeni sifre önceki şifrelerinizden farkli olmalidir!");
                } else {
                    System.out.println("Yeni sifre oluşturuldu ✅");
                }
            } else {
                System.out.println("Giris başarisiz. Kullanici adi veya sifre yanlis");
            }
        }
    }
}
