package patterns.behavioral.command;

/**
 * @author sebastianjara on 03-03-21
 * @project design-patterns
 */
public class App {

    public static void main(String[] args) {

        Account account = new Account(1, 200);

        Deposit depositOp = new Deposit(account, 100);
        Withdraw withdrawOp = new Withdraw(account, 50);

        Invoker invoker = new Invoker();
        invoker.receiveOperation(depositOp);
        invoker.receiveOperation(withdrawOp);

        invoker.doOperation();

    }

}
