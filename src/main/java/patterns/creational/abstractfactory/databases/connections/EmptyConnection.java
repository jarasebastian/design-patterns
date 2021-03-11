package patterns.creational.abstractfactory.databases.connections;

import patterns.creational.abstractfactory.databases.IConnectionDB;

/**
 * @author sebastianjara on 01-03-21
 * @project design-patterns
 */
public class EmptyConnection implements IConnectionDB {

    @Override
    public void connect() {
        System.out.println("DB provider it wasn't specified.");
    }

    @Override
    public void disconnect() {
        System.out.println("DB provider it wasn't specified.");
    }
}
