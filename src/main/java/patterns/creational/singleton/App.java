package patterns.creational.singleton;

import patterns.creational.singleton.model.Connection;

/**
 * @author sebastianjara on 01-03-21
 * @project design-patterns
 */
public class App {

    public static void main(String[] args) {

        /* Getting the DB connection instance using the public getInstance() method
           Due to the class constructor is private */
        Connection connection = Connection.getInstance();
        connection.connect();
        connection.disconnect();

    }
}
