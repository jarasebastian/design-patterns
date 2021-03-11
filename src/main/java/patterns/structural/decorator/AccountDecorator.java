package patterns.structural.decorator;

import patterns.structural.decorator.interfaces.IBankAccount;
import patterns.structural.decorator.model.BankAccount;

/**
 * @author sebastianjara on 02-03-21
 * @project design-patterns
 */
public abstract class AccountDecorator implements IBankAccount {

    protected IBankAccount decoratedAccount;

    public AccountDecorator(IBankAccount decoratedAccount){
        this.decoratedAccount = decoratedAccount;
    }

    @Override
    public void openAccount(BankAccount bankAccount) {

    }
}
