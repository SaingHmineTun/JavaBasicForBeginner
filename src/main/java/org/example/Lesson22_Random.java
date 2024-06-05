package org.example;

import java.util.Random;

public class Lesson22_Random {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(6);
        System.out.println(number);
    }
}

/*
Roll Dice App
# Start Loop
Random -> 1to6
Print -> Enter your guess
Scanner -> 1to6
Random = Scanner => You WON!
TRY AGAIN and Loop
 */

/*
Email & Password
serverEmail & serverPassword
# Start Loop
scanner -> email & password
same => Login Success
unequal => loop
 */

/*

Mario Less

*
**
***
****
*****

    *
   **
  ***
 ****
*****
 */