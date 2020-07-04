package applications.world.hello;

/***
 * Handles DocumentFactory creation using the Simple Document Factory Pattern...Construct...thing.
 *
 * The Simple Factory is:
 * - Not a true factory
 * - Encapsulates object creation in one place (should be the only part of the application that refers to concrete classes)
 * - reduces duplicate code by enforcing DRY (Don't Repeat Yourself)
 *
 * This could be implemented as either "static" or "singleton".
 *
 */
public class DocumentFactory_SimpleFactory {

    /***
     * Returns an object of the specified document factory type.  Returns null if the specified document factory type
     * is not supported.
     * @param documentFactoryType "MICROSOFT" or "OPENOFFICE"
     * @return a DocumentFactory corresponding to the Document Factory Type passed in
     */
    public ADocumentFactory simpleDocumentFactory(String documentFactoryType) {
        ADocumentFactory documentFactory = null;

        switch (documentFactoryType) {
            case "MICROSOFT" : documentFactory = new MicrosoftDocumentFactory(); break;
            case "OPENOFFICE" : documentFactory = new OpenOfficeDocumentFactory(); break;
        }

        return documentFactory;
    }
}
