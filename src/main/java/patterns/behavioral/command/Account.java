package patterns.behavioral.command;

/**
 * @author sebastianjara on 03-03-21
 * @project design-patterns
 */
public class Account {

    private int id;
    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
        System.out.println("[COMMAND WITHDRAW] Account: " + id + " Balance: " + this.balance);
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
        System.out.println("[COMMAND DEPOSIT] Account: " + id + " Balance: " + this.balance);
    }

}
