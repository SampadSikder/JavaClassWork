import java.net.*;
import java.util.Stack;
import java.io.*;

public class server {
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;
    private DataOutputStream out = null;

    private Stack<String> stringStack;

    public server(int port) {
        try {
            server = new ServerSocket(port);
            System.out.println("Server started");
            System.out.println("Waiting for a client ...");

            socket = server.accept();// accepting server
            System.out.println("Client accepted");

            in = new DataInputStream(
                    new BufferedInputStream(socket.getInputStream()));

            out = new DataOutputStream(socket.getOutputStream());

            String line = "";
            int size;
            System.out.println("Enter stack size");
            in.readInt();

            stringStack = new Stack<String>();

            System.out.println("Enter stack elements: ");

            while (!line.equals("End")) {
                try {
                    line = in.readUTF();
                    stringStack.push(line);
                } catch (IOException i) {
                    System.out.println(i);
                }
            }
            System.out.println("Closing connection..");

            in.close();
            out.close();
            socket.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        server server = new server(5000);
    }
}
