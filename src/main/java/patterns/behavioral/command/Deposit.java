package patterns.behavioral.command;

/**
 * @author sebastianjara on 03-03-21
 * @project design-patterns
 */
public class Deposit implements IOperation {

    private Account account;
    private double amount;

    public Deposit(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        this.account.deposit(this.amount);
    }
}
