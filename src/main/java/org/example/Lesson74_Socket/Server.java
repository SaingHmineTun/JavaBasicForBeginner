package org.example.Lesson74_Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(5000);
        while (true) {
            System.out.println("Server is listening on port 5000");
            Socket socket = serverSocket.accept();
            OutputStream os = socket.getOutputStream();

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
            writer.append("Hello, I'm Server");
            writer.flush();
            writer.close();
        }

    }
}
