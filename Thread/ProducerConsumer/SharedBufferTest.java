import java.util.concurrent.ExecutorService;
import java.lang.Runnable;
import java.util.concurrent.Executors;

public class SharedBufferTest {
    public static void main(String[] args) {
        ExecutorService application = Executors.newCachedThreadPool();

        Buffer sharedLocation = new UnsynchronizedBuffer();

        application.execute(new Producer(sharedLocation));
        application.execute(new Consumer(sharedLocation));

        application.shutdown();
    }
}
