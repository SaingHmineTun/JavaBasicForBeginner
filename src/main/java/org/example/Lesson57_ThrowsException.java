package org.example;

public class Lesson57_ThrowsException {
    public static void main(String[] args) {
        try {
            int i = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero exception");
        } finally {
            System.out.println("FINALLY");
        }
    }

    private static void sleep() throws InterruptedException {
        System.out.println("Before sleep");
        Thread.sleep(2000);
        System.out.println("After sleep");
    }


}
