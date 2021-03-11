package patterns.creational.prototype;

/**
 * @author sebastianjara on 02-03-21
 * @project design-patterns
 */
public class App {

    public static void main(String[] args) {

        AccountA accountA = new AccountA();
        accountA.setAmount(200);

        AccountA accountACloned = (AccountA) accountA.cloneAccount();

        if(accountACloned != null){
            //Checks the object cloned has the same values than the original one
            System.out.println(accountACloned.toString());
            /* We can check the accountACloned is no equal, that's because despite of
               they have the same values, they are different references in memory */
            System.out.println(accountA == accountACloned);
        }

    }
}

