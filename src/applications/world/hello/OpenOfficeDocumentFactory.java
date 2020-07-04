package applications.world.hello;

/***
 * Creates OpenOffice Platform documents.
 */
public class OpenOfficeDocumentFactory extends ADocumentFactory {

    /***
     * Returns an object of the specified document type.  Returns null if the specified document type
     * is not supported.
     * @param documentType "SPREADSHEET", "WORD_PROCESSOR" or "PRESENTATION"
     * @return Object of the selected document type using the OpenOffice Platform
     */
    @Override
    public ADocument documentFactory(String documentType) {

        ADocument result = null;

        switch (documentType) {
            case "SPREADSHEET"      : result = new Spreadsheet_Calc(); break;
            case "WORD_PROCESSOR"   : result = new WordProcessor_Writer(); break;
            case "PRESENTATION"     : result = new Presentation_Impress(); break;
        }
        return result;
    }
}
