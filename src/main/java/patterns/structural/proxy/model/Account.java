package patterns.structural.proxy.model;

/**
 * @author sebastianjara on 02-03-21
 * @project design-patterns
 */
public class Account {

    private int idAccount;
    private String user;
    private double initialBalance;

    public Account(int idAccount, String user, double initialBalance) {
        this.idAccount = idAccount;
        this.user = user;
        this.initialBalance = initialBalance;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

}
