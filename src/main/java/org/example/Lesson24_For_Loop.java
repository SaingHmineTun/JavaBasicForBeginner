package org.example;

public class Lesson24_For_Loop {
    public static void main(String[] args) {

        /*
        1. initial value
        2. check condition
        3. update value
         */
        // Print number 1 to 10
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        // (initial; check condition; update value)
        for (int x = 1; x <= 10; x ++) {
            System.out.println(x);
        }
        // Print number 2, 4, 6, 8, 10
        // Print number 10, 9, 8, 7, ..., 1

        char[] characters = {'a', 'b', 'c', 'd', 'e'};





        for (int a = 1; a <= 10; a++, a++) {
            System.out.println(a);
        }

    }
}

/*

*
**
***
****
*****

    *
   **
  ***
 ****
*****

 */
