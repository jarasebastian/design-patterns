package patterns.creational.prototype;

/**
 * @author sebastianjara on 02-03-21
 * @project design-patterns
 *
 * Account class
 */
public class AccountA implements IAccount {

    private String type;
    private double amount;

    public AccountA(){
        type = "Saving";
    }

    @Override
    public IAccount cloneAccount() {

        AccountA account = null;
        try {
            account = (AccountA) clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }


        return account;

    }

    @Override
    public String toString(){
        return "AccountA [type=" + type + ", amount=" + amount + "]";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
