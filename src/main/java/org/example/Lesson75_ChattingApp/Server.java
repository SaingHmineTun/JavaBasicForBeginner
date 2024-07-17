package org.example.Lesson75_ChattingApp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    private PrintWriter writer;
    private BufferedReader reader;

    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.init();
    }

    private void init() throws IOException {

        ServerSocket serverSocket = new ServerSocket(5432);
        while (true) {
            System.out.println("Server is listening on port 5432");
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            reader = new BufferedReader(new InputStreamReader(is));
            writer = new PrintWriter(os, true);

            startReaderThread();
            startWriterThread();

        }

    }

    private void startWriterThread() {
        Thread th = new Thread(() -> {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Write your message");
                String message = sc.nextLine();
                writer.println(message);
            }
        });
        th.start();
    }

    private void startReaderThread() {

        Thread th = new Thread(() -> {
            while (true) {
                try {
                    String message = reader.readLine();
                    System.out.println("Client : " + message);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        th.start();

    }
}
