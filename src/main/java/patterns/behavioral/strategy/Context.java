package patterns.behavioral.strategy;

/**
 * @author sebastianjara on 03-03-21
 * @project design-patterns
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute(){
        this.strategy.analize();
    }
}
