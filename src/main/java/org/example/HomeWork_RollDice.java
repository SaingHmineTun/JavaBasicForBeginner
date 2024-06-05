package org.example;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_RollDice {
    public static void main(String[] args) {

        int dice = 0;
        int guess = 0;

        do {
            if (dice != 0) {
                System.out.println("TRY AGAIN!");
            }

            Random rd = new Random();
            dice = rd.nextInt(6) + 1;

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your guess!");
            guess = sc.nextInt();
            System.out.println("Dice Number = " + dice);

        } while (dice != guess);

        System.out.println("You WON!");


    }
}
