package org.example;

import org.example.Lesson61_ThreadClass.WorkerThread;

public class Lesson64_ThreadSynchronization {
    public static void main(String[] args) throws InterruptedException {
        var main = new Lesson64_ThreadSynchronization();
        main.init();
    }

    int counter = 0;

    private synchronized void increaseCounter() {
        counter++;
    }

    private void incCounter() {
        synchronized (this) {
            counter++;
        }
    }

    private void init() throws InterruptedException {
        class WorkerThread extends Thread {
            @Override
            public void run() {
                for (int i = 0; i < 100_000; i++) {
                    incCounter();
                }
            }
        }

        Thread th1 = new WorkerThread();
        th1.start();
        Thread th2 = new WorkerThread();
        th2.start();
        Thread th3 = new WorkerThread();
        th3.start();
        Thread th4 = new WorkerThread();
        th4.start();
        Thread th5 = new WorkerThread();
        th5.start();

        th1.join();
        th2.join();
        th3.join();
        th4.join();
        th5.join();

        System.out.println("Counter - " + counter);
    }
}
