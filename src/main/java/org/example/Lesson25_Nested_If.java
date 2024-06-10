package org.example;

import java.util.Scanner;

/*
Nested If
 */
public class Lesson25_Nested_If {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your grade!");
        int grade = sc.nextInt();
        if (grade > 0 && grade <= 12) {
            // 1 .. 12
            if (grade <= 4) {
                System.out.println("#######################");
                System.out.println("Go to primary school!");
                System.out.println("#######################");
            } else if (grade <= 6) {
                System.out.println("************************");
                System.out.println("Go to pre-middle school");
                System.out.println("************************");
            } else if (grade <= 8) {
                System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
                System.out.println("Go to post-middle school");
                System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
            } else {
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                System.out.println("Go to Headmaster's office");
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            }
        } else {
            System.out.println("Invalid Grade Input!!!");
        }

    }
}
