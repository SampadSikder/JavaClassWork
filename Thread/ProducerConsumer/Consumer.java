import java.util.Random;

public class Consumer implements Runnable {
    private final static Random generator = new Random();
    private final Buffer sharedLocation;

    public Consumer(Buffer shared) {
        sharedLocation = shared;
    }

    public void run() {
        int sum = 0;
        for (int count = 1; count <= 10; count++) {
            try {
                Thread.sleep(generator.nextInt(300));

                sum += sharedLocation.get();
                ;
                System.out.printf("\t\t\t%2d\n", sum);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        System.out.println("Terminating consumer");
    }
}
