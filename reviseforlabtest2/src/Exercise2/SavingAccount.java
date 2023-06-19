package Exercise2;

public class SavingAccount extends Account {
    private double savingInterestRate;

    public SavingAccount(String id, String name, double savingInterestRate) {
        super(id, name);
        this.savingInterestRate = savingInterestRate;
    }

    public SavingAccount(String id, String name, double balance, double savingInterestRate) {
        super(id, name, balance);
        this.savingInterestRate = savingInterestRate;
    }

    public void calculateInterestAmount() {
        setBalance(getBalance()+getBalance()*savingInterestRate);
    }

    @Override
    public String toString() {
        return "SavingAccount: id= " + getId() + ", name= " + getName() + ", balance= "+ getBalance() + ",interestRate= " + savingInterestRate;
    }

    public double getSavingInterestRate() {
        return savingInterestRate;
    }

    public void setSavingInterestRate(double savingInterestRate) {
        this.savingInterestRate = savingInterestRate;
    }

}
