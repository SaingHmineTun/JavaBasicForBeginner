package org.example.Lesson67_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// CRUD => Create, Read, Update, Delete
public class StackExercise {
    public static void main(String[] args) {
        Stack<String> list = new Stack<>();
        // Add new element into List
        list.add("Sai");
        list.add("Mao");
        list.add("From");
        list.add("Namkham");
        list.add(2, ",");
        System.out.println("Size : " + list.size());

        // Read element from List
        System.out.println("First index : " + list.get(0));
        System.out.println("Last index : " + list.peek());

        // Update element in List
        list.set(list.size() - 1, "Muse");
        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();

        // Remove element in list
        String lastElement = list.pop(); // remove by index
        list.remove("Muse"); // remove by element
        System.out.println("Size : " + list.size());

        int index = list.search("From");

        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();
        System.out.println("Search Mao - " + index);

        System.out.println(list.contains("Sai"));

    }
}
