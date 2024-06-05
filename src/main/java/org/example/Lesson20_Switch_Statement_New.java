package org.example;

public class Lesson20_Switch_Statement_New {
    public static void main(String[] args) {
        String name = "233";
        switch (name) {
            case "Mg", "Sai", "Mai" -> {
                System.out.println("**************");
                System.out.println("Hello, Mr!!!");
                System.out.println("***************");
            }
            case "Ma", "Nang", "Lway" -> {
                System.out.println("Hello, Mrs!!!");
            }
            default -> {
                System.out.println("Unexpected input");
            }
        }
    }
}
