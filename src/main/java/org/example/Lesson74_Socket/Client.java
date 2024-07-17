package org.example.Lesson74_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 5000);
        InputStream is = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line;
        if ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
