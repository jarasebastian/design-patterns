package patterns.creational.abstractfactory.webservices;

import patterns.creational.abstractfactory.AbstractFactory;
import patterns.creational.abstractfactory.databases.IConnectionDB;
import patterns.creational.abstractfactory.webservices.connections.RESTNoAreaConnection;
import patterns.creational.abstractfactory.webservices.connections.RESTPurchasesConnection;
import patterns.creational.abstractfactory.webservices.connections.RESTSalesConnection;

/**
 * @author sebastianjara on 01-03-21
 * @project design-patterns
 */
public class FactoryConnectionREST implements AbstractFactory {

    @Override
    public IConnectionREST getREST(String area) {

        if(area.equals("") || area == null){
            return new RESTNoAreaConnection();
        }

        if(area.equalsIgnoreCase("PURCHASES")){
            return new RESTPurchasesConnection();
        } else if(area.equalsIgnoreCase("SALES")){
            return new RESTSalesConnection();
        }

        return new RESTNoAreaConnection();
    }

    @Override
    public IConnectionDB getDB(String engine) {
        return null;
    }
}
