package patterns.behavioral.strategy;

/**
 * @author sebastianjara on 03-03-21
 * @project design-patterns
 */
public class AdvancedAntivirus extends DeepScan {

    @Override
    void start() {
        System.out.println("Advanced Antivirus - Deep Scan has started");
    }

    @Override
    void analizeMemory() {
        try {
            System.out.println("Analyzing RAM Memory...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void analizeKeyLoggers() {
        try {
            System.out.println("Analyzing to search Keyloggers...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void analizeRootKits() {
        try {
            System.out.println("Analyzing to search RootKits...");
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void uncompressZip() {
        try {
            System.out.println("Analyzing zip files...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void stop() {
        System.out.println("Advanced Antivirus - Deep Scan has finished");
    }
}
