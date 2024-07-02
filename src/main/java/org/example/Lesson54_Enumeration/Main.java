package org.example.Lesson54_Enumeration;

public class Main {
    public static void main(String[] args) {
        Priority low = Priority.HIGH;
        printPriority(low);
    }

    public static void printPriority(Priority priority) {
        switch (priority) {
            case Priority.HIGH -> System.out.println("Temperature is very high");
            case Priority.LOW -> System.out.println("LOW");
            case Priority.MEDIUM -> System.out.println("MEDIUM");
        }
        priority.setName("I am high");
        System.out.println(priority.getName());
    }


}
