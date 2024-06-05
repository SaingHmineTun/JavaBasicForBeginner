package org.example;

public class Lesson21_While_Loop {
    public static void main(String[] args) {
        /*
        Effective using of loop
        1. initialize variable
        2. conditional statement using variable
        3. update variable
         */
        var index = 'a'; // 1.
        while (index <= 'z') { // infinite loop
            System.out.println("Character : " + index);
            index ++;
        }
    }
}
