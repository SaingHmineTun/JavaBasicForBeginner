package org.example;

public class Lesson13_TernaryOperator {
    public static void main(String[] args) {
        boolean isMale = false;
        boolean isEven = 9 % 2 == 0;
        // boolean ? valueTrue : valueFalse;
        String name = isMale ? "Mr" : "Mrs";
        int number = isEven ? 0 : 1;
        System.out.println(number);
    }
}

/*
String email = "test@gmail.com"
int password = 1234;

Scanner
please enter your email
email => sc.next()
please enter your password
password => sc.nextInt()
email = email
password = password
if true -> Login success!
if false -> Login failed!

 */
