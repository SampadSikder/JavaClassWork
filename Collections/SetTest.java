
import java.util.*;

public class SetTest {
    private static String colors[] = {
            "red", "white", "magenta", "blue", "violet", "black", "red", "blue"
    };

    public SetTest() {
        List<String> list = Arrays.asList(colors);

        for (String element : list) {
            System.out.printf("%s,", element);
        }
        System.out.println("\nNon duplicate:");
        printNonDuplicate(list);
    }

    public void printNonDuplicate(Collection<String> color) {
        Set<String> noDuplicate = new HashSet<String>(color);
        for (String element : noDuplicate) {
            System.out.printf("%s ", element);
        }
    }

    public static void main(String[] args) {
        SetTest obj = new SetTest();

    }
}
