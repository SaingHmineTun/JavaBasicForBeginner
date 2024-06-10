package org.example;

import java.util.Scanner;

/*
if (boolean_expression) {
} else {
}
 */
public class Lesson18_If_Statement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your student grade!");
        int studentGrade = scanner.nextInt();

        if (studentGrade >= 1 && studentGrade <= 4) {
            System.out.println("#######################");
            System.out.println("Go to primary school!");
            System.out.println("#######################");
        } else if (studentGrade <= 6) {
            System.out.println("************************");
            System.out.println("Go to pre-middle school");
            System.out.println("************************");
        } else if (studentGrade <= 8) {
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
            System.out.println("Go to post-middle school");
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
        } else {
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("Go to Headmaster's office");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        }
    }
}
/*
constant
email => test@gmail.com
password => 1234

request input
request_email, request_password

check
email = request_email and password = request_password => LOGIN SUCCESS
email = request_email and password != request_password => INCORRECT PASSWORD
email != request_email and password == password => INCORRECT EMAIL
email != request_email and password != request password => INCORRECT EMAIL and PASSWORD
 */
