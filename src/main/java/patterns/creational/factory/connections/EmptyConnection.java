package patterns.creational.factory.connections;

import patterns.creational.factory.IConnection;

/**
 * @author sebastianjara on 01-03-21
 * @project design-patterns
 */
public class EmptyConnection implements IConnection {

    @Override
    public void connect() {
        System.out.println("DB provider it wasn't specified.");
    }

    @Override
    public void disconnect() {
        System.out.println("DB provider it wasn't specified.");
    }
}
