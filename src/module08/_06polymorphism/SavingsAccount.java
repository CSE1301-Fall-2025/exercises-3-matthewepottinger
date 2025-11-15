package module08._06polymorphism;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String name, double balance, double interestRate) {
        super(name, balance);
        this.interestRate = interestRate;
    }

    public void compoundInterest (double interestRate) {
        this.setBalance(this.getBalance() * (this.interestRate + 1) );
    }
}
