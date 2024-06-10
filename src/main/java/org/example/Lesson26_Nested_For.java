package org.example;

public class Lesson26_Nested_For {
    public static void main(String[] args) {
        for (char a = 'a'; a <= 'z'; a++) {
            System.out.println(a);
            for (int i = 0; i < 5; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
