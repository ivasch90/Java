package HomeWorkApp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket socket;
    private Socket client;

    public Server() {
        start();
        communicate();
        System.out.println("Closing connection...");
        System.out.println("Shutting OFF...");
    }

    private void start() {
        try {
            socket = new ServerSocket(8899);
            System.out.println("Socket created...");
            System.out.println("Waiting for connection...");
            client = socket.accept();
            System.out.println("Client connected...");
            System.out.println(client);
            System.out.println("Status OK.");

        } catch (IOException e) {
            System.out.println("Status error");
            e.printStackTrace();
        }

    }

    private void communicate() {
        try {
            DataInputStream in = new DataInputStream(client.getInputStream());
            DataOutputStream out = new DataOutputStream(client.getOutputStream());

            while (true) {
                String inBoundMessage = in.readUTF();

                if(inBoundMessage.equals("-exit")) {
                    out.writeUTF("ECHO: GoodBye!!!!");
                    out.writeUTF("-exit");
                    break;
                }

                out.writeUTF("ECHO: " + inBoundMessage);
            }


        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}


