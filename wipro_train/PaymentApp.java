//Abstraction
package wipro_train;

import java.util.Scanner;

public class PaymentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        int choice = sc.nextInt();
        sc.nextLine();

        Payment payment;

        if (choice == 1) {
            payment = new CreditCardPayment();
        } else if (choice == 2) {
            payment = new UPIPayment();
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        payment.makePayment();
    }
}
