package org.example.Lesson42_WrapperClasses;

public class StringToPrimitive {
    public static void main(String[] args) {
        // String to int
        String integer = "12";
        int integerInt = Integer.valueOf(integer);

        // String to boolean
        String bool = "FALSE";
        boolean boolBoolean = Boolean.valueOf(bool);
        System.out.println(boolBoolean);

        // String to double
        String decimal = "1.23";
        double decimalDouble = Double.valueOf(decimal);

        // String to char
        String character = "Hello World";
        for (int i = 0; i < character.length(); i++) {
            System.out.printf("%c ", character.charAt(i));
        }

        // String to char[]
        char[] chars = character.toCharArray();// ['H', 'e', 'l', 'l', 'o']
        for (char ch : chars) {
            System.out.printf("%c ", ch);
        }

    }
}
