package enhancedAtm;

import java.util.*;

public class Atm {
    private static final int MAX_ATTEMPTS = 3;
    private static final Map<Integer, User> users = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            loadSampleUsers();

            System.out.print("Insert your card (Enter Account Number): ");
            int accNo = sc.nextInt();

            User currentUser = users.get(accNo);
            if (currentUser == null) {
                System.out.println("Account not found.");
                return;
            }

            int attempts = 0;
            boolean accessGranted = false;

            while (attempts < MAX_ATTEMPTS) {
                System.out.print("Enter your PIN: ");
                int enteredPin = sc.nextInt();

                try {
                    validatePin(currentUser, enteredPin);
                    accessGranted = true;
                    break;
                } catch (InvalidPinException e) {
                    attempts++;
                    System.out.println("Invalid PIN. Attempts left: " + (MAX_ATTEMPTS - attempts));
                }
            }

            if (!accessGranted) {
                System.out.println("Too many incorrect attempts. Access denied.");
                return;
            }

            //Show menu
            boolean exit = false;
            while (!exit) {
                System.out.println("\n--- ATM Menu ---");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();

                try {
                    switch (choice) {
                        case 1:
                            System.out.println("Your balance: ₹" + currentUser.getBalance());
                            break;
                        case 2:
                            System.out.print("Enter withdrawal amount: ");
                            double withdrawAmt = sc.nextDouble();
                            currentUser.withdraw(withdrawAmt);
                            System.out.println("Withdrawal successful.");
                            break;
                        case 3:
                            System.out.print("Enter deposit amount: ");
                            double depositAmt = sc.nextDouble();
                            currentUser.deposit(depositAmt);
                            System.out.println("Deposit successful.");
                            break;
                        case 4:
                            System.out.println("Thank you for using the ATM.");
                            exit = true;
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                } catch (InsufficientBalanceException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        } finally {
            System.out.println("Session Timeout. Please take your card.");
            sc.close();
        }
    }

    private static void validatePin(User user, int enteredPin) throws InvalidPinException {
        if (user.getPin() != enteredPin) {
            throw new InvalidPinException("Incorrect PIN.");
        }
    }

    private static void loadSampleUsers() {
        users.put(101, new User(101, 1234, 5000));
        users.put(102, new User(102, 4321, 10000));
        users.put(103, new User(103, 1111, 7500));
    }
}
