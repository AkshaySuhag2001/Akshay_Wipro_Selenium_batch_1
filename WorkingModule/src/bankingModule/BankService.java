package bankingModule;

public interface BankService {
	void openAccount(Account account);

	void showAccountDetails(int accountNumber);

	void performTransaction(int accountNumber, String type, double amount);

}
