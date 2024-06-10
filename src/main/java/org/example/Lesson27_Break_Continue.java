package org.example;
/*
Break -> Break the loop
Continue -> Skip the loop
 */
public class Lesson27_Break_Continue {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i += 5) {
            if (i == 10) {
                continue;
            }
            System.out.println("i = " + i);

            if (i == 50) {
                break;
            }
        }

    }
}
