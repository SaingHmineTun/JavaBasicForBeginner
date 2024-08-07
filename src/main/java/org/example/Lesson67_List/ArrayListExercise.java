package org.example.Lesson67_List;

import java.util.ArrayList;
import java.util.List;

// CRUD => Create, Read, Update, Delete
public class ArrayListExercise {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // Add new element into List
        list.add("Sai");
        list.add("Mao");
        list.add("From");
        list.add("Namkham");
        list.add(2, ",");
        System.out.println("Size : " + list.size());

        // Read element from List
        System.out.println("First index : " + list.get(0));
        System.out.println("Last index : " + list.get(list.size() - 1));

        // Update element in List
        list.set(list.size() - 1, "Muse");
        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();

        // Remove element in list
        list.remove(2); // remove by index
        list.remove("Muse"); // remove by element
        System.out.println("Size : " + list.size());

        System.out.println(list.contains("Sai"));

    }
}
