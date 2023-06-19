package Exercise2;

public class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void credit(double amount) {
        // add the credit money to the previous total
        this.balance += amount;
    }

    public void debit (double amount) {
        // make sure the amount of money is positive number
        if (amount > 0) {
            // check to make sure there is enough money to debit
            if (amount <= balance)
                balance -= amount;
            else
                System.out.println("The debit amount is larger than the balance!");
        } else
            System.out.println("The amount of transfer money must be positive!");
    }

    public void transferTo(Account another, double amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
            System.out.println("Successfully transfer!");
        } else
            System.out.println("The debit amount is larger than the balance!");
    }

    @Override
    public String toString() {
        return "Account: id= " + id + ", name= " + name + ", balance= " + balance;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
