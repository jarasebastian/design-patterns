package patterns.behavioral.observer;

/**
 * @author sebastianjara on 03-03-21
 * @project design-patterns
 */
public class YenObserver extends Observer {

    private double exchangeRate = 3.25;

    public YenObserver(Subject subject){
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("YEN: " + (subject.getState() * exchangeRate));
    }
}
