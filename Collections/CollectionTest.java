import java.util.*;

public class CollectionTest {
    private static final String[] colors = { "Magneta", "Red", "White", "Blue", "Cyan" };
    private static final String[] removeColors = { "Red", "White" };

    public CollectionTest() {
        List<String> list = new ArrayList<String>();
        List<String> removeList = new ArrayList<String>();

        for (String color : colors) {
            list.add(color);
        }
        for (String color : removeColors) {
            removeList.add(color);
        }

        System.out.println("Array list:");

        for (int count = 0; count < list.size(); count++) {
            System.out.printf("%s ", list.get(count));// indexing
        }
        removeColors(list, removeList);

        System.out.println("\nAfter removing:");
        for (String color : list) {// color in list
            System.out.printf("%s ", color);

        }

    }

    private void removeColors(Collection<String> collection1, Collection<String> collection2) {
        Iterator<String> it = collection1.iterator();

        while (it.hasNext()) {
            if (collection2.contains(it.next())) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) {
        new CollectionTest();
    }
}