package patterns.structural.proxy;

import patterns.structural.proxy.interfaces.IAccount;
import patterns.structural.proxy.interfaces.implementations.BankAccountA;
import patterns.structural.proxy.interfaces.implementations.BankAccountB;
import patterns.structural.proxy.model.Account;

/**
 * @author sebastianjara on 02-03-21
 * @project design-patterns
 */
public class App {

    public static void main(String[] args) {

        Account account = new Account(1, "mitocode", 100);

        /*it enough to change the object called on the ProxyAccount constructor without having
          to change internal business logic for using its functions */
        // IAccount proxyAccount = new ProxyAccount(new BankAccountA());
        IAccount proxyAccount = new ProxyAccount(new BankAccountB());
        proxyAccount.showBalance(account);
        account = proxyAccount.depositMoney(account, 50);
        account = proxyAccount.withdrawMoney(account, 20);
        proxyAccount.showBalance(account);

    }

}
