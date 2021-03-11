package patterns.behavioral.strategy;

/**
 * @author sebastianjara on 03-03-21
 * @project design-patterns
 */
public abstract class DeepScan implements IStrategy {

    @Override
    public void analize() {
        start();
        analizeMemory();
        analizeKeyLoggers();
        analizeRootKits();
        uncompressZip();
        stop();
    }

    abstract void start();

    abstract void analizeMemory();

    abstract void analizeKeyLoggers();

    abstract void analizeRootKits();

    abstract void uncompressZip();

    abstract void stop();

}
