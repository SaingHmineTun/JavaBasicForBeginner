package org.example.Lesson42_WrapperClasses;
/*
byte
int
short
long

float
double

char
boolean
 */
public class PrimitiveToString {
    public static void main(String[] args) {
        // int to String
        int number = 123;
        printString(String.valueOf(number));

        // boolean to String
        boolean bool = true;
        String boolString = String.valueOf(bool);
        printString(boolString);

        // char to String
        char ch = 'a';
        String chString = String.valueOf(ch);
    }

    public static void printString(String str) {
        System.out.println("Hello, " + str);
    }

}
