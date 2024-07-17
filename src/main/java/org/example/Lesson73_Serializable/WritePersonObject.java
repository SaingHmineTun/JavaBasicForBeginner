package org.example.Lesson73_Serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WritePersonObject {
    public static void main(String[] args) throws IOException {
        File file = new File("person.ser");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        Person person = new Person("Sai Mao", 28);

        oos.writeObject(person);
        oos.close();

    }
}
