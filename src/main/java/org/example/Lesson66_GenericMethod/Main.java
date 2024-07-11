package org.example.Lesson66_GenericMethod;

public class Main {
    public static void main(String[] args) {
        int i = getInt(5);
        boolean s = getValue(true);
    }

    public static int getInt(int i) {
        return i;
    }

    public static <T> T getValue(T i) {
        return i;
    }

}
