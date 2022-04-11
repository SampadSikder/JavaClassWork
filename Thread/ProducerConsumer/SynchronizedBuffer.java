public class SynchronizedBuffer implements Buffer {
    private int buffer = -1;
    public boolean occupied = false;

    public synchronized void set(int value) {
        while (occupied) {
            System.out.printf("Producer tries to write");
            displayState("kire");
            wait();
        }
        buffer = value;

        occupied = true;
        displayState("Producer writes" + buffer);

        notifyAll();
    }

    public synchronized int get() {
        while (!occupied) {
            System.out.printf("Consumer tries to read");
            displayState("kire");
            wait();
        }

        occupied = false;
        displayState("Consumer reads" + buffer);

        notifyAll();

        return buffer;
    }

    public void displayState(String operation) {
        System.out.printf("%40s%d\t\t%b\n\n", operation, buffer, occupied);
    }
}
