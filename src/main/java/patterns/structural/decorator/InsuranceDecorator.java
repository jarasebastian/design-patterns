package patterns.structural.decorator;

import patterns.structural.decorator.interfaces.IBankAccount;
import patterns.structural.decorator.model.BankAccount;

/**
 * @author sebastianjara on 02-03-21
 * @project design-patterns
 */
public class InsuranceDecorator extends AccountDecorator {

    public InsuranceDecorator(IBankAccount decoratedAccount) {
        super(decoratedAccount);
    }

    @Override
    public void openAccount(BankAccount bankAccount){
        decoratedAccount.openAccount(bankAccount);
        addInsurance(bankAccount);
    }

    public void addInsurance(BankAccount bankAccount){
        System.out.println("A ensurance was added to the customer account " + bankAccount.getCustomer());
    }

}
