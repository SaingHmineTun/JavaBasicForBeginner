package org.example.Lesson61_ThreadClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Main");
        Thread thread = new WorkerThread();
        thread.start();
        System.out.println("End Main");
    }
}
