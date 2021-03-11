package patterns.creational.prototype;

/**
 * @author sebastianjara on 02-03-21
 * @project design-patterns
 *
 * Defines a common clone method for future implementations
 * which extends of Cloneable to allow to clone objects
 */
public interface IAccount extends Cloneable {

    IAccount cloneAccount();
}
