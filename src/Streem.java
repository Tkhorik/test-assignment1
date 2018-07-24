import java.io.FileNotFoundException;

public interface Streem {

    String readFromFile() throws FileNotFoundException;

    String printToConsole();
    void writeIntoFile();
}
