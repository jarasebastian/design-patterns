package patterns.creational.factory.connections;

import patterns.creational.factory.IConnection;

/**
 * @author sebastianjara on 01-03-21
 * @project design-patterns
 */
public class PostgreSQLConnection implements IConnection {

    private String host;
    private String port;
    private String user;
    private String pass;

    public PostgreSQLConnection(String host, String port, String user, String pass) {
        this.host = host;
        this.port = port;
        this.user = user;
        this.pass = pass;
    }

    @Override
    public void connect() {
        //here it could be the JDBC code
        System.out.println("it's connected to PostgreSQL");
    }

    @Override
    public void disconnect() {
        System.out.println("it's connected to PostgreSQL");
    }
}
