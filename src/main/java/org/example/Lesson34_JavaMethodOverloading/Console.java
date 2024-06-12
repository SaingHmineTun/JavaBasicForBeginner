package org.example.Lesson34_JavaMethodOverloading;
/*
1. Numbers of parameter
2. Parameter data type
 */
public class Console {
    void writeLine() {
        System.out.println();
    }

    void writeLine(String string) {
        System.out.println("String Parameter");
        System.out.println(string);
    }

    void writeLine(int ints) {
        System.out.println("Int Parameter");
        System.out.println(ints);
    }
}
