package HomeWorkApp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Client {
    private Socket socket;


    public Client() {
        start();
        communicate();
    }
    private void start() {
        try {
            Thread.sleep(3000);
             socket = new Socket("localhost", 8899);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void communicate() {
        try {
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());
            Scanner scanner = new Scanner(System.in);

            AtomicBoolean isAlive = new AtomicBoolean(true);

            new Thread(() -> {
                try {
                    while (true) {
                        String inBoundMessage = in.readUTF();
                        if (inBoundMessage.equals("-exit")) {
                            isAlive.set(false);
                            System.out.println("Please press ENTER!!! to closing client...");
                            break;
                        } else {
                            System.out.println(inBoundMessage);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }).start();

            while (true) {

                if (!isAlive.get()) {
                    System.out.println("Client closing....");
                    System.out.println("STATUS OK.");
                    break;
                }
                System.out.println("Please enter message...");
                String outBoundMessage = scanner.nextLine();
                out.writeUTF(outBoundMessage);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
