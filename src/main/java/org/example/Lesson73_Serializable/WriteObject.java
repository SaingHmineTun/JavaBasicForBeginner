package org.example.Lesson73_Serializable;

import java.io.*;
import java.util.List;

public class WriteObject {
    public static void main(String[] args) throws IOException {

        List<String> strawHatPiratesNakama = List.of("Luffy", "Chopper", "Nami", "Zoro", "Franky", "Brook", "Jinbe", "Robin", "Usopp");
        File file = new File("straw_hat_pirates_nakamas.ser");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        oos.writeObject(strawHatPiratesNakama);
        oos.close();


    }
}
