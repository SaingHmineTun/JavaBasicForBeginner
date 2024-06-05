package org.example;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {

        String serverEmail = "sai@gmail.com";
        int serverPassword = 1234;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email");
        String userEmail = scanner.next();
        System.out.println("Enter your password");
        int userPassword = scanner.nextInt();

        if (serverEmail.equals(userEmail) && serverPassword == userPassword) {
            System.out.println("LOGIN SUCCESS!");
        } else if (!serverEmail.equals(userEmail) && serverPassword != userPassword) {
            System.out.println("LOGIN FAILED");
        } else if (serverEmail.equals(userEmail)) {
            System.out.println("PASSWORD INCORRECT");
        } else {
            System.out.println("EMAIL INCORRECT!");
        }

    }

    /*
    Both same

    Both unequal
    Email unequal
    Password unequal
     */

}
