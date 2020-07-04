package applications.world.hello;

public class WordProcessor_Writer extends ADocument {

    public void open() {
        System.out.println("Opening OpenOffice Writer document.");
    }
    public void close() {
        System.out.println("Closing OpenOffice Writer document.");
    }
}
