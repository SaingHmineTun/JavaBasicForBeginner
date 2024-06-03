package org.example;
/*
Some of String methods
- toLowerCase()
    turns all string to lower case
- toUpperCase()
    turns all string to upper case
- isEmpty()
    checks if string is empty or not
- isBlank()
    check if string is blank or not
- equals()
    check if two strings are equal
- startsWith()
    check if one string start with another string
- endsWith()
    check if one string start with another string
- contains()
    check if one string contains another string
 */
public class Lesson14_StringClass {
    public static void main(String[] args) {
        String name = "Hello Muse";
        String user = new String("Sai");
        String lower = name.toUpperCase();

        boolean isEmpty = name.isEmpty();
        boolean isBlank = name.isBlank();


        boolean isEqual = name.equals(user);
        boolean startsWith = name.startsWith("Helo");
        boolean endsWith = name.endsWith("se");
        boolean contains = name.contains("lo");
        System.out.println(contains);
    }
}
/*
Home Work
String email = "test@gmail.com"
int password = 1234;

please enter your email
email => sc.next()
please enter your password
password => sc.nextInt()
email = email
password = password
if true -> Login success!
if false -> Login failed!
 */

/*
Home Work String
Input burmese consonants
က - ka
ဂဃနဏ - GaGaNaNa
 */