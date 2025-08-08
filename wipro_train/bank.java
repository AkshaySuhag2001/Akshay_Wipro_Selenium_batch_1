package wipro_train;

import java.util.Scanner;

public class bank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        depo_with dw = new depo_with();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        dw.setName(name);

        System.out.print("Enter deposit amount: ");
        int deposit = scanner.nextInt();
        dw.setDeposit(deposit);

        System.out.print("Enter withdrawal amount: ");
        int withdraw = scanner.nextInt();
        dw.setWithdraw(withdraw);

        System.out.println("\n---- Account Summary ----");
        System.out.println("Name: " + dw.getName());
        System.out.println("Deposit: " + dw.getDeposit());
        System.out.println("Withdraw: " + dw.getWithdraw());
        System.out.println("Balance: " + dw.getBalance());

        scanner.close();
    }
}
