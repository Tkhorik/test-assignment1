import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class StreemImpl implements Streem {

    String fileName = "test.txt";

    String line = null;

    @Override
    public String readFromFile() { // The name of the file to open.
        String fileName = "test.txt";
//        Scanner s = new Scanner(new File(fileName));
        ArrayList<String> list = new ArrayList<String>();
        try {
            byte[] buffer = new byte[1000];

            int total;
            try (FileInputStream inputStream = new FileInputStream(fileName)) {

                total = 0;
                int nRead = 0;
                while ((nRead = inputStream.read(buffer)) != -1) {
                    return (new String(buffer));
//                    total += nRead;
                }

                inputStream.close();
            }

            System.out.println("Read " + total + " bytes");
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
        }
        return fileName;
    }

    @Override
    public String printToConsole() {
        return null;
    }

    @Override
    public void writeIntoFile() {
        return;
    }
}