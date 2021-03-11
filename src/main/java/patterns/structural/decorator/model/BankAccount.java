package patterns.structural.decorator.model;

/**
 * @author sebastianjara on 02-03-21
 * @project design-patterns
 */
public class BankAccount {

    private int id;
    private String customer;

    public BankAccount(int id, String customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
