package org.example;

import java.util.Scanner;

public class Lesson19_Switch_Statement {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your student grade!");
        int studentGrade = scanner.nextInt();

        switch (studentGrade) {
            case 1, 2, 3, 4:
                System.out.println("*********************");
                System.out.println("Go to primary school");
                System.out.println("*********************");
                break;
            case 5, 6, 7, 8:
                System.out.println("Go to middle school");
                break;
            default:
                System.out.println("Go to head master's office");
        }

    }
}
