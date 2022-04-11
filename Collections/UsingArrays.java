import java.util.Arrays;

public class UsingArrays<E> {
    private Integer newArr[] = { 4, 3, 2, 1 };
    private Double doubArr[] = { 1.1, 2.2, 3.4 };

    private Integer intCopy[], doubCopy[];

    public UsingArrays() {
        intCopy = new Integer[10];

        Arrays.fill(intCopy, 7);
        Arrays.sort(newArr);
    }

    public <E> void printArray() {
        for (int element : newArr) {
            System.out.printf("%s", element);
        }
        for (double element : doubArr) {
            System.out.printf("%s", element);
        }
        for (int element : intCopy) {
            System.out.printf("%s", element);
        }
    }

    public <E> int searchForInt(int value) {
        int key;
        key = Arrays.binarySearch(newArr, value);
        return key;
    }

    public static void main(String[] args) {
        UsingArrays obj = new UsingArrays();

        obj.printArray();
        System.out.printf("Found at index %d", obj.searchForInt(4));

    }
}
