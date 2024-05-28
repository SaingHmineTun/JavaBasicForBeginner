package org.example;


import java.util.Scanner;
/*
System.in is a class to request input from user
It works really well with Scanner
1) next() returns String
2) nextInt() returns int
3) nextFloat() returns float
4) nextBoolean() returns boolean
 */
public class Lesson10_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number here : ");
        int i = sc.nextInt();
        System.out.println(i);
    }
}
