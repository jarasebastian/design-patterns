package patterns.creational.factory;

import patterns.creational.factory.IConnection;
import patterns.creational.factory.connections.EmptyConnection;
import patterns.creational.factory.connections.MySQLConnection;
import patterns.creational.factory.connections.PostgreSQLConnection;

/**
 * @author sebastianjara on 01-03-21
 * @project design-patterns
 *
 * Implementation of Factory pattern to manage the creation of different DB connections
 *
 * In this pattern we create object without exposing the creation logic to the client
 * and refer the newly created object using a common interface
 *
 * As another benefit this allows to include new implementations
 * without having to refactor the current code.
 */
public class FactoryConnection {

    /**
     * This method return a different DB Connection depending on the sent parameter
     * @param engine is a String value for specifying which DB connection is needed
     * @return the connection interface with its specific implementation asked
     */
    public IConnection getConnection(String engine){

        if(engine.equals("") || engine == null){
            return new EmptyConnection();
        }

        if(engine.equalsIgnoreCase("MYSQL")){
            return new MySQLConnection("127.0.0.0", "3606", "admin", "nimda");
        } else if(engine.equalsIgnoreCase("POSTGRESQL")){
            return new PostgreSQLConnection("127.0.0.0", "5432", "admin", "nimda");
        }

        return new EmptyConnection();

    }
}
