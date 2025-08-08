package wipro_train;

import java.util.Scanner;

public class Atm {
    private static final int CORRECT_PIN = 1452;
    private static final int MAX_ATTEMPTS = 3;

    private static void validatePin(int enteredPin) {
        if (enteredPin != CORRECT_PIN) {
            throw new SecurityException("Wrong PIN entered!!!");
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean accessGranted = false;

        System.out.println("Insert ATM Card:");

        try {
            while (attempts < MAX_ATTEMPTS) {
                System.out.print("Enter your PIN: ");
                int pin = scanner.nextInt();

                try {
                    validatePin(pin);
                    System.out.println("PIN Verified Successfully! Access granted.");
                    System.out.println("Proceeding with withdrawal...");
                    accessGranted = true;
                    break;
                } catch (SecurityException e) {
                    attempts++;
                    if (attempts < MAX_ATTEMPTS) {
                        System.out.println("Incorrect PIN. Attempts remaining: " + (MAX_ATTEMPTS - attempts));
                    } else {
                        System.out.println("Access Denied: Maximum attempts exceeded.");
                    }
                }
            }
        } finally {
            System.out.println("Session Timeout. Please take your card.");
            scanner.close();
        }
    }
}
