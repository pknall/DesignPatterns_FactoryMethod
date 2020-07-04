package applications.world.hello;

/***
 * Creates the contract which guarantees that any Document Factory will have a Document Factory abstract method
 * which returns ADocument when a documentType is specified.
 */
public abstract class ADocumentFactory {

    public abstract ADocument documentFactory(String documentType);
}
