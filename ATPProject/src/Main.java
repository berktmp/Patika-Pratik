import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
       String userName, password;
      Scanner input = new Scanner(System.in);
     int attempts = 3;
     int balance = 1500;
      int select;
      while (attempts > 0) {
        System.out.print("Username: ");
        userName = input.nextLine();
        System.out.print("Password: ");
        password = input.nextLine();

        int price = 0;

        if (userName.equals("patika") && password.equals("dev123")) {
            do {
                System.out.println("1-Deposit\n" +
                        "2-Withdraw\n" +
                        "3-Check Balance\n" +
                        "4-Exit");
                System.out.print("Please select an operation: ");
                select = input.nextInt();

                switch (select) {
                    case 1:
                        System.out.print("Amount to deposit: ");
                        price = input.nextInt();
                        balance += price;
                        break;
                    case 2:
                        System.out.print("Amount to withdraw: ");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Insufficient balance.");
                        } else {
                            balance -= price;
                        }
                        break;
                    case 3:
                        System.out.println("Your balance: " + balance);
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            } while (select != 4);
        } else {
            attempts--;
            System.out.println("Invalid username or password. Please try again.");

            if (attempts == 0) {
                System.out.println("Your account has been blocked. Please contact the bank.");
            }
        }
    }
}
