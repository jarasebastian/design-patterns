package patterns.behavioral.observer;

/**
 * @author sebastianjara on 03-03-21
 * @project design-patterns
 */
public class App {

    public static void main(String[] args) {

        Subject subject = new Subject();

        new YenObserver(subject);
        new EuroObserver(subject);
        new PoundObserver(subject);

        System.out.println("If you wish to exchange 10 dollars you will get: ");
        subject.setState(10);
        System.out.println("--------------------");
        System.out.println("If you wish to exchange 100 dollars you will get: ");
        subject.setState(100);

    }
}
