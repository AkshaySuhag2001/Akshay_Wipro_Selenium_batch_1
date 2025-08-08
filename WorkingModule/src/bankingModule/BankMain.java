package bankingModule;

public class BankMain {
    public static void main(String[] args) {

        BankService service = new BankServiceImpl();

        Account acc1 = new Account();
        acc1.setAccountNumber(101);
        acc1.setHolderName("Ravi");
        acc1.setBalance(5000);

        Account acc2 = new Account();
        acc2.setAccountNumber(102);
        acc2.setHolderName("Sneha");
        acc2.setBalance(8000);

        service.openAccount(acc1);
        service.openAccount(acc2);

        service.showAccountDetails(101);
        service.showAccountDetails(102);

        service.performTransaction(101, "deposit", 2000);
        service.performTransaction(102, "withdraw", 3000);

        service.showAccountDetails(101);
        service.showAccountDetails(102);

        BankEmployee emp1 = new Cashier("Amit", 1);
        BankEmployee emp2 = new Manager("Kavita", 2);

        emp1.assistCustomer();
        emp2.assistCustomer();
    }
}
