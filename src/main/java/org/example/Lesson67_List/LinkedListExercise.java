package org.example.Lesson67_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// CRUD => Create, Read, Update, Delete
public class LinkedListExercise {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        // Add new element into List
        list.add("Sai");
        list.add("Mao");
        list.add("From");
        list.add("Namkham");
        list.add(2, ",");
        System.out.println("Size : " + list.size());

        // Read element from List
        System.out.println("First index : " + list.getFirst());
        System.out.println("Last index : " + list.getLast());

        // Update element in List
        list.set(list.size() - 1, "Muse");
        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();

        // Remove element in list
        list.poll(); // remove by index
        list.remove("Muse"); // remove by element
        System.out.println("Size : " + list.size());

        System.out.println(list.contains("Sai"));

    }
}
