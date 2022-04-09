import java.lang.Thread;
import java.util.*;
public class ThreadCreator {
    public static void main(String[] args){
        PrintTask thread1 = new PrintTask("Thread 1");
        PrintTask thread2 = new PrintTask("Thread 2");
        PrintTask thread3 = new PrintTask("Thread 3");

        ExecutorService threadExecutor=Executors.newCachedThreadPool();
        threadExecutor.execute(thread1);
        threadExecutor.execute(thread2);
        threadExecutor.execute(thread3);

        System.out.println("Main thread exiting.");

        threadExecutor.shutdown();
    }
}
