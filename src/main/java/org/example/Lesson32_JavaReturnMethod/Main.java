package org.example.Lesson32_JavaReturnMethod;

public class Main {
    public static void main(String[] args) {

        MyNumber myNumber = new MyNumber();
        myNumber.firstNumber = 100;
        myNumber.secondNumber = 50;
        myNumber.printNumbers();
        int x = myNumber.getAddition();
        System.out.println(x);

    }
}
