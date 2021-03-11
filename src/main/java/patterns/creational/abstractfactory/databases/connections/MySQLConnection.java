package patterns.creational.abstractfactory.databases.connections;


import patterns.creational.abstractfactory.databases.IConnectionDB;

/**
 * @author sebastianjara on 01-03-21
 * @project design-patterns
 */
public class MySQLConnection implements IConnectionDB {

    private String host;
    private String port;
    private String user;
    private String pass;

    public MySQLConnection(String host, String port, String user, String pass) {
        this.host = host;
        this.port = port;
        this.user = user;
        this.pass = pass;
    }

    @Override
    public void connect() {
        //here it could be the JDBC code
        System.out.println("it's connected to MySQL");
    }

    @Override
    public void disconnect() {
        System.out.println("it's disconnected to MySQL");
    }
}
