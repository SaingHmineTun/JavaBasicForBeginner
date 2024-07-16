package org.example.Lesson72_FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileWithScanner {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\Users\\Sai Mao\\Desktop\\Teach Python.txt";
        File file = new File(path);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
