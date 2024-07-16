package org.example.Lesson72_FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        File file = new File("myfile.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.append("Hello World");
        writer.newLine();
        writer.append("My name is buffy");
        writer.close();
    }
}
