package patterns.structural.proxy.interfaces.implementations;

import patterns.structural.proxy.interfaces.IAccount;
import patterns.structural.proxy.model.Account;

/**
 * @author sebastianjara on 02-03-21
 * @project design-patterns
 */
public class BankAccountA implements IAccount {

    public BankAccountA() {
    }

    @Override
    public Account withdrawMoney(Account account, double amount) {
        double currentBalance = account.getInitialBalance() - amount;
        account.setInitialBalance(currentBalance);
        System.out.println("Current Balance: " + account.getInitialBalance());
        return account;
    }

    @Override
    public Account depositMoney(Account account, double amount) {
        double currentBalance = account.getInitialBalance() + amount;
        account.setInitialBalance(currentBalance);
        System.out.println("Current Balance: " + account.getInitialBalance());
        return account;
    }

    @Override
    public void showBalance(Account account) {
        System.out.println("Current Balance: " + account.getInitialBalance());
    }
}
