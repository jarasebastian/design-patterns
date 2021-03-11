package patterns.behavioral.strategy;

/**
 * @author sebastianjara on 03-03-21
 * @project design-patterns
 */
public abstract class SimpleScan implements IStrategy {

    @Override
    public void analize() {
        start();
        skipZip();
        stop();
    }

    abstract void start();

    abstract void skipZip();

    abstract void stop();

}
