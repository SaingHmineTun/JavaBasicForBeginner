package org.example;

public class Lesson58_ThrowNewException {
    public static void main(String[] args) {
        operate();
    }


    public static void operate() throws ArithmeticException {

        int x = 10;
        int y = 0;
        if (x > 5) {
            throw new ArithmeticException("X cannot be greater than 5");
        }
        int z = x / 0;
    }

}
