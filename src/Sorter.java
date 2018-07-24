import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Sorter extends StreemImpl {

    StringImpl_2 stringImpl2 = new StringImpl_2();
    private String stringForSorter = readFromFile().replaceAll("[^0-9. ]", "");

    String returnSortetItems() {
        List<String> items = Arrays.asList(stringForSorter.split(" "));
        Collections.sort(items);
        items.sort(Collections.reverseOrder());
//        Collections.reverse(items);
        for (String item : items) {
            System.out.print((" " + item));
        }
        return null;
    }
}
