import applications.world.hello.ADocumentFactory;
import applications.world.hello.DocumentFactory_SimpleFactory;

public class Application {

    /***
     * Prints examples of the three types of documents created by the Factory.  Here to emphasise the fact that,
     * being subclasses of ADocumentFactory, they can both be used without express knowledge of which class
     * was actually instantiated.
     *
     * @param aDocumentFactory Concrete Factory Object that is either a "MICROSOFT", "OPENOFFICE"  or similar type.
     */
    private static void printFactoryDocuments(ADocumentFactory aDocumentFactory) {
        aDocumentFactory.documentFactory("WORD_PROCESSOR").open();
        aDocumentFactory.documentFactory("WORD_PROCESSOR").close();

        System.out.println("- - -");

        aDocumentFactory.documentFactory("SPREADSHEET").open();
        aDocumentFactory.documentFactory("SPREADSHEET").close();

        System.out.println("- - -");

        aDocumentFactory.documentFactory("PRESENTATION").open();
        aDocumentFactory.documentFactory("PRESENTATION").close();

        System.out.println("- - -");
    }


    public static void main(String[] args)  {
        ADocumentFactory microsoftFactory = new DocumentFactory_SimpleFactory().simpleDocumentFactory("MICROSOFT");
        ADocumentFactory openofficeFactory = new DocumentFactory_SimpleFactory().simpleDocumentFactory("OPENOFFICE");

        printFactoryDocuments(microsoftFactory);

        printFactoryDocuments(openofficeFactory);
    }
}

