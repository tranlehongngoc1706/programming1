package Problem2;

import java.util.Scanner;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        this.setBalance(initialBalance);
    }

    public double credit(double amount) {
        return (amount + balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 0)
            this.balance = balance;
        else
            this.balance = 0;
    }
}
