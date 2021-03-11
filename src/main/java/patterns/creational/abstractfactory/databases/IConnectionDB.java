package patterns.creational.abstractfactory.databases;

/**
 * @author sebastianjara on 01-03-21
 * @project design-patterns
 */
public interface IConnectionDB {

    void connect();
    void disconnect();

}
