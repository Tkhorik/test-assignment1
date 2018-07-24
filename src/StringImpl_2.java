import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class StringImpl_2 implements Streem {
    @Override
    public String readFromFile() {
        String result = null; // to join lines
        try {
            result = Files.lines(Paths.get("test.txt"))
                    .parallel() // for parallel processing
                    .map(String::trim) // to change line
                    .filter(line -> line.length() > 2) // to filter some lines by a predicate
                    .collect(Collectors.joining());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public String printToConsole() {
        return new Sorter().returnSortetItems();
    }

    @Override
    public void writeIntoFile() {
    }


}
