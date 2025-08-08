package bankingModule;

public abstract class BankEmployee {
    String name;
    int id;

    public BankEmployee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void assistCustomer();
}

class Cashier extends BankEmployee {

    public Cashier(String name, int id) {
        super(name, id);
    }

    @Override
    void assistCustomer() {
        System.out.println("Cashier:  " + name + " is helping with deposit/withdrawal.");
    }
}

class Manager extends BankEmployee {

    public Manager(String name, int id) {
        super(name, id);
    }

    @Override
    void assistCustomer() {
        System.out.println("Manager:  " + name + " is assisting with account or loan queries.");
    }
}
