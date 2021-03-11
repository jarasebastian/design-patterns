package patterns.structural.proxy.interfaces;

import patterns.structural.proxy.model.Account;

/**
 * @author sebastianjara on 02-03-21
 * @project design-patterns
 */
public interface IAccount {

    Account withdrawMoney(Account account, double amount);
    Account depositMoney(Account account, double amount);
    void showBalance(Account account);

}
