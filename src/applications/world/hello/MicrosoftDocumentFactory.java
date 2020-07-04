package applications.world.hello;

/***
 * Creates Microsoft Platform documents.
 */
public class MicrosoftDocumentFactory extends ADocumentFactory {

    /***
     * Returns an object of the specified document type.  Returns null if the specified document type
     * is not supported.
     * @param documentType "SPREADSHEET", "WORD_PROCESSOR" or "PRESENTATION"
     * @return Object of the selected document type using the Microsoft Platform
     */
    @Override
    public ADocument documentFactory(String documentType) {

        ADocument result = null;

        switch (documentType) {
            case "SPREADSHEET"      : result = new Spreadsheet_Excel(); break;
            case "WORD_PROCESSOR"   : result = new WordProcessor_Word(); break;
            case "PRESENTATION"     : result = new Presentation_PowerPoint(); break;
        }
        return result;
    }
}
