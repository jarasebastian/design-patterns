package patterns.creational.singleton.model;

/**
 * @author sebastianjara on 01-03-21
 * @project design-patterns
 *
 * Class which implements a Singleton pattern
 *
 * Ensure a class has only instance and provide a global point of access
 */
public class Connection {

    //Instance declaration
    private static Connection instance;

    /**
     * The constructor is declared as private for avoiding
     * any instance could be created through the "new" operator
     */
    private Connection(){}

    /**
     * Gets a static an unique instance for this class
     * @return a new instance or the current instance in case it already exists
     */
    public static Connection getInstance(){
        if(instance == null){
            instance = new Connection();
        }
        return instance;
    }

    public void connect(){
        System.out.println("The DB connection is ready");
    }

    public void disconnect(){
        System.out.println("The DB connection has ended");
    }



}
