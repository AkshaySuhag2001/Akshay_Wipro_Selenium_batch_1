package bankingModule;

public class BankServiceImpl implements BankService {

    private Account[] accountList = new Account[10];
    private int count = 0;

    @Override
    public void openAccount(Account account) {
        if (count < accountList.length) {
            accountList[count] = account;
            count++;
            System.out.println("Account opened for: " + account.getHolderName());
        } else {
            System.out.println("Cannot open more accounts. Bank is full.");
        }
    }

    @Override
    public void showAccountDetails(int accountNumber) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (accountList[i].getAccountNumber() == accountNumber) {
                System.out.println("Account Number: " + accountList[i].getAccountNumber());
                System.out.println("Holder Name: " + accountList[i].getHolderName());
                System.out.println("Balance: ₹" + accountList[i].getBalance());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found.");
        }
    }

    @Override
    public void performTransaction(int accountNumber, String type, double amount) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (accountList[i].getAccountNumber() == accountNumber) {
                if (type.equalsIgnoreCase("deposit")) {
                    accountList[i].deposit(amount);
                } else if (type.equalsIgnoreCase("withdraw")) {
                    accountList[i].withdraw(amount);
                } else {
                    System.out.println("nvalid transaction type.");
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found for transaction.");
        }
    }
}
