package patterns.structural.decorator;

import patterns.structural.decorator.interfaces.IBankAccount;
import patterns.structural.decorator.interfaces.implementations.TransactionAccount;
import patterns.structural.decorator.model.BankAccount;

/**
 * @author sebastianjara on 02-03-21
 * @project design-patterns
 */
public class App {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(1, "Sebastian");

        IBankAccount transactionAccount = new TransactionAccount();
        IBankAccount insuredAccount = new InsuranceDecorator(transactionAccount);

        insuredAccount.openAccount(bankAccount);


    }
}
