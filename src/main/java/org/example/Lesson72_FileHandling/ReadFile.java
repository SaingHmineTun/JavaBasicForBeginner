package org.example.Lesson72_FileHandling;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\Sai Mao\\Desktop\\Teach Python.txt";
        File file = new File(path);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Cannot read file");
        }

    }
}
