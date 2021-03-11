package patterns.structural.decorator.interfaces.implementations;

import patterns.structural.decorator.interfaces.IBankAccount;
import patterns.structural.decorator.model.BankAccount;

/**
 * @author sebastianjara on 02-03-21
 * @project design-patterns
 */
public class SavingAccount implements IBankAccount {

    @Override
    public void openAccount(BankAccount bankAccount) {
        System.out.println("-------------------------");
        System.out.println("A saving account was created");
        System.out.println("Customer: " + bankAccount.getCustomer());
    }
}
