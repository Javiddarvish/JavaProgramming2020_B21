package day18_String;

import java.util.Scanner;

public class SubStringMethod {
    public static void main(String[] args) {

     String str = "Today is Monday";
     //            012345678901234

        String day = str.substring(9,14+1); // 14+1 or 15 its same
        System.out.println(day);


        String email = "cybertek@gmail.com";
        //              012345678901234567
        String domain = email.substring(9,14);
        System.out.println("Domain of the email "+email+" is: "+domain);


        String s1 = "I like movies and books";
        //           01234567890123456789012
        String word1 = s1.substring(7,12+1);

        System.out.println(word1);

        System.out.println("=============================================");

        String firstName = "cYBERtek";  // Cybertek
        String firstChar = firstName.substring(0,1).toUpperCase();
        String rest = firstName.substring(1,firstName.length()-1+1).toLowerCase();

        System.out.println(firstChar);
        System.out.println(rest);

        firstName = firstChar + rest;
        System.out.println(firstName);

        System.out.println("===========================================");
        /*
       ask the user to enter the first and last name, then print out the full name
            input:
            cYbErTeK
            sCHOOL

                output
                Cybertek School
         */

        Scanner  scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String f = scan.nextLine();

        f = f.substring(0,1).toUpperCase()  +  f.substring(1, f.length()-1 +1 ).toLowerCase() ;

        System.out.println("Enter your last name: ");
        String l = scan.nextLine();

        l =  l.substring(0, 1).toUpperCase() + l.substring(1, l.length()).toLowerCase();

        System.out.println("first name is: "+f);
        System.out.println("last name is: "+l);

        String fullName = f + " " + l;

        System.out.println("full name is: "+fullName);






















    }}
