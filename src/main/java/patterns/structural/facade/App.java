package patterns.structural.facade;

/**
 * @author sebastianjara on 02-03-21
 * @project design-patterns
 */
public class App {

    public static void main(String[] args) {

        CheckFacade client1 = new CheckFacade();
        client1.search("02/07/2018", "08/07/2018", "Santiago de Chile", "Cancún");

        CheckFacade client2 = new CheckFacade();
        client2.search("02/07/2018", "08/07/2018", "Buenos Aires", "New Zealand");

    }
}
