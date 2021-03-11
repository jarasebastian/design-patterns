package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.databases.FactoryConnectionDB;
import patterns.creational.abstractfactory.webservices.FactoryConnectionREST;

/**
 * @author sebastianjara on 01-03-21
 * @project design-patterns
 */
public class ProducerFactory {

    public static AbstractFactory getFactory(String factoryType){

        if(factoryType.equalsIgnoreCase("DB")){
            return new FactoryConnectionDB();
        } else if(factoryType.equalsIgnoreCase("REST")){
            return new FactoryConnectionREST();
        }

        return null;
    }
}
