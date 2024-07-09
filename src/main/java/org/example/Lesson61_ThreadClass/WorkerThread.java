package org.example.Lesson61_ThreadClass;

public class WorkerThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Cannot sleep");
            }
            System.out.println("i is " + i);
        }
    }
}
