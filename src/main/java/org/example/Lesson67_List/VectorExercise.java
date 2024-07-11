package org.example.Lesson67_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

// CRUD => Create, Read, Update, Delete
public class VectorExercise {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>(); // Upcasting
        // Add new element into List
        list.addElement("Sai");
        list.addElement("Mao");
        list.add("From");
        list.add("Namkham");
        list.insertElementAt(",", 2);
        System.out.println("Size : " + list.size());

        // Read element from List
        System.out.println("First index : " + list.elementAt(0));
        System.out.println("Last index : " + list.get(list.size() - 1));

        // Update element in List
        list.setElementAt("Muse", list.size() - 1);
        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();

        // Remove element in list
        list.removeElementAt(2); // remove by index
        list.remove("Muse"); // remove by element
        System.out.println("Size : " + list.size());

        System.out.println(list.contains("Sai"));

    }
}
