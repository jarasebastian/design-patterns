package patterns.behavioral.strategy;

/**
 * @author sebastianjara on 03-03-21
 * @project design-patterns
 */
public class App {

    public static void main(String[] args) {
        // Context context = new Context(new SimpleAntivirus());
        Context context = new Context(new AdvancedAntivirus());
        context.execute();
    }
}
