package org.example;

public class Lesson62_ThreadRunnableInterface {
    public static void main(String[] args) {


        System.out.println("Start of Main");
        Thread th = new Thread(new Runner("Thread 1"));
        th.start();

        Thread th4 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(200);
                    System.out.println("Listening... to Thread 4");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        th4.start();

        System.out.println("End of Main");

    }


    static class Runner implements Runnable {

        public String name;

        public Runner(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Listening... to " + name);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
