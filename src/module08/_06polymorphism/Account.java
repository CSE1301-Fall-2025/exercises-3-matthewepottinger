package module08._06polymorphism;

public class Account 
{
    private String name;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(String name, double balance)
    {
       this.name = name;
       this.balance = balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public static void main(String[] args) {
        Account A1 = new Account ("Matthew", 9000);
        Account A2 = new Account ("Margo", 2000);
        A1.deposit(200);
        A1.withdraw(800);
        System.out.println(A1.balance);
        System.out.println(A2.balance);
    }
}
