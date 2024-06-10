package org.example;

/*
Only work with List and Array
 */
public class Lesson28_LoopArray {
    public static void main(String[] args) {

        int[] numbers = {123, 234, 345, 456};
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

    }
}
