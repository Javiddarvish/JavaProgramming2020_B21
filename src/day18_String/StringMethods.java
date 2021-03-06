package day18_String;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        String str = "cybertek";

        str = str.concat(" School"); // " Cybertek School"
        System.out.println(str);

        String str2 = "Cybertek";
        str2 = str2 + " School";  // with the ( + ) sign you can concat any thing
        System.out.println(str2);

        System.out.println("=============================================");

        String name = "bank of america";
        name = name.toUpperCase();  // we have to add name at the first then ....
        System.out.println("name: " + name);

        name = name.toLowerCase();  // back to lower case
        System.out.println(name);

        System.out.println("===================================");

        String t1 = "           Hello";
        t1 = t1.trim(); // "Hello"  // it removes the extra space
        System.out.println(t1);


        String t2 = "Hello Everyone";
        t2 = t2.trim();
        System.out.println(t2);


        System.out.println("==============================================");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scan.nextLine();
        firstName = firstName.trim();

        System.out.println("Enter your last name: ");
        String lastName = scan.nextLine();
        lastName = lastName.trim();

        System.out.println("First name is :"+firstName);
        System.out.println("Last name is :"+lastName);





    }
}
