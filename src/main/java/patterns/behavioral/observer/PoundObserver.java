package patterns.behavioral.observer;

/**
 * @author sebastianjara on 03-03-21
 * @project design-patterns
 */
public class PoundObserver extends Observer {

    private double exchangeRate = 20.50;

    public PoundObserver(Subject subject){
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("US: " + (subject.getState() * exchangeRate));
    }
}
