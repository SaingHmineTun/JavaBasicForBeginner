package org.example;

public class Lesson56_TryCatch {
    static String name;

    public static void main(String[] args) {

        try {
            int i = 10/2; // Divide by zero exception
            System.out.println(name.toLowerCase()); // Null pointer exception
            System.out.println("Before sleep");
            Thread.sleep(1000); // Interrupted exception
            System.out.println("After sleep");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("NULL POINTER EXCEPTION");
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception");
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero exception");
        }

    }
}
