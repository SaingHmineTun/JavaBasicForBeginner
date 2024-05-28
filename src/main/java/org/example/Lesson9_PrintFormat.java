package org.example;
/*
Format string and print
%n - line break
%b - boolean
%s - string
%c - unicode character
%d - decimal integer
%o - octal integer
%x - hexadecimal integer
%f - floating point number
 */
public class Lesson9_PrintFormat {
    public static void main(String[] args) {
        int ka = 4096;
        System.out.printf("Character %c%nUnicode Value %x%nDecimal Value %d%n", ka, ka, ka);
    }
}