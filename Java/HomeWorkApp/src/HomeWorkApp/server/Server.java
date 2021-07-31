package HomeWorkApp.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {
    private ServerSocket socket;
    private Socket client;
    private DataInputStream in;
    private DataOutputStream out;
    private Scanner scanner;


    public Server() {
        start();
        scanner = new Scanner(System.in);
        communicate();
        sendMessage();
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
                    out = new DataOutputStream(client.getOutputStream());
                        new Thread(() -> {
                            while (true) {
                            try {
                                in = new DataInputStream(client.getInputStream());
                                String inBoundMessage = in.readUTF();
                                if (inBoundMessage.equals("-exit")) {
                                    out.writeUTF("SERVER: GoodBye!!!!");
                                    out.writeUTF("-exit");
                                    break;
                                }
                                    else
                                    System.out.println(inBoundMessage);

                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }

                }).start();

        } catch (IOException e) {
            e.printStackTrace();

        }

    }
    private void sendMessage() {
            while (true) {

                try {
                    String outBoundMessage = scanner.nextLine();
                    if (outBoundMessage.equals("-exit")) {
                        out.writeUTF("-exit");
                        break;

                    } else
                        out.writeUTF(outBoundMessage);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

    }
}


