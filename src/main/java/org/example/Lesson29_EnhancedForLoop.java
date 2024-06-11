package org.example;

/*
Syntax : for (var variable_name: array)
 */
public class Lesson29_EnhancedForLoop {
    public static void main(String[] args) {
        String[] names = {"Sai", "Mao", "From", "Muse"};
        int[] numbers = {1, 2, 3, 4, 5, 6};
        for (var name : numbers) {
            System.out.println(name);
        }
    }
}
