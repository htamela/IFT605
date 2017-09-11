import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public static void main(String[] args) {
        Socket socket;
        BufferedReader in;
        PrintWriter out;

        try {
            // Connect to server at "localhost:2017"
            socket = new Socket(InetAddress.getLocalHost(),2017);
            System.out.println("Trying to connect to Server");

            // Get message from server
            in = new BufferedReader (new InputStreamReader(socket.getInputStream()));
            String message_distant = in.readLine();

            // Print the received message
            System.out.println(message_distant);

            // Close the connection
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
