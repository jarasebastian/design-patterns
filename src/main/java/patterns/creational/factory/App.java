package patterns.creational.factory;

/**
 * @author sebastianjara on 01-03-21
 * @project design-patterns
 */
public class App {

    public static void main(String[] args) {

        FactoryConnection factory = new FactoryConnection();

        IConnection mysql = factory.getConnection("MYSQL");
        mysql.connect();
        mysql.disconnect();

        IConnection postgre = factory.getConnection("POSTGRESQL");
        postgre.connect();
        postgre.disconnect();

    }
}
