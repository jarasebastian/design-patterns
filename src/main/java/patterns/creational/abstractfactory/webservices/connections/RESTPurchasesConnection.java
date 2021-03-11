package patterns.creational.abstractfactory.webservices.connections;

import patterns.creational.abstractfactory.webservices.IConnectionREST;

/**
 * @author sebastianjara on 01-03-21
 * @project design-patterns
 */
public class RESTPurchasesConnection implements IConnectionREST {

    @Override
    public void readURL(String url) {
        System.out.println("Connecting to " + url);
    }
}
