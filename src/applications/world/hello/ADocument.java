package applications.world.hello;

/***
 * Creates the contract which guarantees that any document will have an
 * "open()" and "close()" method that does not accept any arguments.
 */
public abstract class ADocument {

    public abstract void open();
    public abstract void close();
}
