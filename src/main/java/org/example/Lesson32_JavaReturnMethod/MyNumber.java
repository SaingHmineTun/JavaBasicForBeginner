package org.example.Lesson32_JavaReturnMethod;

public class MyNumber {
    int firstNumber;
    int secondNumber;

    void printNumbers() {
        System.out.println("First Number - " + firstNumber);
        System.out.println("Second Number - " + secondNumber);
    }

    int getMultiplication() {
        int multiplicationResult = firstNumber * secondNumber;
        return multiplicationResult;
    }

    int getAddition() {
        int additionResult = firstNumber + secondNumber;
        return additionResult;
    }

}
