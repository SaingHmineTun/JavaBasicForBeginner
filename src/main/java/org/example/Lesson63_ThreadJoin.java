package org.example;

public class Lesson63_ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start of main");
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        System.out.println("Thread Started");
        thread.start();

        thread.join();
        System.out.println("End of main");
    }
}
