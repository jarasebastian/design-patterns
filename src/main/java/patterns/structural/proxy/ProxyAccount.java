package patterns.structural.proxy;

import patterns.structural.proxy.interfaces.IAccount;
import patterns.structural.proxy.interfaces.implementations.BankAccountA;
import patterns.structural.proxy.model.Account;

import java.util.logging.Logger;

/**
 * @author sebastianjara on 02-03-21
 * @project design-patterns
 *
 * This class implements the proxy pattern
 *
 * Provide a surrogate or placeholder for another object to control access to it.
 * Use an extra level of indirection to support distributed, controlled, or intelligent access.
 * Add a wrapper and delegation to protect the real component from undue complexity.
 */
public class ProxyAccount implements IAccount {

    private IAccount realAccount;
    private final static Logger LOGGER = Logger.getLogger(ProxyAccount.class.getName());

    public ProxyAccount(IAccount realAccount) {
        this.realAccount = realAccount;
    }

    @Override
    public Account withdrawMoney(Account account, double amount) {
        LOGGER.info("----Cuenta Proxy - Retirar Dinero----");
        if (realAccount == null) {
            realAccount = new BankAccountA();
            return realAccount.withdrawMoney(account, amount);
        } else {
            return realAccount.withdrawMoney(account, amount);
        }
    }

    @Override
    public Account depositMoney(Account account, double amount) {
        LOGGER.info("----Cuenta Proxy - Depositar Dinero----");
        if (realAccount == null) {
            realAccount = new BankAccountA();
            return realAccount.depositMoney(account, amount);
        } else {
            return realAccount.depositMoney(account, amount);
        }
    }

    @Override
    public void showBalance(Account account) {
        LOGGER.info("----Cuenta Proxy - Mostrar Dinero----");
        if (realAccount == null) {
            realAccount = new BankAccountA();
            realAccount.showBalance(account);
        } else {
            realAccount.showBalance(account);
        }
    }
}
