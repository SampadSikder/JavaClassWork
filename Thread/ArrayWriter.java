import java.lang.Runnable;

public class ArrayWriter implements Runnable {
    private final SimpleArray sharedSimpleArray;
    private final int startValue;

    public ArrayWriter(int value, SimpleArray array) {
        startValue = value;
        sharedSimpleArray = array;
    }

    public void run() {
        for (int i = startValue; i < startValue + 10; i++) {
            sharedSimpleArray.add(i);
        }
    }
}
