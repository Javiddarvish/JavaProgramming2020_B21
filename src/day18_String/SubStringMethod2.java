package day18_String;

import java.util.Scanner;

public class SubStringMethod2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = "Today is Monday";
        //            012345678901234
        String day1 = str.substring(9);

        System.out.println(day1);
        System.out.println("==================================");

        String firstName = "jAvId"; // Cybertek

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        System.out.println(firstName);


        System.out.println("Last Name: ");
        String lastName = scan.next();
        lastName = lastName.substring(0,1).toUpperCase() +  lastName.substring(1).toLowerCase();


        String fullName = firstName+" "+lastName;
        System.out.println("Full Name: "+fullName);







    }}
