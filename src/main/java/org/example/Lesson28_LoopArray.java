package org.example;

/*
Only work with List and Array
 */
public class Lesson28_LoopArray {
    public static void main(String[] args) {

//        int[] numbers = {123, 234, 345, 456};
//        for (int i = 0; i < numbers.length; i++) {
//            int number = numbers[i];
//            System.out.println(number);
//        }

        String[][] table = {
                {"ka", "kha", "ga", "ga", "nga"},
                {"Sa", "Sa", "Za", "Za", "Nya"},
                {"Ta", "Hta", "Da", "Da", "Na"},
                {"Pa", "Pha", "Ba", "Ba", "Ma"},
                {"Ya", "Ra", "La", "Wa", "Tha"},
                {"Ha", "La", "A"}
        };
        for (int i = 0; i < table.length; i++) {
            String[] row = table[i];
            for (int x = 0; x < row.length; x++) {
                String col = row[x];
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}
/*
consonants = {
{"ka", "kha", "nga"},
{"ja", "sa", "nya"}
};
 */
