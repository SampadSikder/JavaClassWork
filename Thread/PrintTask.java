import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class PrintTask implements Runnable {
    private final int sleepTime;
    private final String taskName;

    private final static Random generator = new Random();

    public PrintTask(String name) {
        this.sleepTime = generator.nextInt(5000);
        this.taskName = name;
    }

    public void run() {// implementing runnable must extend run
        try {
            System.out.println("Going to sleep for " + sleepTime + " milliseconds");

            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + taskName);
        }
        System.out.println("Thread " + taskName + " exiting.");
    }

}
