//Abstraction
package wipro_train;
import java.util.Scanner;

abstract class Payment {
    public abstract void makePayment();
}

class CreditCardPayment extends Payment {
    public void makePayment() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Credit Card Number: ");
        String cardNumber = sc.nextLine();
        System.out.print("Enter amount to pay: ");
        double amount = sc.nextDouble();
        System.out.println("Paid ₹" + amount + " using Credit Card ending with " + cardNumber.substring(cardNumber.length() - 4));
    }
}

class UPIPayment extends Payment {
    public void makePayment() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter UPI ID: ");
        String upiId = sc.nextLine();
        System.out.print("Enter amount to pay: ");
        double amount = sc.nextDouble();
        System.out.println("Paid ₹" + amount + " using UPI ID: " + upiId);
    }
}
