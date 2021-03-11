package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.databases.FactoryConnectionDB;
import patterns.creational.abstractfactory.databases.IConnectionDB;
import patterns.creational.abstractfactory.webservices.IConnectionREST;

/**
 * @author sebastianjara on 01-03-21
 * @project design-patterns
 */
public class App {

    public static void main(String[] args) {

        AbstractFactory dbFactory = ProducerFactory.getFactory("DB");
        IConnectionDB mysql = dbFactory.getDB("MYSQL");
        mysql.connect();

        AbstractFactory restFactory = ProducerFactory.getFactory("REST");
        IConnectionREST purchases = restFactory.getREST("PURCHASES");
        purchases.readURL("http://localhost:8080/");

    }
}
