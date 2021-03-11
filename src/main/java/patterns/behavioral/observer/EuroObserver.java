package patterns.behavioral.observer;

/**
 * @author sebastianjara on 03-03-21
 * @project design-patterns
 */
public class EuroObserver extends Observer {

    private double exchangeRate = 19.07;

    public EuroObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("EUR: " + (subject.getState() * exchangeRate));
    }
}
