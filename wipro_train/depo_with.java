package wipro_train;

public class depo_with {
    private int deposit;
    private int withdraw;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public int getBalance() {
        return deposit - withdraw;
    }
}
