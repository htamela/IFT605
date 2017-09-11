import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        ServerSocket serverSocket;
        Socket socket;
        PrintWriter out;

        try {
            serverSocket = new ServerSocket(2017);
            System.out.println("Listening on port " + serverSocket.getLocalPort());

            // Wait for connection
            socket = serverSocket.accept();
            System.out.println("Someone is there Knock Knock !!");

            // Send message to client
            out = new PrintWriter(socket.getOutputStream());
            out.println("Hey client, how are you ?");
            out.flush();

            // Close the connection and close Server
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
