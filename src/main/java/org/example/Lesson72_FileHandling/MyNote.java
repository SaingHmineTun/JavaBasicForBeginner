package org.example.Lesson72_FileHandling;

import java.io.*;
import java.util.Scanner;

public class MyNote {
    private static File file;

    public static void main(String[] args) {

        file = new File("myfile.txt");

        boolean exit = false;
        while (!exit) {

            String message = """
                    1) Read file
                    2) Write file
                    3) Exit
                    Please choose your action
                    """;
            System.out.println(message);
            Scanner sc = new Scanner(System.in);
            int action = sc.nextInt();
            switch (action) {
                case 1 -> readFile();
                case 2 -> writeFile();
                case 3 -> exit = true;
                default -> System.out.println("Invalid action");
            }
        }


    }

    private static void writeFile() {
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            System.out.println("Please input message here");
            Scanner sc = new Scanner(System.in);
            String message = sc.nextLine();
            writer.append(message);

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile() {
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
