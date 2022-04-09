import java.util.concurrent.*;

public class SharedArrayTest {
    public static void main(String[] args) {
        SimpleArray array = new SimpleArray(10);

        ArrayWriter writer1 = new ArrayWriter(1, "Writer 1");
        ArrayWriter writer2 = new ArrayWriter(11, "Writer 2");

        ExecutorService executor = Executor.newCachedThreadPool();

        executor.execute(writer1);
        executor.execute(writer2);
}
