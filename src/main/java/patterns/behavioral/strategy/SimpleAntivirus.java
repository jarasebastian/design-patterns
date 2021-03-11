package patterns.behavioral.strategy;

/**
 * @author sebastianjara on 03-03-21
 * @project design-patterns
 */
public class SimpleAntivirus extends SimpleScan {

    @Override
    void start() {
        System.out.println("Simple Antivirus - Simple scan has started");
    }

    @Override
    void skipZip() {
        try {
            System.out.println("Analyzing...");
            Thread.sleep(2500);
            System.out.println("It could not analized the '.zip' files extension");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void stop() {
        System.out.println("Simple Antivirus - Simple scan has finished");
    }
}
