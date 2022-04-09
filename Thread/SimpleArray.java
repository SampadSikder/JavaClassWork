import java.util.Random;

public class SimpleArray {
    private final int array[];
    private int writeIndex=0;
    private final static Random generator= new Random();

    public SimpleArray(int size){
        array=new int[size];
    }

    public synchronized void add(int value){
        int position=writeIndex;
            try{
                Thread.sleep(generator.nextInt(5000));
            }catch(InterruptedException e){
                System.out.println("Interrupted");
            }
        
        array[writeIndex]=value;
        System.out.printf("%s wrote %d element to %d\n",Thread.currentThread().getName(),value,position);
        writeIndex++;
        
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<array.length;i++){
            sb.append(array[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}
