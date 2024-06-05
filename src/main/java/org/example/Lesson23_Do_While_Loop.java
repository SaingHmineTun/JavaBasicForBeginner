package org.example;

/*
Do while loop
Just like while loop, do-while loop also uses while keyword
But it places its loop body above the conditional statement
That's why, do-while loop will work at least one time no matter what the initial condition is
 */
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
