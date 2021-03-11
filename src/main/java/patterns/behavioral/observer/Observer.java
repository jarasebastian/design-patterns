package patterns.behavioral.observer;

/**
 * @author sebastianjara on 03-03-21
 * @project design-patterns
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();

}
