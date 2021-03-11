package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.databases.IConnectionDB;
import patterns.creational.abstractfactory.webservices.IConnectionREST;

/**
 * @author sebastianjara on 01-03-21
 * @project design-patterns
 */
public interface AbstractFactory {

    IConnectionREST getREST(String area);
    IConnectionDB getDB(String engine);

}
