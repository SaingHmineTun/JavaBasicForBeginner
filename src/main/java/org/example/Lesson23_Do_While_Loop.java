package org.example;

public class Lesson23_Do_While_Loop {
    public static void main(String[] args) {

        // 1. initialize variable
//        int i = 5;
//        do {
//            System.out.println(i);
//            i ++; // 3. Update Variable
//
//        } while (i < 10); // 2. Check Condition

        int i = 5;
//        while (i < 5) {
//            System.out.println(i);
//            i ++;
//        }
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
        System.out.println("Out of loop");
    }
}
