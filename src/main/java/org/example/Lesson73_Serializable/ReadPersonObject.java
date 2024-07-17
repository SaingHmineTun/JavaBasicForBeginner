package org.example.Lesson73_Serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadPersonObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("person.ser");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Object o = ois.readObject();
        if (o instanceof Person) {
            Person person = (Person) o;
            System.out.println(person.getName() + " : " + person.getAge());
        }
    }
}
