package org.example.Lesson73_Serializable;

import java.io.*;
import java.util.List;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("straw_hat_pirates_nakamas.ser");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        List<String> nakamas = (List<String>) ois.readObject();

        nakamas.forEach(nakama -> System.out.println(nakama));


    }
}
