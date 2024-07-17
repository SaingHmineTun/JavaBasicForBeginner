package org.example.Lesson75_ChattingApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Client client  =new Client();
        client.init();
    }

    private void init() throws IOException {
        Socket socket = new Socket("127.0.0.1", 5432);
        var writer = new PrintWriter(socket.getOutputStream(), true);
        var reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        startWriterThread(writer);
        startReaderThread(reader);
    }

    private void startReaderThread(BufferedReader reader) {


        Thread th = new Thread(() -> {
            while (true) {
                try {
                    String message = reader.readLine();
                    System.out.println("Server : " + message);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        th.start();
    }

    private void startWriterThread(PrintWriter writer) {
        {
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

    }
}
